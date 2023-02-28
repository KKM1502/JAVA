package com.test.lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class Ex90_Lambda {

	public static void main(String[] args) {
		
	/*
	 	
	 	
	 	람다식 > 인터페이스가 필요하다.
	 	
	 	람다식의 장점 > 간단함( 생산성)
	 	       단점 > 인터페이스를 선언해야한다.
	 	 
	 	*** 자바에선 여러가지 형식의 추상 메소드를 소유한 인터페이스를 제공한다. >> 함수형 인터페이스
	 	       
	 	 함수형 인터페이스 , Function Interface
	 	 - 평범한 인터페이스
	 	 - 목적 : 람다식을 저장하기 위해서 만들어진 인터페이스
	 	1. 표즌 API 함수형 인터페이스
	 	2. 사용자 정의 함수형 인터페이스
	 
	 
	 	표준 API 함수형 인터페이스
	 	1. Consumer
	 	
	 	2. Supplier
	 	
	 	3. Function
	 	
	 	4. Operator
	 	
	 	5. Predicate
	 	
	 	
	 	
	 */
	
		m1();
		
	}

	private static void m1() {
		//Consumer
		//- 매개변수를 받아서 소비하는 업무를 구현하는 인터페이스
		//- acceptXXX() 추상 메소드 제공
	
		MyConsumer m1 = num -> System.out.println(num);
		
		m1.test(10);
		
		//표준 API 함수형 인터페이스(Consumer<T>)
		Consumer<Integer> c1 = new Consumer<Integer>(){

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
			
		};
		
		c1.accept(20);
		
		Consumer<String> c2 = txt ->System.out.println(txt); // accept 메소드
		c2.accept("홍길동");
		
		Consumer<String> c3 = txt -> System.out.println(txt.length());
		c3.accept("홍길동");
		
		Consumer<Integer> c4 = count -> {
			for (int i = 0; i < count; i++) {
				System.out.println(i);
			}
			System.out.println();
		};
		c4.accept(9);
		BiConsumer<String, Integer> bc1 = (name, age) ->{
			System.out.println(name+","+ age+"세");
		};
		bc1.accept("김경민", 27);
		
		IntConsumer ic1 = num -> System.out.println(num*num);
		ic1.accept(2);
	
		//Consumer<T>		:범용
		//BiConsumer<T,U>	:범용
		//IntConsumer		:전용
		
		
	}
	
	

	
}//main


//람다식
interface MyConsumer{
	void test(int num); // int로 해야 <>안에 Integer 을 넣던 String 을 넣던 감당 가능해짐
}





