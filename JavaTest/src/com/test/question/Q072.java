package com.test.question;

public class Q072 {
//	Java �Ʒ��� �䱸������ �����Ͻÿ�.
//	Skill: �迭
//	�䱸����
//	�Ʒ��� ���� ����Ͻÿ�.
//
//	���..
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
		//���
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%5d",array[i][j]);
			}
			System.out.println();
		}
	
	}
	
}
