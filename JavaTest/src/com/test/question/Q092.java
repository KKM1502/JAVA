package com.test.question;

public class Q092 {

	public static void main(String[] args) {
		Book b1 = new Book();

		b1.setTitle("�ڹ��� ����");
		b1.setPrice(45000);
		b1.setAuthor("���ü�");
		b1.setPublisher("��������");
		b1.setIsbn("8994492038");
		b1.setPage(1022);

		System.out.println(b1.info());
	}
	
}
