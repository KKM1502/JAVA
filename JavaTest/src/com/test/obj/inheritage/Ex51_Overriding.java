package com.test.obj.inheritage;

public class Ex51_Overriding {
	public static void main(String[] args) {
		/*
		 	�޼ҵ� �����ε�, Method Overloading
		 	-�����ϴ�
		 	-�޼ҵ� �̸� ���� X N�� ����(+���� ����Ʈ)
		 	
		 	
		 	�޼ҵ� �������̵�, Method Overriding
		 	-�Ⱒ�ϴ�, �켱�ϴ�
		 	
		 */
		
	//�ƺ� + �Ƶ� > ����ģ ��Ȳ
	
		OverridingParent hong = new OverridingParent();
		hong.name="ȫ�浿";
		hong.hello();
		
		OverridingChild jhong = new OverridingChild();
		jhong.name="ȫö��";
		jhong.hello();
		
	}
}

class OverridingParent{
	public String name;
	public void hello() {
		System.out.printf("�ȳ��ϼ��� ���� ��ħ�Դϴ�. ���� %s�Դϴ�.\n",name);
	}
}

class OverridingChild extends OverridingParent{
	//4�� ������ > �ð��� �귯.. > ��2�г�
	//�ƺ��� �λ� ��Ŀ� �Ҹ�
	
	
	
}

