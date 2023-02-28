package com.test.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Ex77_Queue {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		queue.add("Red");
		queue.add("yellow");
		queue.add("blue");
		
		System.out.println(queue.size());
		
		System.out.println(queue.poll());
		System.out.println(queue.size());
		System.out.println(queue.poll());
		System.out.println(queue.size());
		System.out.println(queue.poll());
		System.out.println(queue.size());
		System.out.println(queue.poll());// null
		
		System.out.println();
		
		//null??
		System.out.println(queue.size()==0);
		System.out.println(queue.isEmpty());
		
		System.out.println(queue.peek());
		System.out.println(queue.size());
		
	}
}
