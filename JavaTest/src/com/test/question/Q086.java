package com.test.question;

import java.util.Scanner;

public class Q086 {
//	Java �Ʒ��� �䱸������ �����Ͻÿ�.
//	Skill: ���ڿ�
//	�䱸����
//	���ڸ� �Է¹޾� 3�ڸ����� , �� ���̽ÿ�.
//
//	����..
//	%,d ��� ����
//	�Է�..
//	����: 1234 
//
//	���..
//	���: 1,234
//	�Է�..
//	����: 1234567 
//
//	���..
//	���: 1,234,567
	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.print("����: ");
		String input = scan.nextLine();
		String result="";
		
		//1234567
		while(input.length()>3) {
			result=","+input.substring(input.length()-3,input.length())+result;
			input= input.substring(0,input.length()-3);
		}
		System.out.println();
		System.out.println("���: "+input+result);
	}
}
