package com.test.java;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Ex12_BufferedReader {

	public static void main(String[] args)throws Exception {
	/*
	 	2����Ʈ�� �о� �ѱ��� ������ �ʴ´�. 
	 	�Է� ���� �����ϱ� > reader��� ���� �ȿ� ����ִ�
	 */
	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.print("���� �Է�: ");
//		reader.read();
//		System.in.read();
//		int code = reader.read();
//		
//		System.out.printf("���: %c",code);
//		
//		System.out.println("����");
//		
//		System.out.print("�̸� �Է�: "); //3���� 
//		String name = reader.readLine(); //����ڰ� �Է��� ���ڿ��� ��ȯ 
//		System.out.printf("�ȳ��ϼ��� %s��.",name);
//		
//		System.out.print("���� �Է�: \n"); 
//		String color = reader.readLine(); 
//		System.out.printf("����� �Է��� ������ %s�Դϴ�.",color);
		
		
		//BufferedReader �Է��� ���ڿ� ��ȯ�Ѵ�. > ���ڸ� �Է¹޾ƾ� �Ҷ��� parsexxx() �޼ҵ�� �ڷ��� ��ȯ���Ѿ� �Ѵ�.
		
		
//		System.out.print("���� �Է�:");
//		String input = reader.readLine();	
//		//int num = Integer.parseInt(input); //"50" >50
//		
//		double num = Double.parseDouble(input);
//		System.out.println(100-num);
		
		//�䱸����] ����ڷκ��� ���ڸ� 2�� �Է� > �� ���� ���� ���Ͻÿ�.(���� ����)
		System.out.print("ù��° ���ڸ� �Է����ּ���: ");
		String input1 = reader.readLine();

		System.out.print("�ι�° ���ڸ� �Է����ּ���: ");
		String input2 = reader.readLine();

		int sum = Integer.parseInt(input1)+Integer.parseInt(input2);
		System.out.printf("%s + %s = %d",input1,input2,sum);
		


	}
}
