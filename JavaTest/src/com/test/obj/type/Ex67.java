package com.test.obj.type;

public class Ex67 {

	public static void main(String[] args) {
		
		/*
		  
		 ���
		 
		 1.Ŭ����
		 2.�������̽�
		 3.�߻� Ŭ����
		 
		 �θ� 	<-	  �ڽ� 
		Ŭ����		 Ŭ����		:o
		�������̽�		 Ŭ����		:o(��ӵ� �߻� Ŭ������ �ڽ��� �����ؾ� �Ѵ�.)
		�߻�Ŭ����		 Ŭ����		:o(��������� �״�� ��ӹް�, �߻����� �����Ѵ�.)
		�������̽�		 �������̽�	:o
		
		�������̽�		 �߻�Ŭ����	:o
		�߻�Ŭ����		 �������̽�	:x(�θ��� ������ ����� ��ӹ��� �� ���...)
		Ŭ����		 �������̽�	:x(�θ��� ������ ����� ��ӹ��� �� ���...)
		�������̽�		 �������̽�	:x
		 
		�Ϲ� Ŭ������ �Ϲ� Ŭ������ �θ� ���Ҹ� �����ϴ�!
		�Ϲ� Ŭ������ �������̽��� �߻�Ŭ������ �θ� ������ �Ұ����ϴ�.
		 
		�߻� Ŭ������ �߻� Ŭ������ �Ϲ� Ŭ������ �θ� ���Ҹ� �����ϴ�!
		�߻� Ŭ������ �������̽� �θ� ������ �Ұ����ϴ�.
		
		�������̽��� �������̽�, �߻�Ŭ����, �Ϲ� Ŭ������ �θ� ������ �����ϴ�! 
		 
		�������̽� <- �������̽� <- �߻� Ŭ���� <- �߻� Ŭ���� <- �Ϲ� Ŭ����
		 */
		
		
		
	}
	
	
}

interface AAA{
	void aaa(); //�߻�
	
	
}

abstract class BBB{
	public int b; //����
	public abstract void bbb(); //�߻�
	
}

class CCC{
	public int c; //����
	
}

interface DDD extends AAA{

	void ddd();

}

class EEE implements DDD{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ddd() {
		// TODO Auto-generated method stub
		
	}
	
}

abstract class GGG implements AAA{
	

}

//interface HHH implements BBB{
//	public int b; //���� (�Ұ���)
//	public abstract void bbb(); //�߻�
//	
//}

//abstract class III extends AAA{
//	
//}



