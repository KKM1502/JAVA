package com.test.java;

public class Ex37_String {
	public static void main(String[] args) {
//		m1();
//		m3();
		m4();
		
	}

	private static void m4() {
		//String vs StringBuilder
		
		
		long begin = System.nanoTime();
		String txt1 = "홍길동";
		for (int i = 0; i < 10000; i++) {
			txt1 = txt1 +".";
			//잦은 수정
		}
		long end = System.nanoTime();
		System.out.println(txt1.length());
		System.out.println(end-begin +"ns");
//		10003
//		121765301ns
		
		System.out.println();
		long begin1 = System.nanoTime();
		StringBuilder txt2= new StringBuilder("홍길동");
		for (int i = 0; i < 10000; i++) {
			txt2.append(".");
			//잦은 수정
		}
		System.out.println(txt2.length());
		long end1 = System.nanoTime();
		System.out.println(end1-begin1 +"ns");
		
	}

	private static void m2() {

		String name1 = "홍길동";// String = 불변, 조작 비효율
		StringBuilder name2 = new StringBuilder("홍길동"); //StringBuilder = 배열처리 , 조작 가능 
		
		
	}

	private static void m3() {

		
		//1. 메모리의 공간은 한번 할당되면 더 이상 늘리거나 줄일 수 없다.
		//3. 문자열은 참조형이다.
		
		//값형 > 자료형 > 메모리의 크기가 고정
		int a = 20000; //4byte
		char c = '1'; //2byte
		
		String b = "홍길동";//6byte
		String d = "안녕하세요";//10byte
		
		int[] ns1 = new int[3]; //12byte
		int[] ns2 = new int[5]; //20byte
		//모든 참조형 변수의 비교는 참조 데이터 비교가 아니라 주소값을 비교한다.
		
	}
}
