package com.test.question;

import java.util.Scanner;

public class Q043 {
//	�䱸����
//	���ڸ� N�� �Է¹޾� �Ʒ��� ���� ����Ͻÿ�.
//
//	����..
//	�������� 100�� �Ѿ�� ���� ������ �����Ͻÿ�.
//	¦���� ���ϰ� Ȧ���� ���ÿ�.
//	�Է�..
//	����: 12 
//
//	����: 28 
//
//	����: 39 
//
//	����: 15 
//
//	����: 38 
//
//	����: 24 
//
//	����: 78 
//+ 12 + 28 - 39 - 15 + 38 + 24 + 78 = 126
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int sum = 0; //��
 		String result = "";
 		
		for ( ; ; ) {
			if (sum>=100) {
				break;
			}
			System.out.print("���� : ");
			int num = scan.nextInt(); //�Է� ���� �� 
			if(num %2 ==1 ){
				sum-=num; // Ȧ���� ����
				
				result=result + " - "+num;
			}//Ȧ��
			else if(num %2 ==0){
				sum+=num; //¦���� ���ϱ�
				
				result=result + " + "+num;
			}//Ȧ��

		}
		System.out.printf("%s = %d",result,sum);
	}
}
