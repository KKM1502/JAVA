package com.test.question;

import java.util.Scanner;

public class Q002 {

	public static void main(String[] args) {
		//1.scanner �����ϱ�
		//2.�� ����
		//3.���� 2�� �Է¹ޱ�
		//4.���� �۾�
		//5.��� ���
		
		Scanner scan = new Scanner(System.in); //1
		
		System.out.print("ù��° ����: ");//2
		int firstn= scan.nextInt(); //3
		System.out.print("�ι�° ����: "); //2
		int secondn= scan.nextInt(); //3

		double result=(double)firstn/secondn;
		System.out.printf("%d + %d = %d\n", firstn,secondn,firstn+secondn);
		System.out.printf("%d - %d = %d\n", firstn,secondn,firstn-secondn);
		System.out.printf("%d * %d = %d\n", firstn,secondn,firstn*secondn);
		System.out.printf("%d / %d = %.1f\n", firstn,secondn,result);
		System.out.printf("%d %% %d = %d\n", firstn,secondn,firstn%secondn);	//4, 5
		
		
	}

}
