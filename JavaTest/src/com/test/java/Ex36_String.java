package com.test.java;

public class Ex36_String {
	public static void main(String[] args) {
		
		
		
//		m7();
//		m8();
//		m9();
//		m10();
//		m11();
		m12();
		
		
		
		
	}

	private static void m12() {
		//���ڿ� �и�
		//- split(String delimiter)
		String name = "ȫ�浿,�ƹ���,������"; // , > ������
		String[] list = name.split(",");
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);

		}
		
	}

	private static void m11() {
		// ���ڿ� ġȯ
		//- String replace(String old, String new)
		//- ���ڿ��� �Ϻθ� �ٸ� ���ڿ��� ��ü�ϴ� �޼ҵ�
		
		String txt = "�ȳ��ϼ���. ȫ�浿�Դϴ�.";
		System.out.println(txt.replace("ȫ�浿", "�ƹ���"));
		
		
		
		
	}

	private static void m10() {
		
		//���ڿ� ����
		//- String substing(int beginIndex, int endIndex) begin�� ���� end�� ������
		//- String substing(int beginIndex)
		
		String txt= "�����ٶ󸶹ٻ������īŸ����";
		System.out.println(txt.substring(3,7));
		System.out.println(txt.substring(5,6));//"��"
		System.out.println(txt.charAt(5));//'��'
		
		
		//���� ��� > ���ϸ�?
		String path= "C:\\class\\code\\java\\JavaTest\\src\\com\\test\\java\\Ex36_String.java";
		int index = path.lastIndexOf("\\"); //������ \\ 
		System.out.println(index);
		
		String filename = path.substring(index + 1);
		System.out.println(filename);//���ϸ� ����
		
		//Ȯ���� ���� ���ϸ� ����
		index = filename.lastIndexOf(".");
		String filenameWithoutExtension = filename.substring(0,index);
		System.out.println(filenameWithoutExtension);
	}

	private static void m9() {
		
		//���ϰ˻�
		// boolean startsWith(String)
		// boolean endsWith(String)
		
		String txt= "�ڹ� ������ ����";
		
		System.out.println(txt.startsWith("�ڹ�"));
		System.out.println(txt.startsWith("����Ŭ"));
		System.out.println(txt.indexOf("�ڹ�")==0);
		
		System.out.println(txt.endsWith("����"));
		System.out.println(txt.endsWith("����"));
		System.out.println(txt.indexOf("����")==txt.length()-2);
		
		//���� ����
		String file = "Ex36_String.java";
		
		//�ش� ������ Ȯ���ڰ� ".java"���� Ȯ�� ?
		if(file.endsWith(".java")) {
			System.out.println("o");	
		}else {
			System.out.println("x");
		}
		
		
	}

	private static void m8() {
		// ���ڿ� ��ҹ��� ����
		//- String toUpperCase
		//- String toLowerCase
		
		String content="���� ������ String Method�Դϴ�";
		System.out.println(content.toUpperCase());
		System.out.println(content.toLowerCase());
		
	}

	private static void m7() {
		// ������!!
		String content = "�ȳ��ϼ���. ���� �ڹٸ� ���� �л��Դϴ�.";
		String word = "�ٺ�"; //������
		
		if (content.contains(word)) {
			System.out.println("������ �߰�!");
		}else{
			System.out.println("�۾��� ����..!");
		}
		if(content.indexOf(word)>-1){
			System.out.println("������ �߰�!");
		}else{
			System.out.println("�۾��� ����..!");
		}
		
		
		content = "�ȳ��ϼ���. ���� �ڹٸ� ���� �л��Դϴ�.";
		String[] words = {"�ٺ�", "��û��", "�޷�"};
		for (int i = 0; i < words.length; i++) {
			if(content.indexOf(words[i])>-1){
				System.out.println("������ �߰�!");
				break;//**
			}

		}
		System.out.println("�Ϸ�");
		
		//�ֹε�Ϲ�ȣ > "-"
		String Jumin = "970306-1232141";
		
		if(Jumin.charAt(6)=='-') {
			System.out.println("O");
		}else {
			System.out.println("X");
		}
		if(Jumin.indexOf("-")==6) {
			System.out.println("O");
		}else {
			System.out.println("X");
		}
	
	}
}
