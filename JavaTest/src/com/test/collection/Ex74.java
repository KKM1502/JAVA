package com.test.collection;

import java.util.ArrayList;

public class Ex74 {
	public static void main(String[] args) {
		
//		Teacher t1 = new Teacher("홍길동","hong","1111","국어");
//		t1.login();
//		t1.test();
//		t1.logout();
//		System.out.println();
//		
//		Student s1= new Student("아무개","test","1111");
//		s1.login();
//		s1.setKor(100);
//		s1.setEng(50);
//		s1.setMath(40);
//		
//		s1.score();
//		s1.logout();
//		System.out.println();
		String[] name1 = { "김", "이", "박", "최", "정", "연", "조", "정", "유", "양" };      
	    String[] name2 = { "수", "경", "동", "재", "진", "아", "지", "태", "재", "우", "소", "기", "연", "효", "정", "우", "현", "채", "수", "원", "민" };
	    String[] subject = {"국어", "영어","수학"};
	    
	    String temp = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		
	    
	    
	    
	    //1. 길이 고정 vs 가변
	    //2. 사용법
	    
	    //선생님 배열 > 고정 > 순수 배열
	    Teacher[] tlist = new Teacher[3];
	    for (int i = 0; i < tlist.length; i++) {
	    	String name = "";
	    	String id= "";
	    	String pw = "1111";
	    	
	    	name = name1[(int)(Math.random()*name1.length)]
	    			+name2[(int)(Math.random()*name2.length)]
	    			+name1[(int)(Math.random()*name1.length)];
	    	int max = (int)(Math.random()*6)+5;
	    	for (int j = 0; j < max; j++) {
	    		id+=temp.charAt((int)(Math.random()*temp.length()));
			}
	    	tlist[i]= new Teacher(name, id, pw, pw);
		}
	    
	    
	    
	    //학생 배열 > 들락날락 > 컬렉션
	    ArrayList<Student> slist = new ArrayList<Student>();
	    
	    
	    
	}
}


//온라인 교육] 회원
//1. 선생님
//2. 학생

//부모 역할
//1. 클래스
//2. 추상 클래스
//3. 인터페이스
interface User{
	void login();
	void logout();
	void info();
	 
}

abstract class AbstractUser{
	private String name;
	private String id;
	private String pw;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
}

class Teacher extends AbstractUser implements User{
	
	private String name;
	private String id;
	private String pw;
	private String subject;
	
	
	
	public Teacher(String name, String id, String pw, String subject) {
//		this.name = name;
//		this.id = id;
//		this.pw = pw;
		setName(name);
		setId(id);
		setPw(pw);
		this.subject = subject;
	}
	 
	
	//개발자들의 확인용도 (디버깅용) toString ctrl shift s , tostring
	@Override
	public String toString() {
		return "Teacher [name=" + getName() + ", id=" + getId() + ", pw=" + pw + ", subject=" + subject + "]";
	}



	@Override
	public void info() {
		System.out.printf("%s(%s) 선생님이 로그인했습니다.\n",  getName(), getId());
	}@Override
	public void login() {
		System.out.printf("%s(%s) 선생님이 로그아웃했습니다.\n",  getName(), getId());
	}@Override
	public void logout() {
		
		System.out.println("[교사정보]");
		System.out.println("이름: " +  getName());
		System.out.println("아이디: " +  getId());
		System.out.println("담당과목: " + this.subject);
	}
	
	public void test() {
		System.out.println("시험을 출제 합니다.");
	}
}

class Student extends AbstractUser implements User{
	
	private String name;
	private String id;
	private String pw;
	
	public Student(String name, String id, String pw) {
		super();
//		this.name = name;
//		this.id = id;
//		this.pw = pw;
		setName(name);
		setId(id);
		setPw(pw);
		
	}
	
	private int kor;
	private int eng;
	private int math;
	
	
	

	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
	
	public String toString() {
		return "Student [name=" + getName() + ", id=" + getId() + ", pw=" + getPw() + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]";
	}
	
	@Override
	public void info() {
		System.out.println("[학생정보]");
		System.out.println("이름: " + getName());
		System.out.println("아이디: " + getId());
		
	}@Override
	public void login() {
		System.out.printf("%s(%s) 학생이 로그인했습니다.\n", getName(),getId());
		
	}@Override
	public void logout() {

		System.out.printf("%s(%s) 학생이 로그아웃했습니다.\n", getName(),getId());
		
	}
	public void score() {
		System.out.printf("[%s 성적]\n", getName());;
		System.out.println("국어: "+this.kor);
		System.out.println("영어: "+this.eng);
		System.out.println("수학: "+this.math);
	}
	
}
