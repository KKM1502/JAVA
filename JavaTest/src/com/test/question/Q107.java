package com.test.question;

public class Q107 {
	public static void main(String[] args) {
		//�迭 ����
		MyHashMap map = new MyHashMap();
	
		//�߰�
		map.put("����", "�հ�");
		map.put("����", "���հ�");
		map.put("����", "����");

		//�б�
		System.out.println(map.get("����"));
		System.out.println(map.get("����"));
		System.out.println(map.get("����"));

		//����
		System.out.println(map.size());

		//����
		map.put("����", "�հ�");
		System.out.println(map.get("����"));

		//����
		map.remove("����");
		System.out.println(map.get("����"));
		
		
		//�˻�(key)
		if (map.containsKey("����")) {
		      System.out.println("���� ���� ����");
		} else {
		      System.out.println("���� ���� ����");
		}
		
		//�˻�(value)
		if (map.containsValue("�հ�")) {
		      System.out.println("�հ� ���� ����");
		} else {
		      System.out.println("�հ� ���� ����");
		}

		//�ʱ�ȭ
		map.clear();
		System.out.println(map.size());
	}
}
