package com.test.question;

import java.util.Arrays;

public class Q063 {
//	�䱸����
//	int �迭�� �Ű������� �޾� ������ ���ڿ��� ��ȯ�ϴ� dump �޼ҵ带 �����Ͻÿ�.
//
//	����..
//	String dump(int[] list)
//	ȣ��..
//	int[] list = new int[4];
//
//	list[0] = 10;
//	list[1] = 20;
//	list[2] = 30;
//	list[3] = 40;
//
//	String result = dump(list);
//	System.out.printf("nums = %s\n", result);
//	���..
//	nums = [ 10, 20, 30, 40 ]

	public static void main(String[] args) {
		int[] list = new int[4];
		list[0] = 10;
		list[1] = 20;
		list[2] = 30;
		list[3] = 40;

		String result = dump(list);
		System.out.printf("nums = %s\n", result);
		
	}

	private static String dump(int[] list) {
		// TODO Auto-generated method stub
		
		return Arrays.toString(list);
	}
}
