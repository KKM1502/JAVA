package com.test.obj.inheritage;

public class Ex53_Final {
	public static void main(String[] args) {
		
		/*
		 
		 final Ű����
		 1. ���� ����
		 2. �޼ҵ� ����
		 3. Ŭ���� ����
		 
		 */
		
		//���� ����
		int a = 10;
		a = 20;
		a = 30;
		
		final int b =10;
		//b=20;
		//b=30;
		
		// �� ��� ����� > �Ϲ� ����ó�� ����
		final int c ;
		c = 10;
		// c =20;
		
		//����
		final int d = 10;
		
		//������� ��� �빮�ڷ� �ۼ��Ѵ�. > ������ �������� ����
		final double PI = 3.14;
		
		
		
	}
}


class Gender{
	
	//����(1) ����(2)
	public final int MALE = 1;
	public final int FEMALE = 2;
	
}