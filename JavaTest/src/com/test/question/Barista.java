package com.test.question;

public class Barista {

	public Espresso makeEspresso(int bean) {
		Espresso espresso = new Espresso(bean);
		Coffee.countCoffee(espresso);
		return espresso;
	}

	public Latte makeLatte(int bean, int milk) {

		Latte latte = new Latte(bean,milk);
		Coffee.countCoffee(latte);
		return latte;
	}

	public Americano makeAmericano(int bean, int water, int ice) {
		// TODO Auto-generated method stub
		Americano americano = new Americano(bean,water,ice);
		Coffee.countCoffee(americano);
		return americano;
	}

	public Espresso[] makeEspressoes(int bean, int count) {
		Espresso[] espressoes = new Espresso[count];
		for (int i = 0; i < espressoes.length; i++) {
			Espresso espresso = new Espresso(bean);
			Coffee.countCoffee(espresso);
			espressoes[i] = espresso;
		}
		return espressoes;
	}

	public Latte[] makeLattes(int bean, int milk, int count) {
		Latte[] lattes = new Latte[count];
		for (int i = 0; i < lattes.length; i++) {
			Latte latte = new Latte(bean,milk);
			Coffee.countCoffee(latte);
			lattes[i]= latte;
		}
		return lattes;
	}

	public Americano[] makeAmericanos(int bean, int water, int ice, int count) {
		Americano[] americanoes = new Americano[count];
		for (int i = 0; i < americanoes.length; i++) {
			Americano americano = new Americano(bean,water,ice);
			Coffee.countCoffee(americano);
			americanoes[i] = americano;
			
		}
		return americanoes;
	}

	public void result() {
		System.out.println("==========================");
		System.out.println("판매결과");
		System.out.println("==========================");
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("음료 판매량");		
		System.out.println("--------------------------");
		System.out.println("에스프레소	: "+ Coffee.getEspresso()+"잔");
		System.out.println("라떼		: "+ Coffee.getLatte()+"잔");
		System.out.println("아메리카노	: "+ Coffee.getAmericano()+"잔");
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("원자재 소비량");
		System.out.println("--------------------------");
		System.out.println("원두	:" +Coffee.getBean()+"g");
		System.out.println("물 	:" +Coffee.getWater()+"ml");
		System.out.println("얼음 	:" +Coffee.getIce()+"개");
		System.out.println("우유 	:" +Coffee.getMilk()+"ml");
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("매출액");
		System.out.println("--------------------------");
		System.out.println("원두	:" +Coffee.getBeanTotalPrice()+"원");
		System.out.println("물 	:" +Coffee.getWaterTotalPrice()+"원");
		System.out.println("얼음 	:" +Coffee.getIceTotalPrice()+"원");
		System.out.println("우유 	:" +Coffee.getMilkTotalPrice()+"원");
		
		
		
		
		
	}
	
}
