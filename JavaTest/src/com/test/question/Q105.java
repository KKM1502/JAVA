package com.test.question;

public class Q105 {
	public static void main(String[] args) {
		

		//�迭 ����
		MyQueue queue = new MyQueue();
	
		//�߰�
		queue.add("����");
		queue.add("���");
		queue.add("�Ķ�");
		queue.add("��Ȳ");
		queue.add("����");
	
		//�б�
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	
		//����
		System.out.println(queue.size());
	
		//Ȯ��
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.size());
	
		//ũ�� ����
		queue.trimToSize();
	
		//�ʱ�ȭ
		queue.clear();
		System.out.println(queue.size());

	}
}