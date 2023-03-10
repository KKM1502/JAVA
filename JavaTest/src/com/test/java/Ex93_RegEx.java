package com.test.java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex93_RegEx {
	public static void main(String[] args) {
		
		/*
		 
		 정규 표현식, Regular Expression
		 - 정규식
		 - "특정 패턴"의 문자열을 검색하는 도구
		 - 자바(X)
		 - 언어/기술에 독립적인 별도의 길수
		 - 유닉스
		 
		 
		 3 출현ㅎ굇수
		 - 바로 앞의 문자의 출현 횟수를 표현
		 
		 	3.1 생략
		 	
		 	3.2 ?
		 		- 바로 앞의 대상의 출현 횟수가 생략O, 중복X
		 		- 출현 횟수: 0~1
		 		ex) "a?bc" > ab,abc,abbc,ac,bc,bbc,aaabc
		 		 	- "abc"
		 		 	- "bc"
		 		 
		 	3.3 +
		 		- 바로 앞의 대상이 생략x, 중복o
		 		- 출현 횟수 : 1~무한대
		 			ex) "a+bc" > ab,abc,abbc,ac,bc,bbc,aaabc,aaaaaaaaaaaaaaaaaaaaaaabc
		 			ex) (자바)+코드>자바코드 자코드 바코드 자바코드 코드 자바자바코드 자바자바자바코드
		 	
		 	3.4 *
		 		- 바로 앞의 대상이 생략o, 중복o
		 		- 출현 횟수: 0~ 무 한 대!
			 		ex) "a*bc" > ab,abc,abbc,ac,bc,bbc,aaabc
			 		ex) (자바)*코드>자바코드 자코드 바코드 자바코드 코드 자바자바코드 자바자바자바코드
		 4. 선택, choice
		 	4.1 [열거값]
		 		- 열거된 값들중 하나를 선택해서 검색 
		 		ex) "[129]" > 안녕하세요. 제 나이는 21살입니다. 제 동생은 19살입니다.
		 		ex) "[1234567890]" > 안녕하세요. 제 나이는 21살입니다. 제 동생은 19살입니다.
		 		ex) "[김이박]길동" > 홍길동,김길동,이길동,박길동,최길동
		 		ex) "[123]45" > 12345,145,245,45	//123중 하나를 반드시 선택
		 		ex) "[123]?45" > 12345,145,245,45	//123을 선택 안해도 돼~
		 		ex) "[123]+45" > 12345,145,245,45	//연속적인 선택
	
				ex) 페이지의 모든 숫자(한자리 이상~) > "[0123456789]+" // 모~든 숫자를 찾음 
				
				ex) 페이지의 2자리 숫자 > "[0123456789][0123456789]"
				ex) 페이지의 2자리 숫자 > " [0123456789][0123456789] "
				ex) 주민등록번호 검색 > "[0123456789][0123456789][0123456789][0123456789][0123456789][0123456789]-[0123456789][0123456789][0123456789][0123456789][0123456789][0123456789][0123456789]"
				ex) 숫자 > "[0-9]"
				ex) 소문자 > "[a-z]"
				ex) 대문자 > "[A-Z]"
				ex) 영문자 > "[a-zA-Z]"
				ex) 홍씨성을 가진 이름 > "홍+[가-힣][가-힣]"
				ex) 전화번호가 포함되어 있는지 검사 > [0-9]{3}-[0-9]{3,4}-[0-9]{4}
												숫자 3자리 숫자 3~4자리 숫자 4자리


		 	4.2 [^열거값]
		 
			*/
		
		
		
//		m1();
//		m2();
//		m3();
		m4();
		
	}

	private static void m4() {
		//1. 검색 > 치환
		//2. 검색 > 추출
		//3. 유효성 검사
		
		//회원 가입 > 유효성 검사
		//1. 이름 > 필수입력, 한글, 2~5자 이내
		//2. 나이 > 필수입력, 숫자, 18세 이상
		//3. 아이디 > 필수입력, 영어+숫자+_, 숫자로 시작 불가능, 4~12자 이내
		
		System.out.println("[회원 가입]");
		Scanner scan = new Scanner(System.in);
		System.out.print("이름: ");
		String name = scan.nextLine();
		
		System.out.print("나이: ");
		String age = scan.nextLine();
		
		System.out.print("아이디: ");
		String id = scan.nextLine();
		
		if (isValid(name, age, id)) {
			System.out.println("가입 완료");
		} else {
			System.out.println("가입 실패");
		}

		
		
	
	}

	private static boolean isValid(String name, String age, String id) {
		
		String regex = ""; // 정규식
		Pattern pattern = null;	//정규식 객체
		Matcher matcher = null; //결과 객체
		
		//1. 이름 > 필수입력, 한글, 2~5자 이내
		regex = "^[가-힣]{2,5}$";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(name); //입력값을 대상으로 정규식 검사
		
		if(!matcher.find()) {
			//한글로 된 2~5자를 찾지 못했습니다!
			System.out.println("이름을 필수입력, 한글, 2~자 이내로 입력하세요.");
			return false;
		}

		return true;
	}

	private static void m3() {
		String regex = "[0-9]{3}-[0-9]{3,4}-[0-9]{4}";
		Pattern p1 = Pattern.compile(regex);
		
		String txt = "Hi, My name is Hong. my Phone number is 010-3123-1231 if you can't contact me, please call 010-1234-1234";
		Matcher m1 =p1.matcher(txt);
//		
//		System.out.println(m1.find());
//		System.out.println(m1.find());
//		System.out.println(m1.find());
		
		int count = 0;
		while(m1.find()) {
			System.out.println("[전화번호 발견]");
			System.out.println("[전화번호: "+m1.group()+"]");
			count++;
		}
		System.out.printf("txt내에서 전화번호를 %d회 발견",count);
		
		
		
	}
	
	
	private static void m2() {
		
			String regex = "(홍|김|최|남궁)(길동)";
			Pattern p1 = Pattern.compile(regex);
			
			String txt = "홍길동, 최길동,길길동,남궁길동, 길길길동,ㅋ 넌 뭔데 ";
			Matcher m1 =p1.matcher(txt);
			
			int count = 0;
			while(m1.find()) {
				count++;
				System.out.println(count);
				System.out.println("[이름 발견]");
				System.out.println("[풀 네임: "+m1.group()+"]");
				System.out.println("[성: "+m1.group(1)+"]");
				System.out.println("[이름: "+m1.group(2)+"]");
				System.out.println();
			}
			System.out.printf("txt내에서 이름을 %d회 발견",count);
			
			
			
		
	}



	private static void m1() {
		String txt = "홍길동,아무개,하하하,호호호,후후후";
		
		//1.split()
		String[] list = txt.split(",");
		
		for(String name : list) {
			System.out.println(name);
		}
	
		txt = "홍길동,아무개,하하하,호호호,후후후";
		System.out.println();
		list = txt.split("무개");
		
		for(String name : list) {
			System.out.println(name);
		}
	
		
	}
}
