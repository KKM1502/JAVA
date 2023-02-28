package com.test.question;

import java.util.Scanner;

public class Q013 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("국어: ");
		int kor=scan.nextInt();
		
		System.out.print("영어: ");
		int eng=scan.nextInt();
		
		System.out.print("수학: ");
		int math=scan.nextInt();
		
	
		
		test(kor,eng,math); // void
		
		System.out.println();
		
		System.out.println(test1(kor,eng,math)); //String
		
	}
	public static void test(int kor, int eng, int math) {
		System.out.print((kor<40||eng<40||math<40?"불합격입니다":((kor+eng+math)/3)>=60?"합격입니다":"불합격입니다"));
		
	}
	public static String test1(int kor, int eng, int math) {
		String result=(kor<40||eng<40||math<40?"불합격입니다":((kor+eng+math)/3)>=60?"합격입니다":"불합격입니다");
		
		return result;
	}
}
