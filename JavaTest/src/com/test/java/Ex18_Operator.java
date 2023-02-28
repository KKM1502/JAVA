package com.test.java;

public class Ex18_Operator {
	
	public static void main(String[] args) {
		//Ex18_Operator
		/*
		 	������, Operator
		 	- ���� ������ > ���α׷��� ������
		 	- �ǿ����ڸ� ������� �̸� ������ ������ �� �Ŀ�, ������ ����� ��ȯ�ϴ� ���
		 	- �ַ� ��ȣ�� ���� ��� + ���ܾ ���� ���
		 	
		 	1.����, Statement
		 	2.ǥ����, Expression
		 	3.������, Operator
		 	4.�ǿ�����, Operand
		 	5.������ �켱����
		 	6.������ �������
		 	
		 	����, Statement
		 	- 1�� �̻��� ǥ������ �𿩼� ������ �����.
		 	- int sum = 10 + 20;
		 	
		 	ǥ����, Expression
		 	- ������ �����ϴ� �ּ� ����
		 	- int sum
		 	- 10 + 20
		 	
		 	������, Operator
		 	- +
		 	- =
		 	
		 	�ǿ�����, Operand
		 	- +: 10, 20
		 	- =: sum = 30
		 	
		 	������ �켱����
		 	- �ϳ��� ���忡 �����ִ� ��� �������, ���� ���� �����ؾ� �ϴ��� ������ �������ִ�.
		 	������ �������
		 	- 1 + 2 + 3 = 6
		 	
		 	������ ����
		 	1. �ൿ(����)
		 		a. ��� ������
		 		b. �� ������
		 		c. �� ������
		 		d. ���� ������
		 		e. ���� ������
		 		f. ���� ������
		 	1. ����(�ǿ����� ����)
		 		a. 1�� ������
		 		b. 2�� ������
		 		c. 3�� ������
		 */
		
		int sum = 10 + 20;
		System.out.println(sum);
		
		/*
		 	��� ������
		 	- +, -, *, /, %(mod, ������������)
		 	- 2�� ������
		 	- �ǿ����ڴ� ���ڸ� ������. (����,�Ǽ�)
		 	��� ��� �������� ������� �ڷ����� �� �ǿ������� �ڷ����߿��� �� ũ�Ⱑ ū �ڷ������� ��ȯ�ȴ�.
		 */
		
		int a = 10;
		int b = 3;
		System.out.printf("%d + %d = %d\n", a,b,a+b);
		System.out.printf("%d - %d = %d\n", a,b,a-b);
		System.out.printf("%d * %d = %d\n", a,b,a*b);
		System.out.printf("%d / %d = %d\n", a,b,a/b);
		System.out.printf("%d %% %d = %d\n", a,b,a%b);
	
		int e = 1000000000;
		int f = 2000000000;
		// int + int = int
		long g = (long)e+f;
		System.out.println(g); // int �� 21����� ����~~ �����÷ο�� ����÷ο츦 ��������
		
		//�޷� ����� > ���� 
		//1. a�� b�� 1�� > ���� ���� ? �� 
		//2. a�� b�� ��������? 28
		//���������� ���

		
		//���� �� int�� �ַ� ����ϴ���?
		// - ������ ���ͷ��� int 
		// - 
		byte b1 = 10;
		byte b2 = 20;
		
		//byte + byte = byte(x)
		System.out.println(b1+b2);
		//byte + byte = int(o)
		//***byte, short�� ��� ������ ������ int��. > CPU ó�� ���� 
				
		byte b3 = (byte)(b1 + b2); // ()�������� �켱������ �����ش�.		
		System.out.println(b3);
		
		int b4 = b1 + b2;
		
		//����(byte, short, int, long)>int(�ַ�), long(����)
		//�Ǽ�(float, double) > double(�ַ�) - ���е�����
		
		
	}//main
}
