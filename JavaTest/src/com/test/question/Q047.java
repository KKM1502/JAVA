package com.test.question;

import java.util.Scanner;

public class Q047 {
	
	public static void main(String[] args) {
		m2();
	}
	
	private static void m2() {
		//�䱸����] ���Ǳ�
		//- �޴� ��� > ���� ���� > ���� ���
		
		Scanner scan = new Scanner(System.in);
		for(;;){
			System.out.println("==================");
			System.out.println("       ���Ǳ�");
			System.out.println("==================");
			System.out.println("1.�ݶ� : 700��");
			System.out.println("2.���̴� : 600��");
			System.out.println("3.��Ÿ500 : 500��");
			System.out.println("-----------------");
			
			System.out.print("�ݾ� ����(��): ");
			int input = scan.nextInt();
			
			String num1 = scan.nextLine();
			System.out.print("���� ����(��ȣ): ");
			String num = scan.nextLine();
			
			if (num.equals("1") && input>700) {
				System.out.printf("+�ݶ� �����մϴ�.\n+�ܵ� %d���� �����մϴ�.",input-700);
			} else if (num.equals("2")&& input>600) {
				System.out.printf("+���̴ٸ� �����մϴ�.\n+�ܵ� %d���� �����մϴ�.",input-600);
			} else if (num.equals("3")&& input>500) {
				System.out.printf("+��Ÿ500�� �����մϴ�.\n+�ܵ� %d���� �����մϴ�.",input-500);
			} else {
				System.out.println("������ �ݾ��� Ȯ�����ּ���.");
			}
			System.out.println("\n����Ͻ÷��� ���͸� �Է��ϼ���.");
			String conti= scan.nextLine();
			if (conti.equals("\n")) {
				continue;
			}

			
		}
	}

}
