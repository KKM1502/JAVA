package com.test.question;

import java.util.Scanner;

public interface Q027 {

	public static void main(String[] args) {
//		요구사항
//		문자 1개를 입력받아 아래와 같이 출력하시오.
//
//		조건..
//		f, F → Father
//		m, M → Mother
//		s, S → Sister
//		b, B → Brother
//		유효성 검사를 하시오.(위의 문자가 아닌 문자는 예외 처리)
//		입력..
//		문자: f 
//
//		출력..
//		Father
//		입력..
//		문자: F 
//
//		출력..
//		Father
//		입력..
//		문자: s 
//
//		출력..
//		Sister
//		입력..
//		문자: a 
//
//		출력..
//		입력한 문자가 올바르지 않습니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문자: ");
		String input = scan.nextLine();
		
		
		switch(input) {
		case "f":
		case "F":
			System.out.println("Father");
			break;
		case "s":
		case "S":
			System.out.println("Sister");
			break;
		case "b":
		case "B":
			System.out.println("Brother");
			break;
		case "m":
		case "M":
			System.out.println("Mother");
			break;
		default :
			System.out.println("입력한 문자가 올바르지 않습니다.");
		}
		
		
		
	}
	
	
	
}
