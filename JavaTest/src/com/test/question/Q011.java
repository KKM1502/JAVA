package com.test.question;

import java.util.Scanner;

public class Q011 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //1
		
		System.out.print("첫번째 숫자: ");//2
		int n1= scan.nextInt(); //3
		System.out.print("두번째 숫자: "); //2
		int n2= scan.nextInt(); //3
		
		String result = "" ;
		
		result = add(n1, n2); 
		System.out.println(result);

		result = subtract(n1, n2);
		System.out.println(result);

		result = multiply(n1, n2);
		System.out.println(result);

		divide(n1, n2);
		
		result = mod(n1, n2);
		System.out.println(result);
		
	
	}//main
	
	public static String add(int n1, int n2) {

		int add = n1 + n2;
		String result ="" ;
		result = n1 + "+" +n2 + "=" + add;		
		return result;
		
	}
	public static String subtract(int n1, int n2) {
		
		int subtract = n1 - n2;
		String result ="" ;
		result = n1 + "-" +n2 + "=" + subtract;		
		return result;
		
	}
	public static String multiply(int n1, int n2) {
		
		int multiply = n1 * n2;
		String result ="" ;
		result = n1 + "*" +n2 + "=" + multiply;		
		return result;
		
	}
	public static void divide(int n1, int n2) {
		
		double divide = (double)n1 / n2;	
		System.out.printf("%d/%d=%.1f\n",n1,n2,divide);
		
	}
	public static String mod(int n1, int n2) {
		
		int mod = n1 % n2;
		String result ="" ;
		result = n1 + "%" +n2 + "=" + mod;		
		return result;
		
	}
	
	
	

}
