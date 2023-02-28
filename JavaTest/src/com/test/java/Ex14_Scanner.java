package com.test.java;

import java.util.Scanner;


public class Ex14_Scanner {

		public static void main(String[] args) {
			
//			Ex14_Scanner.java
//			1. System.in.read()
//			2. BufferedReader
//			3. Scanner
			
			//입력도구
			Scanner scan = new Scanner(System.in);	
			
			
			System.out.print("이름: ");			
			String name = scan.nextLine(); //reader.readLine()			
			System.out.printf("안녕하세요. %s님\n",name);
			
			
			System.out.print("숫자: ");
			Double num = scan.nextDouble();	//Integer.parseInt()
			System.out.println(num + 10);
			
			
			//요구사항] 가고싶은 나라, 도시를 입력받고, 여행가는 인원 수를 입력
				
			System.out.print("가고싶은 나라:");
			String Country= scan.nextLine();
			System.out.println(Country);
			
			System.out.print("가고싶은 도시:");
			String City= scan.nextLine();
			System.out.println(City);
			
			System.out.print("인원 수:");
			Integer People= scan.nextInt();
			System.out.println(People + "명");
			
			
			
			
			
			
			
			
			
			
			/*
		      
	         문자 1개 입력
	         int code = System.in.read();
	         
	         
	         문자 1개 입력
	         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	         int code = reader.read();
	          
	          
	         문자열 입력
	         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	         String line = reader.readLine();
	         
	         
	         문자열 입력
	         Scanner scan = new Scanner(System.in);
	         String line = scan.nextLine();
	         
	         
	         숫자 입력
	         Scanner scan = new Scanner(System.in);
	         int num = scan.nextInt();
	      
	      */
			
			
		}
	
}
