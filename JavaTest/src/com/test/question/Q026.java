package com.test.question;

import java.util.Scanner;

public class Q026 {
	public static void main(String[] args) {
//		요구사항
//		학생의 국어 점수를 입력받아 성적을 출력하시오.
//
//		조건..
//		90 ~ 100: A
//		80 ~  89: B
//		70 ~  79: C
//		60 ~  69: D
//		 0 ~   59: F
//		유효성 검사를 하시오.(점수: 0 ~ 100점 이내)
//		입력..
//		점수: 85 
//
//		출력..
//		입력한 85점은 성적 B입니다.
//		입력..
//		점수: 55 
//
//		출력..
//		입력한 55점은 성적 F입니다.
//		입력..
//		점수: 123 1
//
//		출력..
//		점수가 올바르지 않습니다. 0~100사이의 값을 입력하시오.
		Scanner scan = new Scanner(System.in);
		System.out.println("점수: ");
		int input = scan.nextInt();
		
		//조건문
		if(90<=input && input<=100) {
			System.out.printf("입력한 %d점은 성적 A입니다.\n",input);
		}else if(80<=input && input<90) {
			System.out.printf("입력한 %d점은 성적 B입니다.\n",input);
		}else if(70<=input && input<80) {
			System.out.printf("입력한 %d점은 성적 C입니다.\n",input);
		}else if(60<=input && input<70) {
			System.out.printf("입력한 %d점은 성적 D입니다.\n",input);
		}else if(input<60) {
			System.out.printf("입력한 %d점은 성적 F입니다.\n",input);
		}else {
			System.out.println("점수가 올바르지 않습니다. 0~100사이의 값을 입력하시오."); //유효성 검사
		}
	}
}
