package com.test.question;


import java.util.Scanner;

public class Q041 {
//	�䱸����
//	���� 1�� 1�� 1�Ϻ��� ���ñ��� ��ĥ°���� ���� ���Ͻÿ�.
//
//	����..
//	Calendar Ŭ���� ��� ����
//	���..
//	2023�� 2�� 10���� 738,561��° �Ǵ� ���̰� �ݿ����Դϴ�.

	public static void main(String[] args) {
		//���� 1�� 1�� 1�� 
		int sum = 0;
		String result= "";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("����(��): ");
		int input_y = scan.nextInt();
		
		System.out.print("����(��): ");
		int input_m = scan.nextInt();
		
		System.out.print("����(��): ");
		int input_d = scan.nextInt();

		//�۳���� �˻�
		for (int i = 1; i < input_y; i++) {
	
			if (test(i).equals("����")) {
				sum+=366;
				
			} else if(test(i).equals("���")){
				sum+=365;
			}
		}
		//���� ���� �˻�
		String leafyear = test(input_y);
		if(leafyear.equals("����")) {
			switch(input_m) {
				case 12:
					sum+=30;
				case 11:
					sum+=31;
				case 10:
					sum+=30;
				case 9:
					sum+=31;
				case 8:
					sum+=31;
				case 7:
					sum+=30;
				case 6:
					sum+=31;
				case 5:
					sum+=30;
				case 4:
					sum+=31;
				case 3:
					sum+=29;
				case 2:
					sum+=31;
				case 1:
					sum+=0;
					break;

			}
		}else {
			switch(input_m) {
				case 12:
					sum+=30;
				case 11:
					sum+=31;
				case 10:
					sum+=30;
				case 9:
					sum+=31;
				case 8:
					sum+=31;
				case 7:
					sum+=30;
				case 6:
					sum+=31;
				case 5:
					sum+=30;
				case 4:
					sum+=31;
				case 3:
					sum+=28;
				case 2:
					sum+=31;
				case 1:
					sum+=0;
					break;	
				
			}

		}
		
		//���� ���ϱ�
		int days = sum+input_d; //��ü �� �� 

		if (days%7==0) {
			result = "�Ͽ���";
		}
		else if (days%7==1) {
			result = "������";
		}
		else if (days%7==2) {
			result = "ȭ����";
		}
		else if (days%7==3) {
			result = "������";
		}
		else if (days%7==4) {
			result = "�����";
		}
		else if (days%7==5) {
			result = "�ݿ���";
		}
		else if (days%7==6) {
			result = "�����";
		}
		
		System.out.printf("%d�� %d�� %d���� %,d��° �Ǵ� ���̰� %s�Դϴ�.",input_y,input_m,input_d,days,result);
	}//main
	
	
	//����˻�
	private static String test(int i) {
		// ���� �˻�
		if ((i%4)==0) {
			
			if((i%100)==0) {
				
				if((i%400)==0) {
					
					return "����";
				}
				else {
					return "���";
				}
				
			}
			else {
				return "����";
			}
		}
		else {
			return "���";
		}
		
	}
	
	
	
}
