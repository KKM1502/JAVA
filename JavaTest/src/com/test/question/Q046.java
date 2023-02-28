	package com.test.question;

import java.util.Scanner;

public class Q046 {
//	숫자를 10개 입력받아 한글로 변환 후 출력하시오.
//
//	조건..
//	1~9까지만 입력하시오.
//	입력..
//	숫자: 5 
//
//	숫자: 7 
//
//	숫자: 4 
//
//	숫자: 3 
//
//	숫자: 5 
//
//	숫자: 7 
//
//	숫자: 6 
//
//	숫자: 2 
//
//	숫자: 1 
//
//	숫자: 3 
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		String result = "";
		System.out.print("1~9 입력.\n");
		
		for (int i = 0; i < 10; i++) {
			System.out.print("숫자: ");
			int input = scan.nextInt();
			
			switch (input) {
			case 1 :
				result+="일";
				break;
			case 2 :
				result+="이";
				break;
			case 3 :
				result+="삼";
				break;
			case 4 :
				result+="사";
				break;
			case 5 :
				result+="오";
				break;
			case 6 :
				result+="육";
				break;
			case 7 :
				result+="칠";
				break;
			case 8 :
				result+="팔";
				break;
			case 9 :
				result+="구";
				break;
			}
		}
		System.out.println(result);
		
		
	}
	
}
