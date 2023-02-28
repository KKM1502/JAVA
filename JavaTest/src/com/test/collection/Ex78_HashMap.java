package com.test.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Ex78_HashMap {

	public static void main(String[] args) {
		
		/*
		 면접 질문
		 - ArrayList vs HashMap
		 - List vs Map
		 
		 -ArrayList(C) > List(I)
		 

		배열 vs ArrayList
		-길이 고정 vs 가변
		
		Class vs HashMap
		-데이터의 개수
		-개수가 적으면>HashMap or Class
		
		 
		 
		 */
		
//m1();
//		m2();
		m3();
		
		
		
		
		
		
		
		
		
	}

	private static void m3() {
		
		HashMap<String, String> map = new HashMap<String,String>();

		map.put("red", "빨강");
		map.put("yellow", "노랑");
		map.put("blue", "파랑");
		
		//HashMap을 루프 탐색하기
		HashMap<Integer, String> map2 = new HashMap<Integer,String>();
		map2.put(0, "빨강");
		map2.put(1, "노랑");
		map2.put(2, "파랑");
		
		
		//이렇게 쓸거면 차라리 ArrayLisrt를 사용해라
		for (int i = 0; i < map2.size(); i++) {
			System.out.println(map2.get(i));
		}
		
		map.put("red", "빨강");
		map.put("yellow", "노랑");
		map.put("blue", "파랑");
		
		
		//key~~
		Set<String> set = map.keySet();
		for (String item : set) {
			System.out.println(item);
		}
		
		//value~~
		Collection<String> values = map.values();
		
		for(String value : values){
			System.out.println(value);
		}
		
		Set<String> set2 = map.keySet();
		for (String item : set2) {
			System.out.println(item + ":" +map.get(item));
		}
		
		
	}

	private static void m2() {
		//HashMap 사용법
		HashMap<String, String> map = new HashMap<String,String>();
		//1. 요소 추가하기
		map.put("red", "빨강");
		map.put("yellow", "노랑");
		map.put("blue", "파랑");
		
		//2.요소 개수
		System.out.println(map.size());
		
		
		//3.요소 읽기
		System.out.println(map.get("red"));
		System.out.println(map.get("yellow"));
		System.out.println(map.get("blue"));
		
		//4.요소 수정
		//-key는 유일하다.
		map.put("yellow", "샛노랑");
		System.out.println();
		System.out.println(map.get("yellow"));
		
		
		
		//5. 요소 검색
		//-contains
		System.out.println(map.containsKey("yellow"));
		System.out.println(map.containsValue("노랑"));
		
		//6.요소 삭제
		map.remove("yellow");
		System.out.println(map.size());
		System.out.println(map.get("yellow"));//없는 key 요청 > null
		
		//7.초기화
		map.clear();
		System.out.println(map.size());
		
		map.put("red", "빨강");
		map.put("yellow", "노랑");
		map.put("blue", "파랑");
		System.out.println(map); // toString() 오버라이딩 > 덤프
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("빨강");
		list.add("노랑");
		list.add("파랑");
		
		System.out.println(list);
		
	}

	private static void m1() {
//		1.간편함 , 비권장
		int kor = 100;
		int eng = 80;
		int math =70;
		
//		2.class 사용
		Score score1 = new Score();
		score1.kor= 100;
		score1.eng= 90;
		score1.math = 70;
		
//		3.Hash 사용 >> key로 받음, 순서가 없음 
		HashMap<String,Integer> score2 = new HashMap<String, Integer>();
		score2.put("국어",100);
		score2.put("영어",80);
		score2.put("수학",70);
		
		System.out.println(score2.get("국어"));
		System.out.println(score2.get("영어"));
		System.out.println(score2.get("수학"));
		
		
		
//		ArrayList 사용
		ArrayList<Integer> score3	=	new ArrayList<Integer>();
		
		
		
		
		
		
		
//		요구사항] 학생 1명(***)의 국,영,수 저장 >>Hash
//		요구사항] 학생 100명의 국,영,수 저장 > Class
		
	}
	
	
}


class Score{
	public int kor;
	public int eng;
	public int math;
}
