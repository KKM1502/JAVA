package com.test.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class Ex81_File {

	public static void main(String[] args) {
		/*
		 	1. 파일/디렉토리 조작
		 	2. 파일 입출력
		 		a. 텍스트 입출력(수업)
		 			-메모장
		 			-응용 프로그램 < - > (데이터) < - > 보조기억장치
		 		b. 비텍스트 입출력
		 			-그림판
		 			-동영상 플레이어
		 			-음악 플레이어
		 	
		 	저장 장치
		 	-데이터 1,0으로 저장
		 	-데이터 자료형 존재(x) > 모든 걸 문자열로 저장 > 문자 코드로 저장

		 			
		 	인코딩, Encoding
		 	-문자 코드(응용 프로그램 데이터)를 부호화(1,0) 시키는 작업
		 	-자바 프로그램("홍길동") > 텍스트파일(100100100010)
		 	
		 	디코딩, Decoding
		 	-부호 데이터를 문자 코드로 변환하는 작업(복호화)
		 	- 텍스트파일(100100100010) > 자바 프로그램("홍길동")
		 	
		 	인코등/디코딩 규칙
		 	1.ANSI
		 	4.ISO-8859-1
		 	5.EUC-KR
		 	6.MS949
		 	--------------
		 	2.UTF-8
		 	--------------
		 	3.UTF-16
		 	
		 	ANSI
		 	- 영어(서유럽 문자, 숫자, 특수문자, 제어문자 등): 1byte
		 	- 한글(일본어, 한자 등): 2byte
		 	
		 	UTF-8
		 	- 영어: 1byte
		 	- 한글: 3byte
		 	
		 	UTF-16
		 	- 영어: 2byte
		 	- 한글: 2byte
		 	
		 */
//		m1();
//		m2();
//		m5();
//		m6();
//		m7();
		m10()	;
		
	}
	private static void m10() {
	      
	      //더미 데이터 만들기
	      String[] names = { "김", "이", "박", "최", "정", "현", "민", "유", "재", "신" };
	      
	      try {
	         
	         //. : 현재 프로그램이 있는 폴더
	         //자바 콘솔 프로그램 > 현재 위치 > 프로젝트 폴더
	         BufferedWriter writer 
	            = new BufferedWriter(new FileWriter(".\\dat\\score.txt"));
	         
	         for (int i=0; i<30; i++) {
	            
	            String name = "";
	            
	            name = names[(int)(Math.random() * names.length)]
	                  + names[(int)(Math.random() * names.length)]
	                  + names[(int)(Math.random() * names.length)];
	            
	            int kor = (int)(Math.random() * 61) + 40;
	            int eng = (int)(Math.random() * 61) + 40;
	            int math = (int)(Math.random() * 61) + 40;
	            
	            writer.write(String.format("%s,%d,%d,%d\r\n"
	                                 , name, kor, eng, math));
	            
	         }
	         
	         writer.close();
	         
	         System.out.println("더미 데이터 생성 완료!!!");
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      
	   }
	private static void m7() {
		//FileOutputStream 	> FileWriter > BufferedWriter (범용)
		//FileInputStream 	> FileReader > BufferedReader (범용)
		
		//파일쓰기
		
		
	
	}
	private static void m6() {
		try {
			//파일 읽기 > 파일 경로 입력
			Scanner scan = new Scanner(System.in);
			System.out.print("파일 경로: ");
			String input = scan.nextLine();

			FileReader reader = new FileReader(input);
			
			int code = -1;
			while((code=reader.read()) != -1) {
				System.out.print((char)code);
			}
			reader.close();
			scan.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	private static void m5() {
		
		try {
			FileReader reader = new FileReader("C:\\class\\code\\java\\JavaTest\\src\\com\\test\\file\\file\\data.txt");
			int code = -1;
			
			while((code = reader.read()) != -1  ) {//끝까지 읽었는데 문자가 없으면 -1 반환 
				System.out.print((char)code);
			}
					
			reader.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void m2() {
		
		//파일 읽기
		//- 읽기 스트림 객체 
		
	}
	private static void m1() {
		//파일 쓰기
		//- 쓰기 스트림 객체
		
		//파일 쓰기 모드
		
		//1. 덮어쓰기 모드(기본)
		
		//2. 이어쓰기 모드
		//	-기존 내용 + 코딩
		//	-파일 있으면	>	파일을 그대로 사용
		//	-파일 없으면	> 	파일을 새로 생성
		
		try {
		
			//데이터를 저장할 파일을 참조
			File file = new File("C:\\class\\code\\java\\JavaTest\\src\\com\\test\\file\\file\\data.txt");
			
			//저장할 파일의 스트림 객체 생성
			//- 빨대 꽂기
			//- 스트림 열기 (꼭 닫아줘)
			FileOutputStream stream = new FileOutputStream(file,true); // 이어쓰기 false=덮어쓰기
			
			//쓰기 > 문자코드값'A'
//			stream.write(68);
//			stream.write(69);
//			stream.write(70);
			
//			stream.write('J');
//			stream.write('a');
//			stream.write('v');
//			stream.write('a');
//			
			//byte[] list = { 'A', 'B', 'C' };
			//stream.write(list)
		
			String txt = "Java Programming";
			
			stream.write(txt.getBytes());
			
			
			//-스트림 닫기(데이터저장)
			stream.close();
			
		}	catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
