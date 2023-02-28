package com.test.question;

public class Q009 {
	public static void main(String[] args) {
		/*
		1.Á¶°Ç..
			String getName(String name)
			name: OOO(ÀÌ¸§)
			return: OOO(ÀÌ¸§)´Ô
		2.
			È£Ãâ..
			result = getName("È«±æµ¿");
			System.out.printf("°í°´: %s\n", result);

			result = getName("¾Æ¹«°³");
			System.out.printf("°í°´: %s\n", result);
		3.
			Ãâ·Â..
			°í°´: È«±æµ¿´Ô
			°í°´: ¾Æ¹«°³´Ô

		 */
		
		String result = getName("È«±æµ¿");
		System.out.printf("°í°´: %s\n", result);

		String result2 = getName("¾Æ¹«°³");
		System.out.printf("°í°´: %s\n", result2);
		
		
	}//main
	public static String getName(String name) {
		
		return name + "´Ô";
	}	
	
	
}
