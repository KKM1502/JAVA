package com.test.question;

public class Q060 {
//	�䱸����
//	�Ʒ��� ���� ����Ͻÿ�.
//
//	����..
//	������ ���ڰ� 100�� �ѱ� ������ ����Ͻÿ�.
//	���..
//	1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34 + 55 + 89 +  = 232
//  n   n1  n2 
	public static void main(String[] args) {
		
		int n = 1;
		int n1 = 1 ;
		int sum = 2	; // ��
		int n2 = 0;
		System.out.print("1+1");
		while(n+n1<100) {
			n2=n+n1; // 2 , 3
			System.out.printf("+%d",n2);
			sum+=n2;
			n=n1; //1
			n1=n2;  //2 
			
		}
		System.out.printf("=%d",sum);
	}
	
}
