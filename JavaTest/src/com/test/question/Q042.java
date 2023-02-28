package com.test.question;

import java.util.Scanner;

public class Q042 {
//	요구사항
//	컴퓨터가 1~10 사이의 숫자 1개를 생각하면 사용자가 맞추는 프로그램을 구현하시오.
//
//	조건..
//	시도 횟수가 10회가 넘어가면 프로그램을 종료하시오.
//	입/출력..
//	컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.
//
//
//	숫자: 1 
//
//	틀렸습니다.
//
//
//	숫자: 3 
//
//	틀렸습니다.
//
//
//	숫자: 7 
//
//	틀렸습니다.
//
//
//	숫자: 2 
//
//	틀렸습니다.
//
//
//	숫자: 5 
//
//	맞았습니다.
//
//
//	컴퓨터가 생각한 숫자는 5입니다.
//
//	정답을 맞추는데 시도한 횟수는 5회입니다.
//
//
//	프로그램을 종료합니다.
	public static void main(String[] args) {
		int count = 1; // 시도횟수
		Scanner scan = new Scanner(System.in);
		//랜덤 숫자 생성
		int random = (int) (Math.random()*10) + 1;
		System.out.println("컴퓨터가 1~10 사이의 숫자 1개 생각했습니다.");
		
		for (int i = 0; i < 10; i++) {
			System.out.print("숫자: ");
			int input = scan.nextInt();
			
			if(input == random) {
				System.out.printf("맞았습니다.\n컴퓨터가 생각한 숫자는 %d입니다.\n정답을 맞추는데 시도한 횟수는 %d회입니다.",random,count);
				break;
			}else {
				System.out.println("틀렸습니다.");
				count ++;
			}
			
		}
		
		
	}
}
