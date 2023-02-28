package com.test.lambda;

import java.util.ArrayList;
import java.util.Comparator;

public class Ex88_lamda {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add((int)Math.random()*10);
		list.add((int)Math.random()*10);
		list.add((int)Math.random()*10);
		list.add((int)Math.random()*10);
		list.add((int)Math.random()*10);
		list.add((int)Math.random()*10);
		list.add((int)Math.random()*10);
		list.add((int)Math.random()*10);

		
		
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		System.out.println(list);
		
		list.sort((o1,o2) -> o2-o1);
		System.out.println(list);
		
	}
	
	
	
}
