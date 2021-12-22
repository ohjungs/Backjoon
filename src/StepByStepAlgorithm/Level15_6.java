package StepByStepAlgorithm;

import java.util.Scanner;

public class Level15_6 {
	/*
	 * 1932 ���� �ﰢ�� ���� 7 3 8 8 1 0 2 7 4 4 4 5 2 6 5 �� �׸��� ũ�Ⱑ 5�� ���� �ﰢ���� �� ����̴�.
	 * 
	 * �� ���� 7���� �����ؼ� �Ʒ��� �ִ� �� �� �ϳ��� �����Ͽ� �Ʒ������� ������ ��, �������� ���õ� ���� ���� �ִ밡 �Ǵ� ��θ� ���ϴ�
	 * ���α׷��� �ۼ��϶�. �Ʒ����� �ִ� ���� ���� ������ ���õ� ���� �밢�� ���� �Ǵ� �밢�� �����ʿ� �ִ� �� �߿����� ������ �� �ִ�.
	 * 
	 * �ﰢ���� ũ��� 1 �̻� 500 �����̴�. �ﰢ���� �̷�� �ִ� �� ���� ��� �����̸�, ������ 0 �̻� 9999 �����̴�.
	 * 
	 * �Է� ù° �ٿ� �ﰢ���� ũ�� n(1 �� n �� 500)�� �־�����, ��° �ٺ��� n+1��° �ٱ��� ���� �ﰢ���� �־�����.
	 * 
	 * ��� ù° �ٿ� ���� �ִ밡 �Ǵ� ��ο� �ִ� ���� ���� ����Ѵ�.
	 */
	static int[][] arr;
	static Integer[][] dp;
	static int N;
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		N = in.nextInt();
 
		arr = new int[N][N];
		dp = new Integer[N][N];
 
        
		// �迭 �ʱ�ȭ
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i + 1; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		// ���� ������ ���� ������ DP�� ������ �࿡�� �Ȱ��� ����
		for (int i = 0; i < N; i++) {
			dp[N - 1][i] = arr[N - 1][i];
		}
 
		System.out.println(find(0, 0));
 
	}
 
	
	static int find(int depth, int idx) {
		// ������ ���� ��� ���� ��ġ�� dp�� ��ȯ
		if(depth == N - 1) return dp[depth][idx];
 
		// Ž������ �ʾҴ� ���� ��� ���� ���� ���� �� ��
		if (dp[depth][idx] == null) {
			dp[depth][idx] = Math.max(find(depth + 1, idx), find(depth + 1, idx + 1)) + arr[depth][idx];
		}
		return dp[depth][idx];
 
	}
}
