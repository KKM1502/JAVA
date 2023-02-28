package com.test.obj;

public class Ex41_Access {

	public static void main(String[] args) {
		
		/*
		 
		 	접근 지정자(제어자), Access Modifier
		 	- 클래스 멤버 변수에 붙여 사용한다.
		 	- 클래스 멤버 메소드에 붙여서 사용한다.
		 	- 클래스 자체에 붙여서 사용한다.
		 	- 멤버의 노출 수위를 조절하는 역할 > 외부에 공개 유무  
		 	
		 	
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
		k2.setModel("길동");
		System.out.println(k2.getModel());
		
		
		
	}//main
	
	
	
}
