package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q023 {
	public static void main(String[] args) {
//		�䱸����
//		�ƺ��� ���� ������ �Է¹޾� �ƺ��� ������ ��ĥ�� �� ��Ҵ��� ����Ͻÿ�.
//
//		�Է�..
//		�ƺ� ����(��): 1970 
//
//		�ƺ� ����(��): 5 
//
//		�ƺ� ����(��): 10 
//
//		�� ����(��): 1998 
//
//		�� ����(��): 7 
//
//		�� ����(��): 22 
//
//		���..
//		�ƺ��� ������ �� 10,300���� �� ��ҽ��ϴ�.
		Scanner scan = new Scanner(System.in);
		System.out.print("�ƺ� ����(��): ");
		int y = scan.nextInt();
		System.out.println();
		
		System.out.print("�ƺ� ����(��): ");
		int m = scan.nextInt();
		System.out.println();
		
		System.out.print("�ƺ� ����(��): ");
		int d = scan.nextInt();
		System.out.println();
		
		System.out.print("�� ����(��): ");
		int y2 = scan.nextInt();
		System.out.println();
		
		System.out.print("�� ����(��): ");
		int m2 = scan.nextInt();
		System.out.println();
		
		System.out.print("�� ����(��): ");
		int d2 = scan.nextInt();
		System.out.println();
		
		Calendar c1 = Calendar.getInstance();
		c1.set(Calendar.YEAR, y);
		c1.set(Calendar.MONTH, m);
		c1.set(Calendar.DATE, d);
		Calendar c2 = Calendar.getInstance();
		c2.set(Calendar.YEAR, y2);
		c2.set(Calendar.MONTH, m2);
		c2.set(Calendar.DATE, d2);
				
		int distance=(int) ((c2.getTimeInMillis()-c1.getTimeInMillis())/1000/60/60/24);
		System.out.printf("�ƺ��� ������ �� %,d���� �� ��ҽ��ϴ�.",distance);
		
		
	}
}
