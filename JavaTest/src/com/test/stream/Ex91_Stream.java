package com.test.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Stream;

import com.test.data.Data;

public class Ex91_Stream {

	public static void main(String[] args) {
		/*
		 
		 	Stream
		 	- Java 8
		 	- 배열(컬렉션)의 탐색(조작)
		 	- 파일 입출력
		 	- 디렉토리 탐색
		 	- 빈번하게 익명 객체를 사용 > 람다식 사용 + 표준 API 함수 인터페이스 사용
		 	
		 	표준 API 함수형 인터페이스
		 	1. Consumer
		 		- (매개변수) -> {};
		 	
		 	2. Supplier
		 		- () -> {return 값;}
		 		
		 	3. Function
		 		-(매개변수) -> { return 값; }
		 	
		 	4. Operator
		 		-(매개변수) -> {return 값;}
		 		-매개변수와 반환값의 자료형이 동일
		 		
		 	5.Predicate
		 		-(매개변수) -> { return 값;}
		 		-반환값의 자료형이 boolean
		 		 
		 		 
		 		 
		 	스트림 > 데이터 조작? > 파이프
		 	
		 	파이프
		 	- 스트림 객체 메소드
		 	1. 중간 파이프
		 		- 반환값 > 스트림 반환
		 		
		 	2. 최종 파이프
		 		- 반환값 > 스트림 아닌 다른 자료형을 반환 or void
		 		
		 	필터링
		 	- filter() 메소드
		 	- 중간 파이프
		 	- 앞의 스트림의 값들을 받아서 > 검사 > 조건을 만족하는 요소만 넘겨 스트림생성
		 	
		 	
		 	중복 제거
		 	-distinct() 메소드
		 	
			변환(매핑)
			- map(), mapXXX()
			- 중간 파이프
			- 앞의 스트림의 값들을 받아서 > 다른 값으로 변환한 새로운 스트림 생성

			정렬
			- sorted()
			- 중간 파이프
			- 앞의 스트림의 값들을 받아서 > 정렬된 상태의 새로운 스트림 생성
			- 이전 컬렉션의 sort(Comparator)와 동일
			
			매칭
			- allMatch(), anyMatch(), noneMatch()
			- 최종 파이프
			- a. boolean allMatch(Predicate): 모든 요소가 만족하는지? AND연산
			- b. boolean anyMatch(Predicate): 일부 요소가 만족하는지? OR연산
            - c. boolean noneMatch(Predicate): 모든 요소가 불만족하는지? 부정연산

		 	
		 */
//		m2();
//		m1();
	
//		m3();
//		m4();
//		m5();
//		m6();
//		m7();
//		m8();
		m9();
//		m10();
	}

	private static void m9() {

		
	}

	private static void m10() {
		
		//Optional<T>
		//- 값형 자료형을 취급하지만 null을 가질 수 있다.
		
		int age = getAge("홍길동");
		System.out.println("나이: " + age);

		Optional<Integer> num = getNum("홍길동");
		if(num.isEmpty()) {
			System.out.println("번호: " + num.get());
		}
		else {
			System.out.println("회원없음");
		}
		
	}
	private static Optional<Integer> getNum(String name){
		
		Optional<Integer> 	num = Optional.empty();
		if(name.equals("홍길동")) {
			num=Optional.of(10);
		}else if(name.equals("아무개")){
			num=Optional.of(220);
		}
		else if(name.equals("호호호")){
			num=Optional.of(30);
		}
		return num;
	}

	private static int getAge(String name) {
		int age =0;
		if(name.equals("홍길동")) {
			age = 20;
		}else if(name.equals("아무개")){
			age= 25;
		}
		else if(name.equals("호호호")){
			age= 22;
		}
		return age;
	}

	private static void m8() {
	
		int[] nums = {2,3,4,6,8,10};
		
		boolean result = true;
		
		//배열안에 짝수만 있는지 확인
		
		for (int n : nums) {
			if(n%2==1) {
				result = false;
				break;
			}
		
		}
		if (result) {
			System.out.println("짝수만 존재");
			
		}else {
			System.out.println("홀수 발견!");
		}
	
		result = Arrays.stream(nums).allMatch(n -> n%2 ==0);
		System.out.println(result); //false
		
		result = Arrays.stream(nums).anyMatch(n -> n%2 ==1);
		System.out.println(result);	//true
		
		result = Arrays.stream(nums).noneMatch(n -> n%11 ==0);
		System.out.println(result);	//true
	
	
	}

	private static void m7() {
		List<String> list = new ArrayList<String>(10);
		list.add("홍길동");
		list.add("김경민");
		list.add("노홍철");
		list.add("유재석");
		list.add("정준수");
		list.add("김윤호");
		list.add("김형준");
		list.add("김영욱");
		list.add("김영욱쿤");
		list.stream().sorted().forEach(name->System.out.println(name));
		System.out.println();
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
		list.stream().sorted((a,b) -> a.charAt(0)>=b.charAt(0)? -1: 1).forEach(name->System.out.println(name));
	
		
		List<Integer> list1 = new ArrayList<Integer>(10);
		list1.add(70);
		list1.add(80);
		list1.add(50);
		list1.add(60);
		list1.add(40);
		list1.add(90);
		list1.add(30);
		list1.add(20);
		list1.add(10);
		Collections.sort(list1);//오름차순 (a,b) -> a-b
		System.out.println(list1);	
		Collections.sort(list1, (a,b) -> b-a);//내림차순
		System.out.println(list1);
		
		list1.sort(Comparator.naturalOrder());
		System.out.println(list1);	
		list1.sort(Comparator.reverseOrder());
		System.out.println(list1);
		
		Optional<Integer> result = list1.stream().max((a,b)->a-b);
		System.out.println(result);
		
	}
	
	
	

