package com.test.question;

import java.util.Scanner;

public class Q003 {
	public static void main(String[] args) {
		//1.scanner 생성하기
		//2.라벨 출력
		//3.너비와 높이 입력받기
		//4.사각형 넓이 = 너비 * 높이 , 사각형 둘레 = 너비 * 2 + 높이 * 2
		//5.결과 출력
		Scanner scan = new Scanner(System.in); //1
		
		System.out.print("너비(㎝): ");//2
		int w= scan.nextInt();	//3
		
		System.out.print("높이(㎝): ");//2
		int h= scan.nextInt();	//3
		
		int area = w * h ;
		int circum = w*2 + h*2;	//4
		
		System.out.printf("사각형의 넓이는 %dcm²입니다.\n사각형의 둘레는 %dcm입니다.",area,circum);	//5
		
		
		
	}
}


