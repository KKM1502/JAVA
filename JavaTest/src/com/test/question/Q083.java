package com.test.question;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q083 {
//	요구사항
//	파일명 10개를 입력받아 각 확장자별로 총 개수를 출력하시오.
//
//	조건..
//	확장자는 다음으로 제한한다.
//	mp3
//	jpg
//	java
//	hwp
//	doc
//	입력..
//	파일명: 인기가요.mp3 
//
//	파일명: cat.jpg 
//
//	파일명: Ex01.java 
//
//	파일명: icon.jpg 
//
//	파일명: 수업_정리.doc 
//
//	파일명: Scanner.java 
//
//	파일명: food.jpg 
//
//	파일명: 공지사항.hwp 
//
//	파일명: 이력서.hwp 
//
//	파일명: 출금내역.doc 
//
//	출력..
//	mp3 : 1개
//	jpg : 3개
//	java : 2개
//	hwp : 2개
//	doc : 2개
	
	public static void main(String[] args) {
		String[] array = new String[10];
		Scanner scan = new Scanner(System.in);
		
		int count = 1;

		
		
		for (int i = 0; i < 10; i++) {

			System.out.print("파일명: ");
			String input = scan.nextLine();
			System.out.println();
			int index = input.lastIndexOf(".");
			String extention=input.substring(index+1); //추출
			array[i]=extention;
			

		}
		Arrays.sort(array,Collections.reverseOrder());	//정렬
		
		
	
		for (int i = 0; i < array.length; i++) {
			if(i==(array.length-1)) {
				if(array[i].equals(array[i-1])) {
				count++;
				System.out.printf("%s : %d개",array[i],count);
				}
				else {
					System.out.printf("%s : %d개",array[i],count);
				}
				
			}
			
			else {
				if(array[i].equals(array[i+1])) {
					count++;
	
				}
				else{
					System.out.printf("%s : %d개\n",array[i],count);
					count=1;
				}
				
			}
		}
	}
}
	
	

