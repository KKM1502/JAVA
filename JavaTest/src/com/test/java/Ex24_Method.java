package com.test.java;

public class Ex24_Method {
	public static void main(String[ ] args) {
		
		/*
		  
		  
		  	접근지정자 정적키워드 반환자료형 메소드 (인자리스트){
			
				구현부
			
			}
		
		*/
		int a =getNum();
		System.out.println(a);
		
		
		String result = checkAge(25);
		System.out.println(result);
	}//main
	
	//This method must return a result of type int
	public static int getNum() {
		
//		리턴문, 반환문
//		-return 키워드 사용한다,
//		-return 뒤의 값 1개를 돌려주는 역할
		
		
		
		return 10;

		
	}
	public static String checkAge(int age) {
		
		String result = age>=19 ? "성인": "미성년자";
		
		return result;
		
		
	}
	
}
