package com.test.obj.inheritage;

public class Ex51_Overriding {
	public static void main(String[] args) {
		/*
		 	메소드 오버로딩, Method Overloading
		 	-과적하다
		 	-메소드 이름 동일 X N개 생성(+인자 리스트)
		 	
		 	
		 	메소드 오버라이딩, Method Overriding
		 	-기각하다, 우선하다
		 	
		 */
		
	//아빠 + 아들 > 마주친 상황
	
		OverridingParent hong = new OverridingParent();
		hong.name="홍길동";
		hong.hello();
		
		OverridingChild jhong = new OverridingChild();
		jhong.name="홍철수";
		jhong.hello();
		
	}
}

class OverridingParent{
	public String name;
	public void hello() {
		System.out.printf("안녕하세요 좋은 아침입니다. 저는 %s입니다.\n",name);
	}
}

class OverridingChild extends OverridingParent{
	//4살 꼬맹이 > 시간이 흘러.. > 중2학년
	//아빠의 인사 방식에 불만
	
	
	
}

