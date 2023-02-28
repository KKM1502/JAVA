package com.test.obj.type;

import java.sql.Wrapper;

public class Ex69_Generic {

	
	public static void main(String[] args) {
		//클래스 종류
		//1. 클래스
		//2. 인터페이스
		//3. 추상 클래스
		//4. enum
		//5. 제네릭 클래스		
		
		
		//제네릭, Generic
		//1. 제네릭 클래스 > o
		//2. 제네릭 메소드 >
		
		//요구사항] 클래스 설계
		//1. 멤버 변수 선언 > int 
		//2. 멤버 변수를 중심으로 여러가지 행동을 하는 메소드 선언 
		
		//추가사항] String 중심으로 하는 클래스 추가 설계 
		//추가사항] boolean 중심으로 하는 클래스 추가 설계 
		
		WrapperInt n1 = new WrapperInt(10);
		
		System.out.println(n1.getData());
		System.out.println(n1.getData()*2);
		System.out.println(n1.toString());
		System.out.println();
		
		WrapperString s1 = new WrapperString("홍길동");
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
		System.out.println((int)n2.getData()*2); //다운 캐스팅! 뒤의 데이터가 int와 같은지 확인하시오.
		System.out.println(n2.toString());
		System.out.println();
		System.out.println();
		
		WrapperObject s2 = new WrapperObject("아무개");
		System.out.println(s2.getData());
		System.out.println(((String)s2.getData()).length()); //다운 캐스팅! 뒤의 데이터가 string과 같은지 확인하시오.
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
	private int data; //클래스 중심이 되는 데이터
	
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


//타입이 계속 바뀌기 때문에 클래스를 여러개 선언했다 
//				>> 대안! Object를 사용하자
class WrapperString{
	private String data; //클래스 중심이 되는 데이터
	
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
	private boolean data; //클래스 중심이 되는 데이터
	
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



