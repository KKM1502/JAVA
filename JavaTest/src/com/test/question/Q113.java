package com.test.question;

import java.io.File;

public class Q113 {

	
	public static void main(String[] args) {
		String path = "C:\\Users\\Administrator\\Downloads\\����_���丮_����\\���� ����";
		File dir = new File(path);
		
		int n = 1;
		File[] list = dir.listFiles();
		for(File file: list) {
			if(file.getName().substring(file.getName().lastIndexOf(".")+1).toLowerCase().equals("mp3")) {
				File temp = new File(path + "\\"+String.format("[%03d]%s",n,file.getName()));
				file.renameTo(temp);
				n++;
			}
		}
		System.out.println("complete");
		
		
	}
	
	
}
