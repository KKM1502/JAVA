package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Ex13_Error {

	public static void main(String[] args) throws IOException {
//		Ex13_Error.java
		
//		1. 컴파일 에러
//			- 컴파일 작업 중 발생하는 에러
//			- 컴파일러 발견!! > 번역하다... >문법이 틀려서!
//			- 난이도 가장 낮음 > 발견이 쉽기 때문 >고치기가 쉽다
//			- 오타!!!
		//	- 가장 공부가 되는 에러이므로 정리하자
/*		2. 런타임 에러
//			- 런타임 > 실행중
 			- 컴파일 작성 중에는 없었는데 실행 중에 발생하는 에러 
 			- 문법에는 오류가 없었는데 다른 원인으로 발생하는 에러
 			- 예외
 			- 난이도 중간 > 발견 중간 > 발견 복불복 >테스트
 												>발견 0 > 수정
 												>발견 x > 잠재 위험 
 
  		3. 논리 에러
  			컴파일 성공!!! 실행 성공~!! 근데 결과가 이상....?
  			난이도 최상!! 
  		
*/		
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("숫자 입력:" );
	String input = reader.readLine();
	
	double num = Double.parseDouble(input);
		
	Double result =(100 / num); // 0으로 나누면 논리 에러 발생~!
		
	System.out.printf("%.2f",result);
		
	}
	
}
