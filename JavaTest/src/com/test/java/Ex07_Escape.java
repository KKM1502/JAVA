package com.test.java;


public class Ex07_Escape {
	
	public static void main(String[] args) {
		
/*		Ex07_Escape.java
		Ư������ > Escape Sequence
		-�����Ϸ��� ������ �� ��, ���� �״�� ������� �ʰ� �̸� ��ӵ� ǥ������ �ٲ㼭 ����ϴ� �������
		
		1. \n
		-new line, line feed
		-���� ���� = enter
*/
		char c1 = '\n';
		String s1 = "\n";
		
		//�䱸����] "�ȳ��ϼ���. ȫ�浿�Դϴ�."�� ���
		//��������] "�ȳ��ϼ���." �� "ȫ�浿�Դϴ�." ���� �ٸ� �ٿ� ���
		
		//***���ڿ� ���ͷ�("") �ȿ��� ���͸� ĥ �� ����.
		String msg = "�ȳ��ϼ���."+c1+"ȫ�浿�Դϴ�.";
		System.out.println(msg);
		
		/* 2.\r
		-carriage return
		-ĳ���� ��ġ�� ���� ������ �Ǿ����� �̵�
		-Ű����>Home Ű ����
		-��Ŭ���� �ܼ�â������ \n�� �����ϰ� ����
		*/
		msg = "�ȳ��ϼ���.\rȫ�浿";
		System.out.println(msg);		
		
		//�ü���� ����
		//1. ������:\r\n
		//2. ��OS:\r
		//3. ������:\n
		
		/* 3.\t
		-�ǹ���, tab
		-�� > �ൿx > �̹� �������ִ� ���� ��ġ����
		-��Ű > ���� ����� ������ �̵�
		-
		*/
		
		msg = "�ϳ�\t\t��\t\t\t��";
		System.out.println(msg);
		
		/* 4.\b
		-backsapce
		-��Ŭ���� �ֿܼ��� ���� ����
		*/
		msg= "ȫ�浿\b�Դϴ�";
		System.out.println(msg); 

		/* 5.\", \',\\
		�䱸����] ȫ�浿: "�ȳ��ϼ���" >���
		*/
		msg = "ȫ�浿: \"�ȳ��ϼ���\"";
		System.out.println(msg); 
		//�䱸����] ���� ���� ��θ� ����Ͻÿ�.
		//C:\class\code\java
		System.out.println("���� ����: C:\\class\\code\\java");
		
	}

}
