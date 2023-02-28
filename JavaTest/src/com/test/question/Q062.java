package com.test.question;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Q062 {
//	요구사항
//	학생의 이름을 N개 입력받아 아래와 같이 출력하시오.
//
//	조건..
//	이름을 오름차순 정렬하시오.
//	입력..
//	학생 수: 6 
//
//	학생명: 홍길동 
//
//	학생명: 아무개 
//
//	학생명: 하하하 
//
//	학생명: 호호호 
//
//	학생명: 후후후 
//
//	학생명: 헤헤헤 
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("학생 수:");
		int num = scan.nextInt();
		String input = scan.nextLine();
		String[] array = new String[num];
		for (int i = 0; i < num; i++) {
			System.out.print("학생명: ");
			String input1 = scan.nextLine();

			array[i]=input1;
		}
		Arrays.sort(array);
		System.out.println();
		
		System.out.printf("입력받은 학생은 총 %d명 입니다.\n",num);
		for(int i=0;i<num;i++) {
			System.out.printf("%d.%s\n",i,array[i]);
			
			
		}
		
		


	}
	
	
}
