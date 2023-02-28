package com.test.question;


import java.util.Scanner;

public class Q041 {
//	요구사항
//	서기 1년 1월 1일부터 오늘까지 며칠째인지 합을 구하시오.
//
//	조건..
//	Calendar 클래스 사용 금지
//	출력..
//	2023년 2월 10일은 738,561일째 되는 날이고 금요일입니다.

	public static void main(String[] args) {
		//서기 1년 1월 1일 
		int sum = 0;
		String result= "";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("오늘(년): ");
		int input_y = scan.nextInt();
		
		System.out.print("오늘(월): ");
		int input_m = scan.nextInt();
		
		System.out.print("오늘(일): ");
		int input_d = scan.nextInt();

		//작년까지 검사
		for (int i = 1; i < input_y; i++) {
	
			if (test(i).equals("윤년")) {
				sum+=366;
				
			} else if(test(i).equals("평년")){
				sum+=365;
			}
		}
		//올해 윤년 검사
		String leafyear = test(input_y);
		if(leafyear.equals("윤년")) {
			switch(input_m) {
				case 12:
					sum+=30;
				case 11:
					sum+=31;
				case 10:
					sum+=30;
				case 9:
					sum+=31;
				case 8:
					sum+=31;
				case 7:
					sum+=30;
				case 6:
					sum+=31;
				case 5:
					sum+=30;
				case 4:
					sum+=31;
				case 3:
					sum+=29;
				case 2:
					sum+=31;
				case 1:
					sum+=0;
					break;

			}
		}else {
			switch(input_m) {
				case 12:
					sum+=30;
				case 11:
					sum+=31;
				case 10:
					sum+=30;
				case 9:
					sum+=31;
				case 8:
					sum+=31;
				case 7:
					sum+=30;
				case 6:
					sum+=31;
				case 5:
					sum+=30;
				case 4:
					sum+=31;
				case 3:
					sum+=28;
				case 2:
					sum+=31;
				case 1:
					sum+=0;
					break;	
				
			}

		}
		
		//요일 구하기
		int days = sum+input_d; //전체 일 수 

		if (days%7==0) {
			result = "일요일";
		}
		else if (days%7==1) {
			result = "월요일";
		}
		else if (days%7==2) {
			result = "화요일";
		}
		else if (days%7==3) {
			result = "수요일";
		}
		else if (days%7==4) {
			result = "목요일";
		}
		else if (days%7==5) {
			result = "금요일";
		}
		else if (days%7==6) {
			result = "토요일";
		}
		
		System.out.printf("%d년 %d월 %d일은 %,d일째 되는 날이고 %s입니다.",input_y,input_m,input_d,days,result);
	}//main
	
	
	//윤년검사
	private static String test(int i) {
		// 윤년 검사
		if ((i%4)==0) {
			
			if((i%100)==0) {
				
				if((i%400)==0) {
					
					return "윤년";
				}
				else {
					return "평년";
				}
				
			}
			else {
				return "윤년";
			}
		}
		else {
			return "평년";
		}
		
	}
	
	
	
}
