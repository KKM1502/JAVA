package com.test.question;

import java.util.Scanner;

public class Q031 {
	public static void main(String[] args) {
		
		
//		���� 5���� �Է¹޾� ¦���� Ȧ���� ������ ����Ͻÿ�.
//
//		�Է�..
//		���� �Է�: 3 
//
//		���� �Է�: 2 
//
//		���� �Է�: 7 
//
//		���� �Է�: 1 
//
//		���� �Է�: 8 
//
//		���..
//		¦���� 2�� Ȧ���� 3�� �Է��߽��ϴ�.
//		Ȧ���� ¦������ 1�� �� �����ϴ�.
		
		int count_1=0; //Ȧ��
		int count_0=0; //¦��
		Scanner scan = new Scanner(System.in);
		//Ȧ��
		for (int i = 0; i < 5; i++) {
			System.out.print("���� �Է�: ");
			int input= scan.nextInt();
			if(input %2 ==1) {
				count_1++;
			}else if(input %2 ==0) {
				count_0++;
			}
		}
		if(count_1>count_0) {
		System.out.printf("¦���� %d�� Ȧ���� %d�� �Է��߽��ϴ�.\nȦ���� ¦������ %d�� �� �����ϴ�.",count_0,count_1,count_1-count_0);
		}else if(count_1<count_0) {
		
		System.out.printf("¦���� %d�� Ȧ���� %d�� �Է��߽��ϴ�.\nȦ���� ¦������ %d�� �� �����ϴ�.",count_0,count_1,count_0-count_1);
		}
	}


	
}
