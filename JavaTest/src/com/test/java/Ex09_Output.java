package com.test.java;

public class Ex09_Output {

	
	public static void main(String[] args) {
		//printf + ���Ĺ��� > Ȯ����
		
		//1. %����s, %����, %����f, %����b
		//- ����: ����� �ʺ� ����
		//- �ǹ���ó�� ��� ������ ���� �����ϴ� ����
		
		int num= 123;
		System.out.printf("[%d]\n", num);
		System.out.printf("[%10d]\n", num); //10ĭ �ڿ�������
		System.out.printf("[%-10d]\n", num); //10ĭ �տ�������
		
		
		//2. %.����f
		//-�Ҽ��� ���� �ڸ��� ����
		//%10.1f >> 10ĭ , �Ҽ��� 1�ڸ�����(10ĭ �� .�� 1ĭ�� ����)
		double num2 = 3.14;
		System.out.println(num2);
		System.out.printf("%.5f\n",num2);
		System.out.printf("%.1f\n",num2);
		System.out.printf("%.2f\n",num2);
		System.out.printf("%.3f\n",num2);

		System.out.printf("[%10.1f]\n",num2);
		System.out.println();
		
		//3. %,d, %,f
		//- �ڸ��� ǥ�� (õ���� ǥ��, 3�ڸ�)
		
		int price = 1234567;
		System.out.printf("�ݾ�: %d��\n",price);
		System.out.printf("�ݾ�: %,d��\n",price);
		System.out.println();
		
		
		//��ü �ʺ� 20ĭ + õ���� ǥ�� + �Ҽ����� 2�ڸ�����
		double num3 = 1234567.89012345;
		
		System.out.printf("%,20.2f\n", num3);
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		System.out.println("=======================================");
		System.out.println("               ���� ����");
		System.out.println("=======================================");
		System.out.printf("�ݶ� \t\t\t\t%,6d��\n",2500);
		System.out.printf("���̴� \t\t\t\t%,6d��\n",3500);
		System.out.printf("�Ƹ޸�ī�� \t\t\t%,6d��\n",5000);
		System.out.printf("����ũ \t\t\t\t%,6d��\n",12000);
		
	}
	
	
	
}
