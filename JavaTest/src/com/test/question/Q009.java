package com.test.question;

public class Q009 {
	public static void main(String[] args) {
		/*
		1.����..
			String getName(String name)
			name: OOO(�̸�)
			return: OOO(�̸�)��
		2.
			ȣ��..
			result = getName("ȫ�浿");
			System.out.printf("��: %s\n", result);

			result = getName("�ƹ���");
			System.out.printf("��: %s\n", result);
		3.
			���..
			��: ȫ�浿��
			��: �ƹ�����

		 */
		
		String result = getName("ȫ�浿");
		System.out.printf("��: %s\n", result);

		String result2 = getName("�ƹ���");
		System.out.printf("��: %s\n", result2);
		
		
	}//main
	public static String getName(String name) {
		
		return name + "��";
	}	
	
	
}
