package com.test.question;

import java.util.Arrays;

public class Q066 {
//	요구사항
//	중복되지 않는 임의의 숫자 6개를 만드시오.(로또)
//
//	조건..
//	숫자의 범위: 1 ~ 45
//	오름차순 정렬
//	출력..
//	[1, 5, 23, 36, 37, 41]
	
	public static void main(String[] args) {
		
		int[] array= new int[6];
		int temp=0;
		int count= 0;
		int i=0;
		
		while(count<6) {
			int random = (int) (Math.random()*45) + 1;
			if(random==temp) {
				continue;
			}
			else{
				temp=random;
				array[i]=random;
				i++;
				count++;
			}
		}

		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}

}
