package StepByStepAlgorithm;

import java.util.Scanner;

public class Level9_7 {
	/* 1085�� ���簢������ Ż��
	 * �� ���� �Ѽ��� ���� (x, y)�� �ִ�. ���簢���� �� ���� ��ǥ�࿡ �����ϰ�, ���� �Ʒ� �������� (0, 0), ������ �� ��������
	 * (w, h)�� �ִ�. ���簢���� ��輱���� ���� �Ÿ��� �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� ù° �ٿ� x, y, w, h�� �־�����.
	 * 
	 * ��� ù° �ٿ� ������ ������ ����Ѵ�.
	 * 
	 * ���� 1 �� w, h �� 1,000 1 �� x �� w-1 1 �� y �� h-1 x, y, w, h�� ����
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
		int x = in.nextInt();
		int y = in.nextInt();
		int w = in.nextInt();
		int h = in.nextInt();
        
		int x_min = Math.min(x, w-x);	// x�� �ּҰŸ�
		int y_min = Math.min(y, h-y);	// y�� �ּҰŸ�
        
		// x�� y�� �ּҰŸ� �� ���� ���� ��
		System.out.println(Math.min(x_min, y_min));
	}
}
