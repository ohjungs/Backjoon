package StepByStepAlgorithm;

import java.util.Scanner;

public class Level10_4 {
	/*
	 * 11729�� �ϳ��� ž �̵� ���� ���� �� ���� ��밡 �ְ� ù ��° ��뿡�� �ݰ��� ���� �ٸ� n���� ������ �׿� �ִ�. �� ������
	 * �ݰ��� ū ������� �׿��ִ�. ���� �����µ��� ���� ��Ģ�� ���� ù ��° ��뿡�� �� ��° ���� �ű�� �Ѵ�.
	 * �� ���� �� ���� ���Ǹ��� �ٸ� ž���� �ű� �� �ִ�. �׾� ���� ������ �׻� ���� ���� �Ʒ��� �ͺ��� �۾ƾ� �Ѵ�. �� �۾��� �����ϴµ�
	 * �ʿ��� �̵� ������ ����ϴ� ���α׷��� �ۼ��϶�. ��, �̵� Ƚ���� �ּҰ� �Ǿ�� �Ѵ�.
	 * �Ʒ� �׸��� ������ 5���� ����� �����̴�.
	 * �Է� ù° �ٿ� ù ��° ��뿡 ���� ������ ���� N (1 �� N �� 20)�� �־�����.
	 * ��� ù° �ٿ� �ű� Ƚ�� K�� ����Ѵ�.
	 * �� ��° �ٺ��� ���� ������ ����Ѵ�. �� ��° �ٺ��� K���� �ٿ� ���� �� ���� A B�� ��ĭ�� ���̿� �ΰ� ����ϴµ�, �̴� A��°
	 * ž�� ���� ���� �ִ� ������ B��° ž�� ���� ���� �ű�ٴ� ���̴�.
	 *//*
	N : ������ ����
	start : �����
	mid : �ű�� ���� �̵��ؾ� ���
	to : ������
*/
	public static StringBuilder sb = new StringBuilder();
	 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
 
		sb.append((int) (Math.pow(2, N) - 1)).append('\n');
 
		Hanoi(N, 1, 2, 3);
		System.out.println(sb);
	}
	public static void Hanoi(int N, int start, int mid, int to) {
		// �̵��� ������ ���� 1�����?
		if (N == 1) {
			sb.append(start + " " + to + "\n");
			return;
		}
		// STEP 1 : N-1���� A���� B�� �̵�
		Hanoi(N - 1, start, to, mid);
		
		// STEP 2 : 1���� A���� C�� �̵�
		sb.append(start + " " + to + "\n");
		
		// STEP 3 : N-1���� B���� C�� �̵�
		Hanoi(N - 1, mid, start, to);
 
	}
	

}
