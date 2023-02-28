package com.test.question;

public class Note {
	 private String size;
	 private String color;
	 private int page;
	 private String owner;
	 private int price;
	private String thickness;

	   //setter, getter ±¸Çö
	 

	 public String info() {
		 
//		 ¡á¡á¡á¡á¡á¡á ³ëÆ® Á¤º¸ ¡á¡á¡á¡á¡á¡á
//		 ¼ÒÀ¯ÀÚ : È«±æµ¿
//		 Æ¯¼º : ³ë¶õ»ö ¾ãÀº B4³ëÆ®
//		 °¡°Ý : 1,150¿ø
//		 ¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á
//
//		 ¡á¡á¡á¡á¡á¡á ³ëÆ® Á¤º¸ ¡á¡á¡á¡á¡á¡á
//		 ÁÖÀÎ ¾ø´Â ³ëÆ®
//		 ¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á
		 StringBuilder sb = new StringBuilder();
		 sb.append("¡á¡á¡á¡á¡á¡á¡á¡á ³ëÆ® Á¤º¸ ¡á¡á¡á¡á¡á¡á¡á¡á\n" );
		 if(this.owner!=null) {
			
			 sb.append("¼ÒÀ¯ÀÚ : "+this.owner +"\n" );
			 sb.append(String.format("Æ¯¼º : %s %s %s³ëÆ®\n",this.color,this.thickness,this.size));
			 sb.append(String.format("°¡°Ý: %,d¿ø\n", this.price));
		 }else {
			
			 sb.append("ÁÖÀÎ ¾ø´Â ³ëÆ®\n");
			 
		 }
		 sb.append("¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á\n");
		 return sb.toString();
		 
	 }

	 //¾²±âÀü¿ë
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
			System.out.println("Àß¸øµÈ »çÀÌÁî ÀÔ·Â");
		}
		
	}
	public void setColor(String color) {
		String[] list = {"°ËÁ¤»ö", "Èò»ö","³ë¶õ»ö","ÆÄ¶õ»ö"};
		boolean result = false;
		
		for (int i = 0; i < list.length; i++) {
			if(list[i].equals(color)) {
				result= true;
				break;
			}
		}
		
		if (result) {
			
			if(color.equals("°ËÁ¤»ö")) {
				this.price += 100;
			}else if(color.equals("³ë¶õ»ö")) {
				this.price += 200;
			}else if(color.equals("ÆÄ¶õ»ö")) {
				this.price += 200;
			}
			
			this.color = color;
		}else {
			System.out.println("Àß¸øµÈ color ÀÔ·Â");
		}
		
	}
	
	public void setPage(int page)
	{
		if(page>=10&& page<=200) {
			if(page >=10 && page <50) {
				this.thickness = "¾ãÀº";
			}
			else if(page >=51 && page <=100) {
				this.thickness = "º¸Åë";
			}
			else {
				this.thickness="µÎ²¨¿î";
			}
			this.price += (page-10)*10;
			this.page = page;
		}else {
			System.out.println("Àß¸øµÈ ÆäÀÌÁö ÀÔ·Â");
		}
	}
	public void setOwner(String owner) {
		
//		if(owner.length()>=2 &&owner.length()<=5) {//À¯È¿¼º °Ë»ç
//			boolean result = false;
//			
//			for (int i = 0; i < owner.length(); i++) {//À¯È¿¼º °Ë»ç
//				char c = owner.charAt(i);
//				if(c<'°¡'||c>'ÆR') {
//					result = true;
//					break;
//					
//				}
//			}
//			if(!result) {
//				this.owner=owner;
//			}else {
//				System.out.println("Àß¸øµÈ owner ÀÔ·Â");
//			}
//		}else {
//			System.out.println("Àß¸øµÈ owner ÀÔ·Â");
//			
//		}
		if(checkLength(owner)&&checkKorean(owner)) {
			this.owner = owner;
		}else {
			System.out.println("Àß¸øµÈ owner ÀÔ·Â");
		}
		
		
	}
	private boolean checkKorean(String owner) {
		for (int i = 0; i < owner.length(); i++) {//À¯È¿¼º °Ë»ç
			char c = owner.charAt(i);
			if(c<'°¡'||c>'ÆR') {
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
