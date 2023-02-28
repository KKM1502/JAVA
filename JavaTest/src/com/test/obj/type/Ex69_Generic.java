package com.test.obj.type;

import java.sql.Wrapper;

public class Ex69_Generic {

	
	public static void main(String[] args) {
		//Ŭ���� ����
		//1. Ŭ����
		//2. �������̽�
		//3. �߻� Ŭ����
		//4. enum
		//5. ���׸� Ŭ����		
		
		
		//���׸�, Generic
		//1. ���׸� Ŭ���� > o
		//2. ���׸� �޼ҵ� >
		
		//�䱸����] Ŭ���� ����
		//1. ��� ���� ���� > int 
		//2. ��� ������ �߽����� �������� �ൿ�� �ϴ� �޼ҵ� ���� 
		
		//�߰�����] String �߽����� �ϴ� Ŭ���� �߰� ���� 
		//�߰�����] boolean �߽����� �ϴ� Ŭ���� �߰� ���� 
		
		WrapperInt n1 = new WrapperInt(10);
		
		System.out.println(n1.getData());
		System.out.println(n1.getData()*2);
		System.out.println(n1.toString());
		System.out.println();
		
		WrapperString s1 = new WrapperString("ȫ�浿");
		System.out.println(s1.getData());
		System.out.println(s1.getData().length());
		System.out.println(s1.toString());
		System.out.println();
		
		WrapperBoolean d1 = new WrapperBoolean(true);
		System.out.println(d1.getData());
		System.out.println(!d1.getData());
		System.out.println(d1.toString());
		System.out.println();
		
		
		WrapperObject n2 = new WrapperObject(20);
		System.out.println(n2.getData());
		System.out.println((int)n2.getData()*2); //�ٿ� ĳ����! ���� �����Ͱ� int�� ������ Ȯ���Ͻÿ�.
		System.out.println(n2.toString());
		System.out.println();
		System.out.println();
		
		WrapperObject s2 = new WrapperObject("�ƹ���");
		System.out.println(s2.getData());
		System.out.println(((String)s2.getData()).length()); //�ٿ� ĳ����! ���� �����Ͱ� string�� ������ Ȯ���Ͻÿ�.
		System.out.println(s2.toString());
		System.out.println();
		
		WrapperObject b2 = new WrapperObject(false);
		System.out.println(b2.getData());
		System.out.println(!(boolean)b2.getData()); 
		System.out.println(b2.toString());
		System.out.println();
		
	
		
		
		
		
	}//main
}//main class


class WrapperInt{
	private int data; //Ŭ���� �߽��� �Ǵ� ������
	
	public WrapperInt(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		
		return "data=" + this.data;
	}
}


//Ÿ���� ��� �ٲ�� ������ Ŭ������ ������ �����ߴ� 
//				>> ���! Object�� �������
class WrapperString{
	private String data; //Ŭ���� �߽��� �Ǵ� ������
	
	public WrapperString(String data) {
		this.data = data;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		
		return "data=" + this.data;
	}
}

class WrapperBoolean{
	private boolean data; //Ŭ���� �߽��� �Ǵ� ������
	
	public WrapperBoolean(boolean data) {
		this.data = data;
	}
	
	public boolean getData() {
		return data;
	}
	
	public void setData(boolean data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		
		return "data=" + this.data;
	}
}

class WrapperObject{
	private Object data;

	public WrapperObject(Object data) {
		this.data = data;
	}
	
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	public String toString() {
		return "data=" + data;
	}
	
}



