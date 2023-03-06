package com.test.question;

import java.util.Scanner;

public class Q038 {
//	요구사항
//	입력 횟수(N)와 숫자 N개를 입력받아 짝수의 합과 홀수의 합을 각각 출력하시오.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 횟수: ");
		int input = scan.nextInt();
		int count = 0; // 홀수 개수
		int sum1 = 0; //홀수합
 		int sum2 = 0; //짝수합
		
		for (int i = 0; i < input; i++) {
			
			System.out.print("숫자 : ");
			int num = scan.nextInt();
			if(num %2 ==1 ){
				sum1+=num;
				count++; // 홀수 개수
			}//홀수
			else if(num %2 ==0){
				sum2+=num;
			}//홀수
		}
		System.out.printf("짝수 %d개의 합: %d\n홀수 %d개의 합: %d",input-count,sum2,count,sum1);
		scan.close();
	}
	

}
