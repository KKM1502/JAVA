package com.test.question;

public class Note {
	 private String size;
	 private String color;
	 private int page;
	 private String owner;
	 private int price;
	private String thickness;

	   //setter, getter 구현
	 

	 public String info() {
		 
//		 ■■■■■■ 노트 정보 ■■■■■■
//		 소유자 : 홍길동
//		 특성 : 노란색 얇은 B4노트
//		 가격 : 1,150원
//		 ■■■■■■■■■■■■■■■■■■■■■■
//
//		 ■■■■■■ 노트 정보 ■■■■■■
//		 주인 없는 노트
//		 ■■■■■■■■■■■■■■■■■■■■■■
		 StringBuilder sb = new StringBuilder();
		 sb.append("■■■■■■■■ 노트 정보 ■■■■■■■■\n" );
		 if(this.owner!=null) {
			
			 sb.append("소유자 : "+this.owner +"\n" );
			 sb.append(String.format("특성 : %s %s %s노트\n",this.color,this.thickness,this.size));
			 sb.append(String.format("가격: %,d원\n", this.price));
		 }else {
			
			 sb.append("주인 없는 노트\n");
			 
		 }
		 sb.append("■■■■■■■■■■■■■■■■■■■■■■\n");
		 return sb.toString();
		 
	 }

	 //쓰기전용
	public void setSize(String size) {
		String[] list = {"A3", "A4","A5","B3","B4","B5"};
		boolean result = false;
		
		for (int i = 0; i < list.length; i++) {
			if(list[i].equals(size)) {
				result= true;
				break;
			}
		}
		
		if (result) {
			switch(size) {
			case "A3":
				this.price+=900;
				break;
			case "A4":
				this.price+=700;
				break;
			case "A5":
				this.price+=500;
				break;
			case "B3":
				this.price+=1000;
				break;
			case "B4":
				this.price+=800;
				break;
			case "B5":
				this.price+=600;
				break;
			}
			this.size = size;
		}else {
			System.out.println("잘못된 사이즈 입력");
		}
		
	}
	public void setColor(String color) {
		String[] list = {"검정색", "흰색","노란색","파란색"};
		boolean result = false;
		
		for (int i = 0; i < list.length; i++) {
			if(list[i].equals(color)) {
				result= true;
				break;
			}
		}
		
		if (result) {
			
			if(color.equals("검정색")) {
				this.price += 100;
			}else if(color.equals("노란색")) {
				this.price += 200;
			}else if(color.equals("파란색")) {
				this.price += 200;
			}
			
			this.color = color;
		}else {
			System.out.println("잘못된 color 입력");
		}
		
	}
	
	public void setPage(int page)
	{
		if(page>=10&& page<=200) {
			if(page >=10 && page <50) {
				this.thickness = "얇은";
			}
			else if(page >=51 && page <=100) {
				this.thickness = "보통";
			}
			else {
				this.thickness="두꺼운";
			}
			this.price += (page-10)*10;
			this.page = page;
		}else {
			System.out.println("잘못된 페이지 입력");
		}
	}
	public void setOwner(String owner) {
		
//		if(owner.length()>=2 &&owner.length()<=5) {//유효성 검사
//			boolean result = false;
//			
//			for (int i = 0; i < owner.length(); i++) {//유효성 검사
//				char c = owner.charAt(i);
//				if(c<'가'||c>'힣') {
//					result = true;
//					break;
//					
//				}
//			}
//			if(!result) {
//				this.owner=owner;
//			}else {
//				System.out.println("잘못된 owner 입력");
//			}
//		}else {
//			System.out.println("잘못된 owner 입력");
//			
//		}
		if(checkLength(owner)&&checkKorean(owner)) {
			this.owner = owner;
		}else {
			System.out.println("잘못된 owner 입력");
		}
		
		
	}
	private boolean checkKorean(String owner) {
		for (int i = 0; i < owner.length(); i++) {//유효성 검사
			char c = owner.charAt(i);
			if(c<'가'||c>'힣') {
				return false;
			
				
			}
		}
		return true;
	}

	public boolean checkLength(String owner) {
		 if (owner.length()>=2 && owner.length()<=5){
			 return true;
		 }
		 else {
			 return false;
		 }
	}
	
}
