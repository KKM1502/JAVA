package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q112 {
	public static void main(String[] args) {
		String path1 = "C:\\class\\code\\java\\JavaTest\\src\\com\\test\\file\\file\\data.txt";
		String path2 = "C:\\class\\code\\java\\JavaTest\\src\\com\\test\\file\\data.txt";
		
		File file1 = new File(path1);
		File file2 = new File(path2);
		
		System.out.println("파일 이동을 실행합니다.");
		if(!file2.exists()) {
			System.out.println("!exist");
			file1.renameTo(file2);
			System.out.println("파일 이동을 완료했습니다.");
			
		}else {
			System.out.println("exist");
			System.out.print("같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n) ");
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();
			if(input.equals("y")) {
				file2.delete()	;
				file1.renameTo(file2);
				System.out.println("파일 이동 완료");
			}else {
				System.out.println("작업 취소");
				
			}
			scan.close();

		}
		
	}
}
