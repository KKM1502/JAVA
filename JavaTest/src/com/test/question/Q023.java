package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q023 {
	public static void main(String[] args) {
//		요구사항
//		아빠와 딸의 생일을 입력받아 아빠가 딸보다 며칠을 더 살았는지 출력하시오.
//
//		입력..
//		아빠 생일(년): 1970 
//
//		아빠 생일(월): 5 
//
//		아빠 생일(일): 10 
//
//		딸 생일(년): 1998 
//
//		딸 생일(월): 7 
//
//		딸 생일(일): 22 
//
//		출력..
//		아빠는 딸보다 총 10,300일을 더 살았습니다.
		Scanner scan = new Scanner(System.in);
		System.out.print("아빠 생일(년): ");
		int y = scan.nextInt();
		System.out.println();
		
		System.out.print("아빠 생일(월): ");
		int m = scan.nextInt();
		System.out.println();
		
		System.out.print("아빠 생일(일): ");
		int d = scan.nextInt();
		System.out.println();
		
		System.out.print("딸 생일(년): ");
		int y2 = scan.nextInt();
		System.out.println();
		
		System.out.print("딸 생일(월): ");
		int m2 = scan.nextInt();
		System.out.println();
		
		System.out.print("딸 생일(일): ");
		int d2 = scan.nextInt();
		System.out.println();
		
		Calendar c1 = Calendar.getInstance();
		c1.set(Calendar.YEAR, y);
		c1.set(Calendar.MONTH, m);
		c1.set(Calendar.DATE, d);
		Calendar c2 = Calendar.getInstance();
		c2.set(Calendar.YEAR, y2);
		c2.set(Calendar.MONTH, m2);
		c2.set(Calendar.DATE, d2);
				
		int distance=(int) ((c2.getTimeInMillis()-c1.getTimeInMillis())/1000/60/60/24);
		System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다.",distance);
		
		
	}
}
