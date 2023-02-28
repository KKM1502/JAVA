package com.test.question;

public class Q044 {
	public static void main(String[] args) {
		String txt="";
		int sum=0;
		for (int i =1;; i++) {
			if(sum+i>1000) {
				txt+=i;
				sum+=i;
				break;
			}
			else{
				txt+=i+" + ";
				sum+=i;
			}
		}
		System.out.printf("%s = %d",txt,sum);
	}
}
