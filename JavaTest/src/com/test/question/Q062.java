package com.test.question;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Q062 {
//	�䱸����
//	�л��� �̸��� N�� �Է¹޾� �Ʒ��� ���� ����Ͻÿ�.
//
//	����..
//	�̸��� �������� �����Ͻÿ�.
//	�Է�..
//	�л� ��: 6 
//
//	�л���: ȫ�浿 
//
//	�л���: �ƹ��� 
//
//	�л���: ������ 
//
//	�л���: ȣȣȣ 
//
//	�л���: ������ 
//
//	�л���: ������ 
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("�л� ��:");
		int num = scan.nextInt();
		String input = scan.nextLine();
		String[] array = new String[num];
		for (int i = 0; i < num; i++) {
			System.out.print("�л���: ");
			String input1 = scan.nextLine();

			array[i]=input1;
		}
		Arrays.sort(array);
		System.out.println();
		
		System.out.printf("�Է¹��� �л��� �� %d�� �Դϴ�.\n",num);
		for(int i=0;i<num;i++) {
			System.out.printf("%d.%s\n",i,array[i]);
			
			
		}
		
		


	}
	
	
}
