package com.test.java;

public class Ex05_Variable {

	public static void main(String[] args) {
		
		//Ex05_Variable.java
		
		//1. �� �ڷ��� > ���� �����
		//2. �� �ڷ��� > ������ ���� + ���
		
		//������
		byte b1;
		b1 =10; //10 > ������ > ���� ǥ���� 10 > *���ͷ�(Literal), ���
		System.out.println(b1);
		
		//����(���ϴ�) <-> ���(�������ʴ�)
		
		//b1 = 128;//Type mismatch: cannot convert from int to byte
		//�ڷ����� ǥ���� �� �ִ� ������ �Ѿ
		//System.out.println(b1)
		
		//��ƿ ũ���� (���� Ŭ����)
		//1. byte	 > Byte
		//2. short	 > Short
		//3. int	 > Integer
		//4. long	 > Long
		//5. float	 > Float
		//6. double	 > Double
		//7. boolean > Boolean

		b1 = Byte.MAX_VALUE; //���� > ��� > JDK�� �̸� �����ϴ� ���
		System.out.println(b1);//127
		
		b1 = Byte.MIN_VALUE;
		System.out.println(b1);
		
		//�Ǽ��� ����� double���̴�.
		float f1; 
		f1 = 3.14f;
		System.out.println(f1);
		
		char c1;
		c1 = 'A';
		System.out.println(c1);
		
		c1 = '@';
		System.out.println(c1);
		
		c1 = '1';
		System.out.println(c1);
		
		
		//Ȧ�浿
//		c1 = 'ȫ�浿'; //Invalid character constant
		String c2;
		c2 = "ȫ�浿";
		System.out.println(c2);
		
		//����
		boolean flag;
		
		flag = true;	//���� ���ͷ�
		flag = false;	//���� ��� 
		
		
		
	}
	
	
	
}
