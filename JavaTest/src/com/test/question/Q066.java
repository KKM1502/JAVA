package com.test.question;

import java.util.Arrays;

public class Q066 {
//	�䱸����
//	�ߺ����� �ʴ� ������ ���� 6���� ����ÿ�.(�ζ�)
//
//	����..
//	������ ����: 1 ~ 45
//	�������� ����
//	���..
//	[1, 5, 23, 36, 37, 41]
	
	public static void main(String[] args) {
		
		int[] array= new int[6];
		int temp=0;
		int count= 0;
		int i=0;
		
		while(count<6) {
			int random = (int) (Math.random()*45) + 1;
			if(random==temp) {
				continue;
			}
			else{
				temp=random;
				array[i]=random;
				i++;
				count++;
			}
		}

		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}

}
