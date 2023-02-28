package com.test.question;

import java.util.Scanner;

public class Q045 {
//	요구사항
//	사용자가 입력한 범위의 숫자까지 369 게임 과정을 출력하시오.
//
//	조건..
//	최대 3자리까지만 입력하시오.
//	입력..
//	최대 숫자: 50 
//
//	출력..
//	1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 14 15 짝 17 18 짝 20 
//	21 22 짝 24 25 짝 27 28 짝 짝 짝 짝 짝짝 짝 짝 짝짝 짝 짝 짝짝 40 
//	41 42 짝 44 45 짝 47 48 짝 50
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("최대 숫자: ");
		int input = scan.nextInt();
		if (input>1000) {
			System.out.println("세자리 숫자만 입력하시오");
		}else {
			for (int i = 1; i <= input; i++) {
				if(i%3==0) {
					System.out.print("짝 ");
				}else {
					System.out.printf("%d ",i);
				}
			}
			
		}
	}
	
}


