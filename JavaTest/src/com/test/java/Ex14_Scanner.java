package com.test.java;

import java.util.Scanner;


public class Ex14_Scanner {

		public static void main(String[] args) {
			
//			Ex14_Scanner.java
//			1. System.in.read()
//			2. BufferedReader
//			3. Scanner
			
			//�Էµ���
			Scanner scan = new Scanner(System.in);	
			
			
			System.out.print("�̸�: ");			
			String name = scan.nextLine(); //reader.readLine()			
			System.out.printf("�ȳ��ϼ���. %s��\n",name);
			
			
			System.out.print("����: ");
			Double num = scan.nextDouble();	//Integer.parseInt()
			System.out.println(num + 10);
			
			
			//�䱸����] ������� ����, ���ø� �Է¹ް�, ���డ�� �ο� ���� �Է�
				
			System.out.print("������� ����:");
			String Country= scan.nextLine();
			System.out.println(Country);
			
			System.out.print("������� ����:");
			String City= scan.nextLine();
			System.out.println(City);
			
			System.out.print("�ο� ��:");
			Integer People= scan.nextInt();
			System.out.println(People + "��");
			
			
			
			
			
			
			
			
			
			
			/*
		      
	         ���� 1�� �Է�
	         int code = System.in.read();
	         
	         
	         ���� 1�� �Է�
	         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	         int code = reader.read();
	          
	          
	         ���ڿ� �Է�
	         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	         String line = reader.readLine();
	         
	         
	         ���ڿ� �Է�
	         Scanner scan = new Scanner(System.in);
	         String line = scan.nextLine();
	         
	         
	         ���� �Է�
	         Scanner scan = new Scanner(System.in);
	         int num = scan.nextInt();
	      
	      */
			
			
		}
	
}
