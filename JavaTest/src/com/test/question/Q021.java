package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q021 {
	public static void main(String[] args){
//		�䱸����
//		�¾ �⵵�� �Է��ϸ� ���̸� ����Ͻÿ�.
//
//		����..
//		���ظ� �������� ���̸� ����Ͻÿ�.
//		����, ���ĳ⿡ �����ص� �׶��� �´� ���̸� ����Ѵ�.
//		�츮���� ���̷� ����Ͻÿ�.
		
//		�Է�..
//		�¾ �⵵: 1995 
//
//		���..
//		����: 29��
		Scanner scan = new Scanner(System.in);
		System.out.print("�¾ �⵵: ");
		int input = scan.nextInt();
		
		
		Calendar c= Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR)-input+1+"��");
		
	}
}
