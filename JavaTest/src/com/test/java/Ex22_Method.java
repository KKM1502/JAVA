package com.test.java;

public class Ex22_Method {
	
	//main �޼ҵ�
	//- Ư���� �޼ҵ�
	//- �̸��� ����(�����)
	//- ���α׷��� �����ϸ� �ڹٰ� �ڵ����� ����(ȣ��)�ϴ� �޼ҵ� > ������ main()���� �ڵ�� �ڵ����� ����ȴ�.
	
	public static void main(String[] args) {
//	Ex22_Method
	/*
	 	�޼ҵ�, Method
	 	-�޼ҵ�(Method), �Լ�(Function), ���ν���(Procedure), �����ƾ(SubRoutine)
	 	-�ڵ��� ����
	 	-���� ������ ���� �ڵ��� ����
	 	
	 	�޼ҵ� ���
	 	1. �޼ҵ� �����ϱ�
	 		-1ȸ
	 	
	 	2. �޼ҵ� ȣ���ϱ�
	 		-1ȸ ~ ���Ѵ� 
	 	
	 		
	 	�䱸����]"�ȳ��ϼ���" x5ȸ ���
	 	��������]"�ݰ����ϴ�" x5ȸ ���
	 	
	 	
	 */
		
		//���� -> ���������� ����� 
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		
		//�޼ҵ� ȣ���ϱ�
		hello();
		hello();
		hello();
		hello();
		hello();
	}// main
	
	//�޼ҵ� �����ϱ�
//	public 		static 		void 		hello		()		<<���
//  ���������� 	����Ű����		��ȯ�ڷ��� 	�޼ҵ��		���ڸ���Ʈ
//	{
//		System.out.println("�ȳ��ϼ���"); <<�ٵ�
//	}
	
	//�ڵ��� ���뼺
	public static void hello() {
		//������ (Body)
		//- �޼ҵ尡 �Ϸ��� ���� �ڵ� ����
		System.out.println("�ݰ����ϴ�");
	}
}
