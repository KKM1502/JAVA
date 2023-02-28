package com.test.java;

public class Ex37_String {
	public static void main(String[] args) {
//		m1();
//		m3();
		m4();
		
	}

	private static void m4() {
		//String vs StringBuilder
		
		
		long begin = System.nanoTime();
		String txt1 = "ȫ�浿";
		for (int i = 0; i < 10000; i++) {
			txt1 = txt1 +".";
			//���� ����
		}
		long end = System.nanoTime();
		System.out.println(txt1.length());
		System.out.println(end-begin +"ns");
//		10003
//		121765301ns
		
		System.out.println();
		long begin1 = System.nanoTime();
		StringBuilder txt2= new StringBuilder("ȫ�浿");
		for (int i = 0; i < 10000; i++) {
			txt2.append(".");
			//���� ����
		}
		System.out.println(txt2.length());
		long end1 = System.nanoTime();
		System.out.println(end1-begin1 +"ns");
		
	}

	private static void m2() {

		String name1 = "ȫ�浿";// String = �Һ�, ���� ��ȿ��
		StringBuilder name2 = new StringBuilder("ȫ�浿"); //StringBuilder = �迭ó�� , ���� ���� 
		
		
	}

	private static void m3() {

		
		//1. �޸��� ������ �ѹ� �Ҵ�Ǹ� �� �̻� �ø��ų� ���� �� ����.
		//3. ���ڿ��� �������̴�.
		
		//���� > �ڷ��� > �޸��� ũ�Ⱑ ����
		int a = 20000; //4byte
		char c = '1'; //2byte
		
		String b = "ȫ�浿";//6byte
		String d = "�ȳ��ϼ���";//10byte
		
		int[] ns1 = new int[3]; //12byte
		int[] ns2 = new int[5]; //20byte
		//��� ������ ������ �񱳴� ���� ������ �񱳰� �ƴ϶� �ּҰ��� ���Ѵ�.
		
	}
}
