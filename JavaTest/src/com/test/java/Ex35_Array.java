package com.test.java;


public class Ex35_Array {

	public static void main(String[] args) {
	
//		m1();
//		m2();
//		m3();
//		m4();
//		m5();
		
		
		
		
	}//main

	private static void m5() {
		int[][] nums = new int[5][5];
		//[[I@5ccd43c2, [I@4aa8f0b4, [I@7960847b, [I@6a6824be, [I@5c8da962]
//		System.out.println(Arrays.toString(nums));
		//toString은 가장 바깥쪽의 배열만 보여줌(dump)
		
		int n =1;
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				nums[i][j]=n;
				n++;
			}
		}
		
		
		
		printArray(nums);
	}

	private static void printArray(int[][] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.printf("%5d",nums[i][j]);
				
			}
			System.out.println();
		}
		
	}

	private static void m4() {
		
		//성적표
		//여러명 국,영,수
		int[][]	score = new int[10][3];//10명 3과목
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j]=(int)(Math.random() * 41)+60	;
				
			}
		}
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[0].length; j++) {
				
			}
			System.out.printf("%5d\t%5d\t%5d\n",score[i][0],score[i][1],score[i][2]);
		}
		
		
		
	}

	private static void m3() {
		// 초기화 리스트
		int[] nums1 = {10,20,30};
		int[][] nums2 = {{10,20,30},{40,50,60}};
		int[][][] nums3 = {{{10},{20},{30}},{{40},{50},{60}},{{10,20,30},{40,50,60}}};
		int[][][] nums4 = {
								{
									{10,20,30},
									{40,50,60}
								},
								{
									{10,20,30},
									{40,50,60}
								}
							};
	}
	
	private static void m2() {
//		int nums[] = new int[3];
//		int[] nums	= new int[3]; //권장
		
		//배열의 길이
		int[] nums1 = new int[3];
		System.out.println(nums1.length);//3
		
		int[][] nums2 = new int[2][3];	
		System.out.println(nums2.length);//2
		System.out.println(nums2[0].length);//3
		
		
		int[][][] nums3 = new int[5][2][3];
		System.out.println(nums3.length);//5
		
		//num3의 자료형 = int[][][] = int 3차원 배열
		//num3[0]의 자료형 = int[][] = int 2차원 배열
		//num3[0][0]의 자료형 = int[] = int 1차원 배열 
		
	}

	private static void m1() {

		
		//1차원 배열
		int[] nums1 = new int[3];
		
		//2차원 배열
		int[][] nums2 = new int[2][3];		//2= 행 3= 열
		
		//3차원 배열
		int[][][] nums3 = new int[2][2][3]; //2= 면 2= 행 3= 열
		
		nums1[0]	=	100;
		nums1[1]	=	100;
		nums1[2]	=	100;
		
		//2차원 배열
		nums2[0][0] = 100;
		nums2[0][1] = 200;
		nums2[0][2] = 300;
		
		nums2[1][0] = 400;
		nums2[1][1] = 500;
		nums2[1][2] = 600;
		
		nums3[0][0][0] = 100;
		nums3[0][0][1] = 200;
		nums3[0][0][2] = 300;
		
		nums3[0][1][0] = 400;
		nums3[0][1][1] = 500;
		nums3[0][1][2] = 600;
		
		nums3[1][0][0] = 700;
		nums3[1][0][1] = 800;
		nums3[1][0][2] = 900;
		
		nums3[1][1][0] = 700;
		nums3[1][1][1] = 800;
		nums3[1][1][2] = 900;
		
		//2차원 탐색
		for (int i = 0; i < nums2.length; i++) { //바깥쪽 배열의 길이
			for (int j = 0; j < nums2[i].length; j++) { // 아쪽 배열의 길이
				System.out.printf("nums2[%d][%d]=[%d]\n",i,j,nums2[i][j]);
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%5d",nums2[i][j]);
			}
			System.out.println();
		}
		
		
		 
		//3차원 배열
		for (int i = 0; i < nums3.length; i++) {
			for (int j = 0; j < nums3[i].length; j++) {
				for (int k = 0; k < nums3[i][j].length; k++) {
					System.out.printf("nums3[%d][%d][%d]=[%d]\n",i,j,k,nums3[i][j][k]);
				}
				
			}
		}
		System.out.println();
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 3; k++) {
					System.out.printf("%5d",nums3[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
	
	
	
	
}
