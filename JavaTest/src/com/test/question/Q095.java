package com.test.question;

public class Q095 {
	public static void main(String[] args) {
		Employee e1 = new Employee();

		e1.setName("ȫ�浿");
		e1.setDepartment("ȫ����");
		e1.setPosition("����");
		e1.setTel("010-1234-5678");
		e1.setBoss(null); //���� ��� ����

		e1.info();


		Employee e2 = new Employee();

		e2.setName("�ƹ���");
		e2.setDepartment("ȫ����");
		e2.setPosition("���");
		e2.setTel("010-2541-8569");
		e2.setBoss(e1); //���� ��� e1(ȫ�浿)

		e2.info();
	}
}
