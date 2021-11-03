package StepByStepAlgorithm;

import java.util.Scanner;

public class Level11_4 {
	public static boolean[][] arr;
	public static int min = 64;
	
public static void main(String[] args) {
	/*
	 * 1018�� ü���� �ٽ� ĥ�ϱ� ���� �����̴� �ڽ��� ���ÿ��� MN���� ���� ���簢������ �������� �ִ� M��N ũ���� ���带 ã�Ҵ�. �
	 * ���簢���� ���������� ĥ���� �ְ�, �������� ������� ĥ���� �ִ�. �����̴� �� ���带 �߶� 8��8 ũ���� ü�������� ������� �Ѵ�.
	 * 
	 * ü������ �������� ����� �����Ƽ� ĥ���� �־�� �Ѵ�. ��ü������, �� ĭ�� �������� ��� �� �ϳ��� ��ĥ�Ǿ� �ְ�, ���� �����ϴ� ��
	 * ���� �簢���� �ٸ� ������ ĥ���� �־�� �Ѵ�. ���� �� ���Ǹ� ������ ü������ ��ĥ�ϴ� ���� �� �������̴�. �ϳ��� �� ���� �� ĭ��
	 * ����� ���, �ϳ��� �������� ����̴�.
	 * 
	 * ���尡 ü����ó�� ĥ���� �ִٴ� ������ ���, �����̴� 8��8 ũ���� ü�������� �߶� �Ŀ� �� ���� ���簢���� �ٽ� ĥ�ؾ߰ڴٰ�
	 * �����ߴ�. �翬�� 8*8 ũ��� �ƹ������� ��� �ȴ�. �����̰� �ٽ� ĥ�ؾ� �ϴ� ���簢���� �ּ� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� ù° �ٿ� N�� M�� �־�����. N�� M�� 8���� ũ�ų� ����, 50���� �۰ų� ���� �ڿ����̴�. ��° �ٺ��� N���� �ٿ��� ������
	 * �� ���� ���°� �־�����. B�� �������̸�, W�� ����̴�.
	 * 
	 * ��� ù° �ٿ� �����̰� �ٽ� ĥ�ؾ� �ϴ� ���簢�� ������ �ּڰ��� ����Ѵ�.
	 */
	Scanner in = new Scanner(System.in);
	 
	int N = in.nextInt();
	int M = in.nextInt();

	arr = new boolean[N][M];
	
    
	// �迭 �Է� 
	for (int i = 0; i < N; i++) {
		String str = in.next();
		
		for (int j = 0; j < M; j++) {
			if (str.charAt(j) == 'W') {
				arr[i][j] = true;		// W�� ���� true 
			} else {
				arr[i][j] = false;		// B�� ���� false
			}

		}
	}

	
	int N_row = N - 7;
	int M_col = M - 7;

	for (int i = 0; i < N_row; i++) {
		for (int j = 0; j < M_col; j++) {
			find(i, j);
		}
	}
	System.out.println(min);
}


public static void find(int x, int y) {
	int end_x = x + 8;
	int end_y = y + 8;
	int count = 0;

	boolean TF = arr[x][y];	// ù ��° ĭ�� �� 

	for (int i = x; i < end_x; i++) {
		for (int j = y; j < end_y; j++) {

			// �ùٸ� ���� �ƴҰ�� count 1 ���� 
			if (arr[i][j] != TF) {	
				count++;
			}
			
			/* 
			 * ���� ĭ�� ���� �ٲ�Ƿ�
			 * true��� false��, false ��� true ��
			 * ���� �����Ѵ�.
			 */
			TF = (!TF);
		}
		
		TF = !TF;
	}
	
	/*
	 *  ù ��° ĭ�� �������� �� ���� ��ĥ �� ����(count)��
	 *  ù ��° ĭ�� ���� �ݴ�Ǵ� ���� �������� �� ����
	 *  ��ĥ �� ����(64 - count) �� �ּڰ��� count �� ���� 
	 */
	count = Math.min(count, 64 - count);
	
	/*
	 * ���������� ��� �� �ּڰ����� ���� count ����
	 * �� ���� ��� �ּڰ��� ���� 
	 */
	min = Math.min(min, count);
}
}
