package com.test.java;

import java.util.Arrays;
import java.util.Calendar;


public class Ex34_Array {

	public static void main(String[] args) {
//		
		
		//�ʱ�ȭ ��Ģ
//		1. �����迭 > 0
//		2. �Ǽ��迭 > 0.0
//		3. ���ڹ迭 > \0
//		4. ���迭 > false
//		5. �������迭 >null
//		
//		
//		
//		
		
		//m1();
//		m2();
//		m3();
//		m4();
//		m5();
//		m11();
//		m12();
//		m13();
//		m14();
//		m15();
		
//		m16();
//		m17();
//		m18();
		m19();
//		m20();
//		m21();
		
		
		
	}
	
	
	
	private static void m21() {
		// left shitf
		String[] list = {"A","B", "C", "D", "E"};
		int index = 1;
		for (int i = index; i < list.length-1; i++) {
			list[i]= list[i+1];

		}
		list[list.length-1]=null;
		System.out.println(Arrays.toString(list));
		
	}



	private static void m20() {
		//- ����(*****)
		//- �迭�� ���ϴ� ��ġ�� ��Ҹ� ����
		//- Right Shift
		
		String[] list= {"A","B", "C", "D", "E"};
		int index =1;
		String value="F";
		//for (int i = index; i < list.length-1; i++) {
			for (int i = list.length-2; i >= index; i--) {
				list[i+1] = list[i];
			}
			
		
		System.out.println(Arrays.toString(list));
		list[index]= value;
		
		
	}



	//ó������ ������
	public static String[] subArray(String[] colors, int beginIndex) {

		
		String[] temp = new String[colors.length - beginIndex];
		for (int i = beginIndex; i < colors.length; i++) {

			//�����ϰ� ���� ������ �ε���
			temp[i-beginIndex]= colors[i];
		}
		return temp;
	}
	
	public static String[] subArray(String[] colors, int beginIndex, int endIndex) {

		
		String[] temp = new String[endIndex - beginIndex];
		for (int i = beginIndex; i < endIndex; i++) {

			//�����ϰ� ���� ������ �ε���
			temp[i-beginIndex]= colors[i];
		}
		return temp;
	}
	
		
		
	public static String colorAt(String[] colors ,int i) {
		return colors[i];
	}
	
	private static void m19() {
		//- ����
		//- ���� colorAt(�迭,	���ȣ)
		//- qodufsubArray > �κ� ���� ��������
		String[] colors= {"red","yellow", "blue", "white"};
		
		colorAt(colors,5);
//		System.out.println(colors5]);
	}

	private static void m18() {
		// TODO Auto-generated method stub
		
	}

	public static String[] deepCopy(String[] colors) {
		String[] temp = new String[colors.length];
		for (int i = 0; i < colors.length; i++) {
			temp[i] =colors[i];

		}
		return temp;
	}
	
	private static void m17() {
		//- �˻�
		//- int indexof(�迭,�˻����)
		//- �˻������ �迭�� ���° �濡�� �߰ߵƴ��� ���ȣ ��ȯ
		
		
	}

	private static void m16() {
		// �迭�� ������� �����ϴ� �ൿ�� .. > �޼ҵ� ����
		//- �˻� 
		//- boolean contains(�迭, �˻����)
		
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
			if(contains(nums,15)) {
				System.out.println("�߰���");
			}
			else {
				System.out.println("�߰߸�");
			}
		
	}
	
