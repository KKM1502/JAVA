package com.test.question;

import java.util.Scanner;

public class Q081 {
//	�䱸����
//	�̸��� �ּҸ� �Է¹޾� ���̵�� �������� ���� �����Ͻÿ�.
//
//	�Է�..
//	�̸���: hong@gmail.com 
//
//	���..
//	���̵�: hong
//	������: gmail.com
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸���: ");
		String input = scan.nextLine();

		int k =input.indexOf("@");
		System.out.print("���̵�: ");
		for (int i = 0; i < k; i++) {
			System.out.print(input.charAt(i));
		}
		System.out.println();
		System.out.print("������: ");
		for (int i = k+1; i < input.length(); i++) {
			System.out.print(input.charAt(i));
		}
	}

}
