package com.test.question;

import java.util.Scanner;

public class Q048 {
//	�䱸����
//	�ִ� 9�ڸ� ������ �Է¹޾� ���ڸ��� Ȧ�� �����հ� ¦�� �������� ���Ͻÿ�.
//
//	����..
//	int ����� �Է��Ͻÿ�.
//	�Է�..
//	���� �Է�: 273645281 
//
//	���..
//	¦���� ��: 22
//	Ȧ���� ��: 16
//
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("int ����� �Է��Ͻÿ�.\n");
		System.out.print("���� �Է�: ");
		String input = scan.nextLine();
		
		int sum0=0;
		int sum1=0;
		
		
		for (int i = 0; i < input.length(); i++) {
	
			switch (input.charAt(i)) {
			case '1' :
				sum1+=1;
				break;
			case '2' :
				sum0+=2;
				break;
			case '3' :
				sum1+=3;
				break;
			case '4' :
				sum0+=4;
				break;
			case '5' :
				sum1+=5;
				break;
			case '6' :
				sum0+=6;
				break;
			case '7' :
				sum1+=7;
				break;
			case '8' :
				sum0+=8;
				break;
			case '9' :
				sum1+=9;
				break;
				
			}
		}
		System.out.printf("¦���� ��: %d \nȦ���� ��: %d",sum0,sum1);

		
		
	}
}
