package com.test.question;

public class Q108 {
	
	
	public static void main(String[] args) {
		//�迭 ����
		MySet list = new MySet();
		
		//�߰�
		list.add("ȫ�浿");
		list.add("�ƹ���");
		list.add("������");
	


		//����
		System.out.println(list.size());
//
//		//����
		list.remove("�ƹ���");
		
//
//		//����
		System.out.println(list.size());
		
//
		//Ž�� + �б�
		while (list.hasNext()) {
		      System.out.println(list.next());
		  
		}
//
//		//�ʱ�ȭ
		list.clear();
		System.out.println(list.size());
		
	}

}