	private static void m6() {
		
		List<String> list = new ArrayList<String>(10);
		list.add("홍길동");
		list.add("김경민");
		list.add("노홍철");
		list.add("유재석");
		list.add("정준수");
		list.add("김윤호");
		list.add("김형준");
		list.add("김영욱");
		list.add("김영욱쿤");
		
		System.out.println(list);
		System.out.println();
		
		list.stream().forEach(word -> System.out.print(word.length()));
		System.out.println();
		
		list.stream().map(word -> word.length()).forEach(num->System.out.print(num));
		System.out.println();
		
		list.stream().map(word -> word.substring(0,2)).forEach(word->System.out.print(word+" "));
		
		
		String[] names = {"홍길동", "유재석", "박명수", "박나래", "장도연"};
		Arrays.stream(names).map(name ->name.substring(1)).forEach(name->System.out.print(name+"  "));
		System.out.println();
		
		for (int i = 0; i < names.length; i++) {
			
			String firstName = names[i].substring(1);//성
			String lastName = names[i].substring(0,1);//이름
			
			Name name = new Name();
			name.setFirstName(firstName);
			name.setLastName(lastName);
			System.out.println(name.getFirstName() + ","+name.getLastName());
		}
		
		System.out.println();
		
		Arrays.stream(names).map(name->{
			String firstName = name.substring(1);//성
			String lastName = name.substring(0,1);//이름
			Name result = new Name();
			result.setFirstName(firstName);
			result.setLastName(lastName);
			return result;
		}).forEach(name -> {
			System.out.println(name.getFirstName() + ","+name.getLastName());
		});
		
		
		Data.getIntList(5)
		.stream()
		.map(num ->1)	//상수변환 , 쓸모없음
		.forEach(n->System.out.println(n));
		
		
		
		
		
		
		
		
		
		
	
	}

	private static void m5() {
		ArrayList<Integer> list =new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			list.add((int)(Math.random()*10)+1);
			
		}
		System.out.println(list);
		System.out.println(list.size());
		System.out.println();
		
		//Set 사용
		Set<Integer> set = new HashSet<Integer>();
		for (int n : list) {
			set.add(n);
		}
		System.out.println(set);
		System.out.println(set.size());
		
		list.stream().distinct().forEach(num->System.out.printf("%3d",num));
		System.out.println();
		System.out.println(set.size());
		System.out.println();
		
		
		
	}

	private static void m4() {
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(91);
				
		list.stream().filter(num-> num%2 ==0).forEach(num->System.out.printf("%4d",num));
		System.out.println();
		System.out.println();
		
		
		ArrayList<String> list1 =new ArrayList<String>();
		list1.add("홍길동");
		list1.add("김경민");
		list1.add("노홍철");
		list1.add("유재석");
		list1.add("정준수");
		list1.add("김윤호");
		list1.add("김형준");
		list1.add("김영욱");
		list1.add("김영욱쿤");
		list1.stream().filter(word->word.length() <4).filter(word->word.startsWith("김")).forEach(word->System.out.println(word));
		System.out.println();

		
	
	}

	private static void m3() {
		//스트림을 얻어오는 법
		//1. 컬렉션으로분터
		//2. 배열로부터
		
		
//		Path dir = Path.get("C:\\Users\\Administrator\\Documents\\Warcraft III\\CustomMapData\\ORD10");
//		Files.list(dir).forEach(p->{
//			System.out.println(p.getFileName());
//			System.out.println(p.toFile().length());
//		});
	}

	private static void m2() {
		int[] num1 = Data.getIntArray();
		System.out.println(Arrays.toString(num1));
	}

	private static void m1() {
		
		List<Integer> list= Data.getIntList(10);
		System.out.println(list);
		Stream<Integer> stream = list.stream();
		
		Consumer<Integer> c1 = num -> System.out.println(num);
		
		//forEach 메소드의 행동 >> 배열로부터 데이터 집합을 공급받음
		//1. stream > 배열로구터 데이터 집합을 공급받는다.
		//2. forEach > 공급받은 데이터를 하나씩 처리
		//3. Consumer > forEach가 하나씩 꺼내온 데이터를 스스로 처리(x) > 컨슈머에게 전달 + 처리
		stream.forEach(c1);  //배열 탐색 > c1.accept(n) x 10회 호출
		
		List<Double> list2= Data.getDoubleList(10);
		Stream<Double> stream2 = list2.stream();
		Consumer<Double> c2= num -> System.out.println(num); 
		stream2.forEach(c2);
		
		System.out.println();
		System.out.println();
		System.out.println();

		//메소드 체인
		//- 메소드의 반환값에 바로 또 다른 메소드를 연결시킨 모습
		//- 함수형 프로그래밍 방식
		Data.getDoubleList(10).stream().forEach(num -> System.out.println(num));
	
	}

	
}

class Name {
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}



