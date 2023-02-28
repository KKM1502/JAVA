package com.test.question;

public class Q101 {
	public static void main(String[] args) {
		//�ٸ���Ÿ
		Barista barista = new Barista();

		//�մ� 1
		//���������� 1�� �ֹ� - ���� 30g
		Espresso e1 = barista.makeEspresso(30);
		e1.drink();

		//�մ� 2
		//���� 1�� �ֹ� - ���� 30g, ���� 250ml
		Latte l1 = barista.makeLatte(30, 250);
		l1.drink();

		//�մ� 3
		//�Ƹ޸�ī�� 1�� �ֹ� - ���� 30g, �� 300ml, ������ 20��
		Americano a1 = barista.makeAmericano(30, 300, 20);
		a1.drink();

		//�մ� 4
		//���������� 10�� �ֹ� - ���� 25g
		Espresso[] e2 = barista.makeEspressoes(25, 10);

		for (Espresso e : e2) {
		      e.drink();
		}

		//�մ� 5
		//���� 5�� �ֹ� - ���� 25g, ���� 300ml
		Latte[] l2 = barista.makeLattes(25, 300, 5);

		for (Latte l : l2) {
		      l.drink();
		}

		//�մ� 6
		//�Ƹ޸�ī�� 15�� �ֹ� - ���� 20g, �� 350ml, ������ 30��
		Americano[] a2 = barista.makeAmericanos(20, 350, 30, 15);

		for (Americano a : a2) {
		      a.drink();
		}

		//���
		barista.result();
	}
}
