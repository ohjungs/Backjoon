package StepByStepAlgorithm;

import java.util.Scanner;

public class Level15_15 {
	/*
	 * 1912 ������ ���� n���� ������ �̷���� ������ ������ �־�����. �츮�� �� �� ���ӵ� �� ���� ���� �����ؼ� ���� �� �ִ� �� ��
	 * ���� ū ���� ���Ϸ��� �Ѵ�. ��, ���� �� �� �̻� �����ؾ� �Ѵ�.
	 * 
	 * ���� �� 10, -4, 3, 1, 5, 6, -35, 12, 21, -1 �̶�� ������ �־����ٰ� ����. ���⼭ ������ 12+21��
	 * 33�� ������ �ȴ�.
	 * 
	 * �Է� ù° �ٿ� ���� n(1 �� n �� 100,000)�� �־����� ��° �ٿ��� n���� ������ �̷���� ������ �־�����. ����
	 * -1,000���� ũ�ų� ����, 1,000���� �۰ų� ���� �����̴�.
	 * 
	 * ��� ù° �ٿ� ���� ����Ѵ�.
	 */
	static int[] arr;		// �迭 
	static Integer[] dp;		// �޸������̼� �� dp
	static int max;			// �ִ� ���� 
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		arr = new int[N];
		dp = new Integer[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		
		/*
		 * dp[0]�� ù ���ҷ� ������ ���̻� Ž���� ���� ���� ������
		 * arr[0] ��ü ���� �ǹǷ� arr[0]���� �ʱ�ȭ ���ش�.
		 * max���� ù ��° ���ҷ� �ʱ�ȭ ���ش�.
		 */
		dp[0] = arr[0];
		max = arr[0];
		
		// dp�� ������ index�� N-1�̹Ƿ� N-1���� Top-Down Ž�� 
		recur(N - 1);
		
		System.out.println(max);
	}
	
	static int recur(int N) {
		
		// Ž������ ���� �ε������
		if(dp[N] == null) {
			dp[N] = Math.max(recur(N - 1) + arr[N], arr[N]);
 
			// �ش� dp[N]�� max �� ū ������ max ���� 
			max = Math.max(dp[N], max);
		}
		
		return dp[N];
	}
}
