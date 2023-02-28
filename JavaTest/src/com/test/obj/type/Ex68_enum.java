package com.test.obj.type;

public class Ex68_enum {

	
	public static void main(String[] args) {
		
		//Ŭ���� ����
		//1. Ŭ����
		//2. �������̽�
		//3. �߻� Ŭ����
		//4. enum
		
		//������, Enumeration
		//- ������ ���� ������ �ִ� �ڷ��� > ������(������)
		
		//�䱸����] �Ƿ� ���θ� > Ƽ���� > �� �湮 > ���� ����(����,���,�Ķ�)

		//Case 1.�ְ���. ��Ÿ �߻� Ȯ�� ����
		String color = "����";
		if(color.equals("����")||color.equals("���")||color.equals("�Ķ�")) {
			System.out.println("�Ǹ� ����");
		}else {
			System.out.println("��� ����");
		}
		
		//Case 2. ������
		int input = Color.RED; //Calendar.YEAR
		
		if(input ==0 || input ==1 || input ==2) {
			System.out.println("�Ǹ� ����");
			
		}else {
			System.out.println("��� ����");
		}
		
		//Case 3. enum
		Colour input2 = Colour.RED;
		if(input2==Colour.RED || input2==Colour.YELLOW || input2==Colour.BLUE) {
			System.out.println("�Ǹ� ����");
			
		}else {
			System.out.println("��� ����");
		}
		
		Gender gender = Gender.MALE;
		Gender gender2 = Gender.FEMALE;
		
		
		
		
	}
}


class Color{
	public final static int RED = 0;
	
	public final static int YELLOW = 1;
	
	public final static int BLUE = 2;
	
}

enum Colour{//����� ���� 
	RED, //public final static int RED (����, ����0 ���� ������� �Ҵ�)
	YELLOW, //public final static int YELLOW
	BLUE //public final static int BLUE 
}

enum Gender{
	MALE,
	FEMALE
}

