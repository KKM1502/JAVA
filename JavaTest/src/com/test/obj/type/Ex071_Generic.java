package com.test.obj.type;

public class Ex071_Generic {

	public static void main(String[] args) {
		
//		Item is a raw type. References to generic type Item<T> should be parameterized
		Item item1 = new Item();
		item1.c=100; //object
		
		Item<String> item2 = new Item<String>();
		item2.c="홍길동"; //string
		
		Item<Integer> item3 = new Item<Integer>();
		item3.c=200; //int 
//		Item<int> item4 = new Item<int>(); //Syntax error, insert "Dimensions" to complete ReferenceType
	
		Pen<Boolean> p = new Pen<Boolean>();
		
		p.a = true;
		p.b = false;
		p.c = true;
		
		Desk<Double> d = new Desk<Double>();
		d.set(3.14);
		System.out.println(d.get()*2);
		
		Cup<Integer,String>cup = new Cup<Integer,String>(100,"문자열");
		
		System.out.println(cup.getA());
		System.out.println(cup.getB());
	}
}


//제네릭 클래스
//1. T 	: 타입 변수 > 자료형을 저장하는 변수 > 값형식은 불가능 , 참조형식만 가능
//2. <>	: 인자 리스트
class Item<T>{
	public int a;
	public int b;
	public T c; //클래스 설계 당시에는 c의 자료형이 결정되지 않음 > 객체를 생성할 때 결정됨  
	
}

class Pen<T>{
	
	public T a;
	public T b;
	public T c;
	
}

class Desk<T>{
	
	public T a;
	public void set(T a) {
		this.a = a;
	
		T b; //지역변수 자료형  > 비권장, 외부에 노출이 안되어 컨트롤이 힘들다.
		
	}
	public T get() {
		return this.a;
	}
}

class Cup<T,U>{
	public T a;
	public U b;
	
	public Cup(T a, U b) {
		this.a= a;
		this.b= b;
	}
	
	public T getA() {
		return this.a;
	}
	public U getB() {
		return this.b;
	}
}