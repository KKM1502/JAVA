package com.test.question;

import java.util.Scanner;

public class Q006 {
	public static void main(String[] args) {
		//1.scanner �����ϱ�
		//2.�� ���
		//3.�Ѵ� ���� �Է¹ޱ�
//		//4.����: ������ 3.3%
		//5.��� ���
		
		Scanner scan = new Scanner(System.in); //1 
		
		System.out.print("�Ѵ� ���� �ݾ�(��): ");//2
		double pay= scan.nextDouble();//3
		
		
		double result = pay * 0.967;
		double tax = pay *0.033; //4
		
		
		System.out.printf("���� �ݾ�(��): 967,000��\r\n"
				+ "����(��) : 33,000��\r\n",result,tax); //5 
				
		
		
		
		
		
		
		
		
		
	}
}
