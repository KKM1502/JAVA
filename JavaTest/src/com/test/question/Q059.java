package com.test.question;

public class Q059 {
//	요구사항
//	아래와 같이 출력하시오.
//
//	조건..
//	마지막 숫자가 100이 넘기 전까지 출력하시오.
//	출력..
//	1 + 2 + 4 + 7 + 11 + 16 + 22 + 29 + 37 + 46 + 56 + 67 + 79 + 92 +  = 469
//	  1   2   3   4    5     6   7    8     9   10   11   12   13 
	
	public static void main(String[] args) {
		int n = 1 ;//1+2+4+....
		int sum = 0	;
		for (int j = 0; n+j<100; j++) { //n 더해지는 수 
			
			n=n+j;
			sum+=n;
			System.out.printf(" %d +",n);
				
		}
		System.out.printf("= %d",sum);
	}
}
