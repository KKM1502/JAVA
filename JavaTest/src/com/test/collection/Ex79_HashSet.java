package com.test.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Ex79_HashSet {
	/*
	 �÷���
	 1. List �迭 (÷�ڰ� �ִ� ������ �ִ� ����)
	 	- ������ �ִ� ����
	 	- ÷��(���ȣ)
	 	- ������ �ߺ��� ����Ѵ�.
	 	
	 	
	 	
	 2. Map �迭 (Ű�� ����� �̷���� ������ ���� �����Դϴ�.)
		 - ������ ���� ����
		 - Ű
		 - ������ �ߺ��� ����Ѵ�.
	 
	 3. Set �迭 (������ �ߺ��� ������� �ʴ� ������ ���� �����Դϴ�.)
	 	- ������ ���� ����
	 	- �ĺ��ڰ� ����. (���ȣx, ���̸�x) > ��� ���� ������ �� ����.
	 	- ������ �ߺ��� ������� �ʴ´�. 
	 	
	 
	 
	 
	 
	 */
	public static void main(String[] args) {
//		m1();
		m2();
		
		
	}

	private static void m2() {
		
		//�ζ� ��ȣ > �ߺ����� �ʴ� ����
		
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		
		for (int i = 0; i < 6; i++) {
			int n = (int)(Math.random()*45)+1; //���ڰ��� �������� �ʴ´�.
//			
//			//�ߺ� �˻�
//			boolean flag = false;
//			for (int j = 0; j < i; j++) {
//				if(lotto.get(j)==n) {
//					flag = true;
//					break;
//				}
//			}
//			if(!flag) {
//				lotto.add(n);//�ߺ����� ���� ���� 
//			}else {
//				i--; //�ߺ��϶� 
//			}
			if(!lotto.contains(n)) {
				lotto.add(n);
			}else {
				i--;
			}
			
		}
		System.out.println(lotto);
		//����
		Collections.sort(lotto);
		System.out.println(lotto);
		
		
		HashSet<Integer> lotto2 = new HashSet<Integer>();
		
		while(lotto2.size()<6) {
			int n = (int)(Math.random()*45)+1;
			lotto2.add(n); // Set�� ���������� �ߺ��� ����

		}
		
		System.out.println(lotto2);
		//����
		//set�� �ݵ�� �����ϰ�ʹ� < set�� list�� ġȯ �� ����
		
		ArrayList<Integer> lotto3 = new ArrayList<Integer>(lotto2);
		Collections.sort(lotto3);
		System.out.println(lotto3);
		
		
		
		
	}

	private static void m1() {
		//���� + ��� > ���� ���� > ���� > �˰���, �ڷᱸ��, ����������, Win32 API(C���)
		
		HashSet<String> set = new HashSet<String>();
		//1.��� �߰��ϱ�
		set.add("���");
		set.add("����");
		set.add("�ٳ���");
		
		//2.��� ����
		System.out.println(set.size());
		
		//3.����
		System.out.println(set);
		
		//4. �ߺ��� �� �߰��ϱ� 
		set.add("���"); //�ȵ� (������ ����� �־..)

		System.out.println(set);
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("���");
		
		
	
	
	}
	
	
}
