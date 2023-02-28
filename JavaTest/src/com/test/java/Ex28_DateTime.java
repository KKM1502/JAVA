package com.test.java;

import java.util.Calendar;
import java.util.Date;

public class Ex28_DateTime {
	public static void main(String[] args) {
		
		
		/*
		 1. ������
		 	-int, char, short, long ���
		 
		 2. ������
		 	- Ŭ����
		 		-String
		 		-��¥/�ð�
		 		
		 �ڹ� ��¥�ð� �ڷ���
		 1.Date Ŭ���� > JDK 1.0
		 2.Calender Ŭ���� > JDK 1.1
		 3.LocalDateTime, LocalDate, LocalTime Ŭ���� > JDK 1.8
		 
		 A.�ð�
		 B.�ð�
		 
		 2023�� 2�� 7�� 4�� 39�� 18�� > �ð�
		 �����ð��� �� 8�ð��Դϴ� > �ð�
		 
		 -ƽ(tick)��, Epoch Time, Timestamp > Ư�������Ϸκ��� �ش� �ð����� ��ŭ �귶���� ���� ���� �ð�
		 
		 - �ð� + �ð� = 2023.02.07 + 2023.05.13 = x		 
		 - �ð� - �ð� = 2023.05.13 - 2023.02.07 = o		
		 - �ð� - �ð� = �ð�		
		 
		 - �ð� + �ð� = 8�ð� + 2�ð� = 10�ð�,o		
		 - �ð� - �ð� = 8�ð� - 2�ð� = 6�ð�,o

		 
		 - �ð� + �ð� = 2023.02.07 +5�� = 2023.02.12, o 
		 - �ð� - �ð� = 2023.02.07 +-�� = 2023.02.02, o 
		 - �ð� - �ð� = �ð�
		 
		 1. ���� �ð� �����			>Calendar.getInstance()
		 2. Ư�� ��Ʈ �б�				>c1.get(���)
		 3. Ư�� �ð� �����(�����ϱ�)	>c1.get(���, ��)
		 4. �ð� + �ð� = �ð�			>c1.get(���, ��)
		 5. �ð� - �ð� = �ð�			>c1.get(���, -��)
		 6. �ð� - �ð� = �ð�			>getTimeInMillis()
		 7. �ð� + �ð� = �ð�			>�������
		 8. �ð� - �ð� = �ð�			>�������
		 
		  
		 */
		//m1();
		//m2();
		m3();
		//m4();
		//m5();
		
		
		//���� �ð� tick
		Calendar now = Calendar.getInstance();
		System.out.println(now.getTimeInMillis());
		System.out.println(System.currentTimeMillis());
		
		
		

		
	}
		private static void m4() {

		//����
		//- �ð� + �ð�
		//- �ð� - �ð�
		
		//���� ���� Ŀ�� > 100��
		Calendar now = Calendar.getInstance();
		
		System.out.printf("1����: %tF\n",now);
		
		now.add(Calendar.DATE, 100); // ��¥ ����. now�� ���̻� ���� �ð��� �ƴ�s
		//now.add(Calendar.MONTH, 10);
		System.out.printf("100����: %tF\n",now);
		
		//���� + 100 >100�� ��ġ
		Calendar birthday = Calendar.getInstance();
		birthday.set(1995, 6, 10, 12,30 ,0);
		birthday.add(Calendar.DATE, 100);
		System.out.printf("������ġ: %tF\n", birthday);
		
		//12����?
		now = Calendar.getInstance();// ���� �ð� �ʱ�ȭ
		now.add(Calendar.DATE, -12);
		System.out.printf("%tF\n",now);
		
		//3�ð� 17�� �ڿ� ����
		now = Calendar.getInstance();// ���� �ð� �ʱ�ȭ
		now.add(Calendar.HOUR, 3);
		now.add(Calendar.MINUTE, 17);
		System.out.printf("������ ���� �ð�: %tT\n",now);
		
		//���� ��ƿ� �ð�(870472586984ms)
		
		System.out.println((now.getTimeInMillis() - birthday.getTimeInMillis())/1000/60/60/24);
		
		
		
	}
	public static void m1() {
		//���� 1
		
		//Date, Calendar
		
		//Date   date;   // ���� ����
//		  �ڷ���   ������
		Date date = new Date(); //���� �ð��� �����ؼ� data��� ������ ��ƶ� > ���� ��ǻ�� 
		System.out.println(date);
		
	}

