package com.test.question;

public class Q010 {
	public static void main(String[] args) {
		/*
		 1. ����
		 	void digit(int num)
			3�� ������ ���(���ǹ� ��� ����)
			�Է��� ���ڰ� 4�ڸ� �̻��̸� �״�� ����Ѵ�.
		 
		 2. ȣ��
		 	ȣ��..
			digit(1);
			digit(12);
			digit(321);
			digit(5678);
			digit(98765);
		 
		 3. ���
		 	���..
			1 �� 0001
			12 �� 0012
			321 �� 0321
			5678 �� 5678
			98765 �� 98765
		 */
		
		digit(1);
		digit(12);
		digit(321);
		digit(5678);
		digit(98765);
		
	}//main
	
	public static void digit(int num) {
		
		System.out.println((num<10?"000"+num:num<100?"00"+num:num<1000?"0"+num:num));
	}
	
	
}
