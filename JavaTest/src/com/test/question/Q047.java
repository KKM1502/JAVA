package com.test.question;

import java.util.Scanner;

public class Q047 {
	
	public static void main(String[] args) {
		m2();
	}
	
	private static void m2() {
		//요구사항] 자판기
		//- 메뉴 출력 > 음료 선택 > 가격 출력
		
		Scanner scan = new Scanner(System.in);
		for(;;){
			System.out.println("==================");
			System.out.println("       자판기");
			System.out.println("==================");
			System.out.println("1.콜라 : 700원");
			System.out.println("2.사이다 : 600원");
			System.out.println("3.비타500 : 500원");
			System.out.println("-----------------");
			
			System.out.print("금액 투입(원): ");
			int input = scan.nextInt();
			
			String num1 = scan.nextLine();
			System.out.print("음료 선택(번호): ");
			String num = scan.nextLine();
			
			if (num.equals("1") && input>700) {
				System.out.printf("+콜라를 제공합니다.\n+잔돈 %d원을 제공합니다.",input-700);
			} else if (num.equals("2")&& input>600) {
				System.out.printf("+사이다를 제공합니다.\n+잔돈 %d원을 제공합니다.",input-600);
			} else if (num.equals("3")&& input>500) {
				System.out.printf("+비타500을 제공합니다.\n+잔돈 %d원을 제공합니다.",input-500);
			} else {
				System.out.println("투입한 금액을 확인해주세요.");
			}
			System.out.println("\n계속하시려면 엔터를 입력하세요.");
			String conti= scan.nextLine();
			if (conti.equals("\n")) {
				continue;
			}

			
		}
	}

}
