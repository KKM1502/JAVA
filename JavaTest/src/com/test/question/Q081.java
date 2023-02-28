package com.test.question;

import java.util.Scanner;

public class Q081 {
//	요구사항
//	이메일 주소를 입력받아 아이디와 도메인을 각각 추출하시오.
//
//	입력..
//	이메일: hong@gmail.com 
//
//	출력..
//	아이디: hong
//	도메인: gmail.com
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이메일: ");
		String input = scan.nextLine();

		int k =input.indexOf("@");
		System.out.print("아이디: ");
		for (int i = 0; i < k; i++) {
			System.out.print(input.charAt(i));
		}
		System.out.println();
		System.out.print("도메인: ");
		for (int i = k+1; i < input.length(); i++) {
			System.out.print(input.charAt(i));
		}
	}

}
