package com.test.question;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Q022 {

	public static void main(String[] args) {
//		요구사항
//		남녀 커플의 이름과 만난날을 입력받아 기념일을 출력하시오.
//
//		입력..
//		남자 이름: 하하하 
//
//		여자 이름: 호호호 
//
//		만난날(년): 2023 
//
//		만난날(월): 2 
//
//		만난날(일): 8 
//
//		출력..
//		'하하하'과(와) '호호호'의 기념일
//		100일: 2023-05-19
//		200일: 2023-08-27
//		300일: 2023-12-05
//		500일: 2024-06-22
//		1000일: 2025-11-04
		Scanner scan = new Scanner(System.in);
		System.out.print("남자 이름: ");
		String name1 = scan.nextLine();
		System.out.println();
		
		System.out.print("여자 이름: ");
		String name2 = scan.nextLine();
		System.out.println();
		
		System.out.print("만난날(년): ");
		int y = scan.nextInt();
		System.out.println();
		
		System.out.print("만난날(월): ");
		int m = scan.nextInt();
		System.out.println();
		
		System.out.print("만난날(일): ");
		int d = scan.nextInt();
		System.out.println();
		
		Calendar date= Calendar.getInstance();
		date.set(Calendar.YEAR,y);
		date.set(Calendar.MONTH,m-1);
		date.set(Calendar.DATE,d);
		
		System.out.printf("%s와 %s의 기념일\n ",name1,name2);
		
		date.add(Calendar.DATE, 100);
		System.out.printf("100일 :%tF\n ",date);
		
		date.add(Calendar.DATE, 100);
		System.out.printf("200일 :%tF\n ",date);
		
		date.add(Calendar.DATE, 100);
		System.out.printf("300일 :%tF\n ",date);
		
		date.add(Calendar.DATE, 200);
		System.out.printf("500일 :%tF\n ",date);
		
		date.add(Calendar.DATE, 500);
		System.out.printf("1000일 :%tF\n ",date);
		
	}


}
