package com.test.question;

import java.util.Scanner;

public class Q037 {
//	�䱸����
//	���� 1���� �Է¹޾� 1���� �Է��� ���ڱ����� ���� ����Ͻÿ�.
//
//	�Է�..
//	����: 5 
//
//	���..
//	1 ~ 5 = 15
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("����: ");
		int input = scan.nextInt();
		int sum = 0;
		for (int i = 1; i <= input; i++) {
			sum+=i;
		}
		System.out.printf("1 ~ %d = %d", input, sum);
		scan.close();
	}
}
