package com.test.java;

public class Ex27_Overloading {
	
	
	public static void main(String[ ] args) {
	//Ex27_Overloading.java
	
	/*
	 	***�޼ҵ� �����ε�, Method Overloading
	 	- ������ �̸� �޼ҵ尡 ���� ����Ʈ�� �پ��ϰ� �����鼭 ������ �����ϴ� ���
	 	
	 	�޼ҵ� �����ε��� �ϴ� ����?
	 	- ���� ���x
	 	- �����ڿ��� ����o > �޼ҵ� �̸��� �ܿ�� ���ϰ� ����
	 	
	 	�޼ҵ� �����ε� ���� ���� > ����
	 	1. �Ű������� ����
	 	2. �Ű������� �ڷ���
	 	
	 	�޼ҵ� �����ϴ� ��...
	 	1. public static void test() {} 		//�� �������
	 	2. public static void test() {} 		//���� (1�� ������)
	 	3. public static void test(int n) {}	//o
	 	4. public static void test(int m) {}	//���� (3�� ������)
	 	5. public static void test(String s) {}	//o
	 	6. public static void test(int n, int m) {}	//o
	 	7. public static int test() {}	//x
	 	 
	 	
	 	�޼ҵ� ȣ���ϱ�(���� ���)
	 	test(); //1��
	 	test(100); //3��
	 	test("ȫ�浿")//5��
	 	int num = test() //7��
	 	
	 	�޼ҵ� �����ε� ���� ���� > �Ұ���
	 	1. �Ű������� �̸�
	 	2. ��ȯ���� �ڷ���
	 	
	 	
	 */
		//���� : �������� ���� 
		//���� : �޼ҵ�� > �ܿ�� ���� 
//		drawLineEqual();
//		drawLineAsterisk();
//		drawLineHash();
		
		
		//���� : �޼ҵ���� �Ѱ�
		//���� : ���� ����Ʈ�� �޶���Ѵ�. > Ư¡ 
		drawLine();
		drawLine("8");

		System.out.println(100);//println(int n)
		
		
		
	}//main
	
	
	public static void drawLine() {
		
		System.out.println("==============================");
		
	}
	
	public static void drawLine(String s) {
		
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		
	}
	
	
	//�䱸����] ���� �׸��� �޼ҵ�
	public static void drawLineEqual() {
		
		System.out.println("==============================");
	
	}
	
	//�߰�����] ���� ��� ����
	
	public static void drawLineAsterisk() {
		
		System.out.println("******************************");
	
	}
	
	public static void drawLineHash() {
		
		System.out.println("##############################");
		
	}
	
	
}
