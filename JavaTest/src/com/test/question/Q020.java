package com.test.question;

import java.util.Calendar;

public class Q020 {
	public static void main(String[] args) {
//		요구사항
//		오늘 태어난 아이의 백일과 첫돌을 출력하시오.
//
//		출력..
//		백일: 2023-05-19
//		첫돌: 2024-02-08
		
		Calendar birth=Calendar.getInstance();
		birth.add(Calendar.DATE, 100);
		System.out.printf("백일잔치: %tF\n",birth);
		
		
		birth=Calendar.getInstance();
		birth.add(Calendar.YEAR, 1);
		System.out.printf("첫돌: %tF\n",birth);
		
		
	}
}
