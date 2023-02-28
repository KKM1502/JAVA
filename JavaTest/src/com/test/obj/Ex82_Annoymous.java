package com.test.obj;

public class Ex82_Annoymous {
	public static void main(String[] args) {
//		�͸� ��ü , Anonymous Object
//		- �͸� Ŭ����, Anonymous Class
//		- �̸��� ���� Ŭ����
//		- �ݵ�� �������̽��� �ʿ��ϴ�.
//
//		�Ǹ� Ŭ����
//		1. ��ü�� N�� ���� �� �ִ�.
//			- Ŭ���� ���� > ��ü ����
//
//		�͸� Ŭ���� 
//		1. ��ü�� �� 1���� ���� �� �ִ�. > 1ȸ�� Ŭ����
//			- Ŭ���� + ��ü ���� 

		//������Ʈ
		// - Ŭ���� ���� > ���� > ���鰳~ ��õ�� �̻�
		// - �̸� ����... > ���� + �ǹ�
		
		
		
		//�䱸����] �������̽��� ������ Ŭ���� �����ϱ� > ��ü�� �����ϱ�

		//1.���� Ÿ���� ���� ����
		BB o1 = new BB();
		o1.aaa();

		//2.�θ� Ÿ���� ���� ����
		AA o2 = new BB();  //��ĳ����
		o2.aaa();

		//3.�߻� Ŭ����, �������̽� > ��ü�� ������ �� ����. > �߻� �޼��� ����
//		AA o3 = new AA();  
//		o3.aaa();


		//AA�� ��ӹ޴� �̸� ���� Ŭ���� ���� �� 
		AA o4 = new AA() {
			@Override
			public void aaa() {
				System.out.println("�߻�޼ҵ� ����2");
			}
		};



	}
}

interface AA{
	void aaa();
}

class BB implements AA{
	@Override
	public void aaa() {
		System.out.println("�߻�޼ҵ� ����");
	}
}
