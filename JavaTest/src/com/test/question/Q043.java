package com.test.question;

import java.util.Scanner;

public class Q043 {
//	요구사항
//	숫자를 N개 입력받아 아래와 같이 출력하시오.
//
//	조건..
//	누적값이 100을 넘어가는 순간 루프를 종료하시오.
//	짝수는 더하고 홀수는 빼시오.
//	입력..
//	숫자: 12 
//
//	숫자: 28 
//
//	숫자: 39 
//
//	숫자: 15 
//
//	숫자: 38 
//
//	숫자: 24 
//
//	숫자: 78 
//+ 12 + 28 - 39 - 15 + 38 + 24 + 78 = 126
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int sum = 0; //합
 		String result = "";
 		
		for ( ; ; ) {
			if (sum>=100) {
				break;
			}
			System.out.print("숫자 : ");
			int num = scan.nextInt(); //입력 받은 수 
			if(num %2 ==1 ){
				sum-=num; // 홀수는 빼기
				
				result=result + " - "+num;
			}//홀수
			else if(num %2 ==0){
				sum+=num; //짝수는 더하기
				
				result=result + " + "+num;
			}//홀수

		}
		System.out.printf("%s = %d",result,sum);
	}
}
