package com.test.java;

public class Ex15_Casting {

	public static void main(String[] args) {
//		Ex15_Casting
		
		
		/*
		 (�ڷ�)�� ��ȯ
		 Casting, Data Type Casting
		 �ϳ��� �ڷ����� �� �ٸ� �ڷ������� ��ȯ
		 �ڵ� �ۼ��� �����ϰ� �ϱ� ���ؼ� ���
		 ����������  ����(boolean ����)
		 byte, short, int, long, float, double, char
		 */
		
		int n1;
		int n2;
		//= ������
		//- Lvalue(����) = RValue(��)
		//- Lvalue�� RValue�� �ڷ����� �����ؾ� �Ѵ�.

		n1 = 100;
		n2 = n1;
		
		//�Ͻ��� ����ȯ
		short a = 10;
		int b;
		b = a ;
		System.out.println(b);
		
		//����� ����ȯ
		//����� ����ȯ �� �߻��ϴ� �����Ͱ� ��ġ�� ���� > �����÷ο�
		//�����÷ο찡 �߻��� ���� ��Ȳ�� �̸� �����ϰ� ���� �ʼ�!
		int e =10;
		short f ;
		
		f=(short)e;
		System.out.println(f);
		
	}
	
}
