package com.test.obj;

public class Ex42_Access {

	public static void main(String[] args) {
	
		Cup c1 = new Cup();
		
		c1.setColor("White");
		System.out.println(c1.getColor());
		
		
		//Setter > 쓰기 전용 멤버
		c1.setWeight(500);
//		System.out.println(c1.get);
		
		//Getter > 읽기 전용 멤버
		System.out.println(c1.getPrice());
		
		//계산된 프로퍼티
		System.out.println(c1.getLevel());
		//클래스 내부에서 일어나는 일은 외부에서는 알 수 없다. 
		
		//자바 용어
		//- c1.type			> field(필드)
		//- c1.getType()	> property(프로퍼티) >getter/setter 
		
	}
	
	
}
