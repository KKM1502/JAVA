package com.test.obj.type;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex70_Object {

	
	
	public static void main(String[] args) {
		
		AAAA a1 = new AAAA();
		
		AAAA a2 = new BBBB();//업캐스팅
		
		AAAA a3 = new CCCC();
		// Object 변수는 모든 것을 담을 수 있는 만능 주머니!
		// 값형 대상 > 박싱, 언박싱 발생!
		// Object 변수 안의 값이 어떤 타입인지 확인하기 힘들다!!  > 다운 캐스팅 오류!
		
		
		Object o1 = new Object();
		
		Object o2 = new AAAA();
		Object o3 = new BBBB();
		Object o4 = new CCCC();
		Object o5 = new Date();
		Object o6 = new Scanner(System.in);
		Object o7 = Calendar.getInstance();
		Object o8 = new BufferedReader(new InputStreamReader(System.in));
		

		System.out.println(o8);
	}
}



class AAAA{
	public String name;
}

class BBBB extends AAAA{
	public int age;
}

class CCCC extends BBBB{
	public String address;
}