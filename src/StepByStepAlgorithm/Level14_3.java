package StepByStepAlgorithm;

import java.util.Scanner;

public class Level14_3 {
	/*
	 * 15651�� N�� M(3) ���� �ڿ��� N�� M�� �־����� ��, �Ʒ� ������ �����ϴ� ���̰� M�� ������ ��� ���ϴ� ���α׷���
	 * �ۼ��Ͻÿ�.
	 * 
	 * 1���� N���� �ڿ��� �߿��� M���� �� ���� ���� ���� ���� �� ��� �ȴ�. �Է� ù° �ٿ� �ڿ��� N�� M�� �־�����. (1 �� M
	 * �� N �� 7)
	 * 
	 * ��� �� �ٿ� �ϳ��� ������ ������ �����ϴ� ������ ����Ѵ�. �ߺ��Ǵ� ������ ���� �� ����ϸ� �ȵǸ�, �� ������ �������� �����ؼ�
	 * ����ؾ� �Ѵ�.
	 * 
	 * ������ ���� ������ �����ϴ� ������ ����ؾ� �Ѵ�.
	 */

		public static int[] arr;
		public static int N, M;
		public static StringBuilder sb = new StringBuilder();
	 
		public static void main(String[] args) {
	 
			Scanner in = new Scanner(System.in);
	 
			N = in.nextInt();
			M = in.nextInt();
	 
			arr = new int[M];
	        
			dfs(0);
			System.out.print(sb);
	 
		}
	 
		public static void dfs(int depth) {
			// ���̰� M�̶� �������� ����� return
			if (depth == M) {
				for (int i = 0; i < M; i++) {
					sb.append(arr[i] + " ");
				}
				sb.append('\n');
				return;
			}
	 
			for (int i = 1; i <= N; i++) {
				arr[depth] = i;
				dfs(depth + 1);
			}
	}
}
