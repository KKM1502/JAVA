package com.test.question;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Q022 {

	public static void main(String[] args) {
//		�䱸����
//		���� Ŀ���� �̸��� �������� �Է¹޾� ������� ����Ͻÿ�.
//
//		�Է�..
//		���� �̸�: ������ 
//
//		���� �̸�: ȣȣȣ 
//
//		������(��): 2023 
//
//		������(��): 2 
//
//		������(��): 8 
//
//		���..
//		'������'��(��) 'ȣȣȣ'�� �����
//		100��: 2023-05-19
//		200��: 2023-08-27
//		300��: 2023-12-05
//		500��: 2024-06-22
//		1000��: 2025-11-04
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �̸�: ");
		String name1 = scan.nextLine();
		System.out.println();
		
		System.out.print("���� �̸�: ");
		String name2 = scan.nextLine();
		System.out.println();
		
		System.out.print("������(��): ");
		int y = scan.nextInt();
		System.out.println();
		
		System.out.print("������(��): ");
		int m = scan.nextInt();
		System.out.println();
		
		System.out.print("������(��): ");
		int d = scan.nextInt();
		System.out.println();
		
		Calendar date= Calendar.getInstance();
		date.set(Calendar.YEAR,y);
		date.set(Calendar.MONTH,m-1);
		date.set(Calendar.DATE,d);
		
		System.out.printf("%s�� %s�� �����\n ",name1,name2);
		
		date.add(Calendar.DATE, 100);
		System.out.printf("100�� :%tF\n ",date);
		
		date.add(Calendar.DATE, 100);
		System.out.printf("200�� :%tF\n ",date);
		
		date.add(Calendar.DATE, 100);
		System.out.printf("300�� :%tF\n ",date);
		
		date.add(Calendar.DATE, 200);
		System.out.printf("500�� :%tF\n ",date);
		
		date.add(Calendar.DATE, 500);
		System.out.printf("1000�� :%tF\n ",date);
		
	}


}
