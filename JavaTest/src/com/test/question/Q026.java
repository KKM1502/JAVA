package com.test.question;

import java.util.Scanner;

public class Q026 {
	public static void main(String[] args) {
//		�䱸����
//		�л��� ���� ������ �Է¹޾� ������ ����Ͻÿ�.
//
//		����..
//		90 ~ 100: A
//		80 ~  89: B
//		70 ~  79: C
//		60 ~  69: D
//		 0 ~   59: F
//		��ȿ�� �˻縦 �Ͻÿ�.(����: 0 ~ 100�� �̳�)
//		�Է�..
//		����: 85 
//
//		���..
//		�Է��� 85���� ���� B�Դϴ�.
//		�Է�..
//		����: 55 
//
//		���..
//		�Է��� 55���� ���� F�Դϴ�.
//		�Է�..
//		����: 123 1
//
//		���..
//		������ �ùٸ��� �ʽ��ϴ�. 0~100������ ���� �Է��Ͻÿ�.
		Scanner scan = new Scanner(System.in);
		System.out.println("����: ");
		int input = scan.nextInt();
		
		//���ǹ�
		if(90<=input && input<=100) {
			System.out.printf("�Է��� %d���� ���� A�Դϴ�.\n",input);
		}else if(80<=input && input<90) {
			System.out.printf("�Է��� %d���� ���� B�Դϴ�.\n",input);
		}else if(70<=input && input<80) {
			System.out.printf("�Է��� %d���� ���� C�Դϴ�.\n",input);
		}else if(60<=input && input<70) {
			System.out.printf("�Է��� %d���� ���� D�Դϴ�.\n",input);
		}else if(input<60) {
			System.out.printf("�Է��� %d���� ���� F�Դϴ�.\n",input);
		}else {
			System.out.println("������ �ùٸ��� �ʽ��ϴ�. 0~100������ ���� �Է��Ͻÿ�."); //��ȿ�� �˻�
		}
	}
}
