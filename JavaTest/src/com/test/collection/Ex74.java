package com.test.collection;

import java.util.ArrayList;

public class Ex74 {
	public static void main(String[] args) {
		
//		Teacher t1 = new Teacher("ȫ�浿","hong","1111","����");
//		t1.login();
//		t1.test();
//		t1.logout();
//		System.out.println();
//		
//		Student s1= new Student("�ƹ���","test","1111");
//		s1.login();
//		s1.setKor(100);
//		s1.setEng(50);
//		s1.setMath(40);
//		
//		s1.score();
//		s1.logout();
//		System.out.println();
		String[] name1 = { "��", "��", "��", "��", "��", "��", "��", "��", "��", "��" };      
	    String[] name2 = { "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "ȿ", "��", "��", "��", "ä", "��", "��", "��" };
	    String[] subject = {"����", "����","����"};
	    
	    String temp = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		
	    
	    
	    
	    //1. ���� ���� vs ����
	    //2. ����
	    
	    //������ �迭 > ���� > ���� �迭
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
	    
	    
	    
	    //�л� �迭 > ������� > �÷���
	    ArrayList<Student> slist = new ArrayList<Student>();
	    
	    
	    
	}
}


//�¶��� ����] ȸ��
//1. ������
//2. �л�

//�θ� ����
//1. Ŭ����
//2. �߻� Ŭ����
//3. �������̽�
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
	 
	
	//�����ڵ��� Ȯ�ο뵵 (������) toString ctrl shift s , tostring
	@Override
	public String toString() {
		return "Teacher [name=" + getName() + ", id=" + getId() + ", pw=" + pw + ", subject=" + subject + "]";
	}



	@Override
	public void info() {
		System.out.printf("%s(%s) �������� �α����߽��ϴ�.\n",  getName(), getId());
	}@Override
	public void login() {
		System.out.printf("%s(%s) �������� �α׾ƿ��߽��ϴ�.\n",  getName(), getId());
	}@Override
	public void logout() {
		
		System.out.println("[��������]");
		System.out.println("�̸�: " +  getName());
		System.out.println("���̵�: " +  getId());
		System.out.println("������: " + this.subject);
	}
	
	public void test() {
		System.out.println("������ ���� �մϴ�.");
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
		System.out.println("[�л�����]");
		System.out.println("�̸�: " + getName());
		System.out.println("���̵�: " + getId());
		
	}@Override
	public void login() {
		System.out.printf("%s(%s) �л��� �α����߽��ϴ�.\n", getName(),getId());
		
	}@Override
	public void logout() {

		System.out.printf("%s(%s) �л��� �α׾ƿ��߽��ϴ�.\n", getName(),getId());
		
	}
	public void score() {
		System.out.printf("[%s ����]\n", getName());;
		System.out.println("����: "+this.kor);
		System.out.println("����: "+this.eng);
		System.out.println("����: "+this.math);
	}
	
}
