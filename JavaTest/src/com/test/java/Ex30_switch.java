package com.test.java;

import java.util.Scanner;

public class Ex30_switch {
	public static void main(String[] args) {
		
		
	/*
	 	switch(����){
	 		case ��:
	 			���๮;
	 			break;
	 		[case ��:
	 			���๮;
	 			break;] //n��
	 		[deafult:
	 			���๮;
	 			break;]
	 			
	 	����ġ �ȿ��� boolean type�� ���� ���� �� ����.
	 	Character�� int�� ���ԵǱ� ������ ��� ���� 
	 */
		
//		m1();
//		m2();
		
	}

	private static void m2() {
		//�䱸����] ���Ǳ�
		//- �޴� ��� > ���� ���� > ���� ���
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("==================");
		System.out.println("       ���Ǳ�");
		System.out.println("==================");
		System.out.println("1.�ݶ�");
		System.out.println("2.���̴�");
		System.out.println("3.��Ÿ500");
		System.out.println("-----------------");
		System.out.print("����(���� �Է�):");
		
		int coke= 500;
		String input = scan.nextLine();
		if (input.equals("1")) {
			System.out.printf("%d���Դϴ�.\n",coke);
		} else if (input.equals("2")) {
			System.out.printf("%d���Դϴ�.\n",coke);
		} else if (input.equals("3")) {
			System.out.println("500���Դϴ�.");
		}
		
		switch (input) {
			case "1":
				System.out.printf("%d���Դϴ�.\n",coke);
				break;
			case "2":
				System.out.printf("%d���Դϴ�.\n",coke);
				break;
			case "3":
				System.out.println("500���Դϴ�.");
				break;
			
		}
		switch (input) {
		case "1":
	
		case "2":
			System.out.println("700���Դϴ�.");
			break;
		case "3":
			System.out.println("500���Դϴ�.");
			break;
		
	}
		
	}

	private static void m1() {
		
		//�䱸���� ] ���ڸ� 1�� �Է� < �ѱ��� ���
		//1 > �ϳ�
		//2 > ��
		Scanner scan = new Scanner(System.in);
		System.out.print("����: ");
		int num = scan.nextInt();
		
		if(num==1) {
			System.out.println("�ϳ�");
		} else if(num==2){
			System.out.println("��");
		} else if(num==3){
			System.out.println("��");
		} else{
			System.out.println("������ ����");
		}
		
		switch(num) {
			case 1: //Label(��ġ�� ǥ���ϴ� ����)
				System.out.println("�ϳ�");
				break;
			case 2:
				System.out.println("��");
				break;
			case 3:
				System.out.println("��");
				break;
			default:
				System.out.println("������ ����");
				break;
			
		}
		
		
	}
	
	
}
