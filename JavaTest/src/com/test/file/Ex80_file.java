package com.test.file;

import java.io.File;

public class Ex80_file {
	
	private static int fileCount;
	private static int dirCount;
	private static int length;
	
	static {
		fileCount = 0;
		dirCount = 0;
		length = 0;
	}
	
	/*
	 
	 1. 파일/디렉토리 조작
	 	-윈도우 탐색기로 하는 행동
	 	- 파일의 조작
	 	- 폴더의 조작
	 	
	 2. 파일 입출력
	 	- 메모장으로 하는 행동
	 	- 텍스트 입출력
	 	- 메모장, 이클립스 등 텍스트 편집기 
	 
	 
	 */
	
	public static void main(String[] args) {
		
		//파일 > 정보
//		C:\class\code\java\JavaTest\src\com\test\file\test.txt
		
//		m13();
//		m14();
		
//		m16();
//		m17();
		m18();
		m19();
		//재귀 메소드 == 트리 구조 탐색(조작)
		
		
		
		
	}

	private static void m19() {
		//폴더 삭제
		String path = "C:\\Users\\Administrator\\Downloads\\파일_디렉토리_문제\\폴더 삭제\\delete";
		File dir = new File(path);
		if(dir.exists()) {
//			System.out.println(dir.delete());
			delete(dir);
			
		}
	}

	private static void delete(File dir) {
		File[] list =dir.listFiles();
		
		for(File file: list) {
			if (file.isFile()) {
				file.delete();
			}
		}
		
		//재귀
		for(File subdir: list) {
			if (subdir.isDirectory()) {
				delete(subdir);
			}
		}
		
		//호출된 폴더 >> 파일 모두 삭제, 자식 폴더 없음 == 빈폴더
		dir.delete();
		
	}

	private static void m18() {
		String path = "C:\\class\\dev\\eclipse";
		File dir = new File(path);

		if(dir.exists()) {
			count(dir);
		}
		System.out.println(fileCount+"개");
		System.out.println(dirCount+"개");
		System.out.println("파일 크기: "+length+"B");
		System.out.println("파일 크기: "+length/1024/1024+"MB");
	}

	private static void count(File dir) {
		//C:\class\dev\eclipse > 탐색
		
			//1. 목록
			File[] list = dir.listFiles()	;
			
			//2. 자식 폴더 탐색, 파일 개수
			for(File file : list) {
				if (file.isFile()) {
					fileCount++;
					length += file.length();
				
				}
			}
			// 자식 폴더 탑색 행동을 반복
			for (File subdir : list) {
				if(subdir.isDirectory()) {
					dirCount++;
					count(subdir);
				}	
			}

	}
	
	

	private static void m17() {
		
		//C:\class\dev\eclipse > 탐색
		String path = "C:\\class\\dev\\eclipse";
		File dir = new File(path);
		
		int count = 0 ; //누적변수
		if(dir.exists()) {
			
			File[] list = dir.listFiles();
			for (File file : list) {
				if(file.isFile()) {
					count++;
				}
			}
			//자식 폴더의 파일들도 개수를 세자 
			for(File subdir : list) {
				if(subdir.isDirectory()) {
					File[] sublist = subdir.listFiles();
					for (File subfile : sublist) {
						if(subfile.isFile()) {
							count++;
						}
					}
				}
			}
			System.out.println("총 파일의 개수: "+count+"개");
		}
	}

	private static void m16() {
		
		//팩토리얼!
		int n =4;
		int result = m17(n);
		System.out.println(result);
		
		result = factorial(n);
		System.out.printf("%d! = %d\n",n,result);
	}

	private static int factorial(int n) {
		
		
		return (n==1)?1:n*factorial(n-1);
	}

	private static int m17(int n) {
		System.out.println(n);
		int result = (n==1)? 1 : m17(n-1);
		return result;
	}

//	private static void m14() {
//		m15();
//	}

//	private static void m15() {
//		
//		if) {
//		m15();//재귀호출
//		}
//		else {
//			
//		}
//	}

	private static void m13() {
//		메소드 사용+ 파일 디렉토리 조작
		// 선언 + 호출
		
		test();
		
		
	}

	private static void test() {
		System.out.println("메소드 호출");
		test();//자기가 자기를 호출 > 에러발생x > 재귀 호출 (Recursive Call)
	}
	
}
