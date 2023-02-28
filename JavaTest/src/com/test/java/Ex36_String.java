package com.test.java;

public class Ex36_String {
	public static void main(String[] args) {
		
		
		
//		m7();
//		m8();
//		m9();
//		m10();
//		m11();
		m12();
		
		
		
		
	}

	private static void m12() {
		//문자열 분리
		//- split(String delimiter)
		String name = "홍길동,아무개,하하하"; // , > 구분자
		String[] list = name.split(",");
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);

		}
		
	}

	private static void m11() {
		// 문자열 치환
		//- String replace(String old, String new)
		//- 문자열의 일부를 다른 문자열로 교체하는 메소드
		
		String txt = "안녕하세요. 홍길동입니다.";
		System.out.println(txt.replace("홍길동", "아무개"));
		
		
		
		
	}

	private static void m10() {
		
		//문자열 추출
		//- String substing(int beginIndex, int endIndex) begin은 포함 end는 미포함
		//- String substing(int beginIndex)
		
		String txt= "가나다라마바사아자차카타파하";
		System.out.println(txt.substring(3,7));
		System.out.println(txt.substring(5,6));//"바"
		System.out.println(txt.charAt(5));//'바'
		
		
		//파일 경로 > 파일명?
		String path= "C:\\class\\code\\java\\JavaTest\\src\\com\\test\\java\\Ex36_String.java";
		int index = path.lastIndexOf("\\"); //마지막 \\ 
		System.out.println(index);
		
		String filename = path.substring(index + 1);
		System.out.println(filename);//파일명 추출
		
		//확장자 없는 파일명 추출
		index = filename.lastIndexOf(".");
		String filenameWithoutExtension = filename.substring(0,index);
		System.out.println(filenameWithoutExtension);
	}

	private static void m9() {
		
		//패턴검색
		// boolean startsWith(String)
		// boolean endsWith(String)
		
		String txt= "자바 개발자 과정";
		
		System.out.println(txt.startsWith("자바"));
		System.out.println(txt.startsWith("오라클"));
		System.out.println(txt.indexOf("자바")==0);
		
		System.out.println(txt.endsWith("과정"));
		System.out.println(txt.endsWith("교육"));
		System.out.println(txt.indexOf("과정")==txt.length()-2);
		
		//파일 조작
		String file = "Ex36_String.java";
		
		//해당 파일의 확장자가 ".java"인지 확인 ?
		if(file.endsWith(".java")) {
			System.out.println("o");	
		}else {
			System.out.println("x");
		}
		
		
	}

	private static void m8() {
		// 문자열 대소문자 변경
		//- String toUpperCase
		//- String toLowerCase
		
		String content="오늘 수업은 String Method입니다";
		System.out.println(content.toUpperCase());
		System.out.println(content.toLowerCase());
		
	}

	private static void m7() {
		// 금지어!!
		String content = "안녕하세요. 저는 자바를 배우는 학생입니다.";
		String word = "바보"; //금지어
		
		if (content.contains(word)) {
			System.out.println("금지어 발견!");
		}else{
			System.out.println("글쓰기 진행..!");
		}
		if(content.indexOf(word)>-1){
			System.out.println("금지어 발견!");
		}else{
			System.out.println("글쓰기 진행..!");
		}
		
		
		content = "안녕하세요. 저는 자바를 배우는 학생입니다.";
		String[] words = {"바보", "멍청이", "메롱"};
		for (int i = 0; i < words.length; i++) {
			if(content.indexOf(words[i])>-1){
				System.out.println("금지어 발견!");
				break;//**
			}

		}
		System.out.println("완료");
		
		//주민등록번호 > "-"
		String Jumin = "970306-1232141";
		
		if(Jumin.charAt(6)=='-') {
			System.out.println("O");
		}else {
			System.out.println("X");
		}
		if(Jumin.indexOf("-")==6) {
			System.out.println("O");
		}else {
			System.out.println("X");
		}
	
	}
}
