package com.test.question;

public class Q057 {
//	요구사항
//	아래와 같이 출력하시오.
//
//	출력..
//	1 ~  10:   55
//	1 ~  20:  210
//	1 ~  30:  465
//	1 ~  40:  820
//	1 ~  50: 1275
//	1 ~  60: 1830
//	1 ~  70: 2485
//	1 ~  80: 3240
//	1 ~  90: 4095
//	1 ~ 100: 5050
	public static void main(String[] args) {
		
	System.out.printf("1 ~  10: %5d\n",m1(1,10));
	System.out.printf("1 ~  20: %5d\n",m1(1,20));
	System.out.printf("1 ~  30: %5d\n",m1(1,30));
	System.out.printf("1 ~  40: %5d\n",m1(1,40));
	System.out.printf("1 ~  50: %5d\n",m1(1,50));
	System.out.printf("1 ~  60: %5d\n",m1(1,60));
	System.out.printf("1 ~  70: %5d\n",m1(1,70));
	System.out.printf("1 ~  80: %5d\n",m1(1,80));
	System.out.printf("1 ~  90: %5d\n",m1(1,90));
	System.out.printf("1 ~ 100: %5d\n",m1(1,100));
	
	
	}
	
	
	private static int m1(int start, int end) {
		
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum+=i;
		}
		return sum;
	}
}

