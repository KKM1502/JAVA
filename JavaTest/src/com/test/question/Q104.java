package com.test.question;

public class Q104 {
	public static void main(String[] args) {
		//�迭 ����
		MyArrayList list = new MyArrayList();

		//�߰�
		list.add("ȫ�浿");
		list.add("�ƹ���");
		list.add("������");

		//�б�
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		//����
		System.out.println(list.size());
		System.out.println();

		//Ž�� + �б�
		for (int i=0; i<list.size(); i++) {
		      System.out.println(list.get(i));
		}
		System.out.println();
		//����
		list.set(0, "������");
		System.out.println(list.get(0));
		System.out.println();

		//����
		list.remove(1);
		for (int i=0; i<list.size(); i++) {
		      System.out.println(list.get(i));
		}
		System.out.println();
		//����
		list.add(1, "ȣȣȣ");
		for (int i=0; i<list.size(); i++) {
		      System.out.println(list.get(i));
		}
		System.out.println();	
		//�˻�
		if (list.indexOf("ȫ�浿") > -1) {
		      System.out.println("ȫ�浿 ����");
		} else {
		      System.out.println("ȫ�浿 ����");
		}

		//�ʱ�ȭ
		list.clear();
		System.out.println(list.size());
		
		
		
	}
}
