package com.test.java;



public class Ex25_Method {
	public static void main(String[] args) {
		
		//Ex25_Method.java
		
//		int num = getNum();

		System.out.println();
		
		//TODO Ȯ���� 
		test();

		
		//��Ŭ���� ���(�޼ҵ� ����)
		
		//****������ ������ ������ ������ �ڵ尡 2�� �̻� �ݺ��Ǹ� �ȵȴ�.
		
		hello();

		hello2();
		
		
		String name = "ȫ�浿";
		
		hi(name);
		
		score();
		score2(100);
		String result = score3("ȫ�浿"); //Ctrl +1 
		
		System.out.println();
		System.out.println();
		System.out.println();
		aaa();

		
	}//main



	private static void aaa() {
		
		//BreakPoint(Ctrl + shift + B) > ����(f11) 
		//f5�� �����鼭 ���� ��ȭ�� Ȯ��
		int num = 10;
		int sum=0;
		num++;
//		System.out.println(num);
		num *=2;
		sum = num +100;
		System.out.println(sum);
		
		
	}



	private static String score3(String string) {

		return null;
	}



	private static void score2(int i) {
		
		
	}



	private static void score() {
		
		
	}



	public static void hello2() {
		System.out.println("�ȳ��ϼ���.");
		System.out.println("�ݰ����ϴ�.");
		System.out.println("ȯ���մϴ�.");
	}



	public static void hi(String name) {
		System.out.println(name + "�ȳ�.");
		System.out.println(name + "����");
		System.out.println(name + "��������~.");
	}



	private static void hello() {
		hello2();
	}
	
	
	
	public static void test() {
		System.out.println("one");
		
		//�� ���Ϲ�
//		1.�޼ҵ带 �����Ѵ�
		return;
		
//		System.out.println("two");
	}
	
	public static int getNum() {
		
		System.out.println("�ϳ�");
		return 100; //�޼ҵ� ���� 
		
		//Unreachable code > �ڵ� ���� �Ұ� 
		
		
	}
}
