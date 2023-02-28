package com.test.obj.inheritage;

public class Ex49_Inheritance {
	public static void main(String[] args) {
		
		//상속
			//-부모클래스가 가지는 멤버변수, 멤버메소드 등을 자식클래스에게 물려주는 행동
		//상속하는 이유
			//-비용 절감
			//-코드 재사용
		
		
		
		
		//부모클래스 < 자식클래스
		//슈퍼클래스 < 서브클래스
		//기본클래스 < 확장클래스
		//기본클래스 < 파생클래스
		
		
		Parent p = new Parent();
		p.a = 10;
		p.b = 10;
		p.ccc();
		
		Child c = new Child();
		c.a = 10;
		c.b = 10;
		c.ccc();
		
		
	}//main
}


class Parent{
	public int a;
	public int b;
	public void ccc() {
		System.out.println("ccc");
	}
}


//클래스 상속
//- Child > 자식클래스
//- Parent > 부모클래스
//- 부모클래스(Parent)가 가지는 모든 멤버를 자식클래스(Child)에게 물려준다
class Child extends Parent{
	public int d;
	public int e;
	public void fff() {
		System.out.println("fff");
	}
	
	
	
	
}

//사이트 회원(카페)
//1. 일반 회원
//	- 이름
//	- 아이디
//	- 암호
//	- 이메일
//2. 관리자 회원
//	- 이름
//	- 아이디
//	- 암호
//	- 이메일
//3. 임시 회원
//	- 이름
//	- 아이디
//	- 암호
//	- 유효기간


class Member{
	
	public String name;
	public String id;
	public String pw;
	
	
	
}



class User extends Member{

	public String email;
}
class Administrator extends Member{

	public String email;
}

class Temp extends Member{
	public String exDate;
	
}


