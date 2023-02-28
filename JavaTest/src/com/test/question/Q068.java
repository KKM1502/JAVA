package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q068 {
//	요구사항
//	배열의 요소를 삭제하시오.
//
//	조건..
//	배열 길이: 10
//	마지막 요소는 0으로 채우시오.
//	입력..
//	삭제 위치: 2 
//
//	출력..
//	원본: [5, 6, 1, 3, 2, 0, 0, 0, 0, 0]
//	결과: [5, 6, 3, 2, 0, 0, 0, 0, 0, 0]
//	입력..
//	삽입 위치: 5 
//
//	출력..
//	원본: [5, 6, 1, 3, 2, 8, 7, 4, 10, 9]
//	결과: [5, 6, 1, 3, 2, 7, 4, 10, 9, 0]
	
	public static void main(String[] args) {
		
		int[] array= {5, 6, 1, 3, 2, 8, 7, 4, 10, 9};
		int[] temp= new int[10];
		
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제 위치: ");
		int input = scan.nextInt();
	
		for (int i = 0; i < input; i++) {
			temp[i]=array[i];
		
		}
		
		System.out.printf("원본: %s\n",Arrays.toString(array));
		for (int i = input; i < array.length-1; i++) {
			temp[i]=array[i+1];
			if(input==9) {
				temp[i]=0;
			}
			
		}
		
		System.out.printf("원본: %s",Arrays.toString(temp));

	
	}
		
}
