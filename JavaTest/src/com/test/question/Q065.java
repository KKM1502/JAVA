package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q065 {
//	�䱸����
//	������ ��� �ִ� �迭�� ������ �� �Ʒ��� ���� ����Ͻÿ�.
//
//	����..
//	������ 20�� �߻� �� �迭�� �ִ´�.
//	������ 1 ~ 20 ����
//	�迭�� Ž���Ͽ� ������ �����ϴ� ���ڸ� ����Ѵ�.
//	�Է�..
//	�ִ� ����: 15 
//
//	�ּ� ����: 5 
//
//	���..
//	����: 10, 2, 3, 20, 15, 9, 5, 1, 3, 11, 15, 18, 9, 14, 18, 5, 8, 2, 1, 17
//	���: 10, 15, 9, 5, 11, 15, 9, 14, 5, 8
	
	public static void main(String[] args) {
		
		int[] array = new int[20];
		int[] result = new int[20];
		int count=0;
		int j = 0;
		for (int i = 0; i < 20; i++) {
			int random = (int) (Math.random()*20) + 1;
			array[i]=random;
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�ִ� ����: ");
		int max = scan.nextInt();
		System.out.print("�ּ� ����: ");
		int min = scan.nextInt();

		System.out.print("����: ");
		for (int i = 0; i < 20; i++) {
			System.out.printf("%d, ",array[i]);
		}
		
		System.out.print("\n���: ");
		for (int i = 0; i < 20; i++) {
			
			if(array[i]>=min&&array[i]<=max) {

				System.out.printf("%d, ",array[i]);
			}

		}
		
		
	}
}
