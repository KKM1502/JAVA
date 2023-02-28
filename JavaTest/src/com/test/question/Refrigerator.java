package com.test.question;


//조건..
//Refrigerator 객체의 정보
//Item을 최대 100개까지 담을 수 있다.(멤버 변수 = Item 배열)
//Refrigerator 객체의 사용
//Item을 냉장고에 넣는다. void add(Item item);
//Item을 냉장고에서 꺼낸다. Item get(String name);
//냉장고에 있는 Item의 개수를 확인한다. int count();
//냉장고에 있는 Item을 확인한다. void listItem();
//Item 객체의 정보
//식품명, 유통기한


//'김치'를 냉장고에 넣었습니다. //r.add(item1);
//'깍두기'를 냉장고에 넣었습니다. //r.add(item2);
//'멸치볶음'를 냉장고에 넣었습니다. //r.add(item3);
//
//깍두기의 유통기한 : 2023-02-27 //printf();
//냉장고 안의 총 아이템 개수 : 2개 //printf();
//
//[냉장고 아이템 목록] //r.listItem();
//김치(2023-03-06) 
//멸치볶음(2023-03-01)

public class Refrigerator {
	private Item[] items = new Item[100];
	int count=0;

	public void add(Item item) {
		this.items[count]=item;
	
		System.out.printf("'%s'를 냉장고에 넣었습니다.\n",items[count].getName());
		count++;
	}
	   
	public Item get(String name) {
		Item item=null;
		int seat= 0;
		for (int i = 0; i < count; i++) {
			if(this.items[i].getName().equals(name)){
				item = this.items[i]; // 뺄 아이템
				seat = i;	//뺄 아이템의 위치 (자리)
				this.count--;
				break;
			}
		}
		if(item != null) { //위 반복문이 실행이 정상적으로 되면
			for (int i = seat; i < count; i++) {
				this.items[i] = this.items[i+1];
				System.out.println("정상실행");
			}
			
		}
		
		return item;
	}

	public int count() {
		return this.count;
	}
//
	public void listItem() {
		System.out.println("냉장고 아이템 목록");
		for (int i = 0; i < count; i++) {
			Item item = this.items[i];
			System.out.printf("%s(%s)\n",item.getName(),item.getExpiration());
		}
		
	}
}

class Item {
	//'김치'를 냉장고에 넣었습니다. //r.add(item1);
	//'깍두기'를 냉장고에 넣었습니다. //r.add(item2);
	//'멸치볶음'를 냉장고에 넣었습니다. //r.add(item3);
	//
	//깍두기의 유통기한 : 2023-02-27 //printf();
	//냉장고 안의 총 아이템 개수 : 2개 //printf();
	//
	//[냉장고 아이템 목록] //r.listItem();
	//김치(2023-03-06) 
	//멸치볶음(2023-03-01)
	private String name;
	private String expiration;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExpiration() {
		return expiration;
	}
	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}
}
