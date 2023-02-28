package com.test.java;

public class Ex16_Casting {

	public static void main(String[] args) {
		//Ex16_Casting
		
		//Á¤¼öÇü ¸®ÅÍ·²Àº int
		//½Ç¼öÇü ¸®ÅÍ·²Àº double
		//´ëÀÔ ¿¬»êÀÚ´Â ÁÂ¿ì ÀÚ·áÇüÀÌ µ¿ÀÏÇØ¾ßÇÑ´Ù.
		
		//byte = int
		//ÀÛÀºÇü(1) = Å«Çü(4) > ¸í½ÃÀû Çüº¯È¯
		byte m1 = 10;	
		
		//short = int
		//ÀÛÀºÇü(2) = Å«Çü(4) > ¸í½ÃÀû
		short m2 = 10;
		
		//int = int
		//Çüº¯È¯ ¾øÀ½ 
		int m3 = 10;
		
		//long = int
		//Å«Çü(8) = ÀÛÀºÇü(4) > ¾Ï½ÃÀû
		long m4 = 10;
		
		//float = double
		//ÀÛÀºÇü(4) = Å«Çü(8)
		//float f1 = (float)3.14;
		float f1 = 3.14f;
		double f2 = 3.14;
		
		
		//Á¤¼ö <> ½Ç¼ö
		long n1 = 100;	//¿øº»(8)
		float n2;		//º¹»ç(4)
		
		double n3 = 3.14;
		int n4;
		
		//ÀÛÀºÇü - Å«Çü
		n4 = (int)n3;
		System.out.println(n4);//¼Ò¼öÁ¡ ÀÌÇÏ Àı»è
		
		//Á¤¼ö¿Í ½Ç¼ö°£ÀÇ Å©±â ºñ±³´Â ´Ü¼øÈ÷ ¹°¸® Å©±âÀÌ byte·Î °è»êÇÏ´Â°Ô ¾Æ´Ñ ½ÇÁ¦ Ç¥Çö °¡´ÉÇÑ ¼ıÀÚÀÇ ¹üÀ§·Î Ç¥ÇöÇØ¾ß ÇÑ´Ù.
		
		//Å©±â Á¤¸®
		//byte(1) < short(2) < int(4) < long(8) <<<<<float(4) < double(8)
	
		//char(2byte) = short(2byte)
		
		char c1 = 'A';
		short s1;
		
		s1 = (short)c1;
		System.out.println("s1: "+s1); //'A' > 65
		
		short s2 = 97; //¿øº»
		char c2;
		c2 = (char)s2;	//¸í½ÃÀû º¯È¯
		System.out.println(c2);//97 > 'a'
		
		//*** charÀ» short·Î º¯È¯ÇÏ¸é ¾ÈµÈ´Ù.
		//*** charÀ» ¹®ÀÚÄÚµå·Î º¯È¯ÇÏ·Á¸é int¸¦ »ç¿ëÇÑ´Ù.
		//-char > int
		//- int > char
		
		//¸î¸î ¹®ÀÚÀÇ ÄÚµå ¾Ï±â
		System.out.println((int)'A'); //65
		System.out.println((int)'Z'); //90
		
		System.out.println((int)'a'); //97
		System.out.println((int)'z'); //122
		
		System.out.println((int)'0'); //48
		System.out.println((int)'9'); //57
		
		//ÇÑ±Û Ã¼°è
		//- ¿Ï¼ºÇü ÇÑ±Û(°¡, ³ª, ´Ù, °­...)
		//- Á¶ÇÕÇü ÇÑ±Û(¤¡, ¤¤, ¤¿, ¤Á...) > »ç¿ëx 
		System.out.println((int)'°¡');
		System.out.println((int)'ÆR');
		
		
		
	}
	
	
	
	
	
}
