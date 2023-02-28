package com.test.question;

public class Q058 {
//	아래와 같이 출력하시오.
//
//	출력..
//	 1 ~  10:  55
//	11 ~  20: 155
//	21 ~  30: 255
//	31 ~  40: 355
//	41 ~  50: 455
//	51 ~  60: 555
//	61 ~  70: 655
//	71 ~  80: 755
//	81 ~  90: 855
//	91 ~ 100: 955
	
	public static void main(String[] args) {
	
	
	m2();
	
	}
	
	private static void m2() {
	
		for (int i = 1; i <= 100; i=i+10) {
			System.out.printf(" %2d ~  %3d: %4d\n",i,i+9,m1(i,i+9));
		}	
	
	}

	private static int m1(int start, int end) {
		
		int sum = 0;
		for (int i = start; i <= end; i++) {
				sum+=i;
		}
		return sum;
	}
}




