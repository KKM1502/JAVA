package com.test.lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class Ex90_Lambda {

	public static void main(String[] args) {
		
	/*
	 	
	 	
	 	���ٽ� > �������̽��� �ʿ��ϴ�.
	 	
	 	���ٽ��� ���� > ������( ���꼺)
	 	       ���� > �������̽��� �����ؾ��Ѵ�.
	 	 
	 	*** �ڹٿ��� �������� ������ �߻� �޼ҵ带 ������ �������̽��� �����Ѵ�. >> �Լ��� �������̽�
	 	       
	 	 �Լ��� �������̽� , Function Interface
	 	 - ����� �������̽�
	 	 - ���� : ���ٽ��� �����ϱ� ���ؼ� ������� �������̽�
	 	1. ǥ�� API �Լ��� �������̽�
	 	2. ����� ���� �Լ��� �������̽�
	 
	 
	 	ǥ�� API �Լ��� �������̽�
	 	1. Consumer
	 	
	 	2. Supplier
	 	
	 	3. Function
	 	
	 	4. Operator
	 	
	 	5. Predicate
	 	
	 	
	 	
	 */
	
		m1();
		
	}

	private static void m1() {
		//Consumer
		//- �Ű������� �޾Ƽ� �Һ��ϴ� ������ �����ϴ� �������̽�
		//- acceptXXX() �߻� �޼ҵ� ����
	
		MyConsumer m1 = num -> System.out.println(num);
		
		m1.test(10);
		
		//ǥ�� API �Լ��� �������̽�(Consumer<T>)
		Consumer<Integer> c1 = new Consumer<Integer>(){

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
			
		};
		
		c1.accept(20);
		
		Consumer<String> c2 = txt ->System.out.println(txt); // accept �޼ҵ�
		c2.accept("ȫ�浿");
		
		Consumer<String> c3 = txt -> System.out.println(txt.length());
		c3.accept("ȫ�浿");
		
		Consumer<Integer> c4 = count -> {
			for (int i = 0; i < count; i++) {
				System.out.println(i);
			}
			System.out.println();
		};
		c4.accept(9);
		BiConsumer<String, Integer> bc1 = (name, age) ->{
			System.out.println(name+","+ age+"��");
		};
		bc1.accept("����", 27);
		
		IntConsumer ic1 = num -> System.out.println(num*num);
		ic1.accept(2);
	
		//Consumer<T>		:����
		//BiConsumer<T,U>	:����
		//IntConsumer		:����
		
		
	}
	
	

	
}//main


//���ٽ�
interface MyConsumer{
	void test(int num); // int�� �ؾ� <>�ȿ� Integer �� �ִ� String �� �ִ� ���� ��������
}





