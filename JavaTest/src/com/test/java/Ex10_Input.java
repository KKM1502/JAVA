package com.test.java;


public class Ex10_Input {

	public static void main(String[] args) throws Exception	{
		
		//Ex10_Input.java
		
		/*콘솔 입력
		 
		 1. System.in.read()
		 	-read() 메소드
		 	-System.out.print() 반대 기능
		 	-불편
		 
		 2. BufferedReader 클래스
		 	-편함
		 
		 3. Scanner 클래스
		 	-아주 편함
		 
		*/
		
		
		//요구사항] 사용자에게 문자 1개를 입력받아 화면에 그대로 출력
		
		//1. 안내 메시지를 출력
		//2. 키 입력
		//3. 화면에 출력
		//설계 바탕 > 화면 설계 > 화면 구현
		System.out.print("문자를 입력하세요:"); //1.라벨
		
		//System.out.print("A"); //2.사용자 입력
		
		//사용자로부터 키보드 입력받아 입력한 문자를 돌려주는 명령어
		
		int code = System.in.read();
		
		// 문자 코드값
		// char
		// A > 65
		// a > 97
		// 0 > 48
		
		System.out.println(code);
		System.out.printf("%c\n",code);
		System.out.printf("입력한 문자는 %c입니다.",code); //3.출력
		
		
	
		
	}
}
