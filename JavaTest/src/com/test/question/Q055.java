package com.test.question;

public class Q055 {
//	�䱸����
//	1���� 100������ �������� ���Ͻÿ�.
//
//	����..
//	������: �ڱ� �ڽ��� ������ ������ ������� ���� �ڽŰ� ������ ��
//	���: � ���� ���� ������ �������� ���� �������� ��
//	���..
//	6 = [1, 2, 3,]
//	28 = [1, 2, 4, 7, 14,]
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			int sum = 0;
			String txt = "";
			for (int j = 1; j < i; j++) {
				if(i%j==0) {
					sum+=j;
					txt+=j+",";
				}
			}
			if(sum == i ) {
				System.out.printf("%d = [%s]\n",i,txt);
			}
			}
		
		}
	}
	
	
