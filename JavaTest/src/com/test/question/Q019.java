package com.test.question;

import java.util.Calendar;

public class Q019 {
	public static void main(String[] args) {
//		����..
//		void nowTime()
//		���� �ð��� 24�ð����� ����Ͻÿ�.
//		���� �ð��� ����/���ķ� ����Ͻÿ�.
		
//		ȣ��..
		nowTime();
		
//		���..
//		���� �ð� : 10�� 30�� 25��
//		���� �ð� : ���� 10�� 30�� 25��
		
		
		
	}//main

	private static void nowTime() {
		Calendar c1= Calendar.getInstance();
		System.out.printf("���� �ð�:%d�� %d�� %d��\n",c1.get(Calendar.HOUR_OF_DAY),c1.get(Calendar.MINUTE),c1.get(Calendar.SECOND));
		System.out.printf("���� �ð�:%s %d�� %d�� %d��\n",c1.get(Calendar.AM_PM)==0 ?"����":"����",c1.get(Calendar.HOUR_OF_DAY),c1.get(Calendar.MINUTE),c1.get(Calendar.SECOND));
		
	}
	
	
}
