package com.test.question;

import java.util.Scanner;

public class Q037 {
//	요구사항
//	숫자 1개를 입력받아 1부터 입력한 숫자까지의 합을 출력하시오.
//
//	입력..
//	숫자: 5 
//
//	출력..
//	1 ~ 5 = 15
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자: ");
		int input = scan.nextInt();
		int sum = 0;
		for (int i = 1; i <= input; i++) {
			sum+=i;
		}
		System.out.printf("1 ~ %d = %d", input, sum);
	}
}
