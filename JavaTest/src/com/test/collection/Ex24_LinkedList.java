package com.test.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex24_LinkedList {

	public static void main(String[] args) {
		
		/*
		 
		 	Collection(I) < List(I) < ArrayList(C), LinkedList(C)
		 	
		 	ArrayList vs LinkedList
		 	- 사용법 매우 유사
		 	- 내부 구조가 다르다.  >>> 사용 용도가 다르ㅏ다.
		 	
		 	ArrayList
		 	- 순차적인 데이터 추가/삭제
		 	- 탐색 위주 작업
		 	
		 	LinkedList
		 	- 중간 데이터 추가/삭제
			
		 	LinkedList 종류
		 	1. LinkedList	 : 단방향 탐색
		 	2. Double LinkedList	: 양방향 탐색
		 	3. Double Circular LinkedList : 순환 탐색 > 자바의 LinkedList
		 
		 */
		
//		m1();
		m2();
	}//main

	
	//속도비교
	private static void m2() {
		ArrayList<Integer> list1 =new ArrayList<Integer>();
		LinkedList<Integer> list2 =new LinkedList<Integer>();
		long begin = 0, end = 0;
		
		//1. 순차적으로 데이터 추가하기, Append
		System.out.println("1.순차적으로 데이터 추가하기");
		begin = System.currentTimeMillis();
		
		for (int i = 0; i < 10000000; i++) {
			list1.add(i);
		}

		end = System.currentTimeMillis();
		System.out.println("Array: " + (end-begin));

		begin = System.currentTimeMillis();
		
		for (int i = 0; i < 10000000; i++) {
			list2.add(i);
		}
		
		end = System.currentTimeMillis();
		System.out.println("Linked: "+(end-begin));
		
		
		
		//2. 중간에 데이터 추가하기, Insert
		System.out.println("2.중간에 데이터 추가하기");
		begin = System.currentTimeMillis();
		
		for (int i = 0; i < 1000; i++) {
			list1.add(0,i);
		}

		end = System.currentTimeMillis();
		System.out.println("Array: " + (end-begin));

		begin = System.currentTimeMillis();
		
		for (int i = 0; i < 1000; i++) {
			list2.add(0,i);
		}
		
		end = System.currentTimeMillis();
		System.out.println("Linked: "+(end-begin));
		
		//3. 중간에 있는 데이터 삭제하기
		System.out.println("3. 중간에 있는 데이터 삭제하기");
		begin = System.currentTimeMillis();
		
		for (int i = 0; i < 1000; i++) {
			list1.remove(0);
		}

		end = System.currentTimeMillis();
		System.out.println("Array: " + (end-begin));
		
		begin = System.currentTimeMillis();
		
		for (int i = 0; i < 1000; i++) {
			list2.remove(0);
		}
		
		end = System.currentTimeMillis();
		System.out.println("Linked: "+(end-begin));
		

	}

	private static void m1() {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(300);
		list1.add(200);
		list1.add(100);
		
		System.out.println(list1.size());
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		list2.add(300);
		list2.add(200);
		list2.add(100);
		
		System.out.println(list2.size());
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		System.out.println(list2.get(2));
		
		
		
	}
	
}
