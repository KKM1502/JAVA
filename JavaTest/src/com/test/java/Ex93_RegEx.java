package com.test.java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex93_RegEx {
	public static void main(String[] args) {
		
		/*
		 
		 Á¤±Ô Ç¥Çö½Ä, Regular Expression
		 - Á¤±Ô½Ä
		 - "Æ¯Á¤ ÆĞÅÏ"ÀÇ ¹®ÀÚ¿­À» °Ë»öÇÏ´Â µµ±¸
		 - ÀÚ¹Ù(X)
		 - ¾ğ¾î/±â¼ú¿¡ µ¶¸³ÀûÀÎ º°µµÀÇ ±æ¼ö
		 - À¯´Ğ½º
		 
		 
		 3 ÃâÇö¤¾±±¼ö
		 - ¹Ù·Î ¾ÕÀÇ ¹®ÀÚÀÇ ÃâÇö È½¼ö¸¦ Ç¥Çö
		 
		 	3.1 »ı·«
		 	
		 	3.2 ?
		 		- ¹Ù·Î ¾ÕÀÇ ´ë»óÀÇ ÃâÇö È½¼ö°¡ »ı·«O, Áßº¹X
		 		- ÃâÇö È½¼ö: 0~1
		 		ex) "a?bc" > ab,abc,abbc,ac,bc,bbc,aaabc
		 		 	- "abc"
		 		 	- "bc"
		 		 
		 	3.3 +
		 		- ¹Ù·Î ¾ÕÀÇ ´ë»óÀÌ »ı·«x, Áßº¹o
		 		- ÃâÇö È½¼ö : 1~¹«ÇÑ´ë
		 			ex) "a+bc" > ab,abc,abbc,ac,bc,bbc,aaabc,aaaaaaaaaaaaaaaaaaaaaaabc
		 			ex) (ÀÚ¹Ù)+ÄÚµå>ÀÚ¹ÙÄÚµå ÀÚÄÚµå ¹ÙÄÚµå ÀÚ¹ÙÄÚµå ÄÚµå ÀÚ¹ÙÀÚ¹ÙÄÚµå ÀÚ¹ÙÀÚ¹ÙÀÚ¹ÙÄÚµå
		 	
		 	3.4 *
		 		- ¹Ù·Î ¾ÕÀÇ ´ë»óÀÌ »ı·«o, Áßº¹o
		 		- ÃâÇö È½¼ö: 0~ ¹« ÇÑ ´ë!
			 		ex) "a*bc" > ab,abc,abbc,ac,bc,bbc,aaabc
			 		ex) (ÀÚ¹Ù)*ÄÚµå>ÀÚ¹ÙÄÚµå ÀÚÄÚµå ¹ÙÄÚµå ÀÚ¹ÙÄÚµå ÄÚµå ÀÚ¹ÙÀÚ¹ÙÄÚµå ÀÚ¹ÙÀÚ¹ÙÀÚ¹ÙÄÚµå
		 4. ¼±ÅÃ, choice
		 	4.1 [¿­°Å°ª]
		 		- ¿­°ÅµÈ °ªµéÁß ÇÏ³ª¸¦ ¼±ÅÃÇØ¼­ °Ë»ö 
		 		ex) "[129]" > ¾È³çÇÏ¼¼¿ä. Á¦ ³ªÀÌ´Â 21»ìÀÔ´Ï´Ù. Á¦ µ¿»ıÀº 19»ìÀÔ´Ï´Ù.
		 		ex) "[1234567890]" > ¾È³çÇÏ¼¼¿ä. Á¦ ³ªÀÌ´Â 21»ìÀÔ´Ï´Ù. Á¦ µ¿»ıÀº 19»ìÀÔ´Ï´Ù.
		 		ex) "[±èÀÌ¹Ú]±æµ¿" > È«±æµ¿,±è±æµ¿,ÀÌ±æµ¿,¹Ú±æµ¿,ÃÖ±æµ¿
		 		ex) "[123]45" > 12345,145,245,45	//123Áß ÇÏ³ª¸¦ ¹İµå½Ã ¼±ÅÃ
		 		ex) "[123]?45" > 12345,145,245,45	//123À» ¼±ÅÃ ¾ÈÇØµµ µÅ~
		 		ex) "[123]+45" > 12345,145,245,45	//¿¬¼ÓÀûÀÎ ¼±ÅÃ
	
				ex) ÆäÀÌÁöÀÇ ¸ğµç ¼ıÀÚ(ÇÑÀÚ¸® ÀÌ»ó~) > "[0123456789]+" // ¸ğ~µç ¼ıÀÚ¸¦ Ã£À½ 
				
				ex) ÆäÀÌÁöÀÇ 2ÀÚ¸® ¼ıÀÚ > "[0123456789][0123456789]"
				ex) ÆäÀÌÁöÀÇ 2ÀÚ¸® ¼ıÀÚ > " [0123456789][0123456789] "
				ex) ÁÖ¹Îµî·Ï¹øÈ£ °Ë»ö > "[0123456789][0123456789][0123456789][0123456789][0123456789][0123456789]-[0123456789][0123456789][0123456789][0123456789][0123456789][0123456789][0123456789]"
				ex) ¼ıÀÚ > "[0-9]"
				ex) ¼Ò¹®ÀÚ > "[a-z]"
				ex) ´ë¹®ÀÚ > "[A-Z]"
				ex) ¿µ¹®ÀÚ > "[a-zA-Z]"
				ex) È«¾¾¼ºÀ» °¡Áø ÀÌ¸§ > "È«+[°¡-ÆR][°¡-ÆR]"
				ex) ÀüÈ­¹øÈ£°¡ Æ÷ÇÔµÇ¾î ÀÖ´ÂÁö °Ë»ç > [0-9]{3}-[0-9]{3,4}-[0-9]{4}
												¼ıÀÚ 3ÀÚ¸® ¼ıÀÚ 3~4ÀÚ¸® ¼ıÀÚ 4ÀÚ¸®


		 	4.2 [^¿­°Å°ª]
		 
			*/
		
		
		
//		m1();
//		m2();
//		m3();
		m4();
		
	}

	private static void m4() {
		//1. °Ë»ö > Ä¡È¯
		//2. °Ë»ö > ÃßÃâ
		//3. À¯È¿¼º °Ë»ç
		
		//È¸¿ø °¡ÀÔ > À¯È¿¼º °Ë»ç
		//1. ÀÌ¸§ > ÇÊ¼öÀÔ·Â, ÇÑ±Û, 2~5ÀÚ ÀÌ³»
		//2. ³ªÀÌ > ÇÊ¼öÀÔ·Â, ¼ıÀÚ, 18¼¼ ÀÌ»ó
		//3. ¾ÆÀÌµğ > ÇÊ¼öÀÔ·Â, ¿µ¾î+¼ıÀÚ+_, ¼ıÀÚ·Î ½ÃÀÛ ºÒ°¡´É, 4~12ÀÚ ÀÌ³»
		
		System.out.println("[È¸¿ø °¡ÀÔ]");
		Scanner scan = new Scanner(System.in);
		System.out.print("ÀÌ¸§: ");
		String name = scan.nextLine();
		
		System.out.print("³ªÀÌ: ");
		String age = scan.nextLine();
		
		System.out.print("¾ÆÀÌµğ: ");
		String id = scan.nextLine();
		
		if (isValid(name, age, id)) {
			System.out.println("°¡ÀÔ ¿Ï·á");
		} else {
			System.out.println("°¡ÀÔ ½ÇÆĞ");
		}

		
		
	
	}

	private static boolean isValid(String name, String age, String id) {
		
		String regex = ""; // Á¤±Ô½Ä
		Pattern pattern = null;	//Á¤±Ô½Ä °´Ã¼
		Matcher matcher = null; //°á°ú °´Ã¼
		
		//1. ÀÌ¸§ > ÇÊ¼öÀÔ·Â, ÇÑ±Û, 2~5ÀÚ ÀÌ³»
		regex = "^[°¡-ÆR]{2,5}$";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(name); //ÀÔ·Â°ªÀ» ´ë»óÀ¸·Î Á¤±Ô½Ä °Ë»ç
		
		if(!matcher.find()) {
			//ÇÑ±Û·Î µÈ 2~5ÀÚ¸¦ Ã£Áö ¸øÇß½À´Ï´Ù!
			System.out.println("ÀÌ¸§À» ÇÊ¼öÀÔ·Â, ÇÑ±Û, 2~ÀÚ ÀÌ³»·Î ÀÔ·ÂÇÏ¼¼¿ä.");
			return false;
		}

		return true;
	}

	private static void m3() {
		String regex = "[0-9]{3}-[0-9]{3,4}-[0-9]{4}";
		Pattern p1 = Pattern.compile(regex);
		
		String txt = "Hi, My name is Hong. my Phone number is 010-3123-1231 if you can't contact me, please call 010-1234-1234";
		Matcher m1 =p1.matcher(txt);
//		
//		System.out.println(m1.find());
//		System.out.println(m1.find());
//		System.out.println(m1.find());
		
		int count = 0;
		while(m1.find()) {
			System.out.println("[ÀüÈ­¹øÈ£ ¹ß°ß]");
			System.out.println("[ÀüÈ­¹øÈ£: "+m1.group()+"]");
			count++;
		}
		System.out.printf("txt³»¿¡¼­ ÀüÈ­¹øÈ£¸¦ %dÈ¸ ¹ß°ß",count);
		
		
		
	}
	
	
	private static void m2() {
		
			String regex = "(È«|±è|ÃÖ|³²±Ã)(±æµ¿)";
			Pattern p1 = Pattern.compile(regex);
			
			String txt = "È«±æµ¿, ÃÖ±æµ¿,±æ±æµ¿,³²±Ã±æµ¿, ±æ±æ±æµ¿,¤» ³Í ¹ºµ¥ ";
			Matcher m1 =p1.matcher(txt);
			
			int count = 0;
			while(m1.find()) {
				count++;
				System.out.println(count);
				System.out.println("[ÀÌ¸§ ¹ß°ß]");
				System.out.println("[Ç® ³×ÀÓ: "+m1.group()+"]");
				System.out.println("[¼º: "+m1.group(1)+"]");
				System.out.println("[ÀÌ¸§: "+m1.group(2)+"]");
				System.out.println();
			}
			System.out.printf("txt³»¿¡¼­ ÀÌ¸§À» %dÈ¸ ¹ß°ß",count);
			
			
			
		
	}



	private static void m1() {
		String txt = "È«±æµ¿,¾Æ¹«°³,ÇÏÇÏÇÏ,È£È£È£,ÈÄÈÄÈÄ";
		
		//1.split()
		String[] list = txt.split(",");
		
		for(String name : list) {
			System.out.println(name);
		}
	
		txt = "È«±æµ¿,¾Æ¹«°³,ÇÏÇÏÇÏ,È£È£È£,ÈÄÈÄÈÄ";
		System.out.println();
		list = txt.split("¹«°³");
		
		for(String name : list) {
			System.out.println(name);
		}
	
		
	}
}
