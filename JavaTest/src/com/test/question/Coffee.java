package com.test.question;

public class Coffee {
	private static int bean;
	private static int milk;
	private static int water;
	private static int ice;
	
	private static int beanUnitPrice=1;
	private static double waterUnitPrice=0.2;
	private static int iceUnitPrice=3;
	private static int milkUnitPrice=4;
	
	private static int beanTotalPrice;//	���� �� �Ǹž�(��)
	private static int waterTotalPrice;//	�� �� �Ǹž�(��)
	private static int iceTotalPrice;//	���� �� �Ǹž�(��)
	private static int milkTotalPrice;//	���� �� �Ǹž�(��)

	private static int americano;//	�Ƹ޸�ī�� �� �Ǹ� ����(��)
	private static int latte;//	���� �� �Ǹ� ����(��)
	private static int espresso;//	���������� �� �Ǹ� ����(��)
	

	public static int getBean() {
		return bean;
	}
	public static int getMilk() {
		return milk;
	}
	public static int getWater() {
		return water;
	}
	public static int getIce() {
		return ice;
	}
	public static int getBeanUnitPrice() {
		return beanUnitPrice;
	}
	public static double getWaterUnitPrice() {
		return waterUnitPrice;
	}
	public static int getIceUnitPrice() {
		return iceUnitPrice;
	}
	public static int getMilkUnitPrice() {
		return milkUnitPrice;
	}
	public static int getBeanTotalPrice() {
		return beanTotalPrice;
	}
	public static int getWaterTotalPrice() {
		return waterTotalPrice;
	}
	public static int getIceTotalPrice() {
		return iceTotalPrice;
	}
	public static int getMilkTotalPrice() {
		return milkTotalPrice;
	}
	public static int getAmericano() {
		return americano;
	}
	public static int getLatte() {
		return latte;
	}
	public static int getEspresso() {
		return espresso;
	}
	public static void countCoffee(Espresso espresso) {
		Coffee.espresso++;
		Coffee.bean += espresso.getBean();
		Coffee.beanTotalPrice += Coffee.beanUnitPrice*espresso.getBean();
	}
	public static void countCoffee(Latte latte) {
		Coffee.latte++;
		Coffee.bean += latte.getBean();
		Coffee.milk += latte.getMilk();
		Coffee.beanTotalPrice += Coffee.beanUnitPrice*latte.getBean();
		Coffee.milkTotalPrice += Coffee.milkUnitPrice*latte.getMilk();
	}
	public static void countCoffee(Americano americano) {
		Coffee.americano++;
		Coffee.bean += americano.getBean();
		Coffee.water += americano.getWater();
		Coffee.ice += americano.getIce();
		Coffee.beanTotalPrice += Coffee.beanUnitPrice*americano.getBean();
		Coffee.waterTotalPrice += Coffee.waterUnitPrice*americano.getWater();
		Coffee.iceTotalPrice += Coffee.iceUnitPrice*americano.getIce();
	}
	
	

}
