package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q034 {
//	�䱸����
//	��¥�� �Է¹޾� �Ʒ��� ���ǿ� �°� ����� ����Ͻÿ�.
//
//	����..
//	�Է¹��� ��¥�� �����̸� �ش� ���� ������� �˾Ƴ���.
//	�Է¹��� ��¥�� ��/�Ͽ����̸� �ƹ��͵� ���Ѵ�.
//	�Է�..
//	��: 2022 
//
//	��: 3 
//
//	��: 14 
//
//	���..
//	�Է��Ͻ� ��¥�� '����'�Դϴ�.
//	�ش� ���� ����Ϸ� �̵��մϴ�.
//	�̵��� ��¥�� '2022-03-19' �Դϴ�.
//	�Է�..
//	��: 2022 
//
//	��: 3 
//
//	��: 6 
//
//	���..
//	�Է��Ͻ� ��¥�� '����(��/��)'�Դϴ�.
//	����� �����ϴ�.
	public static void main(String[] args) {
		Calendar d_day = Calendar.getInstance();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("��: ");
		int y = scan.nextInt();
		System.out.print("��: ");
		int m = scan.nextInt();
		System.out.print("��: ");
		int d = scan.nextInt();
		
		d_day.set(y,m-1,d);
		
		if(d_day.get(Calendar.DAY_OF_WEEK)==1 || d_day.get(Calendar.DAY_OF_WEEK)==7 ) {
			System.out.println("�Է��Ͻ� ��¥�� '����(��/��)'�Դϴ�");
			
		}else {
			System.out.print("�Է��Ͻ� ��¥�� '����'�Դϴ�.\n �ش� ���� ����Ϸ� �̵��մϴ�.\n");
			d_day.add(Calendar.DATE,7-d_day.get(Calendar.DAY_OF_WEEK));
			System.out.printf("�̵��� ��¥�� '%tF' �Դϴ�",d_day);
		}
		scan.close();
	}
		
}
