package com.test.question;

import java.util.Scanner;

	public class Q040 {
		public static void main(String[] args) {
			
//			//�䱸����
//			�Ʒ��� ���� ����Ͻÿ�.
//
//			�Է�..
//			���� ����: 1 
//
//			���� ����: 10 
//
//			���..
//			1 - 2 + 3 - 4 + 5 - 6 + 7 - 8 + 9 - 10 = -5

			//���� �Է¹ޱ�
			Scanner scan = new Scanner(System.in);
			System.out.print("���� ����: ");
			
			int start= scan.nextInt();//���� ����
			
			System.out.print("���� ����: ");
			int end= scan.nextInt(); //���� ����
			
			int sum = 0; //�� �� 
				
			for (int i = start; i <= end; i++) {
				
				if (i%2==1) {
					if(i!=end) {
						System.out.printf("%d - ",i);
						sum+=i;
					}
					else{
						System.out.printf("%d = ",i);
						sum+=i;
						}
				}//Ȧ��
				if (i%2==0) {
					if(i!=end) {
						System.out.printf("%d + ",i);
						sum-=i;
					}
					else{
						System.out.printf("%d = ",i);
						sum-=i;
						}
				}//¦��

			}
			System.out.printf("%d",sum);
			scan.close();
			
		}
	
	

}
