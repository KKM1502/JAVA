package com.test.java;

import java.util.Scanner;

public class Ex31_for {
	public static void main(String[] args){
		/*


			
		 */
		//m2();
//		m3();
//		m4();
//		m5();
//		m6();
//		m7();
//		m8();
//		m9();
//		m10();
//		m11();
//		m12();
		m13();		
		
		

	}

	private static void m13() {
		// ���� ���� > �ѱ� ����
		
		Scanner scan = new Scanner(System.in);
//		System.out.print("���� �Է�: ");
//		int num = scan.nextInt();
//		String result = getNum(num);
//		System.out.println(result);
//		
//		
		System.out.print("���� �Է�: ");
		String txt = scan.nextLine();
		String result2 = getText();
		System.out.println(result2);
		
		
	
		
	}

	
	
	private static String getText() {
		
		//������ ������ ��Ÿ�� ������ ����!!
		//1. ������ > �ҽ��� ����� ����
		//2. ��Ÿ�� > ��� ����
		
		//������ ����
		//1. �Ľ� > ���� �м� > ���� �˻�
		//2. ���� �۾�
		
//		int a = 10;
//		int b = 20;
//		System.out.println(a+ b) ; //�����Ϸ� > int + int 
//		//���Ϲ��� �ȸ�����ٰ� ��! 
		
		String txt = "";
		for (int i = 0; i < 3; i++) {
				//"012"
			txt = txt + i; //����
			return txt; //���� ��ȯ + �޼ҵ� ����(Ż��)
			//break
		}
		return ""; // �����δ� ���� ����ȵǴ� ����
	}

	private static String getNum(int i) {
		
		if(i ==1) {
			return "�ϳ�";
		}
		else if(i==2) {
			return "��";
		}
		else if(i==3) {
			return "��";
		}
		else if(i==4) {
			return "��";
		}
		return "������";
		
		
		
	}

	private static void m12() {
		for (int i = 0; i < 10; i++) {
			if(i==16) {
				break;
			}
			if(i ==16 || i ==20) {
				continue;
			}
			System.out.printf("%d�� �л��� ����մϴ�.\n",i);
		}
		
	}

	private static void m11() {
//
		//break		>	��������
		//continue	>	�Ͻ�����
		for (int i = 0; i < 10; i++) {
			if(i == 5) {
			continue; // ������ �ڵ带 �������� �ʰ� �ݺ����� �������� ���ư���
			}
//			System.out.println(i);//Unreachable code
		}
		
	}

	private static void m10() {
		// ����� ���� ���ϴ� ��ŭ �Է� > ���� ���Ͻÿ� 
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		int sum= 0;
		for (;;) {
			System.out.print("����(0�� �Է��ϸ� ����): ");
			int num = scan.nextInt();
			//0�� �Է��ϸ� for�� ���� 
			if(num==0) {
				break;
			}
			sum += num;
			count++;
		}
		System.out.printf("�� %d���� ���ڸ� �Է��߰� �� ���ڵ��� ���� %d�Դϴ�",count,sum);
				
		
		
	}	

	private static void m9() {
		//�б⹮ 
		//-break
		//-continue
		//-���� ��� �Ұ���
		//-�ݺ����� ���� ���
		//break�� if���� �ν����� �ʴ´�.
		
		//BreakPoint >F11(Debug mode)
		System.out.println("����");
		for(int i=1; i<=10; i++) {
			break; //�ڽ��� ���� ����� Ż���Ѵ�.
//			System.out.println(i);//Unreachable code, ���� �ȵ� 
		}
		
	}

	private static void m8() {
		//���� ����, Infinate Loop
		
		//������ ����  >> �뷫 21����� (int�� ǥ�� ������ �� ����)
//		for (int i =0; i<10; i--) {
//			System.out.println("�ȳ��ϼ���");
//		}
		
		//���� ���� �Ϻη� �����
		// > ȸ������ �̸� �����ϱ� ���� ��� ���
//		for(;;) { ���ǽ��� �����ϸ� �ڵ����� true�� ���Եȴ�. > ���ѷ���
//			System.out.println("���� ����");
//		}
	}

	private static void m7() {
		// x*x�� ���
		Scanner scan= new Scanner(System.in);
		System.out.print("������� ��:");
		int x = scan.nextInt();
		System.out.println();
		
		if(x<10) {
			System.out.printf("   %d��\n",x);
			for(int j =1; j<10; j++) {
				System.out.printf("%d * %d = %2d\n",x,j,x * j); 
				}
			}
			else if(x>10){
				System.out.printf("   %d��\n",x);
				for(int j =1; j<=x; j++) {
					System.out.printf("%d * %d = %2d\n",x,j,x * j);
			}
			System.out.println();
		}
		
	}

	private static void m6() {
		// �䱸���� ] �Է¹��� ���� 10���� �� 
			Scanner scan = new Scanner(System.in);
			int sum = 0;
			
			for (int i=0;i<10;i++) {
			System.out.print("����: ");
			int num = scan.nextInt();
			sum+=num;
			}
			System.out.printf("���� %d�Դϴ�.",sum);
			
	}

	private static void m5() {
		// �䱸���� ] 1~ �Է¹��� ���ڱ��� �� 
		Scanner scan = new Scanner(System.in);
		System.out.print("����: ");
		int num = scan.nextInt();
		int sum = 0;
		for (int i=0;i<=num;i++) {
			sum+=i;
		}
		System.out.printf("1���� %d������ ���� %d�Դϴ�.",num,sum);
	}

	private static void m4() {
		// �䱸����] 1~10 ��
		
		int sum = 0;
		for(int i=1;i<=10;i++) {
			
			sum += i;
			System.out.printf("1���� %d���� ��: %d \n",i,sum);

		}
		
	}

	private static void m3() {

		//�ݺ��� > ��������?
		
		//�䱸����] ���� 1~10���� ȭ�� ���
		//�䱸����] ���� 10000���� ����
		int num=1;
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
		System.out.println();
		
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		System.out.println();
		
		for (int i=1; i<=10; i++) {
			System.out.println("���๮" + i);
		}
		System.out.println();
		
		//Ȧ��
		for (int i=1; i<=100; i+=2) {
			System.out.println(i);

		}
		System.out.println();
		
		//¦��
		for (int i=2; i<=100; i+=2) {
			System.out.println(i);
			
		}
		System.out.println();
	}

	private static void m2() {
	
		//�ݺ��� > ȸ����
		for(int i = 1; i<=5; i++) {
			
			System.out.println("���๮ A");	
		}
		for(int i = 3; i<=7; i++) {
			
			System.out.println("���๮ B");	
		}
		
		
		//***************
		for(int i = 0; i < 5; i++) {
			
			System.out.println("���๮ B");	
		}
		
	
		
	}

	private static void m1() {
		/*
	 	for ��
		1. �ʱ�� ����
		2. ���ǽ� ����
			true : ����� ����
			false : for�� ��������
		3. ���๮
		4. ������ ����
		5. ���ǽ� ����

		
	 */
	
	//i : ���� ����(***)
	for (int i =1 ; i<=3 ; i++) {
		//�ʱ��	 :  ���ǽ� ;������
		System.out.println("Hello");	
	}
}
		
	}
