	package com.test.question;

public class Q018 {
	public static void main(String[] args) {
//		����..
//		int positive(int)
//		int positive(int, int)
//		int positive(int, int, int)
//		int positive(int, int, int, int)
//		int positive(int, int, int, int, int)
		
//		ȣ��..
		int count ;
		count= positive(10);
		System.out.printf("%d��\n",count);
		count = positive(10, 20);
		System.out.printf("%d��\n",count);
		count = positive(10, 20, -30);
		System.out.printf("%d��\n",count);
		count = positive(10, 20, -30, 40);
		System.out.printf("%d��\n",count);
		count = positive(10, 20, -30, 40, 50);
		System.out.printf("%d��\n",count);
//		
//		���..
//		���: 1��
//		���: 2��
//		���: 2��
//		���: 3��
//		���: 4��

		
		
	}//main

	private static int positive(int i, int j, int k, int l, int m) {
		int result= 0;
		int a = (i > 0 ? 1 : 0);
		int b = (j > 0 ? 1 : 0);
		int c = (k > 0 ? 1 : 0);
		int d = (l > 0 ? 1 : 0);
		int e = (m > 0 ? 1 : 0);
		
		result +=a+b+c+d+e;
		return result;
	}

	private static int positive(int i, int j, int k, int l) {
		int result= 0;
		int a = (i > 0 ? 1 : 0);
		int b = (j > 0 ? 1 : 0);
		int c = (k > 0 ? 1 : 0);
		int d = (l > 0 ? 1 : 0);
		
		result +=a+b+c+d;
		return result;
	}

	private static int positive(int i, int j, int k) {
		int result= 0;
		int a = (i > 0 ? 1 : 0);
		int b = (j > 0 ? 1 : 0);
		int c = (k > 0 ? 1 : 0);
		
		result +=a+b+c;
		return result;
	}

	private static int positive(int i, int j) {
		int result= 0;
		int a = (i > 0 ? 1 : 0);
		int b = (j > 0 ? 1 : 0);
		result +=a+b;
		return result;
	}

	public static int positive(int i) {
		int result= 0;
		int a = (i > 0 ? 1 : 0);
		result +=a;
		return result;
	}
}
