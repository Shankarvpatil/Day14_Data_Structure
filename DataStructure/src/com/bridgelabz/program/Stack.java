package com.bridgelabz.program;

public class Stack {
	public class Node {
		int data;       
	    Node next;
	}
	private Node top;
	
	public Stack() {
		this.top = null;
	}
	// method to push data on stack
	public void push(int x){
		Node node = new Node();
		System.out.println("Inserting... " + x);
		node.data = x;
		node.next = top;
		top = node;
	}
	// method to check if stack is empty or not
	public boolean isEmpty(){
		return top == null;
	}
	// method to retrieve the top element from stack
	public int peak(){
		if (!isEmpty()) {
			return top.data;
		}
		else {
			System.out.println("The stack is empty");
	        return -1;
	    }
	}
	// removing the data from stack 
	public void pop(){
		if (top == null){
			System.out.print("\nStack Underflow");
	        return;
		}
		System.out.println("Removing... " + peak());
		top = (top).next;
	}
}
