package com.test.obj.inheritage;

public class Ex49_Inheritance {
	public static void main(String[] args) {
		
		//���
			//-�θ�Ŭ������ ������ �������, ����޼ҵ� ���� �ڽ�Ŭ�������� �����ִ� �ൿ
		//����ϴ� ����
			//-��� ����
			//-�ڵ� ����
		
		
		
		
		//�θ�Ŭ���� < �ڽ�Ŭ����
		//����Ŭ���� < ����Ŭ����
		//�⺻Ŭ���� < Ȯ��Ŭ����
		//�⺻Ŭ���� < �Ļ�Ŭ����
		
		
		Parent p = new Parent();
		p.a = 10;
		p.b = 10;
		p.ccc();
		
		Child c = new Child();
		c.a = 10;
		c.b = 10;
		c.ccc();
		
		
	}//main
}


class Parent{
	public int a;
	public int b;
	public void ccc() {
		System.out.println("ccc");
	}
}


//Ŭ���� ���
//- Child > �ڽ�Ŭ����
//- Parent > �θ�Ŭ����
//- �θ�Ŭ����(Parent)�� ������ ��� ����� �ڽ�Ŭ����(Child)���� �����ش�
class Child extends Parent{
	public int d;
	public int e;
	public void fff() {
		System.out.println("fff");
	}
	
	
	
	
}

//����Ʈ ȸ��(ī��)
//1. �Ϲ� ȸ��
//	- �̸�
//	- ���̵�
//	- ��ȣ
//	- �̸���
//2. ������ ȸ��
//	- �̸�
//	- ���̵�
//	- ��ȣ
//	- �̸���
//3. �ӽ� ȸ��
//	- �̸�
//	- ���̵�
//	- ��ȣ
//	- ��ȿ�Ⱓ


class Member{
	
	public String name;
	public String id;
	public String pw;
	
	
	
}



class User extends Member{

	public String email;
}
class Administrator extends Member{

	public String email;
}

class Temp extends Member{
	public String exDate;
	
}


