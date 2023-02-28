package com.test.question;

import java.util.Scanner;

public class Q052 {
//	요구사항
//	아래와 같이 출력하시오.
//
//	조건..
//	행의 갯수를 입력받으시오.
//	입력..
//	행: 5 
//
//	출력..
//	    aa
//	   abba
//	  abccba
//	 abcddbca
//	abcdeedcba
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("행: ");

		int input = scan.nextInt();
		for (int i = 1; i <= input; i++) {
			
			for (int j = 0; j <input-i;j++) {
				System.out.print(" ");
			}
			char c= 'a';
			for (int j = 0; j < i;j++) {
				
				System.out.printf("%c",c);
				c++;
			}
			for (int j = 0; j < i;j++) {
				c--;
				System.out.printf("%c",c);
				
			}
			System.out.println();

		}
	}
	

}
