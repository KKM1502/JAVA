package com.test.obj;

public class Ex39_Class {
	
	public static void main(String[] args){
		//Ex39_Class.java
		
		User u1 = new User();
		u1.name="홍길동";
		u1.age = 20;
		u1.hello();
		
		User u2 = new User();
		u2.name="아무개";
		u2.age = 25;
		u2.hello();
		
		User u3 = new User();
		u3.name="하하하";
		u3.age = 23;
		u3.hello();
		
		
		
		
	}//main
	
	
}

//코드 컨벤션
class User{
	
	//멤버 선언
	//1. 멤버 변수
	//2. 멤버 메소드
	
	public String name;
	public int age;
	
	
	//메소드 > 구현 > 개성있는 행동 > 자신만이 가진 데이터를 활용해서 행동
	public void hello() {
		
//		System.out.println("안녕하세요.");
		System.out.printf("안녕하세요. 저는 %s입니다. 그리고 제 나이는 %d살입니	다.\n",name,age);
	}
	
	
}

