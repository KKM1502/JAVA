package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex19_Operator {
		public static void main(String[] args) throws IOException {
//			Ex19_Operator
//			������ ����
//		 	1. �ൿ(����)
//		 		a. ��� ������
//		 		b. �� ������
//		 		c. �� ������
//		 		d. ���� ������
//		 		e. ���� ������
//		 		f. ���� ������
//		 	1. ����(�ǿ����� ����)
//		 		a. 1�� ������
//		 		b. 2�� ������
//		 		c. 3�� ������
		
//			������ �켱 ����
//			1. ()
//			2. ��� ������
//				a. *, / , %
//				b. +, -
//			3. �� ������
//			4. �� ������
			
			/*
			�� ������
			- >, >=, <, <=, ==(����, equals), !=(���� �ʴ�. not equals)
			- 2�� ������
			- �ǿ����ڵ��� ���� �񱳸� �ϴ� ������.
			- �ǿ����ڴ� �������� ������.
			- ������ ����� boolean�̴�. (true, false)
			 
			 */

			int a = 10;
			int b = 3;
			
			System.out.println(a>b);
			System.out.println(a>=b);
			System.out.println(a<b);
			System.out.println(a<=b);
			System.out.println(a==b);
			System.out.println(a!=b);
			
			//���α׷� �帧 > ���� ����
			
			//�䱸����] ����� ���� �Է� > ����(19�� �̻�) o,x
			System.out.print("����:");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String input = reader.readLine() ; //����
			
			int age =Integer.parseInt(input);
			
			if(age>=19 && age<60) {
				System.out.println("�հ�");
			}
			else {
				System.out.println("���հ�");
			}
			
			
			boolean b1 = true;
			boolean b2 = true;
			System.out.println(b1 == b2 );
			System.out.println(b1 != b2);
			
			String s1= "ȫ�浿";
			String s2= "ȫ�浿";
			String s3= "�ƹ���";
			String s4= "ȫ";
			s4 = s4 + "�浿";
			
			System.out.println(s1==s2);// true
			System.out.println(s1==s3);// false
			System.out.println(s1==s4);// false
			
			//***���ڿ��� �񱳴� ==, != �����ڸ� ���� ����ϸ� �ȵȴ�.
			//***���ڿ��� �񱳴� equals() �޼ҵ带 ����Ѵ�.
			
			System.out.println();
			System.out.println(s1.equals(s2));//s1==s2
			
			/*
			 
			 �� ������
			 - &&(and), ||(or), !(not)
			 - ��Ʈ������ > &(and),|(or),^(xor) 
			 - 2�� ������ (&&,||)
			 - 1�� ������ (!)
			 - �ǿ������� �ڷ����� boolean�̴�.
			 - ������ ����� boolean�̴�.
			 
			 A && B = ?
			 
			 T && T = T
			 T && F = F
			 F && T = F
			 F && F = F
			 
			 A || B = ?
			 
			 T || T = T
			 T || F = T
			 F || T = T
			 F || F = F
			
			 1 && 1 = 1
			 1 && 0 = 0
			 0 && 1 = 0
			 0 && 0 = 0
			
			 1 || 1 = 1
			 1 || 0 = 1
			 0 || 1 = 1
			 0 || 0 = 0
			 
			 */
			
			
			//boolean�� �ݴ�� ������
			System.out.println(!true);
			System.out.println(!false);
			
			System.out.println(true&true);
			System.out.println(false|true);
			
			
			System.out.println();
			//��Ÿ�� ����
			//- �¿찡 ���� �ٸ� true
			//- ��ȣȭ
			System.out.println(true^true);
			System.out.println(true^false);
			System.out.println(false^true);
			System.out.println(false^false);
			
			
		}
}
