package com.test.java;


public class Ex10_Input {

	public static void main(String[] args) throws Exception	{
		
		//Ex10_Input.java
		
		/*�ܼ� �Է�
		 
		 1. System.in.read()
		 	-read() �޼ҵ�
		 	-System.out.print() �ݴ� ���
		 	-����
		 
		 2. BufferedReader Ŭ����
		 	-����
		 
		 3. Scanner Ŭ����
		 	-���� ����
		 
		*/
		
		
		//�䱸����] ����ڿ��� ���� 1���� �Է¹޾� ȭ�鿡 �״�� ���
		
		//1. �ȳ� �޽����� ���
		//2. Ű �Է�
		//3. ȭ�鿡 ���
		//���� ���� > ȭ�� ���� > ȭ�� ����
		System.out.print("���ڸ� �Է��ϼ���:"); //1.��
		
		//System.out.print("A"); //2.����� �Է�
		
		//����ڷκ��� Ű���� �Է¹޾� �Է��� ���ڸ� �����ִ� ��ɾ�
		
		int code = System.in.read();
		
		// ���� �ڵ尪
		// char
		// A > 65
		// a > 97
		// 0 > 48
		
		System.out.println(code);
		System.out.printf("%c\n",code);
		System.out.printf("�Է��� ���ڴ� %c�Դϴ�.",code); //3.���
		
		
	
		
	}
}
