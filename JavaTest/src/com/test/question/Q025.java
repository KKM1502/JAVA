package com.test.question;

import java.util.Scanner;

public class Q025 {
	public static void main(String[] args) {
//		�䱸����
//		���� 2���� �Է¹޾� ū���� �������� ����Ͻÿ�.
//
//		����..
//		�� ���ڰ� ���� ���̸� ���̴��� ����Ͻÿ�.
//		�Է�..
//		ù��° ����: 5 
//
//		�ι�° ����: 3 
//
//		���..
//		ū���� 5�̰�, �������� 3�Դϴ�. �� ���ڴ� 2(��)�� ���̳��ϴ�.
//		�Է�..
//		ù��° ����: 2 
//
//		�ι�° ����: 10 
//
//		���..
//		ū���� 10�̰�, �������� 2�Դϴ�. �� ���ڴ� 8(��)�� ���̳��ϴ�.
//		�Է�..
//		ù��° ����: 3 
//
//		�ι�° ����: 3 
//
//		���..
//		�� ���ڴ� �����մϴ�.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù��° ����: ");
		int input1 = scan.nextInt();
		System.out.println();
		
		System.out.print("�ι�° ����: ");
		int input2 = scan.nextInt();
		
		if(input1>input2) {
			System.out.printf("ū���� %d�̰�, �������� %d�Դϴ�. �� ���ڴ� %d(��)�� ���̳��ϴ�.",input1,input2,input1-input2);
			
		}else if(input1<input2) {
			System.out.printf("ū���� %d�̰�, �������� %d�Դϴ�. �� ���ڴ� %d(��)�� ���̳��ϴ�.",input2,input1,input2-input1);
			
		}else {
			System.out.printf("�� ���ڴ� �����մϴ�.");		
		}
	}
	
	
			
	
	
}
