package com.test.question;

public class Q072 {
//	Java 아래의 요구사항을 구현하시오.
//	Skill: 배열
//	요구사항
//	아래와 같이 출력하시오.
//
//	출력..
//	1	6	11	16	21
//	2	7	12	17	22
//	3	8	13	18	23
//	4	9	14	19	24
//	5	10	15	20	25

	public static void main(String[] args) {
		int n =1;
		int[][] array = new int[5][5];
		for (int i = 0; i < array.length; i++) {
		
				for (int j = 0; j < array[i].length; j++) {
					array[j][i]=n;
					n++;
					
				}

		}
		//출력
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%5d",array[i][j]);
			}
			System.out.println();
		}
	
	}
	
}
