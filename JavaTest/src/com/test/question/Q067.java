package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q067 {
//	�䱸����
//	�迭�� ��Ҹ� �����Ͻÿ�.
//
//	����..
//	�迭 ����: 10
//	������ ��Ҵ� �������� �Ű��� ������ ������ �����ȴ�.
	
//	�Է�..
//	���� ��ġ: 2 
//
//	��: 100 
//
//	���..
//	����: [5, 6, 1, 3, 2, 0, 0, 0, 0, 0]
//	���: [5, 6, 100, 1, 3, 2, 0, 0, 0, 0]
	
	public static void main(String[] args) {
		
		int[] array= {5, 6, 1, 3, 2, 0, 0, 0, 0, 0};
		int[] temp= new int[10];
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ��ġ: ");
		int input = scan.nextInt();
		
		System.out.print("��: ");
		int num = scan.nextInt();
		
		for (int i = 0; i < input; i++) {
			temp[i]=array[i];
		
		}
		
		System.out.printf("����: %s\n",Arrays.toString(array));
		for (int i = input; i < array.length; i++) {
			if(i==input) { // ���� ��ġ�� �� �ֱ� 
			temp[i]=num;}
			else {
				temp[i]=array[i-1]; //������ ������ �̵�
			}
			
			
		}
		
		System.out.printf("����: %s",Arrays.toString(temp));

	
	}
	
	
}
