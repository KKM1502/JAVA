package com.test.question;



//����..
//Box ��ü�� ����
//1Box���� 10���� ��ī���� ���� �� �ִ�.(��� ���� = Macaron �迭)
//Box ��ü�� ���
//Box ��ü�� ������ Box�� ��ī�� ��ü�� 10�� ��´�.(������)
//ǰ�� �˻翡 ������� ���ϴ� ��ī���� �����Ѵ�.
//Macaron ��ü�� ����
//���� ũ��(5cm ~ 15cm) �� �Ǹ� ��ȿ ũ��(8cm ~ 14cm)
//���� ����(red, blue, yellow, white, pink, purple, green, black) �� �Ǹ� ��ȿ ����(black�� ������ ��� ����)
//���� ���� �β�(1mm ~ 20mm) �� �Ǹ� ��ȿ �β�(3mm ~ 18mm)

 class Box {
	   private Macaron[] list = new Macaron[10];
	   

	   public void cook() {
		   
		   
	
		   for (int i = 0; i < list.length; i++) {
			   //���� ũ��
			   Macaron ran= new Macaron();
			   String[] color = {"red", "blue", "yellow", "white", "pink", "purple", "green", "black"};
			   
			   ran.setSize((int)(Math.random()*11) +5);
			   ran.setColor(color[(int) (Math.random()*color.length)]);
			   ran.setThickness((int)(Math.random()*20)+1);

			   this.list[i] = ran;
			   System.out.printf("%d,%s,%d\n",ran.getSize(),ran.getColor(),ran.getThickness());
			     
		   }
		   System.out.printf("��ī���� %d�� ��������ϴ�.\n ",list.length);
		 
	   }
	   public void check() {
		   

		   int pass =0;
		   int failed =0;
		   for (int i = 0; i < list.length; i++) {
			   if(checkSize(list[i].getSize())||checkColor(list[i].getColor())||checkThickness(list[i].getThickness())){
				   failed++;
				   list[i].setResult("���հ�"); // �̸� �հ�, ���հ�
			   }
			   else {
				   pass++;
				   list[i].setResult("�հ�");
			   }
		   }
		   System.out.printf(" QC �հ� ���� : %d��\n",pass);
		   System.out.printf(" QC ���հ� ���� : %d��\n",failed);
		   

	   }
	private boolean checkSize(int size) { //Box ������ ����� �޼��� 
		if(8>size||size>14) {
			return true;
		}
		else {
			return false;
		}
		
	}
	private boolean checkColor(String Color) { //Box ������ ����� �޼��� 
		if(Color.equals("black")) {
			return true;
		}
		else {
			return false;
		}
		
	}
	private boolean checkThickness(int thick) { //Box ������ ����� �޼��� 
		if(3>thick||thick>18) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public void list() {
//		   [��ī�� ���] //box1.list();
//				   1�� ��ī�� : 10cm(red, 5mm) : �հ�
//				   2�� ��ī�� : 12cm(blue, 12mm) : �հ�
//				   ..
//				   9�� ��ī�� : 13cm(yellow, 2mm) : ���հ�
//				   10�� ��ī�� : 10cm(black, 6mm) : ���հ�
		
		System.out.println("[��ī�� ���]");
		   for (int i = 0; i < list.length; i++) {
//			   if(checkSize(list[i].getSize())||checkColor(list[i].getColor())||checkThickness(list[i].getThickness())){
//
//				   System.out.printf("%d�� ��ī�� : %d(%s, %d) : ���հ�\n",i,list[i].getSize(),list[i].getColor(),list[i].getThickness());
//			   }
//			   else {
//				   System.out.printf("%d�� ��ī�� : %d(%s, %d) : �հ�\n",i,list[i].getSize(),list[i].getColor(),list[i].getThickness());
//
//				}
			   System.out.printf("%d�� ��ī�� : %d(%s, %d) : %s\n",i,list[i].getSize(),list[i].getColor(),list[i].getThickness(),list[i].getResult());
			   
				  
			   }
		   }
   
		   
		   
 }
class Macaron {
	private int size;
	private String color;
	private int thickness;
	private String result;
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getThickness() {
		return thickness;
	}
	public void setThickness(int thickness) {
		this.thickness = thickness;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
}
