package com.test.question;

import java.util.Scanner;

public class Q050 {
//	조건..
//	행의 갯수를 입력받으시오.
//	입력..
//	행: 5 
//
//	출력..
//	    *
//	   **
//	  ***
//	 ****
//	*****

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("행: ");
		int input = scan.nextInt();
		for (int i = 1; i <= input; i++) {
			
			for (int j = 0; j <input-i;j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i;j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
