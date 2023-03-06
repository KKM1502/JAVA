package com.test.lambda;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

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
	 		-Funtion ������
	 		
	 	5. Predicate
	 		-Funtion ������
	 		-�ൿ > �Ǵ� ����
	 	
	 	
	 */
	
//		m1();
//		m2();
//		m3();
//		m4();
//		m5();
		m6();
		
		
		
	}

	private static void m6() {
		
		//�Լ��� �������̽� �� �Ϻ� > ���ΰ��� ����� ����  > ���ٽ� ����
		User hong = new User("1", "ȫ�浿", 20, "M", "����", "010-1234-5678");
		
		//����1
		Consumer<User> c1 = user -> System.out.println("�̸�: "+ user.getName());
		c1.accept(hong);
		
		
		//����2
		Consumer<User> c2 = user -> System.out.println("����: "+ user.getAge());
		c2.accept(hong);
		
		//����3. ����1 + ����2 ���ÿ� ���� > ���� c1�� c2�� ����? > �޼ҵ� ����
		test(hong,c1,c2);
		System.out.println();
		
		//c3 = c1+ c2;
		Consumer<User> c3 =  c1.andThen(c2); //c1 �ϰ� c2 �ϱ� 
		c3.accept(hong);
		System.out.println();
		
		Consumer<User> c4 = user -> System.out.println("��ȭ: "+ user.getTel());
		
		Consumer<User> c5 = c1.andThen(c2).andThen(c4); // c1+c2+c4
		c5.accept(hong);
		System.out.println();
		
		//���� ������ �Ұ��� : c1 + c2	
		Consumer<User> c6 = user -> {
			System.out.println("�̸�: "+ user.getName());
			System.out.println("����: "+ user.getAge());
		};
	
		Function<Integer,Boolean> f1 = num -> num>0;
		
		Function<Boolean,String> f2 = result -> result ? "����": "����";
		System.out.println(f2.apply(true));

		//		f1+f2 = f3
		Function<Integer,String> f3 = f1.andThen(f2);
		System.out.println(f3.apply(10));
		
		Predicate<Integer> p1 = num -> num % 2 == 0;
		
		//3�� ���
		Predicate<Integer> p2 = num -> num % 3 == 0;
		
	
		
		int a = 4;
		
		System.out.println(p1.test(a));
		System.out.println(p2.test(a));
		System.out.println();
		Predicate<Integer> p4 = p1.or(p2);
		System.out.println(p4.test(a));
		System.out.println();
		Predicate<Integer> p5 = p1.negate();
		System.out.println(p5.test(a));
		
		
		
		//a�� 2�� 3�� ������ΰ�?
		
		
		
		
	}

	private static void test(User hong, Consumer<User> c1, Consumer<User> c2) {
		c1.accept(hong);
		c2.accept(hong);
	
	}

	private static void m5() {
//		5. Predicate
//		-testXXX() �߻� �޼ҵ� ����
		Function<Integer,Boolean>	f1 = num -> num > 0;
		System.out.println(f1.apply(10));
		System.out.println(f1.apply(-10));
	
		Predicate<Integer> p1 = num -> num > 0;
		System.out.println(p1.test(10));
		BiPredicate<Integer,Integer> p2=(num,b) -> num >b;
		System.out.println(p2.test(1,2));
	}

	private static void m4() {
		
		
		//4. Operator
		//applyXXX() �߻� �޼ҵ� ����
		//�߻� �޼ҵ��� �Ű������� ��ȯ���� �ڷ����� �����ϴ�.
		
		//�����ڿ� �޼ҵ�� ������ ����.
		
		//result = 1 + 1
		//result = sum(1,1)
		
		BiFunction<Integer, Integer, Integer> bf1 = (a,b) -> a+b;
		System.out.println(bf1.apply(10, 20));
		
		BinaryOperator<Integer> bo1 = (a,b) -> a+b;
		System.out.println(bo1.apply(10, 20));
		
		Function<Integer,Integer> bo2 = num -> num*num;
		System.out.println(bo1.apply(10, 20));
		
		
		
	}

	private static void m3() {

		//3. Function
		// -Function<T,R>
		// -BiFunction<T,U,R>
		// -�Ű������� �����ϸ�, ó�� �� �ݰ����� �����ִ� ������ �����ϴ� �������̽�
		// -applyXXX() �߻� �޼ҵ� ����
		
		Function<Integer,Boolean> f1 = num -> num > 0;
		System.out.println(f1.apply(10));
		System.out.println(f1.apply(-10));
		
		Function<String,Integer> f2 = txt -> txt.length();
		System.out.println(f2.apply("ȫ�浿"));
		
		User user = new User("1", "ȫ�浿", 20, "M", "����","010-1234-1234");
		User user2 = new User("2", "ȫ�浿", 20, "F", "����","010-1234-1234");
		
		
		
		Function<User, String> f3 = u ->u.getGender().equals("M")?"����":"����";
		System.out.println(f3.apply(user));
		System.out.println(f3.apply(user2));
		
		BiFunction<Integer, Integer, Integer> bf1 = (a,b)->a+b;
		System.out.println(bf1.apply(10, 20));
		
		BiFunction<Integer, Integer, String> bf2 = (a,b) ->{
			if(a>b) {
				return "ũ��";
			}
			else if(a<b) {
				return "�۴�";
			}
			else{
				return "����";
			}
		};
		System.out.println(bf2.apply(10, 20));
		System.out.println(bf2.apply(10, 10));
		System.out.println(bf2.apply(30, 20));
		

	
	}

	private static void m2() {
		
		//2. Supplier
		//	- �Ű����� ���� ��ȯ���� �����ִ� ������ �����ϴ� �������̽�
		//	- getXXX() �߻� �޼ҵ� ����
		
		Supplier<Integer> s1 = () -> {return 100; };// Supplier�� ���ٽ����� ǥ�� 
		System.out.println(s1.get());
		
		Supplier<Double> s2 = () -> Math.random();
		System.out.println(s2.get());
		
		Supplier<Integer> s3 = () ->{
//			Calendar now = new GregorianCalendar();
			Calendar now = Calendar.getInstance();
			
			return now.get(Calendar.HOUR_OF_DAY);
		};
		System.out.println(s3.get());
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
		
		
		ObjIntConsumer<Integer> oic1 = (a,num) ->{
			
		};
		
		//Consumer<T>		:����
		//BiConsumer<T,U>	:����
		//IntConsumer		:����
		
		
	}
	
	

	
}//main


//���ٽ�
interface MyConsumer{
	void test(int num); // int�� �ؾ� <>�ȿ� Integer �� �ִ� String �� �ִ� ���� ��������
}





