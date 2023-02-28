package com.test.java;

public class Ex06_Variable {

	public static void main(String[] args) {
		
		//과제
		// - 9개 자료형
		// - 값형(8개) + 참조형(1개)
		// - 변수 생성 + 데이터 + 출력
		
		//1. 무작위의 데이터 선별
		//2. 데이터의 성격 > 
		//3. 변수 생성 > 변수명
		//4. 값 대입 > 상수
		
		short Km_Height;	//키
		Km_Height = 181;
		
		short Km_Weight;	//몸무게
		Km_Weight = 70;
		
		float Km_BMI;	//BMI
		Km_BMI = 21.36f;
		
		double Km_VA;	//시력 VisualAcuity
		Km_VA = 2.0;
		
		String Km_Laptop = "lenovo";	//노트북
		String Cur_Place= "집";	//현재 위치
		int Num_Bro = 1;	//형제 수
		int Num_Family = 4;	//가족 수
		String Km_Hobby = "coding"; //취미
		String Cur_Status= "Hungry";
		
		System.out.println("1.저의 키는 "+Km_Height+"cm입니다.");
		System.out.println("2.저의 몸무게는 "+Km_Weight+"kg입니다.");
		System.out.println("3.저의 BMI수치는 "+Km_BMI+"입니다.");
		System.out.println("4.저의 시력은 "+Km_VA+"입니다.");
		System.out.println("5.저의 패드는 "+Km_Laptop+"입니다.");
		System.out.println("6.저의 현재위치는 "+Cur_Place+"입니다.");
		System.out.println("7.저는 "+Num_Bro+"명의 형제가 있습니다.");
		System.out.println("8.제 가족의 수는 "+Num_Family+"명입니다.");
		System.out.println("9.저의 취미는 "+Km_Hobby+"입니다.");
		System.out.println("10.I'm "+Cur_Status+".");
 		
		
	}
	
}
