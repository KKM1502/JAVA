	package com.test.question;

import java.util.Scanner;

public class Q046 {
//	���ڸ� 10�� �Է¹޾� �ѱ۷� ��ȯ �� ����Ͻÿ�.
//
//	����..
//	1~9������ �Է��Ͻÿ�.
//	�Է�..
//	����: 5 
//
//	����: 7 
//
//	����: 4 
//
//	����: 3 
//
//	����: 5 
//
//	����: 7 
//
//	����: 6 
//
//	����: 2 
//
//	����: 1 
//
//	����: 3 
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		String result = "";
		System.out.print("1~9 �Է�.\n");
		
		for (int i = 0; i < 10; i++) {
			System.out.print("����: ");
			int input = scan.nextInt();
			
			switch (input) {
			case 1 :
				result+="��";
				break;
			case 2 :
				result+="��";
				break;
			case 3 :
				result+="��";
				break;
			case 4 :
				result+="��";
				break;
			case 5 :
				result+="��";
				break;
			case 6 :
				result+="��";
				break;
			case 7 :
				result+="ĥ";
				break;
			case 8 :
				result+="��";
				break;
			case 9 :
				result+="��";
				break;
			}
		}
		System.out.println(result);
		
		
	}
	
}
