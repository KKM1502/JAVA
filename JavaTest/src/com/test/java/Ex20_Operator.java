package com.test.java;

import java.util.Scanner;

public class Ex20_Operator {
	
	public static void main(String[] args) {
//		Ex20_Operator
//		������ ����
//	 	1. �ൿ(����)
//	 		a. ��� ������
//	 		b. �� ������
//	 		c. �� ������
//	 		d. ���� ������
//	 		e. ���� ������
//	 		f. ���� ������
//	 	1. ����(�ǿ����� ����)
//	 		a. 1�� ������
//	 		b. 2�� ������
//	 		c. 3�� ������
	
//		������ �켱 ����
//		1. ()
//		2. ��� ������
//			a. *, / , %
//			b. +, -
//		3. �� ������
//		4. �� ������
//		5. ���� ������
		
		
		/*
		 	���� ������, �Ҵ� ������
		 	- =
		 	- +=, -=, *=, /=, %= (���� ���� ������)
		 	- LValue(����) = RValue(����, ���)
		 	- LValue�� RValue�� �ڷ����� �����ؾ��Ѵ�. > ����ȯ
		 	- ���� �������� ������ �켱������ ���� ����.
		 	
		 
		 
		 
		 */
		
		/*
			���� ������
			- ++(����), --(����)
			- 1�� ������
			- �ǿ����ڴ� �������� ������.
			- ���� ������ �Ѵ�. ������ ���� +1, -1�� �Ѵ�.
			
			*** �ǿ������� ��ġ�� �ٲ� �� �ִ�. > ������ �켱������ �޶��� �� �ִ�.
			++n ���� ��ġ(��ġ)
			n++ ���� ��ġ(��ġ) ������ �켱������ ���� ���� 
	 	
	 	
	 
	 
	 
		 */
		int sum = 1 + 2 * 3;
		System.out.println(sum);
		
		//���� ������
		int n = 10;
		
		//�䱸����] n�� 1�� ���Ͻÿ� > n�� ���� 1�� ���ؼ� �ٽ� n�� �־��
		//		> ����(***)

		n +=1;
		System.out.println(n); //11
		
		n=n+1;
		n+=1;
		++n;
		System.out.println(n); //14
		
		n = n -1 ;
		n -= 1;
		--n;
		System.out.println(n);
		
		n=10;
		++n;
		n++;
		System.out.println(n);
		
		
		
		
		
		
		
		n=10;
		int result = 0;
		result = 10 + ++n;
		System.out.printf("result= %d\n",result);
		
		
		//���� (������ ����)
		n=10;
		result = 0;
		++n;
		result = 10 + n;
		System.out.printf("result= %d\n",result);
		
		
		
		
		n=10;
		result = 10 + n++; // ������ ���� (******)
		System.out.printf("result= %d\nn= %d",result,n);
		
		//���� (������ ����)
		n=10;
		result = 10;
		result = 10 + n ;
		n++;
		System.out.printf("result= %d\nn= %d",result,n);
		
		/*
		  	���� ������
		  	- ?:
		  	- A ? B : C
		  	- 3�� ������
		  	- A: ����(boolean)
		  	- B,C: ���(���, ����)
		 */
		
		boolean flag = true;
		String m1 = "��";
		String m2 = "����";

		//					A	?	b	:	C
		String m3 = flag? m1 : m2;
		System.out.println(m3);
		
		//���� > ����?
		Scanner scan = new Scanner(System.in);
		
		System.out.println("����: ");
		int age = scan.nextInt();
		
		System.out.println(age >= 19 ? "���" : "����");
	
		System.out.println(age % 2 == 0 ? "¦��" : "Ȧ��");
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		//��� ������
		//- +
		//- ����+����
		
		//���ڿ� ������
		//- +
		//- ���ڿ� + ���ڿ� 
		//���ڿ� ������
		
		
		//������ ���� ����
		//- ���� �켱������ ������ ������� ��� �������� ����Ǵ���
		//- 1+2+3
		//- ��κ��� �����ڴ� ���� > ������ �������� ����ȴ�.
		//- ���� ������(=)�� ������> ���� �������� ����ȴ�.
		
		
		
		
		
	}
}