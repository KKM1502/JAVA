package com.test.question;

import java.util.Scanner;

public class Q005 {
	public static void main(String[] args) {
		//1.scanner 생성하기
		//2.라벨 출력
		//3.밟은 횟수 입력받기
//		//4.총n번 밟았을때 총m(거리)= 3.14 * 26(inch) * n 
//			-기어비 1:1 → 페달 1회전 == 자전거 바퀴 1회전
//			-모든 출력 숫자는 천단위 표기하시오.
		//5.결과 출력
		
		Scanner scan = new Scanner(System.in); //1 
		
		System.out.print("밟은 횟수: ");//2
		
		int n= scan.nextInt();//3
		
		double m = 3.14 * 0.6604 * n; //4. 원주율 * 26inch -> m  *n 
		
	
		System.out.printf("사용자가 총 %,f회 페달을 밟아 자전거가 총 %,.3fm를 달렸습니다.",n,m); //5
		}
}
