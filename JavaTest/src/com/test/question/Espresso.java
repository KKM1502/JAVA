package com.test.question;

public class Espresso {
	private int bean;

	Espresso(int bean){
		this.bean =bean;
	}
	
	public int getBean() {
		return bean;
	}
	public void setBean(int bean) {
		this.bean = bean;
	}

	public void drink() {

		System.out.printf("����%dg���� ������� ���������Ҹ� ���ʴϴ�.\n",bean);
		
	}
}
