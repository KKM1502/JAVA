package com.test.question;

import java.util.Calendar;

public class Q020 {
	public static void main(String[] args) {
//		�䱸����
//		���� �¾ ������ ���ϰ� ù���� ����Ͻÿ�.
//
//		���..
//		����: 2023-05-19
//		ù��: 2024-02-08
		
		Calendar birth=Calendar.getInstance();
		birth.add(Calendar.DATE, 100);
		System.out.printf("������ġ: %tF\n",birth);
		
		
		birth=Calendar.getInstance();
		birth.add(Calendar.YEAR, 1);
		System.out.printf("ù��: %tF\n",birth);
		
		
	}
}
