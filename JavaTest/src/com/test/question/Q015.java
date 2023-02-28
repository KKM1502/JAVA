package com.test.question;

import java.util.Scanner;

public class Q015 {
	public static void main(String[] args) {
//		사과 나무를 처음 심었을 때 나무의 길이: 0m
//		맑은 날 사과 나무의 성장률: 5㎝
//		흐린 날 사과 나무의 성잘률: 2㎝
//		사과 나무는 길이가 1m 넘는 시점부터 사과가 열린다.
//		1m 넘는 시점부터 10㎝ 자랄 때마다 사과가 1개씩 열린다.
		
		Scanner scan=new Scanner(System.in);
		System.out.print("맑은 날: ");
		int sunny = scan.nextInt();
		
		System.out.print("흐린 날: ");
		int foggy = scan.nextInt();
		
		System.out.printf("사과가 총 %d개 열렸습니다.",getApple(sunny,foggy));
		
	}//main
	
	public static int getApple(int sunny, int foggy) {
		
		int	height =sunny*5+foggy*2; //높이
		int apple=	(height-100)/10; //사과개수
		return apple;
	}
}	
