package com.test.question;

import java.util.Scanner;

public class Q039 {
//	�䱸����
//	�Ʒ��� ���� ����Ͻÿ�.
//
//	�Է�..
//	���� ����: 1 
//
//	���� ����: 10 
//
//	���..
//	1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ����: ");
		int start= scan.nextInt();
		
		System.out.print("���� ����: ");
		int end= scan.nextInt();
		int sum = 0;
			
		for (int i = start; i <= end; i++) {
			if(i!=end) {
				System.out.printf("%d + ",i);
				sum+=i;
			}
			else {
				System.out.printf("%d = ",i);
				sum+=i;
			}
		}
		System.out.printf("%d",sum);
		
	}



	
}
