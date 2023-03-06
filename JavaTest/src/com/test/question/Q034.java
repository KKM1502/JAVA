package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q034 {
//	요구사항
//	날짜를 입력받아 아래의 조건에 맞게 결과를 출력하시오.
//
//	조건..
//	입력받은 날짜가 평일이면 해당 주의 토요일을 알아낸다.
//	입력받은 날짜가 토/일요일이면 아무것도 안한다.
//	입력..
//	년: 2022 
//
//	월: 3 
//
//	일: 14 
//
//	출력..
//	입력하신 날짜는 '평일'입니다.
//	해당 주의 토요일로 이동합니다.
//	이동한 날짜는 '2022-03-19' 입니다.
//	입력..
//	년: 2022 
//
//	월: 3 
//
//	일: 6 
//
//	출력..
//	입력하신 날짜는 '휴일(토/일)'입니다.
//	결과가 없습니다.
	public static void main(String[] args) {
		Calendar d_day = Calendar.getInstance();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("년: ");
		int y = scan.nextInt();
		System.out.print("월: ");
		int m = scan.nextInt();
		System.out.print("일: ");
		int d = scan.nextInt();
		
		d_day.set(y,m-1,d);
		
		if(d_day.get(Calendar.DAY_OF_WEEK)==1 || d_day.get(Calendar.DAY_OF_WEEK)==7 ) {
			System.out.println("입력하신 날짜는 '휴일(토/일)'입니다");
			
		}else {
			System.out.print("입력하신 날짜는 '평일'입니다.\n 해당 주의 토요일로 이동합니다.\n");
			d_day.add(Calendar.DATE,7-d_day.get(Calendar.DAY_OF_WEEK));
			System.out.printf("이동한 날짜는 '%tF' 입니다",d_day);
		}
		scan.close();
	}
		
}
