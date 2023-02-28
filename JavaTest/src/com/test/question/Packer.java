package com.test.question;
//Packer
//�繫��ǰ�� �����ϴ� ����

//����
//static pencilCount
//���� ���� ����(��)
//static eraserCount
//���찳 ���� ����(��)
//static ballPoinPenCount
//���� ���� ����(��)
//static rulerCount
//�� ���� ����(��)

//�ൿ
//void packing(Pencil pencil)
//������ �˼��ϰ� �����Ѵ�.
//Pencil pencil : ����

//void packing(Eraser eraser)
//���찳�� �˼��ϰ� �����Ѵ�.
//Eraser eraser : ���찳

//void packing(BallPointPen ballPointPen)
//������ �˼��ϰ� �����Ѵ�.
//BallPointPen ballPointPen : ����

//void packing(Ruler ruler)
//�ڸ� �˼��ϰ� �����Ѵ�.
//Ruler ruler : ��

//void countPacking(int type)
//������ ���빰 ������ ����Ѵ�.
//int type : ����� ���빰�� ����
//0 : ��� ���빰
//1 : ����
//2 : ���찳
//3 : ����
//4 : ��
public class Packer {

	private static int pencilCount=0;
	private static int eraserCount=0;
	private static int ballPoinPenCount=0;
	private static int rulerCount=0;
	
	
	public void packing(Pencil pencil) {
		System.out.printf("���� �� �˼� : %s�Դϴ�.\n",pencil.info());
		String[] array={"4B", "3B", "2B", "B", "HB", "H", "2H", "3H", "4H"};
		for (int i = 0; i < array.length; i++) {
			if(pencil.getHardness().equals(array[i])){
				System.out.println("������ �Ϸ��߽��ϴ�.\n");
				Packer.pencilCount++;
			}
		}
		if(Packer.pencilCount==0) {
			System.out.println("������ �����߽��ϴ�.\n");
		}
		
		
	}
	public void packing(Eraser eraser) {
		System.out.printf("���� �� �˼� : %s�Դϴ�.\n",eraser.info());
		String[] array={"Large", "Medium", "Small"};
		for (int i = 0; i < array.length; i++) {
			if(eraser.getSize().equals(array[i])){
				System.out.println("������ �Ϸ��߽��ϴ�.\n");
				Packer.eraserCount++;
			}
		}
		if(Packer.eraserCount==0) {
			System.out.println("������ �����߽��ϴ�.\n");
		}
		
		
	}
	public void packing(BallPointPen ballpointpen) {
		System.out.printf("���� �� �˼� : %s�Դϴ�.\n",ballpointpen.info());
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
					System.out.println("������ �Ϸ��߽��ϴ�.\n");
					Packer.ballPoinPenCount++;
					}
			}
		}
		if(Packer.ballPoinPenCount==0) {
			System.out.println("������ �����߽��ϴ�.\n");
		}
		
	}
	
	public void packing(Ruler ruler) {
		System.out.printf("���� �� �˼� : %s�Դϴ�.\n",ruler.info());
		int[] array={30, 50, 100};
		String[] array1= {"����", "������", "�ﰢ��"};
		boolean result = false;
		
		for (int i = 0; i < array.length; i++) {
			if(ruler.getLength()==array[i]){
				result = true;
			}
		}
		if(result) {
			for (int i = 0; i < array1.length; i++) {
				if(ruler.getShape().equals(array1[i])){
					System.out.println("������ �Ϸ��߽��ϴ�.\n");
					Packer.rulerCount++;
					}
			}
		}
		if(Packer.rulerCount==0) {
			System.out.println("������ �����߽��ϴ�.\n");
		}
		
	}
	public void countPacking(int i) {
		System.out.print("=====================\n���� ���\n=====================\n");
		
		
		switch (i) {
		case 0:
			System.out.printf("���� %dȸ\n",Packer.pencilCount);
			System.out.printf("���찳 %dȸ\n",Packer.eraserCount);
			System.out.printf("���� %dȸ\n",Packer.ballPoinPenCount);
			System.out.printf("�� %dȸ\n",Packer.rulerCount);
			System.out.println();
			break;
		case 1:
			System.out.printf("���� %dȸ\n",Packer.pencilCount);
			System.out.println();
			break;
		case 2:
			System.out.printf("���찳 %dȸ\n",Packer.eraserCount);
			System.out.println();
			break;
		case 3:
			System.out.printf("���� %dȸ\n",Packer.ballPoinPenCount);
			System.out.println();
			break;
		case 4:
			System.out.printf("�� %dȸ\n",Packer.rulerCount);
			System.out.println();
			break;

		}
		
	}
	
	

}
