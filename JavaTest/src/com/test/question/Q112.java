package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q112 {
	public static void main(String[] args) {
		String path1 = "C:\\class\\code\\java\\JavaTest\\src\\com\\test\\file\\file\\data.txt";
		String path2 = "C:\\class\\code\\java\\JavaTest\\src\\com\\test\\file\\data.txt";
		
		File file1 = new File(path1);
		File file2 = new File(path2);
		
		System.out.println("���� �̵��� �����մϴ�.");
		if(!file2.exists()) {
			System.out.println("!exist");
			file1.renameTo(file2);
			System.out.println("���� �̵��� �Ϸ��߽��ϴ�.");
			
		}else {
			System.out.println("exist");
			System.out.print("���� �̸��� ������ ������ �̹� �����մϴ�. ������?(y/n) ");
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();
			if(input.equals("y")) {
				file2.delete()	;
				file1.renameTo(file2);
				System.out.println("���� �̵� �Ϸ�");
			}else {
				System.out.println("�۾� ���");
				
			}
			scan.close();

		}
		
	}
}
