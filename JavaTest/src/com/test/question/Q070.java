package com.test.question;

public class Q070 {
//	Skill: 배열
//	요구사항
//	아래와 같이 출력하시오.
//
//	출력..
//	1	2	3	4	5
//	10	9	8	7	6
//	11	12	13	14	15
//	20	19	18	17	16
//	21	22	23	24	25
	
	public static void main(String[] args) {
		int n =1;
		int[][] array = new int[5][5];
		for (int i = 0; i < array.length; i++) {
			if(i%2==0) {
				for (int j = 0; j < array[i].length; j++) {
					array[i][j]=n;
					n++;
				}
			}
			else {
				for (int j = array[i].length-1; j >= 0; j--) {
					//j=4 array[1][0]=n
					array[i][j]=n;
					n++;
					
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%5d",array[i][j]);
			}
			System.out.println();
		}
	
	
	}
}
