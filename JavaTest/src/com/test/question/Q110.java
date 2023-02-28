package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q110 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("파일 경로: ");
		String input = scan.nextLine();
		
		File file = new File(input);
		
		System.out.println("파일명: "+file.getName());
		System.out.println("종류: "+file.getName().substring(file.getName().lastIndexOf(".")+1));
		System.out.println("파일 크기: "+getSize(file.length()));
		
		scan.close();
		
		
		

		
	}

	private static String getSize(long length) {
		
		if(length < 1024) {
			return length + "B";
		}
		else if(length < 1024 * 1024) {
			return String.format("%.1f", length/1024.0) + "KB";
		}
		else if(length < 1024 * 1024 * 1024) {
			return String.format("%.1f", length/1024.0/1024.0) + "MB";
		}
		else if(length < 1024 * 1024 * 1024 * 1024) {
			return String.format("%.1f", length/1024.0/1024.0/1024.0) + "GB";
		}
		else{
			return String.format("%.1f", length/1024.0/1024.0/1024.0/1024.0) + "TB";
		}
	}
}
