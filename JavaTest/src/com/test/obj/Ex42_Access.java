package com.test.obj;

public class Ex42_Access {

	public static void main(String[] args) {
	
		Cup c1 = new Cup();
		
		c1.setColor("White");
		System.out.println(c1.getColor());
		
		
		//Setter > ���� ���� ���
		c1.setWeight(500);
//		System.out.println(c1.get);
		
		//Getter > �б� ���� ���
		System.out.println(c1.getPrice());
		
		//���� ������Ƽ
		System.out.println(c1.getLevel());
		//Ŭ���� ���ο��� �Ͼ�� ���� �ܺο����� �� �� ����. 
		
		//�ڹ� ���
		//- c1.type			> field(�ʵ�)
		//- c1.getType()	> property(������Ƽ) >getter/setter 
		
	}
	
	
}
