package com.test.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Stream;

import com.test.data.Data;

public class Ex91_Stream {

	public static void main(String[] args) {
		/*
		 
		 	Stream
		 	- Java 8
		 	- �迭(�÷���)�� Ž��(����)
		 	- ���� �����
		 	- ���丮 Ž��
		 	- ����ϰ� �͸� ��ü�� ��� > ���ٽ� ��� + ǥ�� API �Լ� �������̽� ���
		 	
		 	ǥ�� API �Լ��� �������̽�
		 	1. Consumer
		 		- (�Ű�����) -> {};
		 	
		 	2. Supplier
		 		- () -> {return ��;}
		 		
		 	3. Function
		 		-(�Ű�����) -> { return ��; }
		 	
		 	4. Operator
		 		-(�Ű�����) -> {return ��;}
		 		-�Ű������� ��ȯ���� �ڷ����� ����
		 		
		 	5.Predicate
		 		-(�Ű�����) -> { return ��;}
		 		-��ȯ���� �ڷ����� boolean
		 		 
		 		 
		 		 
		 	��Ʈ�� > ������ ����? > ������
		 	
		 	������
		 	- ��Ʈ�� ��ü �޼ҵ�
		 	1. �߰� ������
		 		- ��ȯ�� > ��Ʈ�� ��ȯ
		 		
		 	2. ���� ������
		 		- ��ȯ�� > ��Ʈ�� �ƴ� �ٸ� �ڷ����� ��ȯ or void
		 		
		 	���͸�
		 	- filter() �޼ҵ�
		 	- �߰� ������
		 	- ���� ��Ʈ���� ������ �޾Ƽ� > �˻� > ������ �����ϴ� ��Ҹ� �Ѱ� ��Ʈ������
		 	
		 	
		 	�ߺ� ����
		 	-distinct() �޼ҵ�
		 	
			��ȯ(����)
			- map(), mapXXX()
			- �߰� ������
			- ���� ��Ʈ���� ������ �޾Ƽ� > �ٸ� ������ ��ȯ�� ���ο� ��Ʈ�� ����

			����
			- sorted()
			- �߰� ������
			- ���� ��Ʈ���� ������ �޾Ƽ� > ���ĵ� ������ ���ο� ��Ʈ�� ����
			- ���� �÷����� sort(Comparator)�� ����
			
			��Ī
			- allMatch(), anyMatch(), noneMatch()
			- ���� ������
			- a. boolean allMatch(Predicate): ��� ��Ұ� �����ϴ���? AND����
			- b. boolean anyMatch(Predicate): �Ϻ� ��Ұ� �����ϴ���? OR����
            - c. boolean noneMatch(Predicate): ��� ��Ұ� �Ҹ����ϴ���? ��������

		 	
		 */
//		m2();
//		m1();
	
//		m3();
//		m4();
//		m5();
//		m6();
//		m7();
//		m8();
		m9();
//		m10();
	}

	private static void m9() {

		
	}

	private static void m10() {
		
		//Optional<T>
		//- ���� �ڷ����� ��������� null�� ���� �� �ִ�.
		
		int age = getAge("ȫ�浿");
		System.out.println("����: " + age);

		Optional<Integer> num = getNum("ȫ�浿");
		if(num.isEmpty()) {
			System.out.println("��ȣ: " + num.get());
		}
		else {
			System.out.println("ȸ������");
		}
		
	}
	private static Optional<Integer> getNum(String name){
		
		Optional<Integer> 	num = Optional.empty();
		if(name.equals("ȫ�浿")) {
			num=Optional.of(10);
		}else if(name.equals("�ƹ���")){
			num=Optional.of(220);
		}
		else if(name.equals("ȣȣȣ")){
			num=Optional.of(30);
		}
		return num;
	}

	private static int getAge(String name) {
		int age =0;
		if(name.equals("ȫ�浿")) {
			age = 20;
		}else if(name.equals("�ƹ���")){
			age= 25;
		}
		else if(name.equals("ȣȣȣ")){
			age= 22;
		}
		return age;
	}

	private static void m8() {
	
		int[] nums = {2,3,4,6,8,10};
		
		boolean result = true;
		
		//�迭�ȿ� ¦���� �ִ��� Ȯ��
		
		for (int n : nums) {
			if(n%2==1) {
				result = false;
				break;
			}
		
		}
		if (result) {
			System.out.println("¦���� ����");
			
		}else {
			System.out.println("Ȧ�� �߰�!");
		}
	
		result = Arrays.stream(nums).allMatch(n -> n%2 ==0);
		System.out.println(result); //false
		
		result = Arrays.stream(nums).anyMatch(n -> n%2 ==1);
		System.out.println(result);	//true
		
		result = Arrays.stream(nums).noneMatch(n -> n%11 ==0);
		System.out.println(result);	//true
	
	
	}

	private static void m7() {
		List<String> list = new ArrayList<String>(10);
		list.add("ȫ�浿");
		list.add("����");
		list.add("��ȫö");
		list.add("���缮");
		list.add("���ؼ�");
		list.add("����ȣ");
		list.add("������");
		list.add("�迵��");
		list.add("�迵����");
		list.stream().sorted().forEach(name->System.out.println(name));
		System.out.println();
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
		list.stream().sorted((a,b) -> a.charAt(0)>=b.charAt(0)? -1: 1).forEach(name->System.out.println(name));
	
		
		List<Integer> list1 = new ArrayList<Integer>(10);
		list1.add(70);
		list1.add(80);
		list1.add(50);
		list1.add(60);
		list1.add(40);
		list1.add(90);
		list1.add(30);
		list1.add(20);
		list1.add(10);
		Collections.sort(list1);//�������� (a,b) -> a-b
		System.out.println(list1);	
		Collections.sort(list1, (a,b) -> b-a);//��������
		System.out.println(list1);
		
		list1.sort(Comparator.naturalOrder());
		System.out.println(list1);	
		list1.sort(Comparator.reverseOrder());
		System.out.println(list1);
		
		Optional<Integer> result = list1.stream().max((a,b)->a-b);
		System.out.println(result);
		
	}
	
	
	

