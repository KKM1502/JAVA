package com.test.question;

public class Q071 {
//	요구사항
//	아래와 같이 출력하시오.
//
//	출력..
//	25	24	23	22	21
//	20	19	18	17	16
//	15	14	13	12	11
//	10	9	8	7	6
//	5	4	3	2	1
	
	public static void main(String[] args) {
		int n =1;
		int[][] array = new int[5][5];
		for (int i = 0; i < array.length; i++) {
			
				for (int j = 0; j < array[i].length; j++) {
					array[i][j]=n;
					n++;
				}
		}
		for (int i = array.length-1; i >=0; i--) {
			for (int j = array[i].length-1; j >=0; j--) {
				System.out.printf("%5d",array[i][j]);
			}
			System.out.println();
		}
	
	
	}

}
