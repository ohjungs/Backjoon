package StepByStepAlgorithm;

import java.util.Scanner;

public class Level10_3 {
	/*
	 * 2447�� �� ���
	 * ���� ������� �������� ���� ��� ����. N�� 3�� �ŵ�����(3, 9, 27, ...)�̶�� �� ��, ũ�� N�� ������
	 * N��N ���簢�� ����̴�.
	 * 
	 * ũ�� 3�� ������ ����� ������ �ְ�, ����� ������ ��� ĭ�� ���� �ϳ��� �ִ� �����̴�.
	 ***
	 * 
	 * *
	 ***
	 * N�� 3���� Ŭ ���, ũ�� N�� ������ �������� ä���� ����� (N/3)��(N/3) ���簢���� ũ�� N/3�� �������� �ѷ��� �����̴�.
	 * ���� ��� ũ�� 27�� ������ ���� ��� 1�� ����.
	 * 
	 * �Է� ù° �ٿ� N�� �־�����. N�� 3�� �ŵ������̴�. �� � ���� k�� ���� N=3k�̸�, �̶� 1 �� k < 8�̴�.
	 * 
	 * ��� ù° �ٺ��� N��° �ٱ��� ���� ����Ѵ�.
	 */
	static char[][] arr;
	 
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int N = in.nextInt();
 
			arr = new char[N][N];
			
			star(0, 0, N, false);
 
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					sb.append(arr[i][j]);
				}
				sb.append('\n');
			}
			System.out.print(sb);
		}
	}
 
	static void star(int x, int y, int N, boolean blank) {
 
		// ����ĭ�� ���
		if (blank) {
			for (int i = x; i < x + N; i++) {
				for (int j = y; j < y + N; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
 
		// ���̻� �ɰ� �� ���� ����� ��
		if (N == 1) {
			arr[x][y] = '*';
			return;
		}
 
		/*
		   N=27 �� ��� �� ����� ������� 9�̰�, 
		   N=9 �� ��� �� ����� ������� 3�̵�
		   �ش� ����� �� ĭ�� ���� ������ �ǹ� size
           
		   count�� �� ��� ������ �ǹ�
		 */
 
		int size = N / 3;
		int count = 0;
		for (int i = x; i < x + N; i += size) {
			for (int j = y; j < y + N; j += size) {
				count++;
				if (count == 5) { // ���� ĭ�� ���
					star(i, j, size, true);
				} else {
					star(i, j, size, false);
				}
			}
		}
	}
}