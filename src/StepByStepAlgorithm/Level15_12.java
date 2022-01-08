package StepByStepAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Level15_12 {
	/*
	 * 11054 ���� �� ������� �κ� ���� ���� ���� S�� � �� Sk�� �������� S1 < S2 < ... Sk-1 < Sk > Sk+1 >
	 * ... SN-1 > SN�� �����Ѵٸ�, �� ������ ������� �����̶�� �Ѵ�.
	 * 
	 * ���� ���, {10, 20, 30, 25, 20}�� {10, 20, 30, 40}, {50, 40, 25, 10} �� ������� ����������,
	 * {1, 2, 3, 2, 1, 2, 3, 2, 1}�� {10, 20, 30, 40, 20, 30} �� ������� ������ �ƴϴ�.
	 * 
	 * ���� A�� �־����� ��, �� ������ �κ� ���� �� ������� �����̸鼭 ���� �� ������ ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� ù° �ٿ� ���� A�� ũ�� N�� �־�����, ��° �ٿ��� ���� A�� �̷�� �ִ� Ai�� �־�����. (1 �� N �� 1,000, 1 ��
	 * Ai �� 1,000)
	 * 
	 * ��� ù° �ٿ� ���� A�� �κ� ���� �߿��� ���� �� ������� ������ ���̸� ����Ѵ�.
	 */

	static Integer[] r_dp;
	static Integer[] l_dp;
	static int[] seq;
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
 
		r_dp = new Integer[N];	// LIS dp
		l_dp = new Integer[N];	// LDS dp
		seq = new int[N];
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		for (int i = 0; i < N; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
 
		for (int i = 0; i < N; i++) {
			LIS(i);
			LDS(i);
		}
 
		int max = -1;
		for (int i = 0; i < N; i++) {
			max = Math.max(r_dp[i] + l_dp[i], max);
		}
		System.out.println(max - 1);
 
	}
 
	static int LIS(int N) {
 
		// ���� Ž������ �ʴ� ��ġ�� ���
		if (r_dp[N] == null) {
			r_dp[N] = 1; // 1�� �ʱ�ȭ
 
			// N ������ ������ Ž��
			for (int i = N - 1; i >= 0; i--) {
				// ������ ��� �� seq[N]�� ������ ���� �� �߰����� ���
				if (seq[i] < seq[N]) {
					r_dp[N] = Math.max(r_dp[N], LIS(i) + 1);
				}
			}
		}
		return r_dp[N];
	}
 
	static int LDS(int N) {
		
		// ���� Ž������ �ʴ� ��ġ�� ���
		if (l_dp[N] == null) {
			l_dp[N] = 1; // 1�� �ʱ�ȭ
 
			// N ������ ������ Ž��
			for (int i = N + 1; i < l_dp.length; i++) {
				// ������ ��� �� seq[N]�� ������ ���� �� �߰����� ���
				if (seq[i] < seq[N]) {
					l_dp[N] = Math.max(l_dp[N], LDS(i) + 1);
				}
			}
		}
		return l_dp[N];
	}
}