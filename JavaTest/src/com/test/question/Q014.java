package com.test.question;

import java.util.Scanner;

public class Q014 {
	public static void main(String[] args) {
		
//		����..
//		int getTime(int station, int change, int time)
//		�� ���� �ҿ� �ð�: 2�� �ҿ�
//		ȯ�� �ҿ� �ð�: N�� �ҿ�
//		�ð��뿡 ���� ȯ�� �ҿ� �ð��� �ٸ���.
//		����: 3��
//		��ٽ�: 4��
//		��ٽ�: 5��
//		
		Scanner scan = new Scanner(System.in);
	
		
		System.out.print("���� ����: ");
		int station=scan.nextInt();
		
		System.out.print("ȯ�¿��� ����: ");
		int change=scan.nextInt();
		
		System.out.print("�ð���(1.����, 2.��ٽ�, 3.��ٽ�): ");
		int time=scan.nextInt();
		
		String result="";
		
		getTime(station, change, time);
		System.out.printf("\n�� �ҿ� �ð��� %d���Դϴ�.",getTime1(station, change, time));
	}//main
	
	public static void getTime(int station, int change, int time) {
		int total = station *2 + change*(time+2);
		System.out.printf("�� �ҿ� �ð��� %d���Դϴ�.",total);
	}
	
	public static int getTime1(int station, int change, int time) {
		
		int total = station *2 + change*(time+2);
		return total;
		
	}
	
	

}
