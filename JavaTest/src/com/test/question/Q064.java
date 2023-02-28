package com.test.question;

import java.util.Arrays;

public class Q064 {
//	요구사항
//	1~20 사이의 난수를 담고 있는 배열을 생성하고 최댓값과 최솟값을 출력하시오.
//
//	조건..
//	난수를 20개 발생 후 배열에 넣는다.
//	난수는 1 ~ 20 사이
//	출력..
//	원본: 10, 9, 3, 18, 15, 9, 5, 4, 3, 11, 15, 18, 9, 14, 18, 5, 8, 7, 9, 17,
//	최댓값: 18
//	최솟값: 3
	public static void main(String[] args) {
		int[] array= new int[20];
		for (int i = 0; i < 20; i++) {
			int random = (int) (Math.random()*20) + 1;
			array[i]=random;
		}
		System.out.print("원본: ");
		for (int i = 0; i < 20; i++) {
			System.out.printf("%d, ",array[i]);
		}
		Arrays.sort(array);
		System.out.printf("최대값: %d\n",array[19]);
		System.out.printf("최솟값: %d",array[0]);
		
	}

}
