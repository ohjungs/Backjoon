package StepByStepAlgorithm;

import java.util.Scanner;

public class Level15_11 {
	/*
	 * 11053�� ���� ���� A�� �־����� ��, ���� �� �����ϴ� �κ� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * ���� ���, ���� A = {10, 20, 10, 30, 20, 50} �� ��쿡 ���� �� �����ϴ� �κ� ������ A = {10, 20,
	 * 10, 30, 20, 50} �̰�, ���̴� 4�̴�.
	 * 
	 * �Է� ù° �ٿ� ���� A�� ũ�� N (1 �� N �� 1,000)�� �־�����.
	 * 
	 * ��° �ٿ��� ���� A�� �̷�� �ִ� Ai�� �־�����. (1 �� Ai �� 1,000)
	 * 
	 * ��� ù° �ٿ� ���� A�� ���� �� �����ϴ� �κ� ������ ���̸� ����Ѵ�.
	 */
	static int[] seq;
	static Integer[] dp;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		seq = new int[N];
		dp = new Integer[N];
		
		
		for(int i = 0; i < N; i++) {
			seq[i] = in.nextInt();
		}
		
		// 0 ~ N-1 ���� ��� �κм��� Ž�� 
		for(int i = 0; i < N; i++) {
			LIS(i);
		}
		
		int max = dp[0];
		// �ִ� ã�� 
		for(int i = 1; i < N; i++) {
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
	}
	
	
	static int LIS(int N) {
		
		// ���� Ž������ �ʴ� ��ġ�� ��� 
		if(dp[N] == null) {
			dp[N] = 1;	// 1�� �ʱ�ȭ 
			
			// N-1 ���� 0������ N���� ���� ������ ã���鼭 ���ȣ��. 
			for(int i = N - 1; i >= 0; i--) {
				if(seq[i] < seq[N]) {
					dp[N] = Math.max(dp[N], LIS(i) + 1);
				}
			}
		}
		return dp[N];
	}
	
}
