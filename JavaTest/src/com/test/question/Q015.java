package com.test.question;

import java.util.Scanner;

public class Q015 {
	public static void main(String[] args) {
//		��� ������ ó�� �ɾ��� �� ������ ����: 0m
//		���� �� ��� ������ �����: 5��
//		�帰 �� ��� ������ ���߷�: 2��
//		��� ������ ���̰� 1m �Ѵ� �������� ����� ������.
//		1m �Ѵ� �������� 10�� �ڶ� ������ ����� 1���� ������.
		
		Scanner scan=new Scanner(System.in);
		System.out.print("���� ��: ");
		int sunny = scan.nextInt();
		
		System.out.print("�帰 ��: ");
		int foggy = scan.nextInt();
		
		System.out.printf("����� �� %d�� ���Ƚ��ϴ�.",getApple(sunny,foggy));
		
	}//main
	
	public static int getApple(int sunny, int foggy) {
		
		int	height =sunny*5+foggy*2; //����
		int apple=	(height-100)/10; //�������
		return apple;
	}
}	
