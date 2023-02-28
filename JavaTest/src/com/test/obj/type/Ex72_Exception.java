package com.test.obj.type;

import java.util.Scanner;

public class Ex72_Exception {

	public static void main(String[] args) {
		 m1();
	}
	
	
	private static void m1() {
		//요구사항] 숫자를 입력받아 연산을 하시오.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자: ");
		int input = scan.nextInt();

		if(input != 0 ) {
			System.out.printf("100/%d = %d\n",input,100/input);
		}else {
			System.out.println("0을 입력하면 안됩니다.");
		}
		
		//비권장 >> 가독성 낮음 
		
		if(input == 0) {
			System.out.println("0을 입력하면 안됩니다.");
		}else {
			System.out.printf("100/%d = %d\n",input,100/input);
		}
		
		
		
//		System.out.println(100/0);
//		System.out.println(100/0.0);
//		System.out.println(0.0/100.0);
		
		//try문
		//- try
		//- catch
		//- finally
		
		try {
			System.out.printf("100/%d = %d\n",input,100/input);
		}catch(Exception e) {
			System.out.println("0을 입력하면 안됩니다.");
		}
		//에러가 발생해도 예외처리리를 한 후 프로그램 흐름을 이어간다.
		System.out.println("종료");
		
	}
}
