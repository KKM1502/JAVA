package com.test.question;

public class Q084 {
//	�䱸����
//	Ư�� �ܾ ���峻�� ��ȸ �־��ִ��� ���� ���ÿ�.
//
//	����..
//	��� ���ڿ�: String content = "�ȳ�~ �浿��~ �߰�~ �浿��~";
//	�˻� ���ڿ�: String word = "�浿";
//	���..
//	'�浿'�� �� 2ȸ �߰��߽��ϴ�.

	public static void main(String[] args) {
		
		int count = 0;
		String content = "�ȳ�~ �浿��~ �߰�~ �浿��~";
		System.out.println(content);
		String word = "�浿";
		String result = content.replace(word, "");
		System.out.println(content);
		System.out.printf("'%s'�� �� %dȸ �߰��߽��ϴ�.",word,(content.length()-result.length())/word.length());
		
	}
}
