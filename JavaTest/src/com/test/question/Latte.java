package com.test.question;

public class Latte {
	private int bean;
	private int milk;
	
	Latte(int bean, int milk){
		this.bean = bean;
		this.milk = milk;
	}
	
	public int getMilk() {
		return milk;
	}
	public void setMilk(int milk) {
		this.milk = milk;
	}
	public int getBean() {
		return bean;
	}
	public void setBean(int bean) {
		this.bean = bean;
	}
	public void drink() {

		System.out.printf("����%dg, ����%dml���� ������� ���׸� ���ʴϴ�.\n",bean,milk);
		
	}

}
