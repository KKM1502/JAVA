package com.project;

public class SavUI {
	
	public static void savMain() {
		
		System.out.println("======적금======");
		System.out.println("1. 적금 조회");
		System.out.println("2. 적금 추천");
		System.out.println("3. 적금 계산기");
	}
	
	public static void savSub(String stitle) {
		
		System.out.println("-------------");
		System.out.printf("<%s>\n", stitle);
		System.out.println("-------------");
	}
}
