package com.edocode.dp.structural.bridge;

public class Client {

	public static void main(String[] args) {
		FifoCollection<Integer> q = new Queue<>(new SinglyLinkedList<>());
	
		q.offer(10);
		q.offer(20);
		q.offer(30);
		
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
	}

}
