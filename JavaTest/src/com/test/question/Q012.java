package com.test.question;

import java.util.Scanner;

public class Q012 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("����: ");
		int n=scan.nextInt();
		
		getNumber1(n); //void
		System.out.printf("�Է��Ͻ� ���� '%d'��(��) '%s'�Դϴ�.\n", n,getNumber(n));
		
	}//main
	
	public static void getNumber1(int n) {
	
		System.out.printf("�Է��Ͻ� ���� '%d'��(��) '%s'�Դϴ�.\n", n, (n%2==1?"Ȧ��":"¦��"));
		
		
	}
	public static String getNumber(int n) {
		String result= (n%2==1?"Ȧ��":"¦��");
		return result;
		
	}
}
