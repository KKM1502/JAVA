package com.test.java;

import java.util.Scanner;

public class Ex30_switch {
	public static void main(String[] args) {
		
		
	/*
	 	switch(조건){
	 		case 값:
	 			실행문;
	 			break;
	 		[case 값:
	 			실행문;
	 			break;] //n번
	 		[deafult:
	 			실행문;
	 			break;]
	 			
	 	스위치 안에는 boolean type의 값을 넣을 수 없다.
	 	Character는 int에 포함되기 때문에 사용 가능 
	 */
		
//		m1();
//		m2();
		
	}

	private static void m2() {
		//요구사항] 자판기
		//- 메뉴 출력 > 음료 선택 > 가격 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("==================");
		System.out.println("       자판기");
		System.out.println("==================");
		System.out.println("1.콜라");
		System.out.println("2.사이다");
		System.out.println("3.비타500");
		System.out.println("-----------------");
		System.out.print("선택(숫자 입력):");
		
		int coke= 500;
		String input = scan.nextLine();
		if (input.equals("1")) {
			System.out.printf("%d원입니다.\n",coke);
		} else if (input.equals("2")) {
			System.out.printf("%d원입니다.\n",coke);
		} else if (input.equals("3")) {
			System.out.println("500원입니다.");
		}
		
		switch (input) {
			case "1":
				System.out.printf("%d원입니다.\n",coke);
				break;
			case "2":
				System.out.printf("%d원입니다.\n",coke);
				break;
			case "3":
				System.out.println("500원입니다.");
				break;
			
		}
		switch (input) {
		case "1":
	
		case "2":
			System.out.println("700원입니다.");
			break;
		case "3":
			System.out.println("500원입니다.");
			break;
		
	}
		
	}

	private static void m1() {
		
		//요구사항 ] 숫자를 1개 입력 < 한글을 출력
		//1 > 하나
		//2 > 둘
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자: ");
		int num = scan.nextInt();
		
		if(num==1) {
			System.out.println("하나");
		} else if(num==2){
			System.out.println("둘");
		} else if(num==3){
			System.out.println("셋");
		} else{
			System.out.println("나머지 숫자");
		}
		
		switch(num) {
			case 1: //Label(위치를 표시하는 역할)
				System.out.println("하나");
				break;
			case 2:
				System.out.println("둘");
				break;
			case 3:
				System.out.println("셋");
				break;
			default:
				System.out.println("나머지 숫자");
				break;
			
		}
		
		
	}
	
	
}
