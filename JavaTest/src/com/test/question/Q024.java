package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q024 {
	public static void main(String[] args) {
//		�䱸����
//		���� ��� ������ ���� �ð��� �ޱ⸦ ���ϴ� ���� �ִ�. ���� ������ ���忡 ��ÿ� ��ȭ�� �ؾ� ��� ������ ���� �ð��� ���� �� �ִ��� �˷��ֽÿ�.
//
//		����..
//		��ȭ�� �ɸ� ¥����� 10�� �ڿ� �����մϴ�.
//		��ȭ�� �ɸ� ġŲ�� 18�� �� �����մϴ�.
//		��ȭ�� �ɸ� ���ڴ� 25�� �� �����մϴ�.
//		������ �ޱ� ���ϴ� �ð��� ���� 11�� �������� �����մϴ�.(��¥ ���� ����)
//		�Է�..
//		������ �ޱ� ���ϴ� �ð�

		Scanner scan = new Scanner(System.in);
		System.out.print("��: ");
		int hour = scan.nextInt();
		System.out.println();
		
		System.out.print("��: ");
		int minute = scan.nextInt();
		System.out.println();
		
		Calendar now= Calendar.getInstance();
		now.set(Calendar.HOUR_OF_DAY, hour);
		now.set(Calendar.MINUTE, minute);

		now.add(Calendar.MINUTE,-10);
		System.out.printf("¥���: %d�� %d��",now.get(Calendar.HOUR_OF_DAY),now.get(Calendar.MINUTE));
		
		now.set(Calendar.HOUR_OF_DAY, hour);
		now.set(Calendar.MINUTE, minute);
		now.add(Calendar.MINUTE,-18);
		System.out.printf("ġŲ: %d�� %d��",now.get(Calendar.HOUR_OF_DAY),now.get(Calendar.MINUTE));
		
		now.set(Calendar.HOUR_OF_DAY, hour);
		now.set(Calendar.MINUTE, minute);
		now.add(Calendar.MINUTE,-25);
		System.out.printf("����: %d�� %d��",now.get(Calendar.HOUR_OF_DAY),now.get(Calendar.MINUTE));

		
		
		
				
		
		
	}

	
	
}
