package com.test.obj;

public class Ex39_Class {
	
	public static void main(String[] args){
		//Ex39_Class.java
		
		User u1 = new User();
		u1.name="ȫ�浿";
		u1.age = 20;
		u1.hello();
		
		User u2 = new User();
		u2.name="�ƹ���";
		u2.age = 25;
		u2.hello();
		
		User u3 = new User();
		u3.name="������";
		u3.age = 23;
		u3.hello();
		
		
		
		
	}//main
	
	
}

//�ڵ� ������
class User{
	
	//��� ����
	//1. ��� ����
	//2. ��� �޼ҵ�
	
	public String name;
	public int age;
	
	
	//�޼ҵ� > ���� > �����ִ� �ൿ > �ڽŸ��� ���� �����͸� Ȱ���ؼ� �ൿ
	public void hello() {
		
//		System.out.println("�ȳ��ϼ���.");
		System.out.printf("�ȳ��ϼ���. ���� %s�Դϴ�. �׸��� �� ���̴� %d���Դ�	��.\n",name,age);
	}
	
	
}

