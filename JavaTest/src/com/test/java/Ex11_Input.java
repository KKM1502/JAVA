package com.test.java;

import java.io.IOException;

public class Ex11_Input {

	public static void main(String[] args) throws IOException {
		//Ex11_Input.java
		//- 13 > \r
		//- 10 > \n
		
		//- \r\n > 13 10
		
		System.out.print("문자 입력: ");
		int code = System.in.read();
		
		System.out.println(code);
		System.out.printf("%c\n",code);
		
		code = System.in.read();
		
		System.out.println(code);
		System.out.printf("%c\n",code);
		
		code = System.in.read();
		System.out.println(code);
		System.out.printf("%c\n",code);
		
		code = System.in.read();
		System.out.println(code);
		System.out.printf("%c\n",code);
		
		code = System.in.read();
		System.out.println(code);
		System.out.printf("%c\n",code);
		
	}
	
	
}
