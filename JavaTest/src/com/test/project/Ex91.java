package com.test.project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex91 {
	
	public static void main(String[] args) {
		
		//������Ʈ
		//- ���� ����� ���(������) + �ڹ� �ܼ�(�����) ������Ʈ
		
		
		//�÷���(�迭) vs ���� �����
		//- JavaTest > dat > "member.txt"
		
		m1();
//		m2();
		
//		�迭 ���� + ���� ����� ������ ��� ����غ���
		
		
		
	}

	private static void m2() {
		
		//���� �����
		
		//����
		//���� ���� ����
		
		//����
		//���� ������ ������ ������
		
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(".\\dat\\member.txt"));
			String line = null;
			System.out.println("[��ü ���]");
			while((line = reader.readLine())!=null) {
				System.out.println(line);
			}
			reader.close();

//			//ȸ�� �˻�
//			Scanner scan = new Scanner(System.in);
//			System.out.print("�̸�: ");
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
		
		//�迭
		//- Member[] list;
		//- ArrayList<Member> list;
		
		//����
		//������� ������
		
		//���� 
		//���� ������ �Ұ����ϴ�.
		
		ArrayList<Member> list = new ArrayList<Member>();
		Member m0 = new Member("1", "ȫ�浿", "20", "����");
		Member m1 = new Member("2", "�ƹ���", "25", "����");
		Member m2 = new Member("3", "ȣȣȣ", "26", "����");
		Member m3 = new Member("4", "������", "24", "����");
		Member m4 = new Member("5", "�׽�Ʈ", "23", "����");
	
		
		list.add(m0);
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		
		
		list.stream().distinct().forEach(read->System.out.println(read));
		System.out.println();
		System.out.println("line ��: "+list.size());
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸�: ");
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