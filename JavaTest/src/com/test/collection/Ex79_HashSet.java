package com.test.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Ex79_HashSet {
	/*
	 컬렉션
	 1. List 계열 (첨자가 있는 순서가 있는 집합)
	 	- 순서가 있는 집합
	 	- 첨자(방번호)
	 	- 데이터 중복을 허용한다.
	 	
	 	
	 	
	 2. Map 계열 (키와 밸류로 이루어진 순서가 없는 집합입니다.)
		 - 순서가 없는 집합
		 - 키
		 - 데이터 중복을 허용한다.
	 
	 3. Set 계열 (데이터 중복을 허용하지 않는 순서가 없는 집합입니다.)
	 	- 순서가 없는 집합
	 	- 식별자가 없다. (방번호x, 방이름x) > 방과 방을 구분할 수 없다.
	 	- 데이터 중복을 허용하지 않는다. 
	 	
	 
	 
	 
	 
	 */
	public static void main(String[] args) {
//		m1();
		m2();
		
		
	}

	private static void m2() {
		
		//로또 번호 > 중복되지 않는 난수
		
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		
		for (int i = 0; i < 6; i++) {
			int n = (int)(Math.random()*45)+1; //원자값을 보장하지 않는다.
//			
//			//중복 검사
//			boolean flag = false;
//			for (int j = 0; j < i; j++) {
//				if(lotto.get(j)==n) {
//					flag = true;
//					break;
//				}
//			}
//			if(!flag) {
//				lotto.add(n);//중복되지 않은 숫자 
//			}else {
//				i--; //중복일때 
//			}
			if(!lotto.contains(n)) {
				lotto.add(n);
			}else {
				i--;
			}
			
		}
		System.out.println(lotto);
		//정렬
		Collections.sort(lotto);
		System.out.println(lotto);
		
		
		HashSet<Integer> lotto2 = new HashSet<Integer>();
		
		while(lotto2.size()<6) {
			int n = (int)(Math.random()*45)+1;
			lotto2.add(n); // Set은 자율적으로 중복값 제거

		}
		
		System.out.println(lotto2);
		//정렬
		//set을 반드시 정렬하고싶다 < set을 list로 치환 후 정렬
		
		ArrayList<Integer> lotto3 = new ArrayList<Integer>(lotto2);
		Collections.sort(lotto3);
		System.out.println(lotto3);
		
		
		
		
	}

	private static void m1() {
		//수료 + 취업 > 업무 적응 > 개발 > 알고리즘, 자료구조, 디자인패턴, Win32 API(C언어)
		
		HashSet<String> set = new HashSet<String>();
		//1.요소 추가하기
		set.add("사과");
		set.add("딸기");
		set.add("바나나");
		
		//2.요소 개수
		System.out.println(set.size());
		
		//3.덤프
		System.out.println(set);
		
		//4. 중복된 값 추가하기 
		set.add("사과"); //안들어감 (기존에 사과가 있어서..)

		System.out.println(set);
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		
		
	
	
	}
	
	
}
