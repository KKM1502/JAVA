package com.test.obj.type;

public class Ex67 {

	public static void main(String[] args) {
		
		/*
		  
		 상속
		 
		 1.클래스
		 2.인터페이스
		 3.추상 클래스
		 
		 부모 	<-	  자식 
		클래스		 클래스		:o
		인터페이스		 클래스		:o(상속된 추상 클래스를 자식이 구현해야 한다.)
		추상클래스		 클래스		:o(구현멤버는 그대로 상속받고, 추상멤버는 구현한다.)
		인터페이스		 인터페이스	:o
		
		인터페이스		 추상클래스	:o
		추상클래스		 인터페이스	:x(부모의 구현된 멤버를 상속받을 수 없어서...)
		클래스		 인터페이스	:x(부모의 구현된 멤버를 상속받을 수 없어서...)
		인터페이스		 인터페이스	:x
		 
		일반 클래스는 일반 클래스의 부모 역할만 가능하다!
		일반 클래스는 인터페이스나 추상클래스의 부모 역할이 불가능하다.
		 
		추상 클래스는 추상 클래스나 일반 클래스의 부모 역할만 가능하다!
		추상 클래스는 인터페이스 부모 역할이 불가능하다.
		
		인터페이스는 인터페이스, 추상클래스, 일반 클래스의 부모 역할이 가능하다! 
		 
		인터페이스 <- 인터페이스 <- 추상 클래스 <- 추상 클래스 <- 일반 클래스
		 */
		
		
		
	}
	
	
}

interface AAA{
	void aaa(); //추상
	
	
}

abstract class BBB{
	public int b; //구현
	public abstract void bbb(); //추상
	
}

class CCC{
	public int c; //구현
	
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
//	public int b; //구현 (불가능)
//	public abstract void bbb(); //추상
//	
//}

//abstract class III extends AAA{
//	
//}



