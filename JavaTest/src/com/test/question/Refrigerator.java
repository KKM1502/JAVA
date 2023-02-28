package com.test.question;


//����..
//Refrigerator ��ü�� ����
//Item�� �ִ� 100������ ���� �� �ִ�.(��� ���� = Item �迭)
//Refrigerator ��ü�� ���
//Item�� ����� �ִ´�. void add(Item item);
//Item�� ������� ������. Item get(String name);
//����� �ִ� Item�� ������ Ȯ���Ѵ�. int count();
//����� �ִ� Item�� Ȯ���Ѵ�. void listItem();
//Item ��ü�� ����
//��ǰ��, �������


//'��ġ'�� ����� �־����ϴ�. //r.add(item1);
//'��α�'�� ����� �־����ϴ�. //r.add(item2);
//'��ġ����'�� ����� �־����ϴ�. //r.add(item3);
//
//��α��� ������� : 2023-02-27 //printf();
//����� ���� �� ������ ���� : 2�� //printf();
//
//[����� ������ ���] //r.listItem();
//��ġ(2023-03-06) 
//��ġ����(2023-03-01)

public class Refrigerator {
	private Item[] items = new Item[100];
	int count=0;

	public void add(Item item) {
		this.items[count]=item;
	
		System.out.printf("'%s'�� ����� �־����ϴ�.\n",items[count].getName());
		count++;
	}
	   
	public Item get(String name) {
		Item item=null;
		int seat= 0;
		for (int i = 0; i < count; i++) {
			if(this.items[i].getName().equals(name)){
				item = this.items[i]; // �� ������
				seat = i;	//�� �������� ��ġ (�ڸ�)
				this.count--;
				break;
			}
		}
		if(item != null) { //�� �ݺ����� ������ ���������� �Ǹ�
			for (int i = seat; i < count; i++) {
				this.items[i] = this.items[i+1];
				System.out.println("�������");
			}
			
		}
		
		return item;
	}

	public int count() {
		return this.count;
	}
//
	public void listItem() {
		System.out.println("����� ������ ���");
		for (int i = 0; i < count; i++) {
			Item item = this.items[i];
			System.out.printf("%s(%s)\n",item.getName(),item.getExpiration());
		}
		
	}
}

class Item {
	//'��ġ'�� ����� �־����ϴ�. //r.add(item1);
	//'��α�'�� ����� �־����ϴ�. //r.add(item2);
	//'��ġ����'�� ����� �־����ϴ�. //r.add(item3);
	//
	//��α��� ������� : 2023-02-27 //printf();
	//����� ���� �� ������ ���� : 2�� //printf();
	//
	//[����� ������ ���] //r.listItem();
	//��ġ(2023-03-06) 
	//��ġ����(2023-03-01)
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
