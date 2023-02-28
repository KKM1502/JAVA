package com.test.obj.type;

public class Ex68_enum {

	
	public static void main(String[] args) {
		
		//클래스 종류
		//1. 클래스
		//2. 인터페이스
		//3. 추상 클래스
		//4. enum
		
		//열거형, Enumeration
		//- 여러개 값을 가지고 있는 자료형 > 객관식(선택형)
		
		//요구사항] 의류 쇼핑몰 > 티셔츠 > 고객 방문 > 색상 선택(빨강,노랑,파랑)

		//Case 1.주관식. 오타 발생 확률 있음
		String color = "빨강";
		if(color.equals("빨강")||color.equals("노랑")||color.equals("파랑")) {
			System.out.println("판매 가능");
		}else {
			System.out.println("재고 없음");
		}
		
		//Case 2. 객관식
		int input = Color.RED; //Calendar.YEAR
		
		if(input ==0 || input ==1 || input ==2) {
			System.out.println("판매 가능");
			
		}else {
			System.out.println("재고 없음");
		}
		
		//Case 3. enum
		Colour input2 = Colour.RED;
		if(input2==Colour.RED || input2==Colour.YELLOW || input2==Colour.BLUE) {
			System.out.println("판매 가능");
			
		}else {
			System.out.println("재고 없음");
		}
		
		Gender gender = Gender.MALE;
		Gender gender2 = Gender.FEMALE;
		
		
		
		
	}
}


class Color{
	public final static int RED = 0;
	
	public final static int YELLOW = 1;
	
	public final static int BLUE = 2;
	
}

enum Colour{//멤버만 나옴 
	RED, //public final static int RED (정수, 보통0 부터 순서대로 할당)
	YELLOW, //public final static int YELLOW
	BLUE //public final static int BLUE 
}

enum Gender{
	MALE,
	FEMALE
}

