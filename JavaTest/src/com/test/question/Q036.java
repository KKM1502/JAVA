package com.test.question;

import java.util.Scanner;

public class Q036 {
//	�䱸����
//	���� ����, ���� ����, ����ġ�� �Է¹޾� ���ڸ� ���������� ����Ͻÿ�.
//
//	�Է�..
//	���� ����: 5 
//
//	���� ����: 12 
//
//	����ġ: 1 
//
//	���..
//	5
//	6
//	7
//	8
//	9
//	10
//	11
//	12
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ����: ");
		int start= scan.nextInt();
		
		System.out.print("���� ����: ");
		int end= scan.nextInt();
		
		System.out.print("����ġ: ");
		int plus= scan.nextInt();
		
		for (int i = start; i < end+1; i=i+plus) {
			System.out.println(i);
		}
		scan.close();
		
	}
}
