package com.test.question;

import java.util.Calendar;

public class Bugles {
	   private int price;
	   private int weight;
	   private Calendar creationTime;
	   private int expiration;

	   //getter, setter 구현

	   public void eat() {
		   if(getExpiration() >= 0 ) {
			   System.out.println("과자를 맛있게 먹습니다.");
			   System.out.println();
		   }
		   else{System.out.println("유통기한이 지나 먹을 수 없습니다.");
		   	   System.out.println();
		   }
	   }

	public int getPrice() {
		return price;
	}

	public void setWeight(int weight) {

		boolean result;
		
		if(weight==300||weight==500||weight==850) {
			result =true;
			this.weight = weight;
		}else{
			result = false;
			System.out.println("올바른 weight를 입력해주세요");
		}
		
		if(result) {
			switch(weight) {
			case 300:
				this.price+=850;
				this.expiration=7;//일
				break;
			case 500:
				this.price+=1200;
				this.expiration=10;
				break;
			case 850:
				this.price+=1950;
				this.expiration=15;
				break;
			}
		}
	}

	public void setCreationTime(String date) {
	
		Calendar creationTime = Calendar.getInstance();
		creationTime.set(Integer.parseInt(date.substring(0,4))
				, Integer.parseInt(date.substring(5,7))-1
				, Integer.parseInt(date.substring(8)));

		this.creationTime = creationTime;
		
	}

	public int getExpiration() {
		Calendar now = Calendar.getInstance();
		
		return this.expiration-(int)((now.getTimeInMillis()-creationTime.getTimeInMillis())/1000/60/60/24);
	}

}
