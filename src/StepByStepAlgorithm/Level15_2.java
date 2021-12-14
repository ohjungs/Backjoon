package StepByStepAlgorithm;

import java.util.Scanner;

public class Level15_2 {
	/*
	 * 9184�� �ų��� �Լ� ���� ���� ��� ȣ�⸸ �����ϸ� ���� ����! �ƴѰ���?
	 * 
	 * ������ ���� ����Լ� w(a, b, c)�� �ִ�.
	 * 
	 * if a <= 0 or b <= 0 or c <= 0, then w(a, b, c) returns: 1
	 * 
	 * if a > 20 or b > 20 or c > 20, then w(a, b, c) returns: w(20, 20, 20)
	 * 
	 * if a < b and b < c, then w(a, b, c) returns: w(a, b, c-1) + w(a, b-1, c-1) -
	 * w(a, b-1, c)
	 * 
	 * otherwise it returns: w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1,
	 * b-1, c-1) ���� �Լ��� �����ϴ� ���� �ſ� ����. ������, �״�� �����ϸ� ���� ���ϴµ� �ſ� ���� �ð��� �ɸ���. (���� ���,
	 * a=15, b=15, c=15)
	 * 
	 * a, b, c�� �־����� ��, w(a, b, c)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� �Է��� �� ���� a, b, c�� �̷���� ������, �� �ٿ� �ϳ��� �־�����. �Է��� �������� -1 -1 -1�� ��Ÿ����, �� ������
	 * ��� -1�� ���� �Է��� �������� �����ϸ� ����.
	 * 
	 * ��� �Է����� �־��� ������ a, b, c�� ���ؼ�, w(a, b, c)�� ����Ѵ�.
	 */
	static int[][][] dp = new int[21][21][21];
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);		
		
		while(true) {
			
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			
			// -1 -1 -1 �� ������ ����
			if (a == -1 && b == -1 && c == -1) {
				break;
			}
			
			System.out.printf("w(%d, %d, %d) = %d\n", a, b, c, w(a, b, c));
		}
		
	}
	
	static int w(int a, int b, int c) { 
		
		// a, b, c�� ������ ����� �����鼭 �޸������̼��� �Ǿ��ִ� ���
		if(inRange(a, b, c) && dp[a][b][c] != 0) {
			return dp[a][b][c];
		}
		
		if(a <= 0 || b <= 0 || c <= 0) {
			return 1;
		}
		
		if(a > 20 || b > 20 || c > 20) {
			return dp[20][20][20] = w(20, 20, 20);
		}
		
		if(a < b && b < c) {
			return dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
		}
		
		return dp[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
	}
	
	/*
	 *  �迭�� �����Ϸ� �� �� a, b, c �� �ϳ��� ���� ���� ����
	 *  ���� �� �ֱ� ������ �̸� üũ�� ���ֱ� ���� �Լ���.
	 */
	static boolean inRange(int a, int b, int c) {
		return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20; 
	}
}
