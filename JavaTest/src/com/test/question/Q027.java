package com.test.question;

import java.util.Scanner;

public interface Q027 {

	public static void main(String[] args) {
//		�䱸����
//		���� 1���� �Է¹޾� �Ʒ��� ���� ����Ͻÿ�.
//
//		����..
//		f, F �� Father
//		m, M �� Mother
//		s, S �� Sister
//		b, B �� Brother
//		��ȿ�� �˻縦 �Ͻÿ�.(���� ���ڰ� �ƴ� ���ڴ� ���� ó��)
//		�Է�..
//		����: f 
//
//		���..
//		Father
//		�Է�..
//		����: F 
//
//		���..
//		Father
//		�Է�..
//		����: s 
//
//		���..
//		Sister
//		�Է�..
//		����: a 
//
//		���..
//		�Է��� ���ڰ� �ùٸ��� �ʽ��ϴ�.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("����: ");
		String input = scan.nextLine();
		
		
		switch(input) {
		case "f":
		case "F":
			System.out.println("Father");
			break;
		case "s":
		case "S":
			System.out.println("Sister");
			break;
		case "b":
		case "B":
			System.out.println("Brother");
			break;
		case "m":
		case "M":
			System.out.println("Mother");
			break;
		default :
			System.out.println("�Է��� ���ڰ� �ùٸ��� �ʽ��ϴ�.");
		}
		
		
		
	}
	
	
	
}
