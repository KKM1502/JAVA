package com.test.question;

public class Q017 {
	public static void main(String[] args) {
//		조건..
//		사원 → 대리 → 과장 → 부장
//		void position(String)
//		void position(String, String)
//		void position(String, String, String)
//		void position(String, String, String, String)
		
//		호출..
			position("홍길동");
			System.out.println();
			position("홍길동", "유재석");
			System.out.println();
			position("홍길동", "유재석", "박명수");
			System.out.println();
			position("홍길동", "유재석", "박명수", "정형돈");
		
//		출력..
//		사원 : 홍길동
//		         
//		사원 : 홍길동
//		대리 : 유재석
//
//		사원 : 홍길동
//		대리 : 유재석
//		과장 : 박명수
//
//		사원 : 홍길동
//		대리 : 유재석
//		과장 : 박명수
//		부장 : 정형돈
		
		
	}//main
	public static void position(String n) {
		System.out.printf("사원 : %s\n",n);
	}
	public static void position(String n,String n2) {
		System.out.printf("사원 : %s\n대리 : %s\n",n,n2);
	}
	public static void position(String n,String n2, String n3) {
		System.out.printf("사원 : %s\n대리 : %s\n과장 : %s\n",n,n2,n3);
	}
	public static void position(String n,String n2, String n3, String n4) {
		System.out.printf("사원 : %s\n대리 : %s\n과장 : %s\n부장 : %s\n",n,n2,n3,n4);
	}
	
}
