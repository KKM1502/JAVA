package com.test.java;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Ex12_BufferedReader {

	public static void main(String[] args)throws Exception {
	/*
	 	2바이트로 읽어 한글이 깨지지 않는다. 
	 	입력 도구 생성하기 > reader라는 변수 안에 들어있다
	 */
	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.print("문자 입력: ");
//		reader.read();
//		System.in.read();
//		int code = reader.read();
//		
//		System.out.printf("출력: %c",code);
//		
//		System.out.println("종료");
//		
//		System.out.print("이름 입력: "); //3글자 
//		String name = reader.readLine(); //사용자가 입력한 문자열을 반환 
//		System.out.printf("안녕하세요 %s님.",name);
//		
//		System.out.print("색상 입력: \n"); 
//		String color = reader.readLine(); 
//		System.out.printf("당신이 입력한 색상은 %s입니다.",color);
		
		
		//BufferedReader 입력은 문자열 반환한다. > 숫자를 입력받아야 할때는 parsexxx() 메소드로 자료형 변환시켜야 한다.
		
		
//		System.out.print("숫자 입력:");
//		String input = reader.readLine();	
//		//int num = Integer.parseInt(input); //"50" >50
//		
//		double num = Double.parseDouble(input);
//		System.out.println(100-num);
		
		//요구사항] 사용자로부터 숫자를 2개 입력 > 두 수의 합을 구하시오.(연산 과정)
		System.out.print("첫번째 숫자를 입력해주세요: ");
		String input1 = reader.readLine();

		System.out.print("두번째 숫자를 입력해주세요: ");
		String input2 = reader.readLine();

		int sum = Integer.parseInt(input1)+Integer.parseInt(input2);
		System.out.printf("%s + %s = %d",input1,input2,sum);
		


	}
}
