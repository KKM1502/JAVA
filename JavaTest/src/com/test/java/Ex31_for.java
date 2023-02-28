package com.test.java;

import java.util.Scanner;

public class Ex31_for {
	public static void main(String[] args){
		/*


			
		 */
		//m2();
//		m3();
//		m4();
//		m5();
//		m6();
//		m7();
//		m8();
//		m9();
//		m10();
//		m11();
//		m12();
		m13();		
		
		

	}

	private static void m13() {
		// 숫자 전달 > 한글 반한
		
		Scanner scan = new Scanner(System.in);
//		System.out.print("숫자 입력: ");
//		int num = scan.nextInt();
//		String result = getNum(num);
//		System.out.println(result);
//		
//		
		System.out.print("문자 입력: ");
		String txt = scan.nextLine();
		String result2 = getText();
		System.out.println(result2);
		
		
	
		
	}

	
	
	private static String getText() {
		
		//컴파일 시점과 런타임 시점의 차이!!
		//1. 컴파일 > 소스를 기계어로 번역
		//2. 런타임 > 기계어를 실행
		
		//컴파일 실행
		//1. 파싱 > 구문 분석 > 문법 검사
		//2. 번역 작업
		
//		int a = 10;
//		int b = 20;
//		System.out.println(a+ b) ; //컴파일러 > int + int 
//		//리턴문을 안만들었다고 함! 
		
		String txt = "";
		for (int i = 0; i < 3; i++) {
				//"012"
			txt = txt + i; //누적
			return txt; //값을 반환 + 메소드 종료(탈출)
			//break
		}
		return ""; // 실제로는 절대 실행안되는 리턴
	}

	private static String getNum(int i) {
		
		if(i ==1) {
			return "하나";
		}
		else if(i==2) {
			return "둘";
		}
		else if(i==3) {
			return "셋";
		}
		else if(i==4) {
			return "넷";
		}
		return "작작쳐";
		
		
		
	}

	private static void m12() {
		for (int i = 0; i < 10; i++) {
			if(i==16) {
				break;
			}
			if(i ==16 || i ==20) {
				continue;
			}
			System.out.printf("%d번 학생을 상담합니다.\n",i);
		}
		
	}

	private static void m11() {
//
		//break		>	완전중지
		//continue	>	일시중지
		for (int i = 0; i < 10; i++) {
			if(i == 5) {
			continue; // 나머지 코드를 실행하지 않고 반복문의 시작으로 돌아가라
			}
//			System.out.println(i);//Unreachable code
		}
		
	}

	private static void m10() {
		// 사용자 숫자 원하는 만큼 입력 > 합을 구하시오 
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		int sum= 0;
		for (;;) {
			System.out.print("숫자(0을 입력하면 종료): ");
			int num = scan.nextInt();
			//0을 입력하면 for문 종료 
			if(num==0) {
				break;
			}
			sum += num;
			count++;
		}
		System.out.printf("총 %d개의 숫자를 입력했고 그 숫자들의 합은 %d입니다",count,sum);
				
		
		
	}	

	private static void m9() {
		//분기문 
		//-break
		//-continue
		//-독립 사용 불가능
		//-반복문과 같이 사용
		//break는 if문을 인식하지 않는다.
		
		//BreakPoint >F11(Debug mode)
		System.out.println("시작");
		for(int i=1; i<=10; i++) {
			break; //자신이 속한 제어문을 탈출한다.
//			System.out.println(i);//Unreachable code, 실행 안됨 
		}
		
	}

	private static void m8() {
		//무한 루프, Infinate Loop
		
		//증감식 오류  >> 대략 21억바퀴 (int가 표현 가능한 수 까지)
//		for (int i =0; i<10; i--) {
//			System.out.println("안녕하세요");
//		}
		
		//무한 루프 일부러 만들기
		// > 회전수를 미리 예측하기 힘든 경우 사용
//		for(;;) { 조건식을 생략하면 자동으로 true가 대입된다. > 무한루프
//			System.out.println("무한 루프");
//		}
	}

	private static void m7() {
		// x*x단 출력
		Scanner scan= new Scanner(System.in);
		System.out.print("보고싶은 단:");
		int x = scan.nextInt();
		System.out.println();
		
		if(x<10) {
			System.out.printf("   %d단\n",x);
			for(int j =1; j<10; j++) {
				System.out.printf("%d * %d = %2d\n",x,j,x * j); 
				}
			}
			else if(x>10){
				System.out.printf("   %d단\n",x);
				for(int j =1; j<=x; j++) {
					System.out.printf("%d * %d = %2d\n",x,j,x * j);
			}
			System.out.println();
		}
		
	}

	private static void m6() {
		// 요구사항 ] 입력받은 숫자 10개의 합 
			Scanner scan = new Scanner(System.in);
			int sum = 0;
			
			for (int i=0;i<10;i++) {
			System.out.print("숫자: ");
			int num = scan.nextInt();
			sum+=num;
			}
			System.out.printf("합은 %d입니다.",sum);
			
	}

	private static void m5() {
		// 요구사항 ] 1~ 입력받은 숫자까지 합 
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자: ");
		int num = scan.nextInt();
		int sum = 0;
		for (int i=0;i<=num;i++) {
			sum+=i;
		}
		System.out.printf("1에서 %d까지의 합은 %d입니다.",num,sum);
	}

	private static void m4() {
		// 요구사항] 1~10 합
		
		int sum = 0;
		for(int i=1;i<=10;i++) {
			
			sum += i;
			System.out.printf("1에서 %d까지 합: %d \n",i,sum);

		}
		
	}

	private static void m3() {

		//반복문 > 루프변수?
		
		//요구사항] 숫자 1~10까지 화면 출력
		//요구사항] 숫자 10000까지 변경
		int num=1;
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
		System.out.println();
		
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		System.out.println();
		
		for (int i=1; i<=10; i++) {
			System.out.println("실행문" + i);
		}
		System.out.println();
		
		//홀수
		for (int i=1; i<=100; i+=2) {
			System.out.println(i);

		}
		System.out.println();
		
		//짝수
		for (int i=2; i<=100; i+=2) {
			System.out.println(i);
			
		}
		System.out.println();
	}

	private static void m2() {
	
		//반복문 > 회전수
		for(int i = 1; i<=5; i++) {
			
			System.out.println("실행문 A");	
		}
		for(int i = 3; i<=7; i++) {
			
			System.out.println("실행문 B");	
		}
		
		
		//***************
		for(int i = 0; i < 5; i++) {
			
			System.out.println("실행문 B");	
		}
		
	
		
	}

	private static void m1() {
		/*
	 	for 문
		1. 초기식 실행
		2. 조건식 실행
			true : 실행블럭 실행
			false : for문 빠져나감
		3. 실행문
		4. 증감식 실행
		5. 조건식 실행

		
	 */
	
	//i : 루프 변수(***)
	for (int i =1 ; i<=3 ; i++) {
		//초기식	 :  조건식 ;증감식
		System.out.println("Hello");	
	}
}
		
	}
