package com.test.question;

import java.util.Scanner;

public class Q082 {
//	Java �Ʒ��� �䱸������ �����Ͻÿ�.
//	Skill: ���ڿ�
//	�䱸����
//	���ڸ� �Է¹޾� �� �ڸ����� ���� ���� ���Ͻÿ�.
//
//	�Է�..
//	����: 314 
//
//	���..	
//	���: 3 + 1 + 4 = 8
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("����: ");
		String input = scan.nextLine();
		
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			char k=input.charAt(i);
			sum +=k-48;
			System.out.print(k);
			if(i==input.length()-1) {
				break;
			}
			System.out.print(" + ");
			
			
			
		}
		System.out.printf(" = %d",sum);
	}
}
