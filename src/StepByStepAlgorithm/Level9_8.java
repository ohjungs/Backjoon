package StepByStepAlgorithm;

import java.util.Scanner;

public class Level9_8 {
	/*
	 * 3009�� �׹�° �� ���� �� ���� �־����� ��, �࿡ ������ ���簢���� ����� ���ؼ� �ʿ��� �� ��° ���� ã�� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� �� ���� ��ǥ�� �� �ٿ� �ϳ��� �־�����. ��ǥ�� 1���� ũ�ų� ����, 1000���� �۰ų� ���� �����̴�.
	 * 
	 * ��� ���簢���� �� ��° ���� ��ǥ�� ����Ѵ�
	 */public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			 
			int[] coord_1 = { in.nextInt(), in.nextInt() };	// ù ��° ��ǥ
			int[] coord_2 = { in.nextInt(), in.nextInt() };	// �� ��° ��ǥ
			int[] coord_3 = { in.nextInt(), in.nextInt() };	// �� ��° ��ǥ
	 
			
			in.close();
			
			int x;
			int y;
	 
			// x ��ǥ �� �� ���� �̷��� �ʴ� x��ǥ�� ����
			// 1�� x��ǥ�� 2�� x��ǥ �� 
			if (coord_1[0] == coord_2[0]) {	
				x = coord_3[0];
			}
			// 1�� x��ǥ�� 3�� x��ǥ ��
			else if (coord_1[0] == coord_3[0]) {
				x = coord_2[0];
			}
			// 2�� x��ǥ�� 3�� x��ǥ ��
			else {
				x = coord_1[0];
			}
	 
			// y ��ǥ ��
			// 1�� y��ǥ�� 2�� y��ǥ ��
			if (coord_1[1] == coord_2[1]) {
				y = coord_3[1];
			}
			// 1�� y��ǥ�� 3�� y��ǥ ��
			else if (coord_1[1] == coord_3[1]) {
				y = coord_2[1];
			}
			// 2�� y��ǥ�� 3�� y��ǥ ��
			else {
				y = coord_1[1];
			}
			
			System.out.println(x + " " + y);
			
		}
	}