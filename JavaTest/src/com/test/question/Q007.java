package com.test.question;

import java.util.Scanner;

public class Q007 {
	public static void main(String[] args) {
		//1.scanner 생성하기
		//2.라벨 출력
		//3.영문 소문자를 1글자 입력받기
//		//4.소문자 a = 97 , 대문자 A = 65 차이는 -32
		//5.결과 출력
		
		Scanner scan = new Scanner(System.in); //	1 
		
		System.out.print("문자 입력: ");//2
		String input = scan.nextLine();//3
		
		char c= input.charAt(0); 
		
		int upper = c -32 ; //4 
		
		System.out.printf("소문자 %c의 대문자는 %c입니다.",c,upper); //5 
				
		
		
		
		
		
		
		
		
		
	}
}
