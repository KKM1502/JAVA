package com.test.question;

import java.util.Scanner;

public class Q004 {
	public static void main(String[] args) {
		//1.scanner 생성하기
		//2.라벨 출력
		//3.섭씨 입력받기
//		//4.℉ = ℃ × 1.8 + 32
//			-소수 입력 가능
//			-소수 이하 1자리까지 출력하시오.
		//5.결과 출력
		
		Scanner scan = new Scanner(System.in); //1 
		
		System.out.print("섭씨온도를 입력해주세요: ");//2
		double c= scan.nextDouble(); //3
		
		double f = c * 1.8 + 32; //4
		
		System.out.printf("섭씨 %.1f는 화씨 %.1f℉입니다.",c,f); //5 
				
		
		
		
		
		
		
		
		
		
	}
}
