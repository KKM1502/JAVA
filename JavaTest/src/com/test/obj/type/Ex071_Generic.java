package com.test.obj.type;

public class Ex071_Generic {

	public static void main(String[] args) {
		
//		Item is a raw type. References to generic type Item<T> should be parameterized
		Item item1 = new Item();
		item1.c=100; //object
		
		Item<String> item2 = new Item<String>();
		item2.c="ȫ�浿"; //string
		
		Item<Integer> item3 = new Item<Integer>();
		item3.c=200; //int 
//		Item<int> item4 = new Item<int>(); //Syntax error, insert "Dimensions" to complete ReferenceType
	
		Pen<Boolean> p = new Pen<Boolean>();
		
		p.a = true;
		p.b = false;
		p.c = true;
		
		Desk<Double> d = new Desk<Double>();
		d.set(3.14);
		System.out.println(d.get()*2);
		
		Cup<Integer,String>cup = new Cup<Integer,String>(100,"���ڿ�");
		
		System.out.println(cup.getA());
		System.out.println(cup.getB());
	}
}


//���׸� Ŭ����
//1. T 	: Ÿ�� ���� > �ڷ����� �����ϴ� ���� > �������� �Ұ��� , �������ĸ� ����
//2. <>	: ���� ����Ʈ
class Item<T>{
	public int a;
	public int b;
	public T c; //Ŭ���� ���� ��ÿ��� c�� �ڷ����� �������� ���� > ��ü�� ������ �� ������  
	
}

class Pen<T>{
	
	public T a;
	public T b;
	public T c;
	
}

class Desk<T>{
	
	public T a;
	public void set(T a) {
		this.a = a;
	
		T b; //�������� �ڷ���  > �����, �ܺο� ������ �ȵǾ� ��Ʈ���� �����.
		
	}
	public T get() {
		return this.a;
	}
}

class Cup<T,U>{
	public T a;
	public U b;
	
	public Cup(T a, U b) {
		this.a= a;
		this.b= b;
	}
	
	public T getA() {
		return this.a;
	}
	public U getB() {
		return this.b;
	}
}