//package com.project;
//
//import java.util.Scanner;
//
//public class CustomerService {
//	public static void customerLogin() {
//
//	      UI.subMenu("고객 로그인");
//	      Scanner scan = new Scanner(System.in);
//	      
//	      System.out.print("고객 ID 입력: ");
//	      String cId = scan.nextLine();
//	      System.out.println();
//	      System.out.print("비밀번호 입력: ");
//	      String cPw = scan.nextLine();
//
//	      for(Customer m : Data.customerlist) {
//		      if (cId.equals(m.getId())  && cPw.equals(m.getPw()) ) {
//		          customerMain();
//		      } 
//		      else {
//		         System.out.println("고객 ID 또는 비밀번호가 틀렸습니다.");
//		         System.out.println("메인메뉴로 돌아가시겠습니까?");
//		         System.out.println("1. 네\t\t2. 아니요");
//		         String sel = scan.nextLine();
//		         if (sel.equals("1")) {
//		            UI.mainMenu();
//		         } else if (sel.equals("2")) {
//		            customerLogin();
//		         } 
//		      }
//		      
//		   }
//	}
//}
