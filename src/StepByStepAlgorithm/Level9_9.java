package StepByStepAlgorithm;

import java.util.Scanner;

public class Level9_9 {
	/* 4153�� �����ﰢ��
	 * ���� ���� ����Ʈ�ε��� �� ������ ���̰� 3, 4, 5�� �ﰢ���� ���� �ﰢ���ΰ��� �˾Ƴ´�. �־��� ������ ���̷� �ﰢ���� ��������
	 * �ƴ��� �����Ͻÿ�.
	 * 
	 * �Է� �Է��� �������� �׽�Ʈ���̽��� �־����� �������ٿ��� 0 0 0�� �Էµȴ�. �� �׽�Ʈ���̽��� ��� 30,000���� ���� ���� ������
	 * �־�����, �� �Է��� ���� ���̸� �ǹ��Ѵ�.
	 * 
	 * ��� �� �Է¿� ���� ���� �ﰢ���� �´ٸ� "right", �ƴ϶�� "wrong"�� ����Ѵ�.
	 */
	public static void main(String[] args) {
	     Scanner in = new Scanner(System.in);
	       
	        
	        while(true) {
	        	
	        	int x = in.nextInt();
	        	int y = in.nextInt();
	        	int z = in.nextInt();
	        	
				// 0 0 0 �� �Է¹����� ����
	        	if(x == 0 && y == 0 && z == 0) break;
	            
	        	
	        	if((x * x + y * y) == z * z) {
					System.out.println("right");
				}
	        	else if(x * x == (y * y + z * z)) {
					System.out.println("right");
				}
	        	else if(y * y == (z * z + x * x)) {
					System.out.println("right");
				}
	        	else {
					System.out.println("wrong");
				}
	        	
			}
	}
}
