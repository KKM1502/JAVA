package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q069 {
//	�䱸����
//	�迭�� ��Ҹ� ���������� 2���� ���� ����� �迭�� ������ �� ����Ͻÿ�.
//
//	����..
//	���� �迭 ����: ����� �Է�
//	���� �迭 ���: ����(1~9)
//	��� �迭 ����: ����� �Է� / 2
//	�Է�..
//	�迭 ����: 10 
//
//	���..
//	����: [ 1, 5, 3, 6, 2, 7, 8, 2, 2, 9 ]
//	���: [ 6, 9, 9, 10, 11 ]
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�迭 ����: ");
		int input = scan.nextInt();
		int j = 0;
		
		int[] array = new int[input];
		int[] result = new int[input/2];
		
		for (int i = 0; i < input; i++) {
			int random = (int) (Math.random()*10) + 1;
			array[i]=random;
		}
		System.out.printf("����: %s\n",Arrays.toString(array));
		
		for (int i = 0; i < 10; i=i+2) {
			result[j] =array[i]+ array[i+1];
			j++;
		}
		System.out.printf("���: %s",Arrays.toString(result));
	}


	
}
