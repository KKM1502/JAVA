package com.test.question;



//조건..
//Box 객체의 정보
//1Box에는 10개의 마카롱을 담을 수 있다.(멤버 변수 = Macaron 배열)
//Box 객체의 사용
//Box 객체를 생성시 Box에 마카롱 객체를 10개 담는다.(무작위)
//품질 검사에 통과하지 못하는 마카롱을 구분한다.
//Macaron 객체의 정보
//생산 크기(5cm ~ 15cm) → 판매 유효 크기(8cm ~ 14cm)
//생산 색상(red, blue, yellow, white, pink, purple, green, black) → 판매 유효 색상(black을 제외한 모든 색상)
//생산 샌드 두께(1mm ~ 20mm) → 판매 유효 두께(3mm ~ 18mm)

 class Box {
	   private Macaron[] list = new Macaron[10];
	   

	   public void cook() {
		   
		   
	
		   for (int i = 0; i < list.length; i++) {
			   //생산 크기
			   Macaron ran= new Macaron();
			   String[] color = {"red", "blue", "yellow", "white", "pink", "purple", "green", "black"};
			   
			   ran.setSize((int)(Math.random()*11) +5);
			   ran.setColor(color[(int) (Math.random()*color.length)]);
			   ran.setThickness((int)(Math.random()*20)+1);

			   this.list[i] = ran;
			   System.out.printf("%d,%s,%d\n",ran.getSize(),ran.getColor(),ran.getThickness());
			     
		   }
		   System.out.printf("마카롱을 %d개 만들었습니다.\n ",list.length);
		 
	   }
	   public void check() {
		   

		   int pass =0;
		   int failed =0;
		   for (int i = 0; i < list.length; i++) {
			   if(checkSize(list[i].getSize())||checkColor(list[i].getColor())||checkThickness(list[i].getThickness())){
				   failed++;
				   list[i].setResult("불합격"); // 미리 합격, 불합격
			   }
			   else {
				   pass++;
				   list[i].setResult("합격");
			   }
		   }
		   System.out.printf(" QC 합격 개수 : %d개\n",pass);
		   System.out.printf(" QC 불합격 개수 : %d개\n",failed);
		   

	   }
	private boolean checkSize(int size) { //Box 내에서 사용할 메서드 
		if(8>size||size>14) {
			return true;
		}
		else {
			return false;
		}
		
	}
	private boolean checkColor(String Color) { //Box 내에서 사용할 메서드 
		if(Color.equals("black")) {
			return true;
		}
		else {
			return false;
		}
		
	}
	private boolean checkThickness(int thick) { //Box 내에서 사용할 메서드 
		if(3>thick||thick>18) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public void list() {
//		   [마카롱 목록] //box1.list();
//				   1번 마카롱 : 10cm(red, 5mm) : 합격
//				   2번 마카롱 : 12cm(blue, 12mm) : 합격
//				   ..
//				   9번 마카롱 : 13cm(yellow, 2mm) : 불합격
//				   10번 마카롱 : 10cm(black, 6mm) : 불합격
		
		System.out.println("[마카롱 목록]");
		   for (int i = 0; i < list.length; i++) {
//			   if(checkSize(list[i].getSize())||checkColor(list[i].getColor())||checkThickness(list[i].getThickness())){
//
//				   System.out.printf("%d번 마카롱 : %d(%s, %d) : 불합격\n",i,list[i].getSize(),list[i].getColor(),list[i].getThickness());
//			   }
//			   else {
//				   System.out.printf("%d번 마카롱 : %d(%s, %d) : 합격\n",i,list[i].getSize(),list[i].getColor(),list[i].getThickness());
//
//				}
			   System.out.printf("%d번 마카롱 : %d(%s, %d) : %s\n",i,list[i].getSize(),list[i].getColor(),list[i].getThickness(),list[i].getResult());
			   
				  
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
