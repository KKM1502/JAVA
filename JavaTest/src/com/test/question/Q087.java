package com.test.question;

import java.util.Scanner;

public class Q087 {
//	Java �Ʒ��� �䱸������ �����Ͻÿ�.
//	Skill: ���ڿ�
//	�䱸����
//	���ܾ �Է¹޾� �и��Ͻÿ�.
//
//	����..
//	�ռ�� �Է��Ѵ�.
//	�ռ���� �Ľ�Į ǥ������� �Է��Ѵ�.
//	����� �� �ܾ �������� �����Ѵ�.
//	�Է�..
//	�ܾ�: StudentName 
//
//	���..
//	���: Student Name
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�ܾ�: ");
		String input = scan.nextLine();
		int index = 0;
		String text = "";
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i)>'A' && input.charAt(i)<'Z') {
				text+=" "+input.charAt(i);
			}
			else {
				text+=input.charAt(i);
			}
		}
		System.out.println(text);
		
		
		

	}
}


