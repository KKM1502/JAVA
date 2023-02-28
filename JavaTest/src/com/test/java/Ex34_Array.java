package com.test.java;

import java.util.Arrays;
import java.util.Calendar;


public class Ex34_Array {

	public static void main(String[] args) {
//		
		
		//초기화 규칙
//		1. 정수배열 > 0
//		2. 실수배열 > 0.0
//		3. 문자배열 > \0
//		4. 논리배열 > false
//		5. 참조형배열 >null
//		
//		
//		
//		
		
		//m1();
//		m2();
//		m3();
//		m4();
//		m5();
//		m11();
//		m12();
//		m13();
//		m14();
//		m15();
		
//		m16();
//		m17();
//		m18();
		m19();
//		m20();
//		m21();
		
		
		
	}
	
	
	
	private static void m21() {
		// left shitf
		String[] list = {"A","B", "C", "D", "E"};
		int index = 1;
		for (int i = index; i < list.length-1; i++) {
			list[i]= list[i+1];

		}
		list[list.length-1]=null;
		System.out.println(Arrays.toString(list));
		
	}



	private static void m20() {
		//- 삽입(*****)
		//- 배열의 원하는 위치에 요소를 삽입
		//- Right Shift
		
		String[] list= {"A","B", "C", "D", "E"};
		int index =1;
		String value="F";
		//for (int i = index; i < list.length-1; i++) {
			for (int i = list.length-2; i >= index; i--) {
				list[i+1] = list[i];
			}
			
		
		System.out.println(Arrays.toString(list));
		list[index]= value;
		
		
	}



	//처음부터 끝까지
	public static String[] subArray(String[] colors, int beginIndex) {

		
		String[] temp = new String[colors.length - beginIndex];
		for (int i = beginIndex; i < colors.length; i++) {

			//추출하고 싶은 영역의 인덱스
			temp[i-beginIndex]= colors[i];
		}
		return temp;
	}
	
	public static String[] subArray(String[] colors, int beginIndex, int endIndex) {

		
		String[] temp = new String[endIndex - beginIndex];
		for (int i = beginIndex; i < endIndex; i++) {

			//추출하고 싶은 영역의 인덱스
			temp[i-beginIndex]= colors[i];
		}
		return temp;
	}
	
		
		
	public static String colorAt(String[] colors ,int i) {
		return colors[i];
	}
	
	private static void m19() {
		//- 추출
		//- 색상 colorAt(배열,	방번호)
		//- qodufsubArray > 부분 집합 가져오기
		String[] colors= {"red","yellow", "blue", "white"};
		
		colorAt(colors,5);
//		System.out.println(colors5]);
	}

	private static void m18() {
		// TODO Auto-generated method stub
		
	}

	public static String[] deepCopy(String[] colors) {
		String[] temp = new String[colors.length];
		for (int i = 0; i < colors.length; i++) {
			temp[i] =colors[i];

		}
		return temp;
	}
	
	private static void m17() {
		//- 검색
		//- int indexof(배열,검색대상)
		//- 검색대상이 배열의 몇번째 방에서 발견됐는지 방번호 반환
		
		
	}

	private static void m16() {
		// 배열을 대상으로 자주하는 행동들 .. > 메소드 구현
		//- 검색 
		//- boolean contains(배열, 검색대상)
		
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
			if(contains(nums,15)) {
				System.out.println("발견함");
			}
			else {
				System.out.println("발견못");
			}
		
	}
	
