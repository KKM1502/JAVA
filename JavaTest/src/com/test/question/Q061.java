package com.test.question;


import java.util.Scanner;

public class Q061 {
//	�䱸����
//	���ڸ� 5�� �Է¹޾� �迭�� ���� �� �������� ����Ͻÿ�.
//
//	����..
//	int[] nums = new int[5];
//	�Է�..
//	����: 5 
//
//	����: 1 
//
//	����: 7 
//
//	����: 2 
//
//	����: 3 
//
//	���..
//	nums[4] = 3
//	nums[3] = 2
//	nums[2] = 7
//	nums[1] = 1
//	nums[0] = 5
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[5];
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print("����: ");
			int input = scan.nextInt();
			nums[i]=input;
		}

		for (int i = nums.length-1; i>=0; i--) {
			System.out.printf("nums[%d]=%d\n",i,nums[i]);
		}
		

		
		
		
		
	}
	
}
