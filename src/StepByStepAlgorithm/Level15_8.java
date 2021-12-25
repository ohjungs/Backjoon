package StepByStepAlgorithm;

import java.util.Scanner;

public class Level15_8 {
	/*
	 * 1463�� 1�� ����� ���� ���� X�� ����� �� �ִ� ������ ������ ���� �� ���� �̴�.
	 * 
	 * X�� 3���� ������ ��������, 3���� ������. X�� 2�� ������ ��������, 2�� ������. 1�� ����. ���� N�� �־����� ��, ���� ����
	 * ���� �� ���� ������ ����ؼ� 1�� ������� �Ѵ�. ������ ����ϴ� Ƚ���� �ּڰ��� ����Ͻÿ�.
	 * 
	 * �Է� ù° �ٿ� 1���� ũ�ų� ����, 106���� �۰ų� ���� ���� N�� �־�����.
	 * 
	 * ��� ù° �ٿ� ������ �ϴ� Ƚ���� �ּڰ��� ����Ѵ�.
	 */

	static Integer[] dp;
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
 
		dp = new Integer[N + 1];
		dp[0] = dp[1] = 0;
 
		System.out.print(recur(N));
 
	}
 
	static int recur(int N) {
 
		if (dp[N] == null) {
			// 6���� �������� ��� 
			if (N % 6 == 0) {
				dp[N] = Math.min(recur(N - 1), Math.min(recur(N / 3), recur(N / 2))) + 1;
			}
			// 3���θ� �������� ��� 
			else if (N % 3 == 0) {
				dp[N] = Math.min(recur(N / 3), recur(N - 1)) + 1;
			}
			// 2�θ� �������� ��� 
			else if (N % 2 == 0) {
				dp[N] = Math.min(recur(N / 2), recur(N - 1)) + 1;
			}
			// 2�� 3���� ���������� �ʴ� ���
			else {
				dp[N] = recur(N - 1) + 1;
			}
		}
		return dp[N];
	}
 
}
