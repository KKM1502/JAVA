package com.test.obj.type;

public class Ex66_abstract {
	public static void main(String[] args) {
		
//		1.클래스
//		2.인터페이스
//		3.추상 클래스
		
		
		
		
		
	}//main
}//main class


/*
interface Keyboard{
	
	
	//구현된 멤버를 가질 수 없다.(실제 존재하는 멤버)
//	public int price;
//	public int weight;
	
	//행동의 제약
	void typing(String txt);
	
	
	
}

*/


//추상 클래스 
// - 구현 멤버를 가질 수 있다.(일반 클래스의 성질)
// - 추상 멤버를 가질 수 있다.(인터페이스의 성질)
abstract class Keyboard{
	public int price;
	public int weight;
	
	private void syout() {
		// TODO Auto-generated method stub
		System.out.println();
	}
	
	public abstract void typing(String txt);
	
	
//	클래스의 멤버 메소드는 구현부를 반드시 가져야한다. > 추상 메소드는 가질 수 없다.
	
//	void typing(Sring txt);//This method requires a body instead of a semicolon
	
}

//keyboard
class K810 extends Keyboard{//인터페이스를 상속받는다 ==  인터페이스 구현한다 라고 한다.
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

