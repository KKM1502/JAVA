package com.test.question;

import java.util.Scanner;

public class Q050 {
//	����..
//	���� ������ �Է¹����ÿ�.
//	�Է�..
//	��: 5 
//
//	���..
//	    *
//	   **
//	  ***
//	 ****
//	*****

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("��: ");
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
