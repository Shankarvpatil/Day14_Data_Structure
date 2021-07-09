package com.bridgelabz.program;

import com.bridgelabz.program.Stack.Node;

public class StackMain {
	
	public void print(){
		Node head = null;
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		Stack stack = new Stack();
		stack.push(70);
	    stack.push(30);
	    stack.push(56);
	    System.out.println("The Top Element is : " + stack.peak());
	    
	    stack.pop();
	    stack.pop();
	    stack.pop();
	    
	    if (stack.isEmpty()){
	    	System.out.print("The Stack is Empty");
	    }
	    else {
	    	System.out.print("The Stack is Not Empty");
    	}
    }   
}