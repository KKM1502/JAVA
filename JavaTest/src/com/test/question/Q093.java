package com.test.question;

public class Q093 {
	public static void main(String[] args) {

		//
		Note note = new Note();

		note.setSize("B4");
		note.setColor("�����");
		note.setPage(25);
		note.setOwner("ȫ�浿");

		System.out.println(note.info());


		Note note2 = new Note();

		note2.setSize("A4");
		note2.setColor("������");
		note2.setPage(100);

		System.out.println(note2.info());
		
		
	}
}
