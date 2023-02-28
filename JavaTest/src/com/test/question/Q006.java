package com.test.question;

import java.util.Scanner;

public class Q006 {
	public static void main(String[] args) {
		//1.scanner 생성하기
		//2.라벨 출력
		//3.한달 수입 입력받기
//		//4.세금: 수입의 3.3%
		//5.결과 출력
		
		Scanner scan = new Scanner(System.in); //1 
		
		System.out.print("한달 수입 금액(원): ");//2
		double pay= scan.nextDouble();//3
		
		
		double result = pay * 0.967;
		double tax = pay *0.033; //4
		
		
		System.out.printf("세후 금액(원): 967,000원\r\n"
				+ "세금(원) : 33,000원\r\n",result,tax); //5 
				
		
		
		
		
		
		
		
		
		
	}
}
