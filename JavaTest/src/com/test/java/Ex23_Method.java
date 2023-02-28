package com.test.java;



public class Ex23_Method {
	public static void main(String[ ] args) {
		
//		접근지정자 정적키워드 반환자료형 메소드 (인자리스트){
		
//		현부
		
//	}
//	
//	메소드 인자리스트
//	-인자리스트, 인자(Arguments)
//	-파라미터(Parameters)
//	-매개변수
//	-메소드를 호출할 때 값을 전달해서, 메소드 내에서 사용할 수 있게 해주는 역할
//	-메소드 활용도를 높여준다. > 메소드 가용성 향상!!!
		hello();
		hello2();
		hello3();
		hi("홍길동");
		hi("아무개");
		hi("김경민"); //실인자
		checkAge(25);
		checkAge(14);
		score("김경민",50,60,70);
		System.out.println();
		score("김경민",100, 90, 83);
		
	}// main
	
	//요구사항] 홍길동에게 인사를 하는 메소드 선언 
	public static void hello() {
		System.out.println("홍길동님 안녕하세요");
	}
	
	//추가사항] 아무개에게 인사를 하는 메소드 선언 
	public static void hello2() {
		System.out.println("아무개님 안녕하세요");
	}
	
	//추가사항] 우리 강의실에 있는 모든 사람마다 인사를 하는 메소드를 선언하시오.
	public static void hello3() {
		System.out.println("김경민님 안녕하세요");
	}
	public static void hello4() {
		System.out.println("김대환님 안녕하세요");
	}
	
	public static void hi(String name) {  // 가인자
		
		System.out.printf("%s님 안녕하세요\n",name);
	}
	
	//요구사항] 나이를 전달 > 성인 or 미성년자 판단
	public static void checkAge(int age) {
		
		String result = (age>=19? "성인":"미성년자" );
		System.out.printf("입력한 %d세는 %s입니다.\n",age,result);
	}
	
//	문서 주석, Document Comment
//	-기능이 있는 주석(개발 도구 등에서 사용하는 주석)
//	-팀 작업에 유용
	
	/**
	 * 성적을 출력합니다.
	 * @param kor 국어점수
	 * @param eng 영어점수
	 * @param math 수학점수
	 */
	public static void score(String name, int kor, int eng, int math) {
		
		
		System.out.println();
		System.out.println("==================");
		System.out.printf("%s님의 성적표\n",name);
		System.out.println("==================");
		System.out.printf("국어: \t%7d점\n",kor);
		System.out.printf("영어: \t%7d점\n",eng);
		System.out.printf("수학: \t%7d점\n",math);
		System.out.printf("총점: \t%7d점\n",kor+eng+math);
		System.out.printf("평균: \t%7.1f점\n",(kor+eng+math)/3.0);// == (double)(kor+eng+math)/3
	}
	
}//class
