package com.test.question;

import java.util.Scanner;

public class Q001 {
	public static void main(String[] args) {
		//1.scanner 생성하기
		//2.라벨 출력
		//3.태어난 년도 입력받기
		//4.2023 - 태어난년도
		//5.결과 출력
		
		Scanner scan = new Scanner(System.in); //1 
		System.out.print("태어난 년도: ");//2
		int born = scan.nextInt();//3
		int result = 2023 - born +1;	//4
		System.out.printf("나이: %d세.",result);	//5
		
		
		
		
		
		
		
		
	}

}
