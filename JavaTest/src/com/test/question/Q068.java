package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q068 {
//	�䱸����
//	�迭�� ��Ҹ� �����Ͻÿ�.
//
//	����..
//	�迭 ����: 10
//	������ ��Ҵ� 0���� ä��ÿ�.
//	�Է�..
//	���� ��ġ: 2 
//
//	���..
//	����: [5, 6, 1, 3, 2, 0, 0, 0, 0, 0]
//	���: [5, 6, 3, 2, 0, 0, 0, 0, 0, 0]
//	�Է�..
//	���� ��ġ: 5 
//
//	���..
//	����: [5, 6, 1, 3, 2, 8, 7, 4, 10, 9]
//	���: [5, 6, 1, 3, 2, 7, 4, 10, 9, 0]
	
	public static void main(String[] args) {
		
		int[] array= {5, 6, 1, 3, 2, 8, 7, 4, 10, 9};
		int[] temp= new int[10];
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ��ġ: ");
		int input = scan.nextInt();
	
		for (int i = 0; i < input; i++) {
			temp[i]=array[i];
		
		}
		
		System.out.printf("����: %s\n",Arrays.toString(array));
		for (int i = input; i < array.length-1; i++) {
			temp[i]=array[i+1];
			if(input==9) {
				temp[i]=0;
			}
			
		}
		
		System.out.printf("����: %s",Arrays.toString(temp));

	
	}
		
}
