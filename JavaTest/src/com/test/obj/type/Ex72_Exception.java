package com.test.obj.type;

import java.util.Scanner;

public class Ex72_Exception {

	public static void main(String[] args) {
		 m1();
	}
	
	
	private static void m1() {
		//�䱸����] ���ڸ� �Է¹޾� ������ �Ͻÿ�.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("����: ");
		int input = scan.nextInt();

		if(input != 0 ) {
			System.out.printf("100/%d = %d\n",input,100/input);
		}else {
			System.out.println("0�� �Է��ϸ� �ȵ˴ϴ�.");
		}
		
		//����� >> ������ ���� 
		
		if(input == 0) {
			System.out.println("0�� �Է��ϸ� �ȵ˴ϴ�.");
		}else {
			System.out.printf("100/%d = %d\n",input,100/input);
		}
		
		
		
//		System.out.println(100/0);
//		System.out.println(100/0.0);
//		System.out.println(0.0/100.0);
		
		//try��
		//- try
		//- catch
		//- finally
		
		try {
			System.out.printf("100/%d = %d\n",input,100/input);
		}catch(Exception e) {
			System.out.println("0�� �Է��ϸ� �ȵ˴ϴ�.");
		}
		//������ �߻��ص� ����ó������ �� �� ���α׷� �帧�� �̾��.
		System.out.println("����");
		
	}
}
