package com.test.question;

import java.util.Scanner;

public class Q001 {
	public static void main(String[] args) {
		//1.scanner �����ϱ�
		//2.�� ���
		//3.�¾ �⵵ �Է¹ޱ�
		//4.2023 - �¾�⵵
		//5.��� ���
		
		Scanner scan = new Scanner(System.in); //1 
		System.out.print("�¾ �⵵: ");//2
		int born = scan.nextInt();//3
		int result = 2023 - born +1;	//4
		System.out.printf("����: %d��.",result);	//5
		
		
		
		
		
		
		
		
	}

}
