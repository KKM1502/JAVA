package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Ex13_Error {

	public static void main(String[] args) throws IOException {
//		Ex13_Error.java
		
//		1. ������ ����
//			- ������ �۾� �� �߻��ϴ� ����
//			- �����Ϸ� �߰�!! > �����ϴ�... >������ Ʋ����!
//			- ���̵� ���� ���� > �߰��� ���� ���� >��ġ�Ⱑ ����
//			- ��Ÿ!!!
		//	- ���� ���ΰ� �Ǵ� �����̹Ƿ� ��������
/*		2. ��Ÿ�� ����
//			- ��Ÿ�� > ������
 			- ������ �ۼ� �߿��� �����µ� ���� �߿� �߻��ϴ� ���� 
 			- �������� ������ �����µ� �ٸ� �������� �߻��ϴ� ����
 			- ����
 			- ���̵� �߰� > �߰� �߰� > �߰� ���Һ� >�׽�Ʈ
 												>�߰� 0 > ����
 												>�߰� x > ���� ���� 
 
  		3. �� ����
  			������ ����!!! ���� ����~!! �ٵ� ����� �̻�....?
  			���̵� �ֻ�!! 
  		
*/		
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("���� �Է�:" );
	String input = reader.readLine();
	
	double num = Double.parseDouble(input);
		
	Double result =(100 / num); // 0���� ������ �� ���� �߻�~!
		
	System.out.printf("%.2f",result);
		
	}
	
}
