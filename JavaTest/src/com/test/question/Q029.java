package com.test.question;

import java.util.Scanner;

public class Q029 {
	public static void main(String[] args) {
//		�䱸����
//		���� 2���� ������ 1���� �Է¹޾� ���� ������ ����� ����Ͻÿ�.
//
//		����..
//		������ �Է��Ͻÿ�.(��ȿ�� �˻� �ʿ����)
//		������ ���� ����� �Ҽ����� ù°�ڸ����� ��� �Ͻÿ�.
//		�����ڴ� ��� ������(+, -, *, /, %)�� �Է��Ͻÿ�.
		
//		�Է�..
//		ù��° ����: 5 
//
//		�ι�° ����: 3 
//
//		������: * 
//
//		���..
//		5 * 3 = 15
//		�Է�..
//		ù��° ����: 10 
//
//		�ι�° ����: 3 
//
//		������: / 
//
//		���..
//		10 / 3 = 3.3
//		�Է�..
//		ù��° ����: 3 
//
//		�ι�° ����: 2 
//
//		������: >= 
//
//		���..
//		������ �Ұ����մϴ�
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������: ");
		String input = scan.nextLine();
		
		System.out.print("ù��° ����: ");
		int num1 = scan.nextInt();
		
		System.out.print("�ι�° ����: ");
		int num2 = scan.nextInt();

		
		if(input.equals("+")) {
				System.out.printf("%d + %d = %d",num1,num2,num1 + num2);
		}else if(input.equals("-")){
				System.out.printf("%d - %d = %d",num1,num2,num1 - num2);
		}else if(input.equals("*")){
				System.out.printf("%d * %d = %d",num1,num2,num1 * num2);
		}else if(input.equals("/")){
				System.out.printf("%d / %d = %.1f",num1,num2,(double)num1 / num2);
		}else if(input.equals("%")){
				System.out.printf("%d %% %d = %d",num1,num2,num1 % num2);
		}else {
				System.out.println("������ �Ұ����մϴ�.");
		}
		
		
		
	}
}
