package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex17_Casting {

	public static void main(String[] args) throws Exception {
		//Ex17_Casting
		
		//요구사항] 숫자 2개를 입력받아 두 수의 합을 구하시오.
		
		//한번에 import > Ctrl + Shift + o
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("숫자: ");
		String input1 = reader.readLine();
		
		System.out.println("숫자: ");
		String input2 = reader.readLine();
		
		System.out.println(input1 + input2);
		
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		System.out.println(num1 + num2);
		
		//참조형(String0) > 값형
		//- 래퍼클래스.parsexxx()
		
		byte n1 = Byte.parseByte("10");
		short n2 = Short.parseShort("10");
		int n3 = Integer.parseInt("10");
		long n4 = Long.parseLong("10");
		float n5 = Float.parseFloat("10");
		double n6 = Double.parseDouble("10");
		boolean n7 = Boolean.parseBoolean("true");
	
		String s1 = String.valueOf(10);
		String s2 = String.valueOf(3.14);
		String s3 = String.valueOf("true");
		
	}
	
}
