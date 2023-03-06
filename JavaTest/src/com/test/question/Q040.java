package com.test.question;

import java.util.Scanner;

	public class Q040 {
		public static void main(String[] args) {
			
//			//요구사항
//			아래와 같이 출력하시오.
//
//			입력..
//			시작 숫자: 1 
//
//			종료 숫자: 10 
//
//			출력..
//			1 - 2 + 3 - 4 + 5 - 6 + 7 - 8 + 9 - 10 = -5

			//숫자 입력받기
			Scanner scan = new Scanner(System.in);
			System.out.print("시작 숫자: ");
			
			int start= scan.nextInt();//시작 숫자
			
			System.out.print("종료 숫자: ");
			int end= scan.nextInt(); //종료 숫자
			
			int sum = 0; //총 합 
				
			for (int i = start; i <= end; i++) {
				
				if (i%2==1) {
					if(i!=end) {
						System.out.printf("%d - ",i);
						sum+=i;
					}
					else{
						System.out.printf("%d = ",i);
						sum+=i;
						}
				}//홀수
				if (i%2==0) {
					if(i!=end) {
						System.out.printf("%d + ",i);
						sum-=i;
					}
					else{
						System.out.printf("%d = ",i);
						sum-=i;
						}
				}//짝수

			}
			System.out.printf("%d",sum);
			scan.close();
			
		}
	
	

}
