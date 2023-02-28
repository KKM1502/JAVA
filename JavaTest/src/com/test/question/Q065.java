package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q065 {
//	요구사항
//	난수를 담고 있는 배열을 생성한 뒤 아래와 같이 출력하시오.
//
//	조건..
//	난수를 20개 발생 후 배열에 넣는다.
//	난수는 1 ~ 20 사이
//	배열을 탐색하여 범위에 만족하는 숫자만 출력한다.
//	입력..
//	최대 범위: 15 
//
//	최소 범위: 5 
//
//	출력..
//	원본: 10, 2, 3, 20, 15, 9, 5, 1, 3, 11, 15, 18, 9, 14, 18, 5, 8, 2, 1, 17
//	결과: 10, 15, 9, 5, 11, 15, 9, 14, 5, 8
	
	public static void main(String[] args) {
		
		int[] array = new int[20];
		int[] result = new int[20];
		int count=0;
		int j = 0;
		for (int i = 0; i < 20; i++) {
			int random = (int) (Math.random()*20) + 1;
			array[i]=random;
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("최대 범위: ");
		int max = scan.nextInt();
		System.out.print("최소 범위: ");
		int min = scan.nextInt();

		System.out.print("원본: ");
		for (int i = 0; i < 20; i++) {
			System.out.printf("%d, ",array[i]);
		}
		
		System.out.print("\n결과: ");
		for (int i = 0; i < 20; i++) {
			
			if(array[i]>=min&&array[i]<=max) {

				System.out.printf("%d, ",array[i]);
			}

		}
		
		
	}
}
