package com.test.question;

import java.util.Scanner;

public class Q005 {
	public static void main(String[] args) {
		//1.scanner �����ϱ�
		//2.�� ���
		//3.���� Ƚ�� �Է¹ޱ�
//		//4.��n�� ������� ��m(�Ÿ�)= 3.14 * 26(inch) * n 
//			-���� 1:1 �� ��� 1ȸ�� == ������ ���� 1ȸ��
//			-��� ��� ���ڴ� õ���� ǥ���Ͻÿ�.
		//5.��� ���
		
		Scanner scan = new Scanner(System.in); //1 
		
		System.out.print("���� Ƚ��: ");//2
		
		int n= scan.nextInt();//3
		
		double m = 3.14 * 0.6604 * n; //4. ������ * 26inch -> m  *n 
		
	
		System.out.printf("����ڰ� �� %,fȸ ����� ��� �����Ű� �� %,.3fm�� �޷Ƚ��ϴ�.",n,m); //5
		}
}
