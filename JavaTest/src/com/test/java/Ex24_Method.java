package com.test.java;

public class Ex24_Method {
	public static void main(String[ ] args) {
		
		/*
		  
		  
		  	���������� ����Ű���� ��ȯ�ڷ��� �޼ҵ� (���ڸ���Ʈ){
			
				������
			
			}
		
		*/
		int a =getNum();
		System.out.println(a);
		
		
		String result = checkAge(25);
		System.out.println(result);
	}//main
	
	//This method must return a result of type int
	public static int getNum() {
		
//		���Ϲ�, ��ȯ��
//		-return Ű���� ����Ѵ�,
//		-return ���� �� 1���� �����ִ� ����
		
		
		
		return 10;

		
	}
	public static String checkAge(int age) {
		
		String result = age>=19 ? "����": "�̼�����";
		
		return result;
		
		
	}
	
}
