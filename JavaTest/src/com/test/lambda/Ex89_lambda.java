package com.test.lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Ex89_lambda {

	public static void main(String[] args) {

		// Ex89_lambda.java

		// ���ٽ�
		// 1. �÷���(�迭) ����
		// 2. ��Ʈ��(Stream)

//		m1();
//		m2();
		m3();

	}// main

	private static void m3() {

	}

	private static void m2() {

		ArrayList<User> list = new ArrayList<User>();
		try {
			BufferedReader reader = new BufferedReader(
					new FileReader("C:\\class\\code\\java\\JavaTest\\dat\\user.txt"));
			String line = null;
			while ((line = reader.readLine()) != null) {
				// 1,ȫ�浿,25,M,����,010-1234-5678
				String[] temp = line.split(",");

				User user = new User(temp[0], temp[1], Integer.parseInt(temp[2]), temp[3], temp[4], temp[5]);
				list.add(user);
			}
			reader.close();

//			for (User user : list) {
//				System.out.println(user.getNo() + " : " +user.getName());
//			}
//			
			// ���̼� ����
			list.sort((u1, u2) -> u1.getAge() - u2.getAge());
			for (User user : list) {
				System.out.println(user.getNo() + " : " + user.getName() + "(" + user.getAge() + ")");
			}

			System.out.println();
			// �̸��� ����
			list.sort((u1, u2) -> u1.getName().compareTo(u2.getName()));
			for (User user : list) {
				System.out.println(user.getNo() + " : " + user.getName() + "(" + user.getAge() + ")");
			}

			System.out.println();
			// ������
			list.sort((u1, u2) -> u1.getGender().compareTo(u2.getGender()));
			for (User user : list) {
				System.out.println(user.getName() + "(" + user.getGender() + ")");
			}
			System.out.println();
			// ������
			list.sort((u1, u2) -> u1.getCity().compareTo(u2.getCity()));
			for (User user : list) {
				System.out.println(user.getName() + "(" + user.getCity() + ")");
			}

			System.out.println();
			// 1 �� - ��������
			// 2 �� - ��������
			list.sort((u1, u2) -> {
				int result = 0;
				if (u1.getAge() > u2.getAge()) {
					return -1;
				} else if (u1.getAge() < u2.getAge()) {
					return 1;
				} else { // if(u1.getAge()==u2.getAge()) {
					if (u1.getGender().compareTo(u2.getGender()) > 0) {
						return -1;
					} else if (u1.getGender().compareTo(u2.getGender()) < 0) {
						return 1;
					} else {
						return 0;
					}

				}

			});
			for (User user : list) {
				System.out.println(user.getAge() + "�� " + user.getName() + "(" + user.getGender() + ")" + "("
						+ user.getCity() + ")");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void m1() {

		/*
		 * 
		 * �ڹ��� ���� ���ͷ� - �ڹٴ� � ��������� �����͸� �ۼ��ϴ�, ����Ҷ��� 10������ ����Ѵ�.
		 * 
		 * 1. 10���� - 0~9 - 1234567890
		 * 
		 * 
		 * 2. 8���� - 0~7 - 12345670 - 0NNNN << 8������ �ν�
		 * 
		 * 3. 16���� - 0~F - 1234567890abcdef - 0xNNNN
		 */

		int jumin = 950228;
		System.out.println("�ֹε�Ϲ�ȣ: " + jumin);

		int jumin2 = 020225; // 8������ �ν��մϴ� ... but..! ����� 10������� ��� !!! �����������!!
		System.out.println("�ֹε�Ϲ�ȣ: " + jumin2);

		int color = 0xF;
		System.out.println(color);

		String jumin3 = "020228";
		System.out.println("�ֹε�Ϲ�ȣ: " + jumin3);
	}

}

//***��� ������ �ϴ� ����		>������
//***��� ������ ���� �ʴ� ����	>���ڿ�

//1,ȫ�浿,25,M,����,010-1234-5678

class User {
	private String no;
	private String name;
	private int age;
	private String gender;
	private String city;
	private String tel;

	User(String no, String name, Integer age, String gender, String city, String tel) {
		this.no = no;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.city = city;
		this.tel = tel;
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}