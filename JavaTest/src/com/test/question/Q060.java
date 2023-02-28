package com.test.question;

public class Q060 {
//	요구사항
//	아래와 같이 출력하시오.
//
//	조건..
//	마지막 숫자가 100이 넘기 전까지 출력하시오.
//	출력..
//	1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34 + 55 + 89 +  = 232
//  n   n1  n2 
	public static void main(String[] args) {
		
		int n = 1;
		int n1 = 1 ;
		int sum = 2	; // 합
		int n2 = 0;
		System.out.print("1+1");
		while(n+n1<100) {
			n2=n+n1; // 2 , 3
			System.out.printf("+%d",n2);
			sum+=n2;
			n=n1; //1
			n1=n2;  //2 
			
		}
		System.out.printf("=%d",sum);
	}
	
}
