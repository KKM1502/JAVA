package com.test.file;

import java.io.File;

public class Ex80_file {
	
	private static int fileCount;
	private static int dirCount;
	private static int length;
	
	static {
		fileCount = 0;
		dirCount = 0;
		length = 0;
	}
	
	/*
	 
	 1. ����/���丮 ����
	 	-������ Ž����� �ϴ� �ൿ
	 	- ������ ����
	 	- ������ ����
	 	
	 2. ���� �����
	 	- �޸������� �ϴ� �ൿ
	 	- �ؽ�Ʈ �����
	 	- �޸���, ��Ŭ���� �� �ؽ�Ʈ ������ 
	 
	 
	 */
	
	public static void main(String[] args) {
		
		//���� > ����
//		C:\class\code\java\JavaTest\src\com\test\file\test.txt
		
//		m13();
//		m14();
		
//		m16();
//		m17();
		m18();
		m19();
		//��� �޼ҵ� == Ʈ�� ���� Ž��(����)
		
		
		
		
	}

	private static void m19() {
		//���� ����
		String path = "C:\\Users\\Administrator\\Downloads\\����_���丮_����\\���� ����\\delete";
		File dir = new File(path);
		if(dir.exists()) {
//			System.out.println(dir.delete());
			delete(dir);
			
		}
	}

	private static void delete(File dir) {
		File[] list =dir.listFiles();
		
		for(File file: list) {
			if (file.isFile()) {
				file.delete();
			}
		}
		
		//���
		for(File subdir: list) {
			if (subdir.isDirectory()) {
				delete(subdir);
			}
		}
		
		//ȣ��� ���� >> ���� ��� ����, �ڽ� ���� ���� == ������
		dir.delete();
		
	}

	private static void m18() {
		String path = "C:\\class\\dev\\eclipse";
		File dir = new File(path);

		if(dir.exists()) {
			count(dir);
		}
		System.out.println(fileCount+"��");
		System.out.println(dirCount+"��");
		System.out.println("���� ũ��: "+length+"B");
		System.out.println("���� ũ��: "+length/1024/1024+"MB");
	}

	private static void count(File dir) {
		//C:\class\dev\eclipse > Ž��
		
			//1. ���
			File[] list = dir.listFiles()	;
			
			//2. �ڽ� ���� Ž��, ���� ����
			for(File file : list) {
				if (file.isFile()) {
					fileCount++;
					length += file.length();
				
				}
			}
			// �ڽ� ���� ž�� �ൿ�� �ݺ�
			for (File subdir : list) {
				if(subdir.isDirectory()) {
					dirCount++;
					count(subdir);
				}	
			}

	}
	
	

	private static void m17() {
		
		//C:\class\dev\eclipse > Ž��
		String path = "C:\\class\\dev\\eclipse";
		File dir = new File(path);
		
		int count = 0 ; //��������
		if(dir.exists()) {
			
			File[] list = dir.listFiles();
			for (File file : list) {
				if(file.isFile()) {
					count++;
				}
			}
			//�ڽ� ������ ���ϵ鵵 ������ ���� 
			for(File subdir : list) {
				if(subdir.isDirectory()) {
					File[] sublist = subdir.listFiles();
					for (File subfile : sublist) {
						if(subfile.isFile()) {
							count++;
						}
					}
				}
			}
			System.out.println("�� ������ ����: "+count+"��");
		}
	}

	private static void m16() {
		
		//���丮��!
		int n =4;
		int result = m17(n);
		System.out.println(result);
		
		result = factorial(n);
		System.out.printf("%d! = %d\n",n,result);
	}

	private static int factorial(int n) {
		
		
		return (n==1)?1:n*factorial(n-1);
	}

	private static int m17(int n) {
		System.out.println(n);
		int result = (n==1)? 1 : m17(n-1);
		return result;
	}

//	private static void m14() {
//		m15();
//	}

//	private static void m15() {
//		
//		if) {
//		m15();//���ȣ��
//		}
//		else {
//			
//		}
//	}

	private static void m13() {
//		�޼ҵ� ���+ ���� ���丮 ����
		// ���� + ȣ��
		
		test();
		
		
	}

	private static void test() {
		System.out.println("�޼ҵ� ȣ��");
		test();//�ڱⰡ �ڱ⸦ ȣ�� > �����߻�x > ��� ȣ�� (Recursive Call)
	}
	
}
