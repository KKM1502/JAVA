package com.test.java;

public class Ex16_Casting {

	public static void main(String[] args) {
		//Ex16_Casting
		
		//������ ���ͷ��� int
		//�Ǽ��� ���ͷ��� double
		//���� �����ڴ� �¿� �ڷ����� �����ؾ��Ѵ�.
		
		//byte = int
		//������(1) = ū��(4) > ����� ����ȯ
		byte m1 = 10;	
		
		//short = int
		//������(2) = ū��(4) > �����
		short m2 = 10;
		
		//int = int
		//����ȯ ���� 
		int m3 = 10;
		
		//long = int
		//ū��(8) = ������(4) > �Ͻ���
		long m4 = 10;
		
		//float = double
		//������(4) = ū��(8)
		//float f1 = (float)3.14;
		float f1 = 3.14f;
		double f2 = 3.14;
		
		
		//���� <> �Ǽ�
		long n1 = 100;	//����(8)
		float n2;		//����(4)
		
		double n3 = 3.14;
		int n4;
		
		//������ - ū��
		n4 = (int)n3;
		System.out.println(n4);//�Ҽ��� ���� ����
		
		//������ �Ǽ����� ũ�� �񱳴� �ܼ��� ���� ũ���� byte�� ����ϴ°� �ƴ� ���� ǥ�� ������ ������ ������ ǥ���ؾ� �Ѵ�.
		
		//ũ�� ����
		//byte(1) < short(2) < int(4) < long(8) <<<<<float(4) < double(8)
	
		//char(2byte) = short(2byte)
		
		char c1 = 'A';
		short s1;
		
		s1 = (short)c1;
		System.out.println("s1: "+s1); //'A' > 65
		
		short s2 = 97; //����
		char c2;
		c2 = (char)s2;	//����� ��ȯ
		System.out.println(c2);//97 > 'a'
		
		//*** char�� short�� ��ȯ�ϸ� �ȵȴ�.
		//*** char�� �����ڵ�� ��ȯ�Ϸ��� int�� ����Ѵ�.
		//-char > int
		//- int > char
		
		//��� ������ �ڵ� �ϱ�
		System.out.println((int)'A'); //65
		System.out.println((int)'Z'); //90
		
		System.out.println((int)'a'); //97
		System.out.println((int)'z'); //122
		
		System.out.println((int)'0'); //48
		System.out.println((int)'9'); //57
		
		//�ѱ� ü��
		//- �ϼ��� �ѱ�(��, ��, ��, ��...)
		//- ������ �ѱ�(��, ��, ��, ��...) > ���x 
		System.out.println((int)'��');
		System.out.println((int)'�R');
		
		
		
	}
	
	
	
	
	
}
