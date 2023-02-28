package com.test.lambda;

public class Ex87_lambda {

	public static void main(String[] args) {
		/*
		 	-���ٽ��� ����ϸ� �ڵ� �Ϻΰ� ����������.
		 	-���� >> �÷��� ����
		 	
		 	-�ڹ��� �޼ҵ带 ǥ���ϴ� ��� �� �ϳ��� ���
		 	-���ٽ��� �޼ҵ带 ����ϴ� �ڵ���̴�.
		 	-�ڹ��� ���ٽ��� �������̽��� ����ؼ� �����.
		 	-�ڹ��� ���ٽ��� �͸� ��ü�� ����� ǥ���� ����ȭ��Ų ����̴�.
		 	
		 
		 
		 
		 */
		
			//�߻� �޼ҵ� ���Ŀ� �ٶ�...
			// - �Ű����� �ִ³� , ���³�
			// - ��ȯ�� �ִ³� , ���³�
		NoParameterNoReturn pr1 = new NoParameterNoReturn() {
			
			@Override
			public void call() {
				System.out.println("pr1");
			}
		};
		pr1.call();
		
		//�޼ҵ� ������ �ƴ� ������ ����� �۾�
		NoParameterNoReturn pr2 = ()->{ //call
			System.out.println("pr2");
		};
		pr2.call();
		
		//***���ٽ� �����ο� ���๮���� 1���̸� {}�� �����ص� �˴ϴ�.
		NoParameterNoReturn pr3 = () ->System.out.println("pr3");
		pr3.call();
		
		ParameterNoReturn pr4 = (int n) ->{
			System.out.println("pr4: "+n);
		}; 
		pr4.call(100);
		pr4.call(200);
		pr4.call(300);
		
		//***�Ű������� �ڷ����� ������ �� �ִ�.
		ParameterNoReturn pr5 = (n)->{
			System.out.println("pr5: "+n);
		};
		
		//***�Ű������� ()�� ������ �� �ִ�.
		ParameterNoReturn pr6 = n->{
			System.out.println("pr6: "+n);
		};
		ParameterNoReturn pr7 = n->System.out.println("pr6: "+n);
		
		MultiParameterNoReturn pr8 =  (name , age)-> {
			System.out.println("pr8: " +name + age);
		};
		pr8.call("KyeongMin",27);
		
		NoParameterReturn p12 = ()->{
			return 0;
		};
		
		ParameterReturn pr13 = (a,b)-> a+b; //return a+b
		System.out.println("pr13:"+pr13.call(10, 20));
	}//main
	
}


interface MyInterface{
	void test();
}


interface TestInterface{
	void aaa();
	void bbb();
}

interface NoParameterNoReturn{
	void call();
}
interface ParameterNoReturn{
	void call(int n);
}
interface MultiParameterNoReturn{
	void call(String name, int age);
}
interface NoParameterReturn{
	int call();
}
interface ParameterReturn{
	int call(int a, int b);
}





