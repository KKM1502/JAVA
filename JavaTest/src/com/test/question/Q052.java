package com.test.question;

import java.util.Scanner;

public class Q052 {
//	�䱸����
//	�Ʒ��� ���� ����Ͻÿ�.
//
//	����..
//	���� ������ �Է¹����ÿ�.
//	�Է�..
//	��: 5 
//
//	���..
//	    aa
//	   abba
//	  abccba
//	 abcddbca
//	abcdeedcba
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("��: ");

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
