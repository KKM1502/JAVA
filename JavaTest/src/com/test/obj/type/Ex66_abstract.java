package com.test.obj.type;

public class Ex66_abstract {
	public static void main(String[] args) {
		
//		1.Ŭ����
//		2.�������̽�
//		3.�߻� Ŭ����
		
		
		
		
		
	}//main
}//main class


/*
interface Keyboard{
	
	
	//������ ����� ���� �� ����.(���� �����ϴ� ���)
//	public int price;
//	public int weight;
	
	//�ൿ�� ����
	void typing(String txt);
	
	
	
}

*/


//�߻� Ŭ���� 
// - ���� ����� ���� �� �ִ�.(�Ϲ� Ŭ������ ����)
// - �߻� ����� ���� �� �ִ�.(�������̽��� ����)
abstract class Keyboard{
	public int price;
	public int weight;
	
	private void syout() {
		// TODO Auto-generated method stub
		System.out.println();
	}
	
	public abstract void typing(String txt);
	
	
//	Ŭ������ ��� �޼ҵ�� �����θ� �ݵ�� �������Ѵ�. > �߻� �޼ҵ�� ���� �� ����.
	
//	void typing(Sring txt);//This method requires a body instead of a semicolon
	
}

//keyboard
class K810 extends Keyboard{//�������̽��� ��ӹ޴´� ==  �������̽� �����Ѵ� ��� �Ѵ�.
	public String color;
//	public int price;
//	public int weight;
	
	public void typing(String txt) {
		
	}
}

//keyboard
class K380 extends Keyboard{
//	public int price;
//	public int weight;
	public int size;
	
	public void typing(String txt) {
		
	}
}

