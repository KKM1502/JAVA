package com.test.question;

public class Q094 {
	public static void main(String[] args) {
		Bugles snack = new Bugles();

		snack.setWeight(500);
		snack.setCreationTime("2023-02-15");
		System.out.println("���� : " + snack.getPrice() + "��");
		System.out.println("���� ������ " + snack.getExpiration() + "�� ���ҽ��ϴ�.");

		snack.eat();


		Bugles snack2 = new Bugles();

		snack2.setWeight(300);
		snack2.setCreationTime("2023-02-07");
		System.out.println("���� : " + snack2.getPrice() + "��");
		System.out.println("���� ������ " + snack2.getExpiration() + "�� ���ҽ��ϴ�.");

		snack2.eat();
	}
}
