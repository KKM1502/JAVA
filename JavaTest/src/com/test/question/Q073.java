package com.test.question;

public class Q073 {
//	Skill: 배열
//	요구사항
//	아래와 같이 출력하시오.
//
//	출력..
//	1	2	3	4	5
//	6	7	8	9	0
//	10	11	12	0	0
//	13	14	0	0	0
//	15	0	0	0	0
	public static void main(String[] args) {
		int n =1;
		int[][] array = new int[5][5];
		for (int i = 0; i < array.length; i++) {
		
				for (int j = 0; j < array[i].length; j++) {
					if(i<=4-j) {array[i][j]=n;
					n++;
					System.out.printf("%5d",array[i][j]);
					}
					else {
						array[i][j]=0;
						System.out.printf("%5d",array[i][j]);
					}
				}
				System.out.println();
		}
	}
}
