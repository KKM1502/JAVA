package com.test.question;

import java.util.Scanner;

public class Q088 {
//	Java �Ʒ��� �䱸������ �����Ͻÿ�.
//	Skill: ���ڿ�
//	�䱸����
//	����� ����ŷ ó�� �Ͻÿ�.
//
//	����..
//	������
//	�ٺ�
//	��û��
//	�Է�..
//	�Է�: �ʶ� �ȳ�� �ٺ���!! 
//
//	���..
//	�ʶ� �ȳ�� **��!!
//	����� 1ȸ ����ŷ�߽��ϴ�.
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�Է�: ");
		String input = scan.nextLine();
	
		String[] ban = {"�ٺ�", "��û��"};
		for (int i = 0; i < ban.length; i++) {
			if(input.contains(ban[i])) {
				System.out.println("h");
				
			}
		}
		System.out.println(input);
		
		
		
		
	}
}
