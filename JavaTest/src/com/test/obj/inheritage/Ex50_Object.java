package com.test.obj.inheritage;

public class Ex50_Object {
	public static void main(String[] args) {
		
		/*
		 Object 클래스
		 	-개발자가 만드는 모든 클래스는 따로 상속하지 않으면 자동으로 Object클래스를 상속받는다.
		 	-모든 클래스의 근원 클래스 > Root Class
		 	-모든 클래스는 Object 클래스로부터 파생된다.
		 	
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

//상속을 명시하지 않는 클래스 선언은 자동으로(100%) Object 클래스로부터 상속받는다.
class Test extends Object{
	public int a;
}



class Test2 extends Test{
	public int b ;
}
