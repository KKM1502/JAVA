package com.test.question;

public class Q097 {
	public static void main(String[] args) {
		Refrigerator r = new Refrigerator();

		Item item1 = new Item();
		item1.setName("��ġ");
		item1.setExpiration("2023-03-08");
		r.add(item1);//����� �ֱ�

		Item item2 = new Item();
		item2.setName("��α�");
		item2.setExpiration("2023-03-01");
		r.add(item2);//����� �ֱ�

		Item item3 = new Item();
		item3.setName("��ġ����");
		item3.setExpiration("2023-03-03");
		r.add(item3);//����� �ֱ�

		Item item4 = r.get("��α�");//������� ������
		System.out.printf("%s�� ������� : %s\n", item4.getName(), item4.getExpiration());

		System.out.printf("����� ���� �� ������ ���� : %d��\n", r.count());

		r.listItem();
	}

}