	public static int indexOf(String[] colors,String color) {
		for (int i = 0; i < colors.length; i++) {

			if(colors[i].equals(color)) {
				return i;
			}
		}return 0;
	}
	
	
	public static boolean contains(String[] colors, String color) {
		
		for (int i = 0; i <colors.length; i++) {
			if(colors[i].equals(color)) {
				//메소드 종료 + true 반환
				
				return true;
			}
		}
		
		return false;
		
	}
	public static boolean contains(int[] nums, int num) {
	
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==num) {
				//메소드 종료 + true 반환
				
				return true;
			}
		}
		
		return false;
				
	}

	private static void m15() {

		//자바의 정렬 기능 사용
		//오름차수(sort)
		int[] nums= {5,3,1,4,2};
		Arrays.sort(nums); //정렬 > Quick 정렬 알고리즘
		System.out.println(Arrays.toString(nums));
		
		
		Calendar[] list = new Calendar[5];
		list[0] = Calendar.getInstance();
		list[0].add(Calendar.DATE, -2);

		list[1] = Calendar.getInstance();
		list[1].add(Calendar.DATE, 1);
		
		list[2] = Calendar.getInstance();
		list[2].add(Calendar.DATE, -7);
		
		
		list[3] = Calendar.getInstance();
		list[3].add(Calendar.DATE, 3);
		
		list[4] = Calendar.getInstance();
		
		Arrays.sort(list);
		for (int i = 0; i < list.length; i++) {
			System.out.printf("%tF\n",list[i]);
		}
		
		
		
	}

	private static void m14() {
		Calendar c1 = Calendar.getInstance();
		c1.add(Calendar.DATE, -1);//어제
		
		Calendar c2 = Calendar.getInstance();
		
	
		System.out.println(c1.getTimeInMillis()>c2.getTimeInMillis());
	
		//날짜 비교
		System.out.println(c1.compareTo(c2));
		System.out.println(c2.compareTo(c1));
		System.out.println(c1.compareTo(c1));
		
		Calendar[] list = new Calendar[5];
		list[0] = Calendar.getInstance();
		list[0].add(Calendar.DATE, -2);

		list[1] = Calendar.getInstance();
		list[1].add(Calendar.DATE, 1);
		
		list[2] = Calendar.getInstance();
		list[2].add(Calendar.DATE, -7);
		
		
		list[3] = Calendar.getInstance();
		list[3].add(Calendar.DATE, 3);
		
		list[4] = Calendar.getInstance();
		
		//오름차순 정렬
		for (int i = 0; i < list.length-1; i++) {
			for (int j = 0; j < list.length-1-i; j++) {
				if(list[j].compareTo(list[j+1])>0) {
					Calendar temp = list[j];
					list[j]= list[j+1];
					list[j+1]= temp;
				}
			}
		}
		
		
		
		
		for (int i = 0; i < list.length; i++) {
			System.out.printf("%tF\n",list[i]);
		}
		
		
	}

	private static void m13() {
		//char
		char[] array = {'c','d','a','b','e'};
		System.out.println(array.length);
		System.out.println(Arrays.toString(array));
		System.out.println();
		String s1 = "홍길동";
		String s2 = "아무개";
		System.out.println(compare(s1,s2));
		System.out.println(Arrays.toString(array));
		
		
		String[] names= {"홍길동",
						"유재석",
						"김경민",
						"정형돈",
						"노헝철",
						};


		for (int i = 0; i < names.length-1; i++) {
			for (int j = 0; j < names.length-1-i; j++) {

				if(compare(names[j],names[j+1])>0) {
					String temp = names[j];
					names[j]=  names[j+1];
					names[j+1] = temp;
				}
			}

		}
		System.out.println(Arrays.toString(names));


}

	
	
	
	//두 문자열의 문자코드값을 비교하는 로직
	//-	1 	: 앞
	//-	-1	: 뒤
	//-	0	: 동일
	public static int compare(String s1, String s2) {
		
		
		int length = s1.length()>s2.length()?s2.length():s1.length()	;
		
		for (int i = 0; i<length; i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			
			if(c1 > c2 ) {
				return 1;
			} else if (c1< c2) {
				return -1;
			}

		}
		
		if(s1.length()>s2.length()) {
			return 1;
		} else if(s1.length()<s2.length()) {
			return -1;
		}
		return 0;
	}

	private static void m12() {
		// 데이터 집합 or 배열 > 정렬
		//- 크기 비교 후 > 재배치
		
		
		//1. 오름차순
		// a. 숫자: 작은수 > 큰수
		// b. 문자(열): 문자코드값 순서
		// c. s날짜시간: 과거 > 미래
		// 
		
		//2. 내림차순
		// a. 숫자: 큰수 > 작은수
		// b. 문자(열): 문자코드값 역순
		// c. s날짜시간: 미래 > 과거
		
		//정렬 > 기술 면접(코딩테스트) 질문
		//1. 직접 구현
		//2. JDK 기능 사용
	int[] array = {5,3,1,4,2};
	System.out.println(array.length);
	System.out.println(Arrays.toString(array));
	System.out.println();
	for (int i = 0; i < array.length-1; i++) {//0,1,2,3 >n cycle
		//i(0) j(0,1,2,3)
		for (int j = 0; j <array.length-1-i; j++) {// array.length-1-i 최대 수를 알아보는 것에 필요한 칸 수 
			if(array[j]>array[j+1]) {
				int temp= array[j+1];
				array[j+1]= array[j];
				array[j] = temp;
			}
		}
		
	}
	System.out.println(Arrays.toString(array));
	
	//내림차순
	for (int i = 0; i < array.length-1; i++) {//0,1,2,3 >n cycle
		//i(0) j(0,1,2,3)
		for (int j = 0; j <array.length-1-i; j++) {// array.length-1-i 최대 수를 알아보는 것에 필요한 칸 수 
			if(array[j]<array[j+1]) {
				int temp= array[j+1];
				array[j+1]= array[j];
				array[j] = temp;
			}
		}
		
	}
	System.out.println(Arrays.toString(array));
	
		
		
		
	}

	private static void m11() {
		//배열 자동 초기화 > 초기화 리스트
		int[] nums1 = new int[5];
		System.out.println(Arrays.toString(nums1));
		
		//직접 초기화 > 수정하기
		nums1[0]=96;
		nums1[1]=79;
		nums1[2]=99;
		nums1[3]=85;
		nums1[4]=65;
		System.out.println(Arrays.toString(nums1));
		
		//초기화 리스트
		int[] nums2 = new int[] {96,79,99,85,65};
		System.out.println(Arrays.toString(nums2));
		
		int[] nums3 = {96, 79, 99, 85, 65};//많이 사용
		
		String[] name1 = new String[3];
		name1[0] = "홍길동" ; 
		name1[1] = "홍길똥" ; 
		name1[2] = "홍길둥" ; 
		
		String[] name2 = {"홍길동", "홍길똥", "홍길둥"};
		System.out.println(Arrays.toString(name2));
		
	}

	private static void m5() {
		// 성적표
		//- 10명
		//- 국어, 영어, 수학 > 난수
		
		//데이터 저장 > 배열
		int size = 10;
		String[] name = new String[size];
		int[] kors = new int[size];
		int[] engs = new int[size];
		int[] math = new int[size];
		
		System.out.println("===============================================");
		System.out.println("                     성적표");
		System.out.println("===============================================");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");
		System.out.println("홍길동\t100\t50\t80\t270\t90.0");
		
	}

	private static void m4() {
		byte[] nums= new byte[10];
		double[] nums1= new double[10];
		char[] nums2= new char[10];
		
	}

	private static void m3() {
		//- int[] > int 배열
		//- nums > 변수 > 배열
		//- 방번호 > 첨자(index)
		//- 방1개 (데이터) = 요소(element)
		int[] nums = new int[10];
		
		//배열 사용 시 주의점!!!
		//첨자의 범위 = 0~length-1
		for (int i = 0; i < nums.length; i++) {
//			nums[i]=i;
			nums[i]=(int)(Math.random()*10)+1;
			
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("nums[%d] = %d\n",i,nums[i]);
		}
		
		
	}

	private static void m2() {
		// 요구사항] 학생 3명 > 국어 점수 > 총점, 평균 
		// 추가사항] 학생 수 300명 증가 
		
		//배열 선언하기(생성하기)
		// - 자료형[] 배열명 = new 자료형[길이];
		int[] kors = new int[300];
		//변수 > 필드(field) >>> 프로퍼티(property), 속성(attribute)
		System.out.println(kors.length);
		
		//배열의 방에 접근하기(데이터 입출력)
		kors[0]=100;
		kors[1]=90;
		kors[2]=80;
		
//		
//		int total = kors[0] +kors[1]+kors[2];
//		double avg = total /3.0;
//		System.out.printf("총점: %d점\n",total);
//		System.out.printf("평균: %.1f점\n",avg);
		
		for (int i = 0; i < 3; i++) {
//			kors[i];
		}
		
	}

	private static void m1() {
		
		// 요구사항] 학생 3명 > 국어 점수 > 총점, 평균 
		// 추가사항] 학생 수 300명 증가 
		int kor1= 100;
		int kor2=90;
		int kor3=80;
		
		int total = kor1 + kor2 + kor3;
		double avg = total /3.0;
		System.out.printf("총점: %d점\n",total);
		System.out.printf("평균: %.1f점\n",avg);
		
		
		
	}



}
