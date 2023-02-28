package com.test.question;

public class Time {
//	����
//	hour: ��(0 �̻� ���� ����)
//	minute: ��(0 �̻� ���� ����)
//	second: ��(0 �̻� ���� ����)
//	�ൿ
//	public Time()
//	�⺻ ������
//	��(0), ��(0), ��(0)
//	public Time(int hour, int minute, int second)
//	������ �����ε�
//	hour : ��
//	minute : ��
//	second : ��
//	public Time(int minute, int second)
//	������ �����ε�
//	minute : ��
//	second : ��
//	public Time(int second)
//	������ �����ε�
//	second : ��
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
