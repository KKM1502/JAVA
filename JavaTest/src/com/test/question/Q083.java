package com.test.question;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q083 {
//	�䱸����
//	���ϸ� 10���� �Է¹޾� �� Ȯ���ں��� �� ������ ����Ͻÿ�.
//
//	����..
//	Ȯ���ڴ� �������� �����Ѵ�.
//	mp3
//	jpg
//	java
//	hwp
//	doc
//	�Է�..
//	���ϸ�: �αⰡ��.mp3 
//
//	���ϸ�: cat.jpg 
//
//	���ϸ�: Ex01.java 
//
//	���ϸ�: icon.jpg 
//
//	���ϸ�: ����_����.doc 
//
//	���ϸ�: Scanner.java 
//
//	���ϸ�: food.jpg 
//
//	���ϸ�: ��������.hwp 
//
//	���ϸ�: �̷¼�.hwp 
//
//	���ϸ�: ��ݳ���.doc 
//
//	���..
//	mp3 : 1��
//	jpg : 3��
//	java : 2��
//	hwp : 2��
//	doc : 2��
	
	public static void main(String[] args) {
		String[] array = new String[10];
		Scanner scan = new Scanner(System.in);
		
		int count = 1;

		
		
		for (int i = 0; i < 10; i++) {

			System.out.print("���ϸ�: ");
			String input = scan.nextLine();
			System.out.println();
			int index = input.lastIndexOf(".");
			String extention=input.substring(index+1); //����
			array[i]=extention;
			

		}
		Arrays.sort(array,Collections.reverseOrder());	//����
		
		
	
		for (int i = 0; i < array.length; i++) {
			if(i==(array.length-1)) {
				if(array[i].equals(array[i-1])) {
				count++;
				System.out.printf("%s : %d��",array[i],count);
				}
				else {
					System.out.printf("%s : %d��",array[i],count);
				}
				
			}
			
			else {
				if(array[i].equals(array[i+1])) {
					count++;
	
				}
				else{
					System.out.printf("%s : %d��\n",array[i],count);
					count=1;
				}
				
			}
		}
	}
}
	
	

