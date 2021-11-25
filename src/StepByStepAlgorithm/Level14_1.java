package StepByStepAlgorithm;

import java.util.Scanner;

public class Level14_1 {
	/*
	 * 15649�� N�� M(1) ���� �ڿ��� N�� M�� �־����� ��, �Ʒ� ������ �����ϴ� ���̰� M�� ������ ��� ���ϴ� ���α׷���
	 * �ۼ��Ͻÿ�.
	 * 
	 * 1���� N���� �ڿ��� �߿��� �ߺ� ���� M���� �� ���� �Է� ù° �ٿ� �ڿ��� N�� M�� �־�����. (1 �� M �� N �� 8)
	 * 
	 * ��� �� �ٿ� �ϳ��� ������ ������ �����ϴ� ������ ����Ѵ�. �ߺ��Ǵ� ������ ���� �� ����ϸ� �ȵǸ�, �� ������ �������� �����ؼ�
	 * ����ؾ� �Ѵ�.
	 * 
	 * ������ ���� ������ �����ϴ� ������ ����ؾ� �Ѵ�.
	 */
	public static int[] arr;
	public static boolean[] visit;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int N = in.nextInt();
		int M = in.nextInt();
 
		arr = new int[M];
		visit = new boolean[N];
		dfs(N, M, 0);
 
	}
 
	public static void dfs(int N, int M, int depth) {
		if (depth == M) {
			for (int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
 
		for (int i = 0; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;
				dfs(N, M, depth + 1);
				visit[i] = false;
			}
		}
	}
}
