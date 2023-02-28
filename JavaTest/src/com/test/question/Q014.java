package com.test.question;

import java.util.Scanner;

public class Q014 {
	public static void main(String[] args) {
		
//		조건..
//		int getTime(int station, int change, int time)
//		각 역간 소요 시간: 2분 소요
//		환승 소요 시간: N분 소요
//		시간대에 따라 환승 소요 시간이 다르다.
//		평상시: 3분
//		출근시: 4분
//		퇴근시: 5분
//		
		Scanner scan = new Scanner(System.in);
	
		
		System.out.print("역의 개수: ");
		int station=scan.nextInt();
		
		System.out.print("환승역의 개수: ");
		int change=scan.nextInt();
		
		System.out.print("시간대(1.평상시, 2.출근시, 3.퇴근시): ");
		int time=scan.nextInt();
		
		String result="";
		
		getTime(station, change, time);
		System.out.printf("\n총 소요 시간은 %d분입니다.",getTime1(station, change, time));
	}//main
	
	public static void getTime(int station, int change, int time) {
		int total = station *2 + change*(time+2);
		System.out.printf("총 소요 시간은 %d분입니다.",total);
	}
	
	public static int getTime1(int station, int change, int time) {
		
		int total = station *2 + change*(time+2);
		return total;
		
	}
	
	

}
