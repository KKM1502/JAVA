package com.test.collection;

import java.util.ArrayList;

public class Ex73_ArrayList {

	public static void main(String[] args) {
		/*
		 	컬렉션, Collection
		 	- JCF, Java Collection Framework
		 	- (향상된) 배열
		 	- 기존의 순수 배열 > 성능, 사용법 등 개량 >클래스
		 	- 길이 가변 > 방의 개수를 마음대로 늘리거나 줄이는게 가능
		 	
		 	컬렉션 종류
		 	1. List 계열
		 		- ArrayList(********)
		 			- Serializable, Cloneable, Iterable<E>
		 			- Collection<E>, List<E>, RandomAccess
		 			
		 		- LinkedList
		 		- Queue
		 		- Stack
		 		- Vector(legacy)
		 	
		 	2. Set 계열
		 		- HashSet(***)
		 		- TreeSet
		 	
		 	3. Map 계열
		 		- HashMap(***)
		 		- TreeMap
		 		- Properties(legacy)
		 		- HashTable(legacy)
		 	
		 	ArrayList 클래스
		 	
		 	
		 */
		
		m3();
		
		
	}

	private static void m3() {

		ArrayList<Integer> list = new ArrayList<Integer>();
		//- add(value) : Append
		//- add(index, value) : Insert
		for (int i = 0; i < 10; i++) {
			list.add((int)(Math.random() * 100));
		}
		System.out.println(list);
		
	}

	private static void m2() {
//		1.생성하기
		ArrayList<String> list = new ArrayList<String>();
		
		
//		2.요소 추가하기
		list.add("바나나");
		list.add("딸기");
		list.add("귤");
		list.add("포도");
		list.add("파인애플");
		
		System.out.println(list.get(4));
		System.out.println(list.get(0));
		System.out.println(list.get(3));
		System.out.println(list.get(2));
		
		//요소의 수정
		//-list[0]= 10; 대입 or 수정
		//- T set(int index, T newValue)
		
		System.out.println(list);
		String temp = list.set(0, "망고");
		System.out.println(temp);
		System.out.println(list);
		System.out.println();
	}
	
	
	
}

