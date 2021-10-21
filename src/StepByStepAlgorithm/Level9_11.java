package StepByStepAlgorithm;

import java.util.Scanner;

public class Level9_11 {
	/*
	 * 1002�� �ͷ� ���� �������� ���ȯ�� �ͷ��� �ٹ��ϴ� �����̴�. ������ ���� ���簨�� ��� �α����� �������� �ʴ´�. ������ ��������
	 * ���ȯ�� �����̴�.
	 * 
	 * 
	 * 
	 * �̼����� �������� ���ȯ���� ����� ����(�����)�� ��ġ�� ����϶�� ����� ���ȴ�. �������� ���ȯ�� ���� �ڽ��� �ͷ� ��ġ���� ����
	 * �������� �Ÿ��� ����ߴ�.
	 * 
	 * �������� ��ǥ (x1, y1)�� ���ȯ�� ��ǥ (x2, y2)�� �־�����, �������� ����� �������� �Ÿ� r1�� ���ȯ�� �����
	 * �������� �Ÿ� r2�� �־����� ��, ������� ���� �� �ִ� ��ǥ�� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. �� �׽�Ʈ ���̽��� ������ ���� �̷���� �ִ�.
	 * 
	 * �� �ٿ� x1, y1, r1, x2, y2, r2�� �־�����. x1, y1, x2, y2�� -10,000���� ũ�ų� ����, 10,000����
	 * �۰ų� ���� �����̰�, r1, r2�� 10,000���� �۰ų� ���� �ڿ����̴�.
	 * 
	 * ��� �� �׽�Ʈ ���̽����� ������� ���� �� �ִ� ��ġ�� ���� ����Ѵ�. ���� ������� ���� �� �ִ� ��ġ�� ������ ���Ѵ��� ��쿡��
	 * -1�� ����Ѵ�.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		 
		int T = in.nextInt();
 
		while (T-- > 0) {
 
			int x1 = in.nextInt();
			int y1 = in.nextInt();
			int r1 = in.nextInt();
 
			int x2 = in.nextInt();
			int y2 = in.nextInt();
			int r2 = in.nextInt();
			
			System.out.println(tangent_point(x1, y1, r1, x2, y2, r2));
		}
 
	}
 
 
	// ���� ���� ���ϴ� �Լ�
	public static int tangent_point(int x1, int y1, int r1, int x2, int y2, int r2) {
    
		int distance_pow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));	// ������ �Ÿ� distance�� ���� 
 
 
		// case 1 : ������ �����鼭 �������� ���� ���
		if(x1 == x2 && y1 == y2 && r1 == r2) {
			return -1;
		}
		
		// case 2-1 : �� ���� ������ �պ��� ������ �Ÿ��� �� �� �� 
		else if(distance_pow > Math.pow(r1 + r2, 2)) {
			return 0;
		}
 
		// case 2-2 : �� �ȿ� ���� ������ �������� ���� �� 
		else if(distance_pow < Math.pow(r2 - r1, 2)) {
			return 0;
		}
		
		// case 3-1 : ������ �� 
		else if(distance_pow == Math.pow(r2 - r1, 2)) {
			return 1;
		}
        
		
		// case 3-2 : ������ �� 
		else if(distance_pow == Math.pow(r1 + r2, 2)) {
			return 1;
		}
		
		else {
			return 2;
		}
	}
}
