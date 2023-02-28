package com.test.question;

import java.util.Scanner;

public class Q031 {
	public static void main(String[] args) {
		
		
//		숫자 5개를 입력받아 짝수와 홀수의 개수를 출력하시오.
//
//		입력..
//		숫자 입력: 3 
//
//		숫자 입력: 2 
//
//		숫자 입력: 7 
//
//		숫자 입력: 1 
//
//		숫자 입력: 8 
//
//		출력..
//		짝수는 2개 홀수는 3개 입력했습니다.
//		홀수가 짝수보다 1개 더 많습니다.
		
		int count_1=0; //홀수
		int count_0=0; //짝수
		Scanner scan = new Scanner(System.in);
		//홀수
		for (int i = 0; i < 5; i++) {
			System.out.print("숫자 입력: ");
			int input= scan.nextInt();
			if(input %2 ==1) {
				count_1++;
			}else if(input %2 ==0) {
				count_0++;
			}
		}
		if(count_1>count_0) {
		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n홀수가 짝수보다 %d개 더 많습니다.",count_0,count_1,count_1-count_0);
		}else if(count_1<count_0) {
		
		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n홀수가 짝수보다 %d개 더 많습니다.",count_0,count_1,count_0-count_1);
		}
	}


	
}
