package com.test.lambda;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

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
	 		-Funtion 하위셋
	 		
	 	5. Predicate
	 		-Funtion 하위셋
	 		-행동 > 판단 역할
	 	
	 	
	 */
	
//		m1();
//		m2();
//		m3();
//		m4();
//		m5();
		m6();
		
		
		
	}

	private static void m6() {
		
		//함수형 인터페이스 중 일부 > 서로간의 결과를 결합  > 람다식 연산
		User hong = new User("1", "홍길동", 20, "M", "서울", "010-1234-5678");
		
		//업무1
		Consumer<User> c1 = user -> System.out.println("이름: "+ user.getName());
		c1.accept(hong);
		
		
		//업무2
		Consumer<User> c2 = user -> System.out.println("나이: "+ user.getAge());
		c2.accept(hong);
		
		//업무3. 업무1 + 업무2 동시에 실행 > 기존 c1과 c2를 재사용? > 메소드 생성
		test(hong,c1,c2);
		System.out.println();
		
		//c3 = c1+ c2;
		Consumer<User> c3 =  c1.andThen(c2); //c1 하고 c2 하기 
		c3.accept(hong);
		System.out.println();
		
		Consumer<User> c4 = user -> System.out.println("전화: "+ user.getTel());
		
		Consumer<User> c5 = c1.andThen(c2).andThen(c4); // c1+c2+c4
		c5.accept(hong);
		System.out.println();
		
		//위의 연산이 불가능 : c1 + c2	
		Consumer<User> c6 = user -> {
			System.out.println("이름: "+ user.getName());
			System.out.println("나이: "+ user.getAge());
		};
	
		Function<Integer,Boolean> f1 = num -> num>0;
		
		Function<Boolean,String> f2 = result -> result ? "성공": "실패";
		System.out.println(f2.apply(true));

		//		f1+f2 = f3
		Function<Integer,String> f3 = f1.andThen(f2);
		System.out.println(f3.apply(10));
		
		Predicate<Integer> p1 = num -> num % 2 == 0;
		
		//3의 배수
		Predicate<Integer> p2 = num -> num % 3 == 0;
		
	
		
		int a = 4;
		
		System.out.println(p1.test(a));
		System.out.println(p2.test(a));
		System.out.println();
		Predicate<Integer> p4 = p1.or(p2);
		System.out.println(p4.test(a));
		System.out.println();
		Predicate<Integer> p5 = p1.negate();
		System.out.println(p5.test(a));
		
		
		
		//a가 2와 3의 공배수인가?
		
		
		
		
	}

	private static void test(User hong, Consumer<User> c1, Consumer<User> c2) {
		c1.accept(hong);
		c2.accept(hong);
	
	}

	private static void m5() {
//		5. Predicate
//		-testXXX() 추상 메소드 제공
		Function<Integer,Boolean>	f1 = num -> num > 0;
		System.out.println(f1.apply(10));
		System.out.println(f1.apply(-10));
	
		Predicate<Integer> p1 = num -> num > 0;
		System.out.println(p1.test(10));
		BiPredicate<Integer,Integer> p2=(num,b) -> num >b;
		System.out.println(p2.test(1,2));
	}

	private static void m4() {
		
		
		//4. Operator
		//applyXXX() 추상 메소드 제공
		//추상 메소드의 매개변수와 반환값이 자료형이 동일하다.
		
		//연산자와 메소드는 성질이 같다.
		
		//result = 1 + 1
		//result = sum(1,1)
		
		BiFunction<Integer, Integer, Integer> bf1 = (a,b) -> a+b;
		System.out.println(bf1.apply(10, 20));
		
		BinaryOperator<Integer> bo1 = (a,b) -> a+b;
		System.out.println(bo1.apply(10, 20));
		
		Function<Integer,Integer> bo2 = num -> num*num;
		System.out.println(bo1.apply(10, 20));
		
		
		
	}

	private static void m3() {

		//3. Function
		// -Function<T,R>
		// -BiFunction<T,U,R>
		// -매개변수를 전달하면, 처리 후 반관값을 돌려주는 업무를 구현하는 인터페이스
		// -applyXXX() 추상 메소드 제공
		
		Function<Integer,Boolean> f1 = num -> num > 0;
		System.out.println(f1.apply(10));
		System.out.println(f1.apply(-10));
		
		Function<String,Integer> f2 = txt -> txt.length();
		System.out.println(f2.apply("홍길동"));
		
		User user = new User("1", "홍길동", 20, "M", "서울","010-1234-1234");
		User user2 = new User("2", "홍길동", 20, "F", "서울","010-1234-1234");
		
		
		
		Function<User, String> f3 = u ->u.getGender().equals("M")?"남자":"여자";
		System.out.println(f3.apply(user));
		System.out.println(f3.apply(user2));
		
		BiFunction<Integer, Integer, Integer> bf1 = (a,b)->a+b;
		System.out.println(bf1.apply(10, 20));
		
		BiFunction<Integer, Integer, String> bf2 = (a,b) ->{
			if(a>b) {
				return "크다";
			}
			else if(a<b) {
				return "작다";
			}
			else{
				return "같다";
			}
		};
		System.out.println(bf2.apply(10, 20));
		System.out.println(bf2.apply(10, 10));
		System.out.println(bf2.apply(30, 20));
		

	
	}

	private static void m2() {
		
		//2. Supplier
		//	- 매개변수 없이 반환값을 돌려주는 업무를 구현하는 인터페이스
		//	- getXXX() 추상 메소드 제공
		
		Supplier<Integer> s1 = () -> {return 100; };// Supplier을 람다식으로 표현 
		System.out.println(s1.get());
		
		Supplier<Double> s2 = () -> Math.random();
		System.out.println(s2.get());
		
		Supplier<Integer> s3 = () ->{
//			Calendar now = new GregorianCalendar();
			Calendar now = Calendar.getInstance();
			
			return now.get(Calendar.HOUR_OF_DAY);
		};
		System.out.println(s3.get());
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
		
		
		ObjIntConsumer<Integer> oic1 = (a,num) ->{
			
		};
		
		//Consumer<T>		:범용
		//BiConsumer<T,U>	:범용
		//IntConsumer		:전용
		
		
	}
	
	

	
}//main


//람다식
interface MyConsumer{
	void test(int num); // int로 해야 <>안에 Integer 을 넣던 String 을 넣던 감당 가능해짐
}





