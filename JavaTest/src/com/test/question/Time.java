package com.test.question;

public class Time {
//	상태
//	hour: 시(0 이상 양의 정수)
//	minute: 분(0 이상 양의 정수)
//	second: 초(0 이상 양의 정수)
//	행동
//	public Time()
//	기본 생성자
//	시(0), 분(0), 초(0)
//	public Time(int hour, int minute, int second)
//	생성자 오버로딩
//	hour : 시
//	minute : 분
//	second : 초
//	public Time(int minute, int second)
//	생성자 오버로딩
//	minute : 분
//	second : 초
//	public Time(int second)
//	생성자 오버로딩
//	second : 초
//	String info()
//	02:30:45
	
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		this.hour = 00;
		this.minute = 00;
		this.second = 00;
	}
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		while(this.minute >60) {
			this.hour++;
			this.minute=this.minute-60;
		}
	}
	public Time(int minute, int second) {
		this.hour = minute/60;
		this.minute = minute%60;
		this.second = second;
	}
	public Time(int second) {
		this.hour = second/60/60;
		this.minute = second/60%60;
		this.second = second%60;
	}
	public String info() {
		return String.format("%02d:%02d:%02d", this.hour,this.minute,this.second);
				
	}
	
}
