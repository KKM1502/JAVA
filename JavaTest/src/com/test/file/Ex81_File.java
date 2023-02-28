package com.test.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class Ex81_File {

	public static void main(String[] args) {
		/*
		 	1. ����/���丮 ����
		 	2. ���� �����
		 		a. �ؽ�Ʈ �����(����)
		 			-�޸���
		 			-���� ���α׷� < - > (������) < - > ���������ġ
		 		b. ���ؽ�Ʈ �����
		 			-�׸���
		 			-������ �÷��̾�
		 			-���� �÷��̾�
		 	
		 	���� ��ġ
		 	-������ 1,0���� ����
		 	-������ �ڷ��� ����(x) > ��� �� ���ڿ��� ���� > ���� �ڵ�� ����

		 			
		 	���ڵ�, Encoding
		 	-���� �ڵ�(���� ���α׷� ������)�� ��ȣȭ(1,0) ��Ű�� �۾�
		 	-�ڹ� ���α׷�("ȫ�浿") > �ؽ�Ʈ����(100100100010)
		 	
		 	���ڵ�, Decoding
		 	-��ȣ �����͸� ���� �ڵ�� ��ȯ�ϴ� �۾�(��ȣȭ)
		 	- �ؽ�Ʈ����(100100100010) > �ڹ� ���α׷�("ȫ�浿")
		 	
		 	���ڵ�/���ڵ� ��Ģ
		 	1.ANSI
		 	4.ISO-8859-1
		 	5.EUC-KR
		 	6.MS949
		 	--------------
		 	2.UTF-8
		 	--------------
		 	3.UTF-16
		 	
		 	ANSI
		 	- ����(������ ����, ����, Ư������, ����� ��): 1byte
		 	- �ѱ�(�Ϻ���, ���� ��): 2byte
		 	
		 	UTF-8
		 	- ����: 1byte
		 	- �ѱ�: 3byte
		 	
		 	UTF-16
		 	- ����: 2byte
		 	- �ѱ�: 2byte
		 	
		 */
//		m1();
//		m2();
//		m5();
//		m6();
//		m7();
		m10()	;
		
	}
	private static void m10() {
	      
	      //���� ������ �����
	      String[] names = { "��", "��", "��", "��", "��", "��", "��", "��", "��", "��" };
	      
	      try {
	         
	         //. : ���� ���α׷��� �ִ� ����
	         //�ڹ� �ܼ� ���α׷� > ���� ��ġ > ������Ʈ ����
	         BufferedWriter writer 
	            = new BufferedWriter(new FileWriter(".\\dat\\score.txt"));
	         
	         for (int i=0; i<30; i++) {
	            
	            String name = "";
	            
	            name = names[(int)(Math.random() * names.length)]
	                  + names[(int)(Math.random() * names.length)]
	                  + names[(int)(Math.random() * names.length)];
	            
	            int kor = (int)(Math.random() * 61) + 40;
	            int eng = (int)(Math.random() * 61) + 40;
	            int math = (int)(Math.random() * 61) + 40;
	            
	            writer.write(String.format("%s,%d,%d,%d\r\n"
	                                 , name, kor, eng, math));
	            
	         }
	         
	         writer.close();
	         
	         System.out.println("���� ������ ���� �Ϸ�!!!");
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      
	   }
	private static void m7() {
		//FileOutputStream 	> FileWriter > BufferedWriter (����)
		//FileInputStream 	> FileReader > BufferedReader (����)
		
		//���Ͼ���
		
		
	
	}
	private static void m6() {
		try {
			//���� �б� > ���� ��� �Է�
			Scanner scan = new Scanner(System.in);
			System.out.print("���� ���: ");
			String input = scan.nextLine();

			FileReader reader = new FileReader(input);
			
			int code = -1;
			while((code=reader.read()) != -1) {
				System.out.print((char)code);
			}
			reader.close();
			scan.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	private static void m5() {
		
		try {
			FileReader reader = new FileReader("C:\\class\\code\\java\\JavaTest\\src\\com\\test\\file\\file\\data.txt");
			int code = -1;
			
			while((code = reader.read()) != -1  ) {//������ �о��µ� ���ڰ� ������ -1 ��ȯ 
				System.out.print((char)code);
			}
					
			reader.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void m2() {
		
		//���� �б�
		//- �б� ��Ʈ�� ��ü 
		
	}
	private static void m1() {
		//���� ����
		//- ���� ��Ʈ�� ��ü
		
		//���� ���� ���
		
		//1. ����� ���(�⺻)
		
		//2. �̾�� ���
		//	-���� ���� + �ڵ�
		//	-���� ������	>	������ �״�� ���
		//	-���� ������	> 	������ ���� ����
		
		try {
		
			//�����͸� ������ ������ ����
			File file = new File("C:\\class\\code\\java\\JavaTest\\src\\com\\test\\file\\file\\data.txt");
			
			//������ ������ ��Ʈ�� ��ü ����
			//- ���� �ȱ�
			//- ��Ʈ�� ���� (�� �ݾ���)
			FileOutputStream stream = new FileOutputStream(file,true); // �̾�� false=�����
			
			//���� > �����ڵ尪'A'
//			stream.write(68);
//			stream.write(69);
//			stream.write(70);
			
//			stream.write('J');
//			stream.write('a');
//			stream.write('v');
//			stream.write('a');
//			
			//byte[] list = { 'A', 'B', 'C' };
			//stream.write(list)
		
			String txt = "Java Programming";
			
			stream.write(txt.getBytes());
			
			
			//-��Ʈ�� �ݱ�(����������)
			stream.close();
			
		}	catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
