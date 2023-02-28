package com.test.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex24_LinkedList {

	public static void main(String[] args) {
		
		/*
		 
		 	Collection(I) < List(I) < ArrayList(C), LinkedList(C)
		 	
		 	ArrayList vs LinkedList
		 	- ���� �ſ� ����
		 	- ���� ������ �ٸ���.  >>> ��� �뵵�� �ٸ�����.
		 	
		 	ArrayList
		 	- �������� ������ �߰�/����
		 	- Ž�� ���� �۾�
		 	
		 	LinkedList
		 	- �߰� ������ �߰�/����
			
		 	LinkedList ����
		 	1. LinkedList	 : �ܹ��� Ž��
		 	2. Double LinkedList	: ����� Ž��
		 	3. Double Circular LinkedList : ��ȯ Ž�� > �ڹ��� LinkedList
		 
		 */
		
//		m1();
		m2();
	}//main

	
	//�ӵ���
	private static void m2() {
		ArrayList<Integer> list1 =new ArrayList<Integer>();
		LinkedList<Integer> list2 =new LinkedList<Integer>();
		long begin = 0, end = 0;
		
		//1. ���������� ������ �߰��ϱ�, Append
		System.out.println("1.���������� ������ �߰��ϱ�");
		begin = System.currentTimeMillis();
		
		for (int i = 0; i < 10000000; i++) {
			list1.add(i);
		}

		end = System.currentTimeMillis();
		System.out.println("Array: " + (end-begin));

		begin = System.currentTimeMillis();
		
		for (int i = 0; i < 10000000; i++) {
			list2.add(i);
		}
		
		end = System.currentTimeMillis();
		System.out.println("Linked: "+(end-begin));
		
		
		
		//2. �߰��� ������ �߰��ϱ�, Insert
		System.out.println("2.�߰��� ������ �߰��ϱ�");
		begin = System.currentTimeMillis();
		
		for (int i = 0; i < 1000; i++) {
			list1.add(0,i);
		}

		end = System.currentTimeMillis();
		System.out.println("Array: " + (end-begin));

		begin = System.currentTimeMillis();
		
		for (int i = 0; i < 1000; i++) {
			list2.add(0,i);
		}
		
		end = System.currentTimeMillis();
		System.out.println("Linked: "+(end-begin));
		
		//3. �߰��� �ִ� ������ �����ϱ�
		System.out.println("3. �߰��� �ִ� ������ �����ϱ�");
		begin = System.currentTimeMillis();
		
		for (int i = 0; i < 1000; i++) {
			list1.remove(0);
		}

		end = System.currentTimeMillis();
		System.out.println("Array: " + (end-begin));
		
		begin = System.currentTimeMillis();
		
		for (int i = 0; i < 1000; i++) {
			list2.remove(0);
		}
		
		end = System.currentTimeMillis();
		System.out.println("Linked: "+(end-begin));
		

	}

	private static void m1() {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(300);
		list1.add(200);
		list1.add(100);
		
		System.out.println(list1.size());
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		list2.add(300);
		list2.add(200);
		list2.add(100);
		
		System.out.println(list2.size());
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		System.out.println(list2.get(2));
		
		
		
	}
	
}
