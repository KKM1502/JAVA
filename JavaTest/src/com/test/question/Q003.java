package com.test.question;

import java.util.Scanner;

public class Q003 {
	public static void main(String[] args) {
		//1.scanner �����ϱ�
		//2.�� ���
		//3.�ʺ�� ���� �Է¹ޱ�
		//4.�簢�� ���� = �ʺ� * ���� , �簢�� �ѷ� = �ʺ� * 2 + ���� * 2
		//5.��� ���
		Scanner scan = new Scanner(System.in); //1
		
		System.out.print("�ʺ�(��): ");//2
		int w= scan.nextInt();	//3
		
		System.out.print("����(��): ");//2
		int h= scan.nextInt();	//3
		
		int area = w * h ;
		int circum = w*2 + h*2;	//4
		
		System.out.printf("�簢���� ���̴� %dcm���Դϴ�.\n�簢���� �ѷ��� %dcm�Դϴ�.",area,circum);	//5
		
		
		
	}
}


