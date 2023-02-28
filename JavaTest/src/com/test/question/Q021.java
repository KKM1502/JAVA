package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q021 {
	public static void main(String[] args){
//		요구사항
//		태어난 년도를 입력하면 나이를 출력하시오.
//
//		조건..
//		올해를 기준으로 나이를 계산하시오.
//		내년, 내후년에 실행해도 그때에 맞는 나이를 출력한다.
//		우리나라 나이로 출력하시오.
		
//		입력..
//		태어난 년도: 1995 
//
//		출력..
//		나이: 29세
		Scanner scan = new Scanner(System.in);
		System.out.print("태어난 년도: ");
		int input = scan.nextInt();
		
		
		Calendar c= Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR)-input+1+"세");
		
	}
}
