package com.test.question;

import java.util.Scanner;

public class Q013 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("����: ");
		int kor=scan.nextInt();
		
		System.out.print("����: ");
		int eng=scan.nextInt();
		
		System.out.print("����: ");
		int math=scan.nextInt();
		
	
		
		test(kor,eng,math); // void
		
		System.out.println();
		
		System.out.println(test1(kor,eng,math)); //String
		
	}
	public static void test(int kor, int eng, int math) {
		System.out.print((kor<40||eng<40||math<40?"���հ��Դϴ�":((kor+eng+math)/3)>=60?"�հ��Դϴ�":"���հ��Դϴ�"));
		
	}
	public static String test1(int kor, int eng, int math) {
		String result=(kor<40||eng<40||math<40?"���հ��Դϴ�":((kor+eng+math)/3)>=60?"�հ��Դϴ�":"���հ��Դϴ�");
		
		return result;
	}
}
