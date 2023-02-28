package com.test.java;

import java.util.Calendar;
import java.util.Date;

public class Ex28_DateTime {
	public static void main(String[] args) {
		
		
		/*
		 1. 원시형
		 	-int, char, short, long 등등
		 
		 2. 참조형
		 	- 클래스
		 		-String
		 		-날짜/시간
		 		
		 자바 날짜시간 자료형
		 1.Date 클래스 > JDK 1.0
		 2.Calender 클래스 > JDK 1.1
		 3.LocalDateTime, LocalDate, LocalTime 클래스 > JDK 1.8
		 
		 A.시각
		 B.시간
		 
		 2023년 2월 7일 4시 39분 18초 > 시각
		 수업시간은 총 8시간입니다 > 시간
		 
		 -틱(tick)값, Epoch Time, Timestamp > 특정기준일로부터 해당 시각까지 얼만큼 흘렀는지 구한 누적 시간
		 
		 - 시각 + 시각 = 2023.02.07 + 2023.05.13 = x		 
		 - 시각 - 시각 = 2023.05.13 - 2023.02.07 = o		
		 - 시각 - 시각 = 시간		
		 
		 - 시간 + 시간 = 8시간 + 2시간 = 10시간,o		
		 - 시간 - 시간 = 8시간 - 2시간 = 6시간,o

		 
		 - 시각 + 시간 = 2023.02.07 +5일 = 2023.02.12, o 
		 - 시각 - 시간 = 2023.02.07 +-일 = 2023.02.02, o 
		 - 시각 - 시간 = 시각
		 
		 1. 현재 시각 만들기			>Calendar.getInstance()
		 2. 특정 파트 읽기				>c1.get(상수)
		 3. 특정 시각 만들기(수정하기)	>c1.get(상수, 값)
		 4. 시각 + 시간 = 시각			>c1.get(상수, 값)
		 5. 시각 - 시각 = 시각			>c1.get(상수, -값)
		 6. 시각 - 시각 = 시간			>getTimeInMillis()
		 7. 시각 + 시각 = 시간			>산술연산
		 8. 시간 - 시간 = 시간			>산술연산
		 
		  
		 */
		//m1();
		//m2();
		m3();
		//m4();
		//m5();
		
		
		//현재 시각 tick
		Calendar now = Calendar.getInstance();
		System.out.println(now.getTimeInMillis());
		System.out.println(System.currentTimeMillis());
		
		
		

		
	}
		private static void m4() {

		//연산
		//- 시각 + 시간
		//- 시각 - 시간
		
		//오늘 만날 커플 > 100일
		Calendar now = Calendar.getInstance();
		
		System.out.printf("1일차: %tF\n",now);
		
		now.add(Calendar.DATE, 100); // 날짜 수정. now는 더이상 현재 시각이 아님s
		//now.add(Calendar.MONTH, 10);
		System.out.printf("100일차: %tF\n",now);
		
		//생일 + 100 >100일 잔치
		Calendar birthday = Calendar.getInstance();
		birthday.set(1995, 6, 10, 12,30 ,0);
		birthday.add(Calendar.DATE, 100);
		System.out.printf("백일잔치: %tF\n", birthday);
		
		//12일전?
		now = Calendar.getInstance();// 현재 시각 초기화
		now.add(Calendar.DATE, -12);
		System.out.printf("%tF\n",now);
		
		//3시간 17분 뒤에 복용
		now = Calendar.getInstance();// 현재 시각 초기화
		now.add(Calendar.HOUR, 3);
		now.add(Calendar.MINUTE, 17);
		System.out.printf("영양제 복용 시간: %tT\n",now);
		
		//내가 살아온 시간(870472586984ms)
		
		System.out.println((now.getTimeInMillis() - birthday.getTimeInMillis())/1000/60/60/24);
		
		
		
	}
	public static void m1() {
		//예제 1
		
		//Date, Calendar
		
		//Date   date;   // 변수 선언
//		  자료형   변수명
		Date date = new Date(); //현재 시각을 생성해서 data라는 변수에 담아라 > 현재 컴퓨터 
		System.out.println(date);
		
	}

	public static void m2() {
		
		//Calendar 클래스
		
		Calendar now = Calendar.getInstance();
		//System.out.println(c1);
		
		//java.util.GregorianCalendar[time=1675758221364,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=22,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2023,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=7,DAY_OF_YEAR=38,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=23,SECOND=41,MILLISECOND=364,ZONE_OFFSET=32400000,DST_OFFSET=0]
		//c1안에 들어있는 수 많은 데이터 중 원하는 데이터를 추출
		//- int get(int)
		
//		System.out.println(c1.get(1)); // 년도 추출 - 2023년 
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
		//자바가 제공하는 Calendar 상수
		System.out.println(Calendar.YEAR);				//년도 
		System.out.println(Calendar.MONTH);				//월
		System.out.println(Calendar.DATE);				//일
		System.out.println(Calendar.HOUR);				//시(12H)
		System.out.println(Calendar.SECOND);			//초
		System.out.println(Calendar.MINUTE);			//분
		System.out.println(Calendar.MILLISECOND);		//밀리초
		System.out.println(Calendar.AM_PM);				//오후
		
		System.out.println(Calendar.DAY_OF_YEAR);		//일
		System.out.println(Calendar.DAY_OF_MONTH);		//일
		System.out.println(Calendar.DAY_OF_WEEK);		//요일
		
		System.out.println(Calendar.WEEK_OF_YEAR);		//주차 (연)
		System.out.println(Calendar.WEEK_OF_MONTH);		//주차 (달)
		
		System.out.println(Calendar.HOUR_OF_DAY);		//시(24H)
		
		//달력에서 목요일을 포함한 달이 그 주룰 가진다.

		//]요구사항 : 오늘은 2023년 2월 7일 입니다.
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.",now.get(Calendar.YEAR),now.get(Calendar.MONTH)+1,now.get(Calendar.DATE));
		
		
		System.out.printf("오늘은 %d년 %02d월 %02d일 입니다.",now.get(Calendar.YEAR),now.get(Calendar.MONTH)+1,now.get(Calendar.DATE));//두자리로 만들고 한자리 수 앞에 0 넣기
		
		//14시 12분 53초
		System.out.printf("지금은 %02d시 %02d분 %02d초입니다.\n",now.get(Calendar.HOUR_OF_DAY),now.get(Calendar.MINUTE),now.get(Calendar.SECOND));
		
		//2시 12분 53초
		System.out.printf("지금은 %s %02d시 %02d분 %02d초입니다.\n",now.get(Calendar.AM_PM)==0 ?"오전":"오후",now.get(Calendar.HOUR_OF_DAY),now.get(Calendar.MINUTE),now.get(Calendar.SECOND));
		
		//2023-02-08 > printf()
		System.out.printf("%t\n",now);
		
		//시분초 09:22:17
		System.out.printf("%tT\n", now);
		
		//수요일
		System.out.println(now.get(Calendar.DAY_OF_WEEK));
		System.out.printf("%tA\n", now);
		
		
		//"오늘은 수요일입니다." > 변수 저장
		//String.format() 메소드
		String msg = String.format("오늘은 수요일입니다.")	;	
		
		
		
	}

	
	private static void m3() {
		
		//- get(int)
		//- set(int)
		
		//현재 시각 만들기
		Calendar now = Calendar.getInstance();
		Calendar birthday = Calendar.getInstance();

		//특정 시각 만들기
		//1. 현재 시각 만들기
		//2. 원하는 시각으로 수정하지
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
