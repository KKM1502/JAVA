package com.test.question;

import java.util.Scanner;

public class Q002 {

	public static void main(String[] args) {
		//1.scanner 생성하기
		//2.라벨 생성
		//3.숫자 2개 입력받기
		//4.연산 작업
		//5.결과 출력
		
		Scanner scan = new Scanner(System.in); //1
		
		System.out.print("첫번째 숫자: ");//2
		int firstn= scan.nextInt(); //3
		System.out.print("두번째 숫자: "); //2
		int secondn= scan.nextInt(); //3

		double result=(double)firstn/secondn;
		System.out.printf("%d + %d = %d\n", firstn,secondn,firstn+secondn);
		System.out.printf("%d - %d = %d\n", firstn,secondn,firstn-secondn);
		System.out.printf("%d * %d = %d\n", firstn,secondn,firstn*secondn);
		System.out.printf("%d / %d = %.1f\n", firstn,secondn,result);
		System.out.printf("%d %% %d = %d\n", firstn,secondn,firstn%secondn);	//4, 5
		
		
	}

}