	public static void m2() {
		
		//Calendar Ŭ����
		
		Calendar now = Calendar.getInstance();
		//System.out.println(c1);
		
		//java.util.GregorianCalendar[time=1675758221364,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=22,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2023,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=7,DAY_OF_YEAR=38,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=23,SECOND=41,MILLISECOND=364,ZONE_OFFSET=32400000,DST_OFFSET=0]
		//c1�ȿ� ����ִ� �� ���� ������ �� ���ϴ� �����͸� ����
		//- int get(int)
		
//		System.out.println(c1.get(1)); // �⵵ ���� - 2023�� 
//		System.out.println(c1.get(2));
//		System.out.println(c1.get(3));
//		System.out.println(c1.get(4));
//		System.out.println(c1.get(5));
//		
//		int year = 1 ;
//		System.out.println(c1.get(1));
//		System.out.println(c1.get(year));
//		System.out.println(c1.get(Calendar.YEAR));
		
		System.out.println();
		//�ڹٰ� �����ϴ� Calendar ���
		System.out.println(Calendar.YEAR);				//�⵵ 
		System.out.println(Calendar.MONTH);				//��
		System.out.println(Calendar.DATE);				//��
		System.out.println(Calendar.HOUR);				//��(12H)
		System.out.println(Calendar.SECOND);			//��
		System.out.println(Calendar.MINUTE);			//��
		System.out.println(Calendar.MILLISECOND);		//�и���
		System.out.println(Calendar.AM_PM);				//����
		
		System.out.println(Calendar.DAY_OF_YEAR);		//��
		System.out.println(Calendar.DAY_OF_MONTH);		//��
		System.out.println(Calendar.DAY_OF_WEEK);		//����
		
		System.out.println(Calendar.WEEK_OF_YEAR);		//���� (��)
		System.out.println(Calendar.WEEK_OF_MONTH);		//���� (��)
		
		System.out.println(Calendar.HOUR_OF_DAY);		//��(24H)
		
		//�޷¿��� ������� ������ ���� �� �ַ� ������.

		//]�䱸���� : ������ 2023�� 2�� 7�� �Դϴ�.
		System.out.printf("������ %d�� %d�� %d�� �Դϴ�.",now.get(Calendar.YEAR),now.get(Calendar.MONTH)+1,now.get(Calendar.DATE));
		
		
		System.out.printf("������ %d�� %02d�� %02d�� �Դϴ�.",now.get(Calendar.YEAR),now.get(Calendar.MONTH)+1,now.get(Calendar.DATE));//���ڸ��� ����� ���ڸ� �� �տ� 0 �ֱ�
		
		//14�� 12�� 53��
		System.out.printf("������ %02d�� %02d�� %02d���Դϴ�.\n",now.get(Calendar.HOUR_OF_DAY),now.get(Calendar.MINUTE),now.get(Calendar.SECOND));
		
		//2�� 12�� 53��
		System.out.printf("������ %s %02d�� %02d�� %02d���Դϴ�.\n",now.get(Calendar.AM_PM)==0 ?"����":"����",now.get(Calendar.HOUR_OF_DAY),now.get(Calendar.MINUTE),now.get(Calendar.SECOND));
		
		//2023-02-08 > printf()
		System.out.printf("%t\n",now);
		
		//�ú��� 09:22:17
		System.out.printf("%tT\n", now);
		
		//������
		System.out.println(now.get(Calendar.DAY_OF_WEEK));
		System.out.printf("%tA\n", now);
		
		
		//"������ �������Դϴ�." > ���� ����
		//String.format() �޼ҵ�
		String msg = String.format("������ �������Դϴ�.")	;	
		
		
		
	}

	
	private static void m3() {
		
		//- get(int)
		//- set(int)
		
		//���� �ð� �����
		Calendar now = Calendar.getInstance();
		Calendar birthday = Calendar.getInstance();

		//Ư�� �ð� �����
		//1. ���� �ð� �����
		//2. ���ϴ� �ð����� ��������
		Calendar endDate = Calendar.getInstance();
//		endDate.set(Calendar.YEAR,1995);
		endDate.set(Calendar.MONTH,6);
		endDate.set(Calendar.DATE,12);
		
		endDate.set(Calendar.HOUR_OF_DAY,18);
		endDate.set(Calendar.MINUTE,0);
		endDate.set(Calendar.SECOND,0);
		
		System.out.printf("%tF %tA %tT\n", endDate,endDate,endDate);
		
	}
}
