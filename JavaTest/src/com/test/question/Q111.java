package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q111 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ����: ");
		String input = scan.nextLine();
		System.out.print("���� Ȯ����: ");
		String input2 = scan.nextLine();
		
		File dir = new File(input);
		
		File[] list = dir.listFiles()	;
		System.out.println(list);
		for (File file : list) {
			if(file.getName().toLowerCase().endsWith(input2.toLowerCase())) {
				System.out.println(file.getName());
			}
			
		}
		scan.close();
		
		
	}
}
