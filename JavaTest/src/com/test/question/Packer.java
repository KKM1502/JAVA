package com.test.question;
//Packer
//사무용품을 포장하는 직원

//상태
//static pencilCount
//연필 포장 개수(개)
//static eraserCount
//지우개 포장 개수(개)
//static ballPoinPenCount
//볼펜 포장 개수(개)
//static rulerCount
//자 포장 개수(개)

//행동
//void packing(Pencil pencil)
//연필을 검수하고 포장한다.
//Pencil pencil : 연필

//void packing(Eraser eraser)
//지우개를 검수하고 포장한다.
//Eraser eraser : 지우개

//void packing(BallPointPen ballPointPen)
//볼펜을 검수하고 포장한다.
//BallPointPen ballPointPen : 볼펜

//void packing(Ruler ruler)
//자를 검수하고 포장한다.
//Ruler ruler : 자

//void countPacking(int type)
//포장한 내용물 개수를 출력한다.
//int type : 출력할 내용물의 종류
//0 : 모든 내용물
//1 : 연필
//2 : 지우개
//3 : 볼펜
//4 : 자
public class Packer {

	private static int pencilCount=0;
	private static int eraserCount=0;
	private static int ballPoinPenCount=0;
	private static int rulerCount=0;
	
	
	public void packing(Pencil pencil) {
		System.out.printf("포장 전 검수 : %s입니다.\n",pencil.info());
		String[] array={"4B", "3B", "2B", "B", "HB", "H", "2H", "3H", "4H"};
		for (int i = 0; i < array.length; i++) {
			if(pencil.getHardness().equals(array[i])){
				System.out.println("포장을 완료했습니다.\n");
				Packer.pencilCount++;
			}
		}
		if(Packer.pencilCount==0) {
			System.out.println("포장을 실패했습니다.\n");
		}
		
		
	}
	public void packing(Eraser eraser) {
		System.out.printf("포장 전 검수 : %s입니다.\n",eraser.info());
		String[] array={"Large", "Medium", "Small"};
		for (int i = 0; i < array.length; i++) {
			if(eraser.getSize().equals(array[i])){
				System.out.println("포장을 완료했습니다.\n");
				Packer.eraserCount++;
			}
		}
		if(Packer.eraserCount==0) {
			System.out.println("포장을 실패했습니다.\n");
		}
		
		
	}
	public void packing(BallPointPen ballpointpen) {
		System.out.printf("포장 전 검수 : %s입니다.\n",ballpointpen.info());
		double[] array={0.3, 0.5, 0.7, 1, 1.5};
		String[] array1= {"red", "blue", "green", "black"};
		boolean result = false;
		
		for (int i = 0; i < array.length; i++) {
			if(ballpointpen.getThickness()==array[i]){
				result = true;
			}
		}
		if(result) {
			for (int i = 0; i < array1.length; i++) {
				if(ballpointpen.getColor().equals(array1[i])){
					System.out.println("포장을 완료했습니다.\n");
					Packer.ballPoinPenCount++;
					}
			}
		}
		if(Packer.ballPoinPenCount==0) {
			System.out.println("포장을 실패했습니다.\n");
		}
		
	}
	
	public void packing(Ruler ruler) {
		System.out.printf("포장 전 검수 : %s입니다.\n",ruler.info());
		int[] array={30, 50, 100};
		String[] array1= {"줄자", "운형자", "삼각자"};
		boolean result = false;
		
		for (int i = 0; i < array.length; i++) {
			if(ruler.getLength()==array[i]){
				result = true;
			}
		}
		if(result) {
			for (int i = 0; i < array1.length; i++) {
				if(ruler.getShape().equals(array1[i])){
					System.out.println("포장을 완료했습니다.\n");
					Packer.rulerCount++;
					}
			}
		}
		if(Packer.rulerCount==0) {
			System.out.println("포장을 실패했습니다.\n");
		}
		
	}
	public void countPacking(int i) {
		System.out.print("=====================\n포장 결과\n=====================\n");
		
		
		switch (i) {
		case 0:
			System.out.printf("연필 %d회\n",Packer.pencilCount);
			System.out.printf("지우개 %d회\n",Packer.eraserCount);
			System.out.printf("볼펜 %d회\n",Packer.ballPoinPenCount);
			System.out.printf("자 %d회\n",Packer.rulerCount);
			System.out.println();
			break;
		case 1:
			System.out.printf("연필 %d회\n",Packer.pencilCount);
			System.out.println();
			break;
		case 2:
			System.out.printf("지우개 %d회\n",Packer.eraserCount);
			System.out.println();
			break;
		case 3:
			System.out.printf("볼펜 %d회\n",Packer.ballPoinPenCount);
			System.out.println();
			break;
		case 4:
			System.out.printf("자 %d회\n",Packer.rulerCount);
			System.out.println();
			break;

		}
		
	}
	
	

}
