package com.test.obj;

public class Keyboard {

	
	//Ŭ������ ������� ���� ������
	//1. private���� �����Ѵ�. > ��ȿ���� ���� ���� �����...
	//2. public �޼ҵ� ���� > private ������ �����Ѵ�.
	
	private String model;
	private int price;
	
	
	//�ܺο��� ���� ������ �Ұ����� private ������
	//public �޼ҵ尡 �߰����� ������ ������.
//	public void aaa(String a) {
//		model = a ;
//	}
//	public void bbb(int b) {
//		//��ȿ�� �˻�
//		if(b>0&&b<=200000) {
//			price= b;
//		}{
//			System.out.println("���ݿ���!");
//		}
//	}
//	public String ccc() {
//		return model;
//	}
//		
//	public int ddd() {
//		return price;
//	}
//
	//public void add(String a)
	//- set ��� ������
	//- ���� �޼ҵ� > setter
	public void setModel(String model) {
//		model = model;
		//this? > ��ü ����(����) ������ > ��ü �ڽ��� ����Ű�� ǥ�� > "��"
		this.model = model;
		
	}
	public String getModel() {
//		model = model;
		//this? > ��ü ����(����) ������ > ��ü �ڽ��� ����Ű�� ǥ�� > "��"
		return this.model;
		
	}
	public void setPrice(int price) {
//		model = model;
		//this? > ��ü ����(����) ������ > ��ü �ڽ��� ����Ű�� ǥ�� > "��"
		this.price = price;
		
	}
	public int getPrice() {
//		model = model;
		//this? > ��ü ����(����) ������ > ��ü �ڽ��� ����Ű�� ǥ�� > "��"
		return this.price;
		
	}
	
	
	
}
