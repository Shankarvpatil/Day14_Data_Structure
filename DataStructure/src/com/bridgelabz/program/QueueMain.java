package com.bridgelabz.program;

public class QueueMain {
	public static void main(String[] args) {
		System.out.println("Welcome to  Queue Program");
		
		Queue queue = new Queue();
		queue.enQueue(56);
		queue.enQueue(30);
		queue.enQueue(70);
		
		queue.print();
		
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		
		queue.print();
	}
}