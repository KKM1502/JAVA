package com.test.question;

import java.util.Scanner;

public class Q056 {
//	�䱸����
//	���ڸ� 2�� �Է¹޾� ������ ����� �� ������ ������� ���Ͻÿ�.
//
//	����..
//	�����: �� �̻��� ������ ����� ���
//	�Է�..
//	ù��° ����: 12 
//
//	�ι�° ����: 8 
//
//	���..
//	12�� ���: 1, 2, 3, 4, 6, 12,
//	8�� ���: 1, 2, 4, 8,
//	12�� 8�� �����: 1, 2, 4,
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° ����: ");
		int num1 = scan.nextInt();
		
		System.out.print("�ι�° ����: ");
		int num2 = scan.nextInt();

		String txt1="";
		String txt2="";
		String txt3="";

		
		for (int i = 1; i <= num1; i++) {
				if(num1%i==0) {
					txt1+=i + ",";
				}
			}
		for (int i = 1; i <= num2; i++) {
			if(num2%i==0) {
				txt2+=i + ",";
			}
		}
		for (int i = 1; i<=(num1<num2?num1:num2); i++) {
			if(num2%i==0&&num1%i==0) {
				txt3+=i + ",";
			}
		}

		
		System.out.printf("%d�� ���: %s",num1,txt1);
		System.out.println();
		System.out.printf("%d�� ���: %s",num2,txt2);
		System.out.println();
		System.out.printf("%d�� %d�� �����: %s",num1,num2,txt3);

		
	}
	
}
