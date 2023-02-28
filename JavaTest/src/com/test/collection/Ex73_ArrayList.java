package com.test.collection;

import java.util.ArrayList;

public class Ex73_ArrayList {

	public static void main(String[] args) {
		/*
		 	�÷���, Collection
		 	- JCF, Java Collection Framework
		 	- (����) �迭
		 	- ������ ���� �迭 > ����, ���� �� ���� >Ŭ����
		 	- ���� ���� > ���� ������ ������� �ø��ų� ���̴°� ����
		 	
		 	�÷��� ����
		 	1. List �迭
		 		- ArrayList(********)
		 			- Serializable, Cloneable, Iterable<E>
		 			- Collection<E>, List<E>, RandomAccess
		 			
		 		- LinkedList
		 		- Queue
		 		- Stack
		 		- Vector(legacy)
		 	
		 	2. Set �迭
		 		- HashSet(***)
		 		- TreeSet
		 	
		 	3. Map �迭
		 		- HashMap(***)
		 		- TreeMap
		 		- Properties(legacy)
		 		- HashTable(legacy)
		 	
		 	ArrayList Ŭ����
		 	
		 	
		 */
		
		m3();
		
		
	}

	private static void m3() {

		ArrayList<Integer> list = new ArrayList<Integer>();
		//- add(value) : Append
		//- add(index, value) : Insert
		for (int i = 0; i < 10; i++) {
			list.add((int)(Math.random() * 100));
		}
		System.out.println(list);
		
	}

	private static void m2() {
//		1.�����ϱ�
		ArrayList<String> list = new ArrayList<String>();
		
		
//		2.��� �߰��ϱ�
		list.add("�ٳ���");
		list.add("����");
		list.add("��");
		list.add("����");
		list.add("���ξ���");
		
		System.out.println(list.get(4));
		System.out.println(list.get(0));
		System.out.println(list.get(3));
		System.out.println(list.get(2));
		
		//����� ����
		//-list[0]= 10; ���� or ����
		//- T set(int index, T newValue)
		
		System.out.println(list);
		String temp = list.set(0, "����");
		System.out.println(temp);
		System.out.println(list);
		System.out.println();
	}
	
	
	
}

