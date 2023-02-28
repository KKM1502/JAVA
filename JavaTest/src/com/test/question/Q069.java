package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q069 {
//	요구사항
//	배열의 요소를 순차적으로 2개씩 더한 결과를 배열로 생성한 뒤 출력하시오.
//
//	조건..
//	원본 배열 길이: 사용자 입력
//	원본 배열 요소: 난수(1~9)
//	결과 배열 길이: 사용자 입력 / 2
//	입력..
//	배열 길이: 10 
//
//	출력..
//	원본: [ 1, 5, 3, 6, 2, 7, 8, 2, 2, 9 ]
//	결과: [ 6, 9, 9, 10, 11 ]
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("배열 길이: ");
		int input = scan.nextInt();
		int j = 0;
		
		int[] array = new int[input];
		int[] result = new int[input/2];
		
		for (int i = 0; i < input; i++) {
			int random = (int) (Math.random()*10) + 1;
			array[i]=random;
		}
		System.out.printf("원본: %s\n",Arrays.toString(array));
		
		for (int i = 0; i < 10; i=i+2) {
			result[j] =array[i]+ array[i+1];
			j++;
		}
		System.out.printf("결과: %s",Arrays.toString(result));
	}


	
}
