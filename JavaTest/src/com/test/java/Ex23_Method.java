package com.test.java;



public class Ex23_Method {
	public static void main(String[ ] args) {
		
//		���������� ����Ű���� ��ȯ�ڷ��� �޼ҵ� (���ڸ���Ʈ){
		
//		����
		
//	}
//	
//	�޼ҵ� ���ڸ���Ʈ
//	-���ڸ���Ʈ, ����(Arguments)
//	-�Ķ����(Parameters)
//	-�Ű�����
//	-�޼ҵ带 ȣ���� �� ���� �����ؼ�, �޼ҵ� ������ ����� �� �ְ� ���ִ� ����
//	-�޼ҵ� Ȱ�뵵�� �����ش�. > �޼ҵ� ���뼺 ���!!!
		hello();
		hello2();
		hello3();
		hi("ȫ�浿");
		hi("�ƹ���");
		hi("����"); //������
		checkAge(25);
		checkAge(14);
		score("����",50,60,70);
		System.out.println();
		score("����",100, 90, 83);
		
	}// main
	
	//�䱸����] ȫ�浿���� �λ縦 �ϴ� �޼ҵ� ���� 
	public static void hello() {
		System.out.println("ȫ�浿�� �ȳ��ϼ���");
	}
	
	//�߰�����] �ƹ������� �λ縦 �ϴ� �޼ҵ� ���� 
	public static void hello2() {
		System.out.println("�ƹ����� �ȳ��ϼ���");
	}
	
	//�߰�����] �츮 ���ǽǿ� �ִ� ��� ������� �λ縦 �ϴ� �޼ҵ带 �����Ͻÿ�.
	public static void hello3() {
		System.out.println("���δ� �ȳ��ϼ���");
	}
	public static void hello4() {
		System.out.println("���ȯ�� �ȳ��ϼ���");
	}
	
	public static void hi(String name) {  // ������
		
		System.out.printf("%s�� �ȳ��ϼ���\n",name);
	}
	
	//�䱸����] ���̸� ���� > ���� or �̼����� �Ǵ�
	public static void checkAge(int age) {
		
		String result = (age>=19? "����":"�̼�����" );
		System.out.printf("�Է��� %d���� %s�Դϴ�.\n",age,result);
	}
	
//	���� �ּ�, Document Comment
//	-����� �ִ� �ּ�(���� ���� ��� ����ϴ� �ּ�)
//	-�� �۾��� ����
	
	/**
	 * ������ ����մϴ�.
	 * @param kor ��������
	 * @param eng ��������
	 * @param math ��������
	 */
	public static void score(String name, int kor, int eng, int math) {
		
		
		System.out.println();
		System.out.println("==================");
		System.out.printf("%s���� ����ǥ\n",name);
		System.out.println("==================");
		System.out.printf("����: \t%7d��\n",kor);
		System.out.printf("����: \t%7d��\n",eng);
		System.out.printf("����: \t%7d��\n",math);
		System.out.printf("����: \t%7d��\n",kor+eng+math);
		System.out.printf("���: \t%7.1f��\n",(kor+eng+math)/3.0);// == (double)(kor+eng+math)/3
	}
	
}//class
