package com.test.question;

public class Note {
	 private String size;
	 private String color;
	 private int page;
	 private String owner;
	 private int price;
	private String thickness;

	   //setter, getter ����
	 

	 public String info() {
		 
//		 ������� ��Ʈ ���� �������
//		 ������ : ȫ�浿
//		 Ư�� : ����� ���� B4��Ʈ
//		 ���� : 1,150��
//		 �����������������������
//
//		 ������� ��Ʈ ���� �������
//		 ���� ���� ��Ʈ
//		 �����������������������
		 StringBuilder sb = new StringBuilder();
		 sb.append("��������� ��Ʈ ���� ���������\n" );
		 if(this.owner!=null) {
			
			 sb.append("������ : "+this.owner +"\n" );
			 sb.append(String.format("Ư�� : %s %s %s��Ʈ\n",this.color,this.thickness,this.size));
			 sb.append(String.format("����: %,d��\n", this.price));
		 }else {
			
			 sb.append("���� ���� ��Ʈ\n");
			 
		 }
		 sb.append("�����������������������\n");
		 return sb.toString();
		 
	 }

	 //��������
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
			System.out.println("�߸��� ������ �Է�");
		}
		
	}
	public void setColor(String color) {
		String[] list = {"������", "���","�����","�Ķ���"};
		boolean result = false;
		
		for (int i = 0; i < list.length; i++) {
			if(list[i].equals(color)) {
				result= true;
				break;
			}
		}
		
		if (result) {
			
			if(color.equals("������")) {
				this.price += 100;
			}else if(color.equals("�����")) {
				this.price += 200;
			}else if(color.equals("�Ķ���")) {
				this.price += 200;
			}
			
			this.color = color;
		}else {
			System.out.println("�߸��� color �Է�");
		}
		
	}
	
	public void setPage(int page)
	{
		if(page>=10&& page<=200) {
			if(page >=10 && page <50) {
				this.thickness = "����";
			}
			else if(page >=51 && page <=100) {
				this.thickness = "����";
			}
			else {
				this.thickness="�β���";
			}
			this.price += (page-10)*10;
			this.page = page;
		}else {
			System.out.println("�߸��� ������ �Է�");
		}
	}
	public void setOwner(String owner) {
		
//		if(owner.length()>=2 &&owner.length()<=5) {//��ȿ�� �˻�
//			boolean result = false;
//			
//			for (int i = 0; i < owner.length(); i++) {//��ȿ�� �˻�
//				char c = owner.charAt(i);
//				if(c<'��'||c>'�R') {
//					result = true;
//					break;
//					
//				}
//			}
//			if(!result) {
//				this.owner=owner;
//			}else {
//				System.out.println("�߸��� owner �Է�");
//			}
//		}else {
//			System.out.println("�߸��� owner �Է�");
//			
//		}
		if(checkLength(owner)&&checkKorean(owner)) {
			this.owner = owner;
		}else {
			System.out.println("�߸��� owner �Է�");
		}
		
		
	}
	private boolean checkKorean(String owner) {
		for (int i = 0; i < owner.length(); i++) {//��ȿ�� �˻�
			char c = owner.charAt(i);
			if(c<'��'||c>'�R') {
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
