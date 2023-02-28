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
		System.out.println("�ǸŰ��");
		System.out.println("==========================");
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("���� �Ǹŷ�");		
		System.out.println("--------------------------");
		System.out.println("����������	: "+ Coffee.getEspresso()+"��");
		System.out.println("��		: "+ Coffee.getLatte()+"��");
		System.out.println("�Ƹ޸�ī��	: "+ Coffee.getAmericano()+"��");
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("������ �Һ�");
		System.out.println("--------------------------");
		System.out.println("����	:" +Coffee.getBean()+"g");
		System.out.println("�� 	:" +Coffee.getWater()+"ml");
		System.out.println("���� 	:" +Coffee.getIce()+"��");
		System.out.println("���� 	:" +Coffee.getMilk()+"ml");
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("�����");
		System.out.println("--------------------------");
		System.out.println("����	:" +Coffee.getBeanTotalPrice()+"��");
		System.out.println("�� 	:" +Coffee.getWaterTotalPrice()+"��");
		System.out.println("���� 	:" +Coffee.getIceTotalPrice()+"��");
		System.out.println("���� 	:" +Coffee.getMilkTotalPrice()+"��");
		
		
		
		
		
	}
	
}
