package com.test.question;

public class Americano {
	private int bean;
	private int water;
	private int ice;
	
	Americano(int bean, int water, int ice){
		this.bean = bean;
		this.water = water;
		this.ice = ice;
		
	}
	
	
	public int getBean() {
		return bean;
	}
	public void setBean(int bean) {
		this.bean = bean;
	}
	public int getWater() {
		return water;
	}
	public void setWater(int water) {
		this.water = water;
	}
	public int getIce() {
		return ice;
	}
	public void setIce(int ice) {
		this.ice = ice;
	}
	
	
	public void drink() {

		System.out.printf("����%dg, ��%dml, ����%d���� ������� �Ƹ޸�ī�븦 ���ʴϴ�.\n",bean,water,ice);
		
	}

}
