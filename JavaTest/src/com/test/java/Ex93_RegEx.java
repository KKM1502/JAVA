package com.test.java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex93_RegEx {
	public static void main(String[] args) {
		
		/*
		 
		 ���� ǥ����, Regular Expression
		 - ���Խ�
		 - "Ư�� ����"�� ���ڿ��� �˻��ϴ� ����
		 - �ڹ�(X)
		 - ���/����� �������� ������ ���
		 - ���н�
		 
		 
		 3 ����������
		 - �ٷ� ���� ������ ���� Ƚ���� ǥ��
		 
		 	3.1 ����
		 	
		 	3.2 ?
		 		- �ٷ� ���� ����� ���� Ƚ���� ����O, �ߺ�X
		 		- ���� Ƚ��: 0~1
		 		ex) "a?bc" > ab,abc,abbc,ac,bc,bbc,aaabc
		 		 	- "abc"
		 		 	- "bc"
		 		 
		 	3.3 +
		 		- �ٷ� ���� ����� ����x, �ߺ�o
		 		- ���� Ƚ�� : 1~���Ѵ�
		 			ex) "a+bc" > ab,abc,abbc,ac,bc,bbc,aaabc,aaaaaaaaaaaaaaaaaaaaaaabc
		 			ex) (�ڹ�)+�ڵ�>�ڹ��ڵ� ���ڵ� ���ڵ� �ڹ��ڵ� �ڵ� �ڹ��ڹ��ڵ� �ڹ��ڹ��ڹ��ڵ�
		 	
		 	3.4 *
		 		- �ٷ� ���� ����� ����o, �ߺ�o
		 		- ���� Ƚ��: 0~ �� �� ��!
			 		ex) "a*bc" > ab,abc,abbc,ac,bc,bbc,aaabc
			 		ex) (�ڹ�)*�ڵ�>�ڹ��ڵ� ���ڵ� ���ڵ� �ڹ��ڵ� �ڵ� �ڹ��ڹ��ڵ� �ڹ��ڹ��ڹ��ڵ�
		 4. ����, choice
		 	4.1 [���Ű�]
		 		- ���ŵ� ������ �ϳ��� �����ؼ� �˻� 
		 		ex) "[129]" > �ȳ��ϼ���. �� ���̴� 21���Դϴ�. �� ������ 19���Դϴ�.
		 		ex) "[1234567890]" > �ȳ��ϼ���. �� ���̴� 21���Դϴ�. �� ������ 19���Դϴ�.
		 		ex) "[���̹�]�浿" > ȫ�浿,��浿,�̱浿,�ڱ浿,�ֱ浿
		 		ex) "[123]45" > 12345,145,245,45	//123�� �ϳ��� �ݵ�� ����
		 		ex) "[123]?45" > 12345,145,245,45	//123�� ���� ���ص� ��~
		 		ex) "[123]+45" > 12345,145,245,45	//�������� ����
	
				ex) �������� ��� ����(���ڸ� �̻�~) > "[0123456789]+" // ��~�� ���ڸ� ã�� 
				
				ex) �������� 2�ڸ� ���� > "[0123456789][0123456789]"
				ex) �������� 2�ڸ� ���� > " [0123456789][0123456789] "
				ex) �ֹε�Ϲ�ȣ �˻� > "[0123456789][0123456789][0123456789][0123456789][0123456789][0123456789]-[0123456789][0123456789][0123456789][0123456789][0123456789][0123456789][0123456789]"
				ex) ���� > "[0-9]"
				ex) �ҹ��� > "[a-z]"
				ex) �빮�� > "[A-Z]"
				ex) ������ > "[a-zA-Z]"
				ex) ȫ������ ���� �̸� > "ȫ+[��-�R][��-�R]"
				ex) ��ȭ��ȣ�� ���ԵǾ� �ִ��� �˻� > [0-9]{3}-[0-9]{3,4}-[0-9]{4}
												���� 3�ڸ� ���� 3~4�ڸ� ���� 4�ڸ�


		 	4.2 [^���Ű�]
		 
			*/
		
		
		
//		m1();
//		m2();
//		m3();
		m4();
		
	}

	private static void m4() {
		//1. �˻� > ġȯ
		//2. �˻� > ����
		//3. ��ȿ�� �˻�
		
		//ȸ�� ���� > ��ȿ�� �˻�
		//1. �̸� > �ʼ��Է�, �ѱ�, 2~5�� �̳�
		//2. ���� > �ʼ��Է�, ����, 18�� �̻�
		//3. ���̵� > �ʼ��Է�, ����+����+_, ���ڷ� ���� �Ұ���, 4~12�� �̳�
		
		System.out.println("[ȸ�� ����]");
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸�: ");
		String name = scan.nextLine();
		
		System.out.print("����: ");
		String age = scan.nextLine();
		
		System.out.print("���̵�: ");
		String id = scan.nextLine();
		
		if (isValid(name, age, id)) {
			System.out.println("���� �Ϸ�");
		} else {
			System.out.println("���� ����");
		}

		
		
	
	}

	private static boolean isValid(String name, String age, String id) {
		
		String regex = ""; // ���Խ�
		Pattern pattern = null;	//���Խ� ��ü
		Matcher matcher = null; //��� ��ü
		
		//1. �̸� > �ʼ��Է�, �ѱ�, 2~5�� �̳�
		regex = "^[��-�R]{2,5}$";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(name); //�Է°��� ������� ���Խ� �˻�
		
		if(!matcher.find()) {
			//�ѱ۷� �� 2~5�ڸ� ã�� ���߽��ϴ�!
			System.out.println("�̸��� �ʼ��Է�, �ѱ�, 2~�� �̳��� �Է��ϼ���.");
			return false;
		}

		return true;
	}

	private static void m3() {
		String regex = "[0-9]{3}-[0-9]{3,4}-[0-9]{4}";
		Pattern p1 = Pattern.compile(regex);
		
		String txt = "Hi, My name is Hong. my Phone number is 010-3123-1231 if you can't contact me, please call 010-1234-1234";
		Matcher m1 =p1.matcher(txt);
//		
//		System.out.println(m1.find());
//		System.out.println(m1.find());
//		System.out.println(m1.find());
		
		int count = 0;
		while(m1.find()) {
			System.out.println("[��ȭ��ȣ �߰�]");
			System.out.println("[��ȭ��ȣ: "+m1.group()+"]");
			count++;
		}
		System.out.printf("txt������ ��ȭ��ȣ�� %dȸ �߰�",count);
		
		
		
	}
	
	
	private static void m2() {
		
			String regex = "(ȫ|��|��|����)(�浿)";
			Pattern p1 = Pattern.compile(regex);
			
			String txt = "ȫ�浿, �ֱ浿,��浿,���ñ浿, ���浿,�� �� ���� ";
			Matcher m1 =p1.matcher(txt);
			
			int count = 0;
			while(m1.find()) {
				count++;
				System.out.println(count);
				System.out.println("[�̸� �߰�]");
				System.out.println("[Ǯ ����: "+m1.group()+"]");
				System.out.println("[��: "+m1.group(1)+"]");
				System.out.println("[�̸�: "+m1.group(2)+"]");
				System.out.println();
			}
			System.out.printf("txt������ �̸��� %dȸ �߰�",count);
			
			
			
		
	}



	private static void m1() {
		String txt = "ȫ�浿,�ƹ���,������,ȣȣȣ,������";
		
		//1.split()
		String[] list = txt.split(",");
		
		for(String name : list) {
			System.out.println(name);
		}
	
		txt = "ȫ�浿,�ƹ���,������,ȣȣȣ,������";
		System.out.println();
		list = txt.split("����");
		
		for(String name : list) {
			System.out.println(name);
		}
	
		
	}
}
