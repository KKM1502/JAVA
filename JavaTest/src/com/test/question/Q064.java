package com.test.question;

import java.util.Arrays;

public class Q064 {
//	�䱸����
//	1~20 ������ ������ ��� �ִ� �迭�� �����ϰ� �ִ񰪰� �ּڰ��� ����Ͻÿ�.
//
//	����..
//	������ 20�� �߻� �� �迭�� �ִ´�.
//	������ 1 ~ 20 ����
//	���..
//	����: 10, 9, 3, 18, 15, 9, 5, 4, 3, 11, 15, 18, 9, 14, 18, 5, 8, 7, 9, 17,
//	�ִ�: 18
//	�ּڰ�: 3
	public static void main(String[] args) {
		int[] array= new int[20];
		for (int i = 0; i < 20; i++) {
			int random = (int) (Math.random()*20) + 1;
			array[i]=random;
		}
		System.out.print("����: ");
		for (int i = 0; i < 20; i++) {
			System.out.printf("%d, ",array[i]);
		}
		Arrays.sort(array);
		System.out.printf("�ִ밪: %d\n",array[19]);
		System.out.printf("�ּڰ�: %d",array[0]);
		
	}

}
