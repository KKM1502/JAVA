package com.test.question;

import java.util.Scanner;

public class Q004 {
	public static void main(String[] args) {
		//1.scanner �����ϱ�
		//2.�� ���
		//3.���� �Է¹ޱ�
//		//4.�� = �� �� 1.8 + 32
//			-�Ҽ� �Է� ����
//			-�Ҽ� ���� 1�ڸ����� ����Ͻÿ�.
		//5.��� ���
		
		Scanner scan = new Scanner(System.in); //1 
		
		System.out.print("�����µ��� �Է����ּ���: ");//2
		double c= scan.nextDouble(); //3
		
		double f = c * 1.8 + 32; //4
		
		System.out.printf("���� %.1f�� ȭ�� %.1f���Դϴ�.",c,f); //5 
				
		
		
		
		
		
		
		
		
		
	}
}
