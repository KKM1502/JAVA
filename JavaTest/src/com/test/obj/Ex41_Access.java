package com.test.obj;

public class Ex41_Access {

	public static void main(String[] args) {
		
		/*
		 
		 	���� ������(������), Access Modifier
		 	- Ŭ���� ��� ������ �ٿ� ����Ѵ�.
		 	- Ŭ���� ��� �޼ҵ忡 �ٿ��� ����Ѵ�.
		 	- Ŭ���� ��ü�� �ٿ��� ����Ѵ�.
		 	- ����� ���� ������ �����ϴ� ���� > �ܺο� ���� ����  
		 	
		 	
		 	1. public
		 	2. private
		 	-------------
		 	3. protected
		 	4. default
		 
		 
		 
		 */
		
		Book b1 = new Book();
		b1.a = 10;
//		b1.b = 20;//The field Book.b is not visible
		
		System.out.println(b1.a);
//		System.out.println(b1.b);//The field Book.b is not visible
		
		Keyboard k2 = new Keyboard();
//		k2.bbb(20000000);
		k2.setModel("�浿");
		System.out.println(k2.getModel());
		
		
		
	}//main
	
	
	
}
