package com.test.java;

public class Ex08_Output {

	public static void main(String[] args) {
		
		//Ex08_Output.java
		/*
		 *`(������ǥ)
		 *^(xor)
		 *& (and)
		 *| (pipe) 
		 *~(ƿ��)
		 *
		 
		 
		 �ܼ� ȯ��: �ܼ��� ȯ��
		 
		 �ܼ� �����
		 - �ܼ� ȯ�濡�� ���α׷� > �����͸� �����
		 - Console Input Output > IO
		 - �⺻ �Է� ��ġ: Ű����
		 - �⺻ ��� ��ġ: ����� 
		 
		 �ܼ� ���
		 - Ŭ����.�ʵ�.�޼ҵ�()
		 1. System.out.println(��)
		 	- println �޼ҵ�
		 	- print line > ���� ����� ����Ѵ� > ���� ����� �� ���͸� ģ��.
		 
		 2. System.out.print(��)
		 	- print �޼ҵ�
		 	- ���� ��� 
		 
		 3. System.out.printf(��)
		 	- printf �޼ҵ�
		 	
		 �� ���� ���
		 System.out.println()
		 System.out.println()
		 System.out.println()
		 
		 
		 System.out.println("\n\n\n")
		 
		 */
		//����ǥ ����ϱ�
		String name1 = "ȫ�浿";
		int kor1 = 100;
		int eng1 = 90;
		int math1 = 80;
		
		String name2 = "�ƹ���";
		int kor2 = 95;
		int eng2 = 77;
		int math2 = 89;
		System.out.println("=================================");
		System.out.println("             ����ǥ");
		System.out.println("=================================");
		System.out.println("[�̸�]\t[����]\t[����]\t[����]");				
		
		System.out.printf("%s\t%5d\t%5d\t%5d\n", name1, kor1, eng1, math1);
		
//		System.out.print(name1);
//		System.out.print("\t");
//		System.out.print(kor1);
//		System.out.print("\t");
//		System.out.print(eng1);
//		System.out.print("\t");
//		System.out.println(math1);
		

		System.out.printf("%s\t%5d\t%5d\t%5d\n", name2, kor2, eng2, math2);
		System.out.printf("");
		
		//printf()
		//- ���� ���� ����
		
		//���� ����
		//1. %s > Sring
		//2. %d > Decimal(����)
		//3. %f > Float(�Ǽ�)
		//4. %c > Char
		//5. %b > boolean
		
		//** %s�� ��� �ڷ����� ����� �� �ִ�.
		//** %s�� ��� �ڷ����� ����� �� �ִ���, �츮�� ������ ���Ŀ� �´� ���� ���ڸ� ����Ѵ�.
		
		//]�䱸���� "�ȳ��ϼ���. ȫ�浿��" ������ ����Ͻÿ�/
		String name = "ȫ�浿";
		System.out.println("�ȳ��ϼ���. "+name+"��");
		
		//printf�� ���� ���� (x)
		System.out.printf("�ȳ��ϼ���. %s��\n",name);
		
		//�䱸����] SQL
		//insert into tblMember (seq, name, age, address, tel) values (1, 'ȫ�浿', 20, '����� ������ ���ﵿ', '010-1234-5678');
		
		name = "ȫ�浿";
		String seq = "1";
		String age = "20";
		String address="����� ������ ���ﵿ";
		String tel="010-1234-5678";
		
		System.out.printf("insert into tblMember (seq, name, age, address, tel) values (%s, '%s', %s, '%s', '%s')\n;", seq, name, age, address, tel);
		
				
		int a = 100;
		double b = 3.14;
		char c= 'A';
		boolean d = true;
		
		System.out.printf("���ڿ�: %s\n",name);
		System.out.printf("����: %d\n",a);
		System.out.printf("�Ǽ�: %f\n",b);
		System.out.printf("����: %c\n",c);
		System.out.printf("��: %b\n",d);
 
		System.out.printf("%s\n",a);


		
		
		
		
		
		
		
	}
	
}
