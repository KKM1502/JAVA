package com.test.question;

public class Q106 {
	public static void main(String[] args) {
		//�迭 ����
		MyStack stack = new MyStack();

		//�߰�
		stack.push("����");
		stack.push("���");
		stack.push("�Ķ�");
		stack.push("��Ȳ");
		stack.push("����");

		//�б�
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		//����
		System.out.println(stack.size());

		//Ȯ��
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.size());

		//ũ�� ����
		stack.trimToSize();

		//�ʱ�ȭ
		stack.clear();
		System.out.println(stack.size());
	}
}
