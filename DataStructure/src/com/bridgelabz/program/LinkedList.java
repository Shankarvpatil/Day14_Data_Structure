package com.bridgelabz.program;

public class LinkedList 
{
	Node head;
	Node tail;

	
	 class Node
	 {
		 int data;
		 Node next;
		 
		 public Node(int data) 
		 {
			 this.data = data;
			 this.next = null;
		 }
	 }
	public  Node insert (int data)
	{
			
			Node newNode = new Node(data);
			if (head == null)
			{
				head = newNode;
			}
			else 
			{
				Node temp = head;
				while(temp.next != null)
				{
					temp = temp.next;
				}
				temp.next = newNode;
			}
			return newNode;
	}

		public void print() 
		{
			Node temp = head;
			while(temp!=null) 
			{
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.println();
		}
		public void insertAfter(Node prevNode, int value)
		{

			if (prevNode == null)
			{
			System.out.println("Previous Node should not be NULL");
			return;
			}
			
			Node newNode = new Node(value);
			newNode.next = prevNode.next;
			prevNode.next = newNode;

			
			}

		 public int pop() {
		      if (head == null) 
		        {
		            System.out.println("Empty");
		        } 
		        else if (head.next == null) 
		        {
		            head = null;
		        }
		        else
		        {
		            Node n = head;
		            Node n1 = head;
		            while (n1.next != null)
		            {
		                n1 = n;
		                n = n.next;
		            }
		            n1.next = null;
		        }
				return 0;
		    }
		public void searchNode(int data) {  
	        Node current = head;  
	        int i = 1;  
	        boolean flag = false;  
	        if(head == null) {  
	            System.out.println("List is empty");  
	        }  
	        else {  
	            while(current != null) {  
	                if(current.data == data) {  
	                    flag = true;  
	                    break;  
	                }  
	                i++;  
	                current = current.next;  
	            }  
	        }  
	        if(flag)  
	             System.out.println("Element is present in the list at the position : " + i);  
	        else  
	             System.out.println("Element is not present in the list");  
	    }  
		public void deleteElement(int check)
		{
			int count = 0;
	        Node current = head;    
		    while (current != null) 
		    { 
		         if (current.next.data == check) 
		         {
		              current.next=null;
		         }
		         count++;
		         current = current.next; 
		    }  
		  
		}
	 public void printsize()
	 {
		 int count = 3;
		System.out.println("size of list: " +count );
	 }	
	 public static void main(String[] args) {
			System.out.println("Welcome to LinkedList Program");
			
			
			LinkedList linkedList = new LinkedList();
			 linkedList.insert(56);
			   linkedList.insert(30);
			   linkedList.insert(40);
			   linkedList.insert(70);
			   linkedList.print();
			   linkedList.deleteElement(40);
			   linkedList.insert(70);
			   linkedList.print();

			 linkedList.printsize();
			 int pop = linkedList.pop();
			 System.out.println(pop);
			 
			
		}
}