package com.test.question;

import java.util.Scanner;

public class Q038 {
//	�䱸����
//	�Է� Ƚ��(N)�� ���� N���� �Է¹޾� ¦���� �հ� Ȧ���� ���� ���� ����Ͻÿ�.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�Է� Ƚ��: ");
		int input = scan.nextInt();
		int count = 0; // Ȧ�� ����
		int sum1 = 0; //Ȧ����
 		int sum2 = 0; //¦����
		
		for (int i = 0; i < input; i++) {
			
			System.out.print("���� : ");
			int num = scan.nextInt();
			if(num %2 ==1 ){
				sum1+=num;
				count++; // Ȧ�� ����
			}//Ȧ��
			else if(num %2 ==0){
				sum2+=num;
			}//Ȧ��
		}
		System.out.printf("¦�� %d���� ��: %d\nȦ�� %d���� ��: %d",input-count,sum2,count,sum1);
		scan.close();
	}
	

}