	private static void m6() {
		
		List<String> list = new ArrayList<String>(10);
		list.add("ȫ�浿");
		list.add("����");
		list.add("��ȫö");
		list.add("���缮");
		list.add("���ؼ�");
		list.add("����ȣ");
		list.add("������");
		list.add("�迵��");
		list.add("�迵����");
		
		System.out.println(list);
		System.out.println();
		
		list.stream().forEach(word -> System.out.print(word.length()));
		System.out.println();
		
		list.stream().map(word -> word.length()).forEach(num->System.out.print(num));
		System.out.println();
		
		list.stream().map(word -> word.substring(0,2)).forEach(word->System.out.print(word+" "));
		
		
		String[] names = {"ȫ�浿", "���缮", "�ڸ��", "�ڳ���", "�嵵��"};
		Arrays.stream(names).map(name ->name.substring(1)).forEach(name->System.out.print(name+"  "));
		System.out.println();
		
		for (int i = 0; i < names.length; i++) {
			
			String firstName = names[i].substring(1);//��
			String lastName = names[i].substring(0,1);//�̸�
			
			Name name = new Name();
			name.setFirstName(firstName);
			name.setLastName(lastName);
			System.out.println(name.getFirstName() + ","+name.getLastName());
		}
		
		System.out.println();
		
		Arrays.stream(names).map(name->{
			String firstName = name.substring(1);//��
			String lastName = name.substring(0,1);//�̸�
			Name result = new Name();
			result.setFirstName(firstName);
			result.setLastName(lastName);
			return result;
		}).forEach(name -> {
			System.out.println(name.getFirstName() + ","+name.getLastName());
		});
		
		
		Data.getIntList(5)
		.stream()
		.map(num ->1)	//�����ȯ , �������
		.forEach(n->System.out.println(n));
		
		
		
		
		
		
		
		
		
		
	
	}

	private static void m5() {
		ArrayList<Integer> list =new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			list.add((int)(Math.random()*10)+1);
			
		}
		System.out.println(list);
		System.out.println(list.size());
		System.out.println();
		
		//Set ���
		Set<Integer> set = new HashSet<Integer>();
		for (int n : list) {
			set.add(n);
		}
		System.out.println(set);
		System.out.println(set.size());
		
		list.stream().distinct().forEach(num->System.out.printf("%3d",num));
		System.out.println();
		System.out.println(set.size());
		System.out.println();
		
		
		
	}

	private static void m4() {
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(91);
				
		list.stream().filter(num-> num%2 ==0).forEach(num->System.out.printf("%4d",num));
		System.out.println();
		System.out.println();
		
		
		ArrayList<String> list1 =new ArrayList<String>();
		list1.add("ȫ�浿");
		list1.add("����");
		list1.add("��ȫö");
		list1.add("���缮");
		list1.add("���ؼ�");
		list1.add("����ȣ");
		list1.add("������");
		list1.add("�迵��");
		list1.add("�迵����");
		list1.stream().filter(word->word.length() <4).filter(word->word.startsWith("��")).forEach(word->System.out.println(word));
		System.out.println();

		
	
	}

	private static void m3() {
		//��Ʈ���� ������ ��
		//1. �÷������κ���
		//2. �迭�κ���
		
		
//		Path dir = Path.get("C:\\Users\\Administrator\\Documents\\Warcraft III\\CustomMapData\\ORD10");
//		Files.list(dir).forEach(p->{
//			System.out.println(p.getFileName());
//			System.out.println(p.toFile().length());
//		});
	}

	private static void m2() {
		int[] num1 = Data.getIntArray();
		System.out.println(Arrays.toString(num1));
	}

	private static void m1() {
		
		List<Integer> list= Data.getIntList(10);
		System.out.println(list);
		Stream<Integer> stream = list.stream();
		
		Consumer<Integer> c1 = num -> System.out.println(num);
		
		//forEach �޼ҵ��� �ൿ >> �迭�κ��� ������ ������ ���޹���
		//1. stream > �迭�α��� ������ ������ ���޹޴´�.
		//2. forEach > ���޹��� �����͸� �ϳ��� ó��
		//3. Consumer > forEach�� �ϳ��� ������ �����͸� ������ ó��(x) > �����ӿ��� ���� + ó��
		stream.forEach(c1);  //�迭 Ž�� > c1.accept(n) x 10ȸ ȣ��
		
		List<Double> list2= Data.getDoubleList(10);
		Stream<Double> stream2 = list2.stream();
		Consumer<Double> c2= num -> System.out.println(num); 
		stream2.forEach(c2);
		
		System.out.println();
		System.out.println();
		System.out.println();

		//�޼ҵ� ü��
		//- �޼ҵ��� ��ȯ���� �ٷ� �� �ٸ� �޼ҵ带 �����Ų ���
		//- �Լ��� ���α׷��� ���
		Data.getDoubleList(10).stream().forEach(num -> System.out.println(num));
	
	}

	
}

class Name {
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}



