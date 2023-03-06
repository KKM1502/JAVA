package com.test.project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex91 {
	
	public static void main(String[] args) {
		
		//프로젝트
		//- 파일 입출력 기반(데이터) + 자바 콘솔(입출력) 프로젝트
		
		
		//컬렉션(배열) vs 파일 입출력
		//- JavaTest > dat > "member.txt"
		
		m1();
//		m2();
		
//		배열 장점 + 파일 입출력 장점을 섞어서 사용해보자
		
		
		
	}

	private static void m2() {
		
		//파일 입출력
		
		//장점
		//영구 보관 가능
		
		//단점
		//영구 보관을 제외한 나머지
		
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(".\\dat\\member.txt"));
			String line = null;
			System.out.println("[전체 목록]");
			while((line = reader.readLine())!=null) {
				System.out.println(line);
			}
			reader.close();

//			//회원 검색
//			Scanner scan = new Scanner(System.in);
//			System.out.print("이름: ");
//			String input = scan.nextLine();
//			
//			
//			line = null;
//			while((line = reader.readLine())!=null) {
//				String[] temp = line.split(",");
//				if(temp[1].equals(input)) {
//					System.out.println(line);
//					break;
//				}
			
			
			

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void m1() {
		
		//배열
		//- Member[] list;
		//- ArrayList<Member> list;
		
		//장점
		//입출력이 빠르다
		
		//단점 
		//영구 보관이 불가능하다.
		
		ArrayList<Member> list = new ArrayList<Member>();
		Member m0 = new Member("1", "홍길동", "20", "남자");
		Member m1 = new Member("2", "아무개", "25", "남자");
		Member m2 = new Member("3", "호호호", "26", "여자");
		Member m3 = new Member("4", "하하하", "24", "남자");
		Member m4 = new Member("5", "테스트", "23", "여자");
	
		
		list.add(m0);
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		
		
		list.stream().distinct().forEach(read->System.out.println(read));
		System.out.println();
		System.out.println("line 수: "+list.size());
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름: ");
		String input = scan.nextLine();
		
		for(Member m : list) {
			if(m.getName().equals(input)) {
				System.out.println(m);
				break;
			}
		}

	}


}


class Member{
	
	private String no;
	private String name;
	private String age;
	private String gender;
	
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Member(String no, String name, String age, String gender) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}


	
	
	@Override
	public String toString() {
		return "Member [no=" + no + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}