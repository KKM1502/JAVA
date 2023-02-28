package com.test.java;

import java.util.Scanner;

public class Ex29_if {
	public static void main(String[] args) {
		
		//Ex29_if.java
		
		/*
		 	���α׷�
		 	- ������ ������ ����
		 	- ��ɾ���� �̸� ������ ������ �帧�� ���� ����(�� > �Ʒ�)
		 	
		 	���
		 	- �� �帧�� �����ϴ� ����
		 	- ���� ����, �ݺ� ����, �б� ����
		 	
		 	1. ���ǹ�
		 		- �����ڰ� ������ ������ �� ���α׷� �帧�� ����
		 		a. if
		 		b. switch
		 	
		 	2. �ݺ���
		 		- Ư�� �ڵ带 �����ڰ� ���ϴ� Ƚ����ŭ �ݺ� ����
		 		a. for
		 		b. while
		 		c. do while
		 		d. for		 	
		 	
		 	3. �б⹮
		 		- �����ڰ� �ڵ��� �帧�� ���ϴ� ������ �̵�
		 		a. break
		 		b. continue
		 		c. goto(JDK 1.5 ���)
		 	
		 */
		
		/*
		 	if��
		 	- ������ ���� �� ���α׷� �帧�� ����
		 	- ���ǽ� > boolean ���� ������.
		 	
		 	if(���ǽ�){
		 		���๮;
		 	}
		 	
		 	���ǽ�
		 	-boolean
		 	-�񱳽�, ����
		 	
		 	�ٸ� ����� ���ǽ�
		 	- boolean�� �ƴ� �ڷ�����  ����ϱ⵵ �Ѵ�.
		 	
		 	�ڹٴ� c�迭 ����̴�.
		 	- c���� boolean���� ����. > ���� ���(1,0)
		 	
		 	- ����: 0(false), 1(true), 0�� �ƴ� ��� ����(true)
		 	- �Ǽ�: 0.0(false), 0�� �ƴ� ��� ����(true)
		 	- ����: \0(null ����, ���� �ڵ尪 : 0)(false) �� �̿��� ����(true)
		 	- ���ڿ�: 
		 */
		//m1();
		//m2();
		//m3();
		m5();
		
		
		
		
		
		
	}//main

	
	
	private static void m5() {
		// TODO Auto-generated method stub
		
	}



	private static void m3() {
		Scanner scan = new Scanner(System.in);
		//��������
		System.out.println("A. �������� �����մϱ�?");
		System.out.println("1.�����");
		System.out.println("2.������");
		System.out.println("3.�Ķ���");
		
		System.out.print("����: ");
		int sum = 0 ;
		int sel = scan.nextInt();
		if (sel ==1 ) {
			sum+= 10;
		}else if (sel ==2 ) {
			sum +=5;
		}else if (sel ==3 ) {
			sum +=3;
		}
		
		
		System.out.println("B. � ������ �����ϴ°�");
		System.out.println("1.java");
		System.out.println("2.python");
		System.out.println("3.c");
		
		System.out.print("����: ");
		int sel2 = scan.nextInt();
		if (sel2 ==1 ) {
			sum+= 10;
		}else if (sel2 ==2 ) {
			sum +=5;
		}else if (sel2 ==3 ) {
			sum +=3;
		}
		
		System.out.println("�Ϸ�\n");
		System.out.println("���\n");
		System.out.print("����� "); 
		if (sum >=6 && sum<8 ) {
			System.out.println("����");
		}else if (sum>=8 && sum<20 ) {
			System.out.println("�� ������ ������");
		}else{
			System.out.println("�ְ�!");
		}
		
		
		
		
	}

	private static void m2() {

			//�䱸����] ���̸� �Է¹޾� ����, �̼��������� ����Ͻÿ�
		Scanner scan = new Scanner(System.in);
		System.out.print("����: ");
		int age = scan.nextInt();
		System.out.println(age>19?"����":"�̼�����");
		
		if(age>19) {
			System.out.println("����");
		}
		else {
			System.out.println("�̼�����");
		}
		
	}

	private static void m1() {
		if(true) {// true block
			System.out.println("�ȳ��ϼ���.");
		}
		System.out.println("���α׷� ����.");
		
		
		int n= 0;
		if(n>0) {
			System.out.println("����Դϴ�.");
		}
		else if(n<0){
			System.out.println("�����Դϴ�.");
		}
		else {
			System.out.println("0�Դϴ�.");
		}
	}
}
