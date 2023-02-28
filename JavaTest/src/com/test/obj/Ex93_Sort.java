package com.test.obj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ex93_Sort {
	public static void main(String[] args) {
		
		m7();
		
	}

	private static void m7() {
		
		ArrayList<Integer>nums = new ArrayList<Integer>();
		
		nums.add(4);
		nums.add(3);
		nums.add(2);
		nums.add(5);
		nums.add(1);
		
		Collections.sort(nums);
		
		Collections.sort(nums, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1- o2;
			}
		});
		
		nums.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return 0;
			}
		});
		
	}
}
