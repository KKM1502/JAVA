package com.test.java;

public class Ex09_Output {

	
	public static void main(String[] args) {
		//printf + 형식문자 > 확장기능
		
		//1. %숫자s, %숫자, %숫자f, %숫자b
		//- 숫자: 출력할 너비를 지정
		//- 탭문자처럼 출력 내용을 서식 지정하는 역할
		
		int num= 123;
		System.out.printf("[%d]\n", num);
		System.out.printf("[%10d]\n", num); //10칸 뒤에서부터
		System.out.printf("[%-10d]\n", num); //10칸 앞에서부터
		
		
		//2. %.숫자f
		//-소수점 이하 자릿수 지정
		//%10.1f >> 10칸 , 소수점 1자리까지(10칸 중 .도 1칸을 차지)
		double num2 = 3.14;
		System.out.println(num2);
		System.out.printf("%.5f\n",num2);
		System.out.printf("%.1f\n",num2);
		System.out.printf("%.2f\n",num2);
		System.out.printf("%.3f\n",num2);

		System.out.printf("[%10.1f]\n",num2);
		System.out.println();
		
		//3. %,d, %,f
		//- 자릿수 표기 (천단위 표기, 3자리)
		
		int price = 1234567;
		System.out.printf("금액: %d원\n",price);
		System.out.printf("금액: %,d원\n",price);
		System.out.println();
		
		
		//전체 너비 20칸 + 천단위 표기 + 소수이하 2자리까지
		double num3 = 1234567.89012345;
		
		System.out.printf("%,20.2f\n", num3);
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		System.out.println("=======================================");
		System.out.println("               음료 가격");
		System.out.println("=======================================");
		System.out.printf("콜라 \t\t\t\t%,6d원\n",2500);
		System.out.printf("사이다 \t\t\t\t%,6d원\n",3500);
		System.out.printf("아메리카노 \t\t\t%,6d원\n",5000);
		System.out.printf("케이크 \t\t\t\t%,6d원\n",12000);
		
	}
	
	
	
}
