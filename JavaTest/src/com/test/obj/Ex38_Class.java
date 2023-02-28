package com.test.obj;

public class Ex38_Class {
	public static void main(String[] args) {
	
		/*
		 Ŭ����, Class
		 - �ڵ��� ����
		 - ���� ������ ������ �ڵ��� ����
		 - ������ ����
		 
		 
		 
		 */
		
		//�䱸����] ���� > �츮�� > ��ǥ > ����+���
		
		//Case 1.
		//- ����, ��� ����
		//- �ĺ��� ���� > ���� ������ �����͸� �����ϴ� �ĺ��ڰ� ���� �ٸ� �̸��� ���
		
		//�츮�� ��ǥ
		int x = 100;
		int y = 200;
		System.out.printf("�츮���� [%d, %d]�� ��ġ�մϴ�.\n",x,y)	;
		
		//��Ʈ ��ǥ
		int x2 = 300;
		int y2 = 400;

		//Case 2.
		//- �迭 ���
		//- ����, ��� ����
		//- ������ ���� ���� ����, ���� ���� + ������ ���
		//- �� ���� �����Ͱ� ������ �����. > ��Ҹ� ���ȣ�� �����ϱ� ���� .. 
		
		
		//�츮��
		int[] a1 = {100,200};
		System.out.printf("�츮���� [%d, %d]�� ��ġ�մϴ�.\n",a1[0],a1[1])	;
		
		//��Ʈ
		int[] a2 = {300,400};
		System.out.printf("�츮���� [%d, %d]�� ��ġ�մϴ�.\n",a2[0],a2[1])	;
	
		
		//Case 3.
		//- Ŭ���� ���
		
		//���� ����
		//- �ڷ��� ������;
		int a;
		
		//Ŭ���� ��ü�� = ��ü���������� ������();
		//- Ŭ���� == �ؾƲ == ���赵 == ��� == ���޶��̾�
		//- ��ü == �ؾ == ��ǰ == ȫ�浿 == ����
		Point p1 = new Point();
		
		p1.x = 100;
		p1.y=200;


		Size s1 = new Size();
		s1.name = "��Ʈ��";
		s1.width = 60;
		s1.height = 50;
	
		
		//UML, 
		// - �������� ���̾�׷�
		// - Ŭ���� ���̾�׷�
		// - �������̽� ���̾�׷�
		// - ������ ���̾�׷�
	}//main
}


//class �����ϱ�
//class Ŭ������{
//	public int a ;
//	public int b;
//}

//��ǥ�� �����ϱ� ���� Ŭ����
class Point{
	
	public int x;
	public int y;
	
}

class Size{
	public String name;
	public int width;
	public int height;
}
