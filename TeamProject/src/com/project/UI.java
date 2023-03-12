package com.project;

import java.util.Scanner;

public class UI {
	
	public static void boot() {
		System.out.println("======================");
		System.out.println("[회원관리 프로그램]");
		System.out.println("1. 관리자 로그인");
		System.out.println("2. 고객 로그인");
		System.out.println("3. 회원가입");
		System.out.println("4. 프로그램 종료");
		System.out.println("======================");
	}
	
	public static void mMain() {
		UI.subMenu("관리자 메인화면");
		System.out.println("1.카드 조회/추천");
		System.out.println("2.상품 관리");
		System.out.println("3.이벤트");
		System.out.println("4.프로그램 종료");
		
	}
	public static void customerMain() {
		UI.subMenu("메인화면");
		System.out.println("1.관리자 추가");
		System.out.println("2.상품 관리");
		System.out.println("3.이벤트");
		System.out.println("4.프로그램 종료");
		
	}
	public static void cardMain() {
		UI.subMenu("카드 조회/추천");
		String[] a = {"체크카드","신용카드","카드 추천 받기","뒤로가기"};
		UI.userSelect(a);
		
	}
	public static void mCardMain() {
		UI.subMenu("카드 상품 관리");
		String[] a = {"카드 상품 목록","카드 상품 추가"};
		UI.userSelect(a);
		
	}
	

	public static void subMenu(String title) {
		System.out.println("-------------------------");
		System.out.printf("<%s>\n",title);
		System.out.println("-------------------------");
	}

	public static void userSelect(String[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.printf("%d.%s\r",i+1,input[i]);
		}
		
	}
	public static void backSapce() {
		System.out.println("0.뒤로 가기");
	}
	
}
