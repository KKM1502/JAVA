package com.test.question;

import java.util.Scanner;

public class Q012 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자: ");
		int n=scan.nextInt();
		
		getNumber1(n); //void
		System.out.printf("입력하신 숫자 '%d'는(은) '%s'입니다.\n", n,getNumber(n));
		
	}//main
	
	public static void getNumber1(int n) {
	
		System.out.printf("입력하신 숫자 '%d'는(은) '%s'입니다.\n", n, (n%2==1?"홀수":"짝수"));
		
		
	}
	public static String getNumber(int n) {
		String result= (n%2==1?"홀수":"짝수");
		return result;
		
	}
}
