package com.test.question;

import java.util.Scanner;

public class Q036 {
//	요구사항
//	시작 숫자, 종료 숫자, 증감치를 입력받아 숫자를 순차적으로 출력하시오.
//
//	입력..
//	시작 숫자: 5 
//
//	종료 숫자: 12 
//
//	증감치: 1 
//
//	출력..
//	5
//	6
//	7
//	8
//	9
//	10
//	11
//	12
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("시작 숫자: ");
		int start= scan.nextInt();
		
		System.out.print("종료 숫자: ");
		int end= scan.nextInt();
		
		System.out.print("증감치: ");
		int plus= scan.nextInt();
		
		for (int i = start; i < end+1; i=i+plus) {
			System.out.println(i);
		}
		scan.close();
		
	}
}
