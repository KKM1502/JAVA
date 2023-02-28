package com.test.question;

import java.util.Scanner;

public class Q016 {
	public static void main(String[] args) {
		
		sum(10);
		sum(10, 20);
		sum(10, 20, 30);
		sum(10, 20, 30, 40);
		sum(10, 20, 30, 40, 50);
	}//main
	
	public static void sum(int n) {
		System.out.printf("%d\n",n);
	}
	public static void sum(int n, int n2) {
		System.out.printf("%d+%d=%d\n",n,n2,n+n2);
	}
	public static void sum(int n,int n2, int n3) {
		System.out.printf("%d+%d+%d=%d\n",n,n2,n3,n+n2+n3);		
	}
	public static void sum(int n,int n2, int n3, int n4) {
		System.out.printf("%d+%d+%d+%d=%d\n",n,n2,n3,n4,n+n2+n3+n4);		
	}
	public static void sum(int n,int n2, int n3, int n4,int n5) {
		System.out.printf("%d+%d+%d+%d+%d=%d\n",n,n2,n3,n4,n5,n+n2+n3+n4+n5);		
	}
}