	public static int indexOf(String[] colors,String color) {
		for (int i = 0; i < colors.length; i++) {

			if(colors[i].equals(color)) {
				return i;
			}
		}return 0;
	}
	
	
	public static boolean contains(String[] colors, String color) {
		
		for (int i = 0; i <colors.length; i++) {
			if(colors[i].equals(color)) {
				//�޼ҵ� ���� + true ��ȯ
				
				return true;
			}
		}
		
		return false;
		
	}
	public static boolean contains(int[] nums, int num) {
	
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==num) {
				//�޼ҵ� ���� + true ��ȯ
				
				return true;
			}
		}
		
		return false;
				
	}

	private static void m15() {

		//�ڹ��� ���� ��� ���
		//��������(sort)
		int[] nums= {5,3,1,4,2};
		Arrays.sort(nums); //���� > Quick ���� �˰���
		System.out.println(Arrays.toString(nums));
		
		
		Calendar[] list = new Calendar[5];
		list[0] = Calendar.getInstance();
		list[0].add(Calendar.DATE, -2);

		list[1] = Calendar.getInstance();
		list[1].add(Calendar.DATE, 1);
		
		list[2] = Calendar.getInstance();
		list[2].add(Calendar.DATE, -7);
		
		
		list[3] = Calendar.getInstance();
		list[3].add(Calendar.DATE, 3);
		
		list[4] = Calendar.getInstance();
		
		Arrays.sort(list);
		for (int i = 0; i < list.length; i++) {
			System.out.printf("%tF\n",list[i]);
		}
		
		
		
	}

	private static void m14() {
		Calendar c1 = Calendar.getInstance();
		c1.add(Calendar.DATE, -1);//����
		
		Calendar c2 = Calendar.getInstance();
		
	
		System.out.println(c1.getTimeInMillis()>c2.getTimeInMillis());
	
		//��¥ ��
		System.out.println(c1.compareTo(c2));
		System.out.println(c2.compareTo(c1));
		System.out.println(c1.compareTo(c1));
		
		Calendar[] list = new Calendar[5];
		list[0] = Calendar.getInstance();
		list[0].add(Calendar.DATE, -2);

		list[1] = Calendar.getInstance();
		list[1].add(Calendar.DATE, 1);
		
		list[2] = Calendar.getInstance();
		list[2].add(Calendar.DATE, -7);
		
		
		list[3] = Calendar.getInstance();
		list[3].add(Calendar.DATE, 3);
		
		list[4] = Calendar.getInstance();
		
		//�������� ����
		for (int i = 0; i < list.length-1; i++) {
			for (int j = 0; j < list.length-1-i; j++) {
				if(list[j].compareTo(list[j+1])>0) {
					Calendar temp = list[j];
					list[j]= list[j+1];
					list[j+1]= temp;
				}
			}
		}
		
		
		
		
		for (int i = 0; i < list.length; i++) {
			System.out.printf("%tF\n",list[i]);
		}
		
		
	}

	private static void m13() {
		//char
		char[] array = {'c','d','a','b','e'};
		System.out.println(array.length);
		System.out.println(Arrays.toString(array));
		System.out.println();
		String s1 = "ȫ�浿";
		String s2 = "�ƹ���";
		System.out.println(compare(s1,s2));
		System.out.println(Arrays.toString(array));
		
		
		String[] names= {"ȫ�浿",
						"���缮",
						"����",
						"������",
						"����ö",
						};


		for (int i = 0; i < names.length-1; i++) {
			for (int j = 0; j < names.length-1-i; j++) {

				if(compare(names[j],names[j+1])>0) {
					String temp = names[j];
					names[j]=  names[j+1];
					names[j+1] = temp;
				}
			}

		}
		System.out.println(Arrays.toString(names));


}

	
	
	
	//�� ���ڿ��� �����ڵ尪�� ���ϴ� ����
	//-	1 	: ��
	//-	-1	: ��
	//-	0	: ����
	public static int compare(String s1, String s2) {
		
		
		int length = s1.length()>s2.length()?s2.length():s1.length()	;
		
		for (int i = 0; i<length; i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			
			if(c1 > c2 ) {
				return 1;
			} else if (c1< c2) {
				return -1;
			}

		}
		
		if(s1.length()>s2.length()) {
			return 1;
		} else if(s1.length()<s2.length()) {
			return -1;
		}
		return 0;
	}

	private static void m12() {
		// ������ ���� or �迭 > ����
		//- ũ�� �� �� > ���ġ
		
		
		//1. ��������
		// a. ����: ������ > ū��
		// b. ����(��): �����ڵ尪 ����
		// c. s��¥�ð�: ���� > �̷�
		// 
		
		//2. ��������
		// a. ����: ū�� > ������
		// b. ����(��): �����ڵ尪 ����
		// c. s��¥�ð�: �̷� > ����
		
		//���� > ��� ����(�ڵ��׽�Ʈ) ����
		//1. ���� ����
		//2. JDK ��� ���
	int[] array = {5,3,1,4,2};
	System.out.println(array.length);
	System.out.println(Arrays.toString(array));
	System.out.println();
	for (int i = 0; i < array.length-1; i++) {//0,1,2,3 >n cycle
		//i(0) j(0,1,2,3)
		for (int j = 0; j <array.length-1-i; j++) {// array.length-1-i �ִ� ���� �˾ƺ��� �Ϳ� �ʿ��� ĭ �� 
			if(array[j]>array[j+1]) {
				int temp= array[j+1];
				array[j+1]= array[j];
				array[j] = temp;
			}
		}
		
	}
	System.out.println(Arrays.toString(array));
	
	//��������
	for (int i = 0; i < array.length-1; i++) {//0,1,2,3 >n cycle
		//i(0) j(0,1,2,3)
		for (int j = 0; j <array.length-1-i; j++) {// array.length-1-i �ִ� ���� �˾ƺ��� �Ϳ� �ʿ��� ĭ �� 
			if(array[j]<array[j+1]) {
				int temp= array[j+1];
				array[j+1]= array[j];
				array[j] = temp;
			}
		}
		
	}
	System.out.println(Arrays.toString(array));
	
		
		
		
	}

	private static void m11() {
		//�迭 �ڵ� �ʱ�ȭ > �ʱ�ȭ ����Ʈ
		int[] nums1 = new int[5];
		System.out.println(Arrays.toString(nums1));
		
		//���� �ʱ�ȭ > �����ϱ�
		nums1[0]=96;
		nums1[1]=79;
		nums1[2]=99;
		nums1[3]=85;
		nums1[4]=65;
		System.out.println(Arrays.toString(nums1));
		
		//�ʱ�ȭ ����Ʈ
		int[] nums2 = new int[] {96,79,99,85,65};
		System.out.println(Arrays.toString(nums2));
		
		int[] nums3 = {96, 79, 99, 85, 65};//���� ���
		
		String[] name1 = new String[3];
		name1[0] = "ȫ�浿" ; 
		name1[1] = "ȫ���" ; 
		name1[2] = "ȫ���" ; 
		
		String[] name2 = {"ȫ�浿", "ȫ���", "ȫ���"};
		System.out.println(Arrays.toString(name2));
		
	}

	private static void m5() {
		// ����ǥ
		//- 10��
		//- ����, ����, ���� > ����
		
		//������ ���� > �迭
		int size = 10;
		String[] name = new String[size];
		int[] kors = new int[size];
		int[] engs = new int[size];
		int[] math = new int[size];
		
		System.out.println("===============================================");
		System.out.println("                     ����ǥ");
		System.out.println("===============================================");
		System.out.println("[�̸�]\t[����]\t[����]\t[����]\t[����]\t[���]");
		System.out.println("ȫ�浿\t100\t50\t80\t270\t90.0");
		
	}

	private static void m4() {
		byte[] nums= new byte[10];
		double[] nums1= new double[10];
		char[] nums2= new char[10];
		
	}

	private static void m3() {
		//- int[] > int �迭
		//- nums > ���� > �迭
		//- ���ȣ > ÷��(index)
		//- ��1�� (������) = ���(element)
		int[] nums = new int[10];
		
		//�迭 ��� �� ������!!!
		//÷���� ���� = 0~length-1
		for (int i = 0; i < nums.length; i++) {
//			nums[i]=i;
			nums[i]=(int)(Math.random()*10)+1;
			
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("nums[%d] = %d\n",i,nums[i]);
		}
		
		
	}

	private static void m2() {
		// �䱸����] �л� 3�� > ���� ���� > ����, ��� 
		// �߰�����] �л� �� 300�� ���� 
		
		//�迭 �����ϱ�(�����ϱ�)
		// - �ڷ���[] �迭�� = new �ڷ���[����];
		int[] kors = new int[300];
		//���� > �ʵ�(field) >>> ������Ƽ(property), �Ӽ�(attribute)
		System.out.println(kors.length);
		
		//�迭�� �濡 �����ϱ�(������ �����)
		kors[0]=100;
		kors[1]=90;
		kors[2]=80;
		
//		
//		int total = kors[0] +kors[1]+kors[2];
//		double avg = total /3.0;
//		System.out.printf("����: %d��\n",total);
//		System.out.printf("���: %.1f��\n",avg);
		
		for (int i = 0; i < 3; i++) {
//			kors[i];
		}
		
	}

	private static void m1() {
		
		// �䱸����] �л� 3�� > ���� ���� > ����, ��� 
		// �߰�����] �л� �� 300�� ���� 
		int kor1= 100;
		int kor2=90;
		int kor3=80;
		
		int total = kor1 + kor2 + kor3;
		double avg = total /3.0;
		System.out.printf("����: %d��\n",total);
		System.out.printf("���: %.1f��\n",avg);
		
		
		
	}



}
