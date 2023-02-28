package com.test.lambda;

public class Ex87_lambda {

	public static void main(String[] args) {
		/*
		 	-람다식을 사용하면 코드 일부가 간결해진다.
		 	-목적 >> 컬렉션 조작
		 	
		 	-자바의 메소드를 표현하는 방법 중 하나로 사용
		 	-람다식은 메소드를 대신하는 코드블럭이다.
		 	-자바의 람다식은 인터페이스를 사용해서 만든다.
		 	-자바의 람다식은 익명 객체를 만드는 표현을 간소화시킨 기술이다.
		 	
		 
		 
		 
		 */
		
			//추상 메소드 형식에 다라...
			// - 매개변수 있는놈 , 없는놈
			// - 반환값 있는놈 , 없는놈
		NoParameterNoReturn pr1 = new NoParameterNoReturn() {
			
			@Override
			public void call() {
				System.out.println("pr1");
			}
		};
		pr1.call();
		
		//메소드 선언이 아님 문장을 만드는 작업
		NoParameterNoReturn pr2 = ()->{ //call
			System.out.println("pr2");
		};
		pr2.call();
		
		//***람다식 구현부에 실행문장이 1줄이면 {}를 생략해도 됩니다.
		NoParameterNoReturn pr3 = () ->System.out.println("pr3");
		pr3.call();
		
		ParameterNoReturn pr4 = (int n) ->{
			System.out.println("pr4: "+n);
		}; 
		pr4.call(100);
		pr4.call(200);
		pr4.call(300);
		
		//***매개변수의 자료형을 생략할 수 있다.
		ParameterNoReturn pr5 = (n)->{
			System.out.println("pr5: "+n);
		};
		
		//***매개변수의 ()를 생략할 수 있다.
		ParameterNoReturn pr6 = n->{
			System.out.println("pr6: "+n);
		};
		ParameterNoReturn pr7 = n->System.out.println("pr6: "+n);
		
		MultiParameterNoReturn pr8 =  (name , age)-> {
			System.out.println("pr8: " +name + age);
		};
		pr8.call("KyeongMin",27);
		
		NoParameterReturn p12 = ()->{
			return 0;
		};
		
		ParameterReturn pr13 = (a,b)-> a+b; //return a+b
		System.out.println("pr13:"+pr13.call(10, 20));
	}//main
	
}


interface MyInterface{
	void test();
}


interface TestInterface{
	void aaa();
	void bbb();
}

interface NoParameterNoReturn{
	void call();
}
interface ParameterNoReturn{
	void call(int n);
}
interface MultiParameterNoReturn{
	void call(String name, int age);
}
interface NoParameterReturn{
	int call();
}
interface ParameterReturn{
	int call(int a, int b);
}





