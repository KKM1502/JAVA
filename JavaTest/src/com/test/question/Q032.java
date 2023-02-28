package com.test.question;

import java.util.Scanner;

public class Q032 {
	public static void main(String[] args) {
//		요구사항
//		주차 요금을 계산하시오.
//
//		조건..
//		무료 주차: 30분
//		초과 10분당: 2,000원
//		입력..
//		[들어온 시간]
//
//		시: 13 
//
//		분: 30 
//
//
//		[나간 시간]
//
//		시: 14 
//
//		분: 20 
//
//		출력..
//		주차 요금은 4,000원입니다.

		//들어온 시간 
		Scanner scan = new Scanner(System.in);
		System.out.print("시: ");
		int h = scan.nextInt();
		System.out.print("분: ");
		int m = scan.nextInt();	
		System.out.println();
		
		//나간시간
		System.out.print("시: ");
		int hout = scan.nextInt();
		System.out.print("분: ");
		int mout = scan.nextInt();
		System.out.println();
		
		
		System.out.printf("주차 요금은 %,d원입니다.",(((hout*60+mout)-(h*60+m))-30)/10*2000 );
	}
}
