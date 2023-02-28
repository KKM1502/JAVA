package com.test.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Ex78_HashMap {

	public static void main(String[] args) {
		
		/*
		 ���� ����
		 - ArrayList vs HashMap
		 - List vs Map
		 
		 -ArrayList(C) > List(I)
		 

		�迭 vs ArrayList
		-���� ���� vs ����
		
		Class vs HashMap
		-�������� ����
		-������ ������>HashMap or Class
		
		 
		 
		 */
		
//m1();
//		m2();
		m3();
		
		
		
		
		
		
		
		
		
	}

	private static void m3() {
		
		HashMap<String, String> map = new HashMap<String,String>();

		map.put("red", "����");
		map.put("yellow", "���");
		map.put("blue", "�Ķ�");
		
		//HashMap�� ���� Ž���ϱ�
		HashMap<Integer, String> map2 = new HashMap<Integer,String>();
		map2.put(0, "����");
		map2.put(1, "���");
		map2.put(2, "�Ķ�");
		
		
		//�̷��� ���Ÿ� ���� ArrayLisrt�� ����ض�
		for (int i = 0; i < map2.size(); i++) {
			System.out.println(map2.get(i));
		}
		
		map.put("red", "����");
		map.put("yellow", "���");
		map.put("blue", "�Ķ�");
		
		
		//key~~
		Set<String> set = map.keySet();
		for (String item : set) {
			System.out.println(item);
		}
		
		//value~~
		Collection<String> values = map.values();
		
		for(String value : values){
			System.out.println(value);
		}
		
		Set<String> set2 = map.keySet();
		for (String item : set2) {
			System.out.println(item + ":" +map.get(item));
		}
		
		
	}

	private static void m2() {
		//HashMap ����
		HashMap<String, String> map = new HashMap<String,String>();
		//1. ��� �߰��ϱ�
		map.put("red", "����");
		map.put("yellow", "���");
		map.put("blue", "�Ķ�");
		
		//2.��� ����
		System.out.println(map.size());
		
		
		//3.��� �б�
		System.out.println(map.get("red"));
		System.out.println(map.get("yellow"));
		System.out.println(map.get("blue"));
		
		//4.��� ����
		//-key�� �����ϴ�.
		map.put("yellow", "�����");
		System.out.println();
		System.out.println(map.get("yellow"));
		
		
		
		//5. ��� �˻�
		//-contains
		System.out.println(map.containsKey("yellow"));
		System.out.println(map.containsValue("���"));
		
		//6.��� ����
		map.remove("yellow");
		System.out.println(map.size());
		System.out.println(map.get("yellow"));//���� key ��û > null
		
		//7.�ʱ�ȭ
		map.clear();
		System.out.println(map.size());
		
		map.put("red", "����");
		map.put("yellow", "���");
		map.put("blue", "�Ķ�");
		System.out.println(map); // toString() �������̵� > ����
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("����");
		list.add("���");
		list.add("�Ķ�");
		
		System.out.println(list);
		
	}

	private static void m1() {
//		1.������ , �����
		int kor = 100;
		int eng = 80;
		int math =70;
		
//		2.class ���
		Score score1 = new Score();
		score1.kor= 100;
		score1.eng= 90;
		score1.math = 70;
		
//		3.Hash ��� >> key�� ����, ������ ���� 
		HashMap<String,Integer> score2 = new HashMap<String, Integer>();
		score2.put("����",100);
		score2.put("����",80);
		score2.put("����",70);
		
		System.out.println(score2.get("����"));
		System.out.println(score2.get("����"));
		System.out.println(score2.get("����"));
		
		
		
//		ArrayList ���
		ArrayList<Integer> score3	=	new ArrayList<Integer>();
		
		
		
		
		
		
		
//		�䱸����] �л� 1��(***)�� ��,��,�� ���� >>Hash
//		�䱸����] �л� 100���� ��,��,�� ���� > Class
		
	}
	
	
}


class Score{
	public int kor;
	public int eng;
	public int math;
}
