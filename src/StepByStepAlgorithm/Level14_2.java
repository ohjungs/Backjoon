package StepByStepAlgorithm;

import java.util.Scanner;

public class Level14_2 {
	/*
	 * 15650�� N�� M(2) ���� �ڿ��� N�� M�� �־����� ��, �Ʒ� ������ �����ϴ� ���̰� M�� ������ ��� ���ϴ� ���α׷���
	 * �ۼ��Ͻÿ�.
	 * 
	 * 1���� N���� �ڿ��� �߿��� �ߺ� ���� M���� �� ���� �� ������ ���������̾�� �Ѵ�. �Է� ù° �ٿ� �ڿ��� N�� M�� �־�����.
	 * (1 �� M �� N �� 8)
	 * 
	 * ��� �� �ٿ� �ϳ��� ������ ������ �����ϴ� ������ ����Ѵ�. �ߺ��Ǵ� ������ ���� �� ����ϸ� �ȵǸ�, �� ������ �������� �����ؼ�
	 * ����ؾ� �Ѵ�.
	 * 
	 * ������ ���� ������ �����ϴ� ������ ����ؾ� �Ѵ�.
	 */
	public static int[] arr;
	public static int N, M;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		N = in.nextInt();
		M = in.nextInt();
 
		arr = new int[M];
        
		dfs(1, 0);
 
	}
 
	public static void dfs(int at, int depth) {
 
		if (depth == M) {
			for (int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
        
		for (int i = at; i <= N; i++) {
 
			arr[depth] = i;
			dfs(i + 1, depth + 1);
 
		}	
	}
}
