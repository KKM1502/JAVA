package com.test.obj.inheritage;

public class Ex50_Object {
	public static void main(String[] args) {
		
		/*
		 Object Ŭ����
		 	-�����ڰ� ����� ��� Ŭ������ ���� ������� ������ �ڵ����� ObjectŬ������ ��ӹ޴´�.
		 	-��� Ŭ������ �ٿ� Ŭ���� > Root Class
		 	-��� Ŭ������ Object Ŭ�����κ��� �Ļ��ȴ�.
		 	
		 	-Class Object is the root of the class hierarchy.
		 	-Every class has Object as a superclass. 
		 	-All objects,including arrays, implement the methods of this class.
		 	
		 */
		
		Object o1 = new Object();
		
		
		Test2 t2 = new Test2();
		t2.a = 10;
		t2.b = 20;
		
		
	}
}

//����� ������� �ʴ� Ŭ���� ������ �ڵ�����(100%) Object Ŭ�����κ��� ��ӹ޴´�.
class Test extends Object{
	public int a;
}



class Test2 extends Test{
	public int b ;
}
