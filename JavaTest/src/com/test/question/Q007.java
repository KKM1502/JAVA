package com.test.question;

import java.util.Scanner;

public class Q007 {
	public static void main(String[] args) {
		//1.scanner �����ϱ�
		//2.�� ���
		//3.���� �ҹ��ڸ� 1���� �Է¹ޱ�
//		//4.�ҹ��� a = 97 , �빮�� A = 65 ���̴� -32
		//5.��� ���
		
		Scanner scan = new Scanner(System.in); //	1 
		
		System.out.print("���� �Է�: ");//2
		String input = scan.nextLine();//3
		
		char c= input.charAt(0); 
		
		int upper = c -32 ; //4 
		
		System.out.printf("�ҹ��� %c�� �빮�ڴ� %c�Դϴ�.",c,upper); //5 
				
		
		
		
		
		
		
		
		
		
	}
}
