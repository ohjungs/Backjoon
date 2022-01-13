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

	static int N;
	static int[] seq;
	static int[] r_dp;
	static int[] l_dp;
	
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		N = Integer.parseInt(br.readLine());
		
		r_dp = new int[N];	// LIS
		l_dp = new int[N];	// LDS
		seq = new int[N];
		
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		for (int i = 0; i < N; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
 
		LIS();
		LDS();
		
		int max = 0;
		for(int i = 0; i < N; i++) {
			if(max < r_dp[i] + l_dp[i]) {
				max = r_dp[i] + l_dp[i];
			}
		}
 
		System.out.println(max - 1);
	}
 
	
	
	static void LIS() {
 
		for(int i = 0; i < N; i++) {
			r_dp[i] = 1;
		    
			// 0 ~ i ���� ���ҵ� Ž��
			for(int j = 0; j < i; j++) {
		    
				// j��° ���Ұ� i��° ���Һ��� �����鼭 i��° dp�� j��° dp+1 ������ �������
				if(seq[j] < seq[i] && r_dp[i] < r_dp[j] + 1) {
					r_dp[i] = r_dp[j] + 1;	// j��° ������ +1 ���� i��° dp�� �ȴ�.
				}
			}
		}
	}
 
 
	
	static void LDS() {
 
		// �ڿ������� ���� 
		for (int i = N - 1; i >= 0; i--) {
			l_dp[i] = 1;
			
			// �� �ڿ��� i ���� ���ҵ��� Ž�� 
			for (int j = N - 1; j > i; j--) {
				
				// i��° ���Ұ� j��° ���Һ��� ũ�鼭 i��° dp�� j��° dp+1 ������ ������� 
				if (seq[j] < seq[i] && l_dp[i] < l_dp[j] + 1) {
					l_dp[i] = l_dp[j] + 1;	// j���� ������ +1�� i���� dp���� ��
				}
			}
		}
	
	}
}
