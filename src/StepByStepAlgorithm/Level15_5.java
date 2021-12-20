package StepByStepAlgorithm;

import java.util.Scanner;

public class Level15_5 {
	/*
	 * 1149�� RGB �Ÿ�
	 *  ���� RGB�Ÿ����� ���� N�� �ִ�. �Ÿ��� �������� ��Ÿ�� �� �ְ�, 1�� ������ N�� ���� ������� �ִ�.
	 * 
	 * ���� ����, �ʷ�, �Ķ� �� �ϳ��� ������ ĥ�ؾ� �Ѵ�. ������ ���� ����, �ʷ�, �Ķ����� ĥ�ϴ� ����� �־����� ��, �Ʒ� ��Ģ��
	 * �����ϸ鼭 ��� ���� ĥ�ϴ� ����� �ּڰ��� ���غ���.
	 * 
	 * 1�� ���� ���� 2�� ���� ���� ���� �ʾƾ� �Ѵ�. N�� ���� ���� N-1�� ���� ���� ���� �ʾƾ� �Ѵ�. i(2 �� i �� N-1)��
	 * ���� ���� i-1��, i+1�� ���� ���� ���� �ʾƾ� �Ѵ�. �Է� ù° �ٿ� ���� �� N(2 �� N �� 1,000)�� �־�����. ��°
	 * �ٺ��� N���� �ٿ��� �� ���� ����, �ʷ�, �Ķ����� ĥ�ϴ� ����� 1�� ������ �� �ٿ� �ϳ��� �־�����. ���� ĥ�ϴ� �����
	 * 1,000���� �۰ų� ���� �ڿ����̴�.
	 * 
	 * ��� ù° �ٿ� ��� ���� ĥ�ϴ� ����� �ּڰ��� ����Ѵ�.
	 */
	final static int Red = 0;
	final static int Green = 1;
	final static int Blue = 2;
	
	static int[][] Cost;
	static int[][] DP;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
        
		Cost = new int[N][3];
		DP = new int[N][3];
		
		for(int i = 0; i < N; i++) {
			Cost[i][Red] = in.nextInt();
			Cost[i][Green] = in.nextInt();
			Cost[i][Blue] = in.nextInt();
		}
		
		// DP�� ù��° ��(��)�� �� �������� ù��° ������ �ʱ�ȭ
		DP[0][Red] = Cost[0][Red];
		DP[0][Green] = Cost[0][Green];
		DP[0][Blue] = Cost[0][Blue];
		
		
		System.out.print(Math.min(Paint_cost(N- 1, Red), Math.min(Paint_cost(N - 1, Green), Paint_cost(N - 1, Blue))));
	}
	
	static int Paint_cost(int N, int color) {
		
		// ���� Ž������ ���� �迭�̶��
		if(DP[N][color] == 0) {
			
			// color�� ���� ���� ���� ���� ���� �ٸ� ���� ���ȣ���Ͽ� �ּڰ��� ���� ���� ����� ���ؼ� DP�� �����Ѵ�
			if(color == Red) {
				DP[N][Red] = Math.min(Paint_cost(N - 1, Green), Paint_cost(N - 1, Blue)) + Cost[N][Red];
			}
			else if(color == Green) {
				DP[N][Green] = Math.min(Paint_cost(N - 1, Red), Paint_cost(N - 1, Blue)) + Cost[N][Green];
			}
			else {
				DP[N][Blue] = Math.min(Paint_cost(N - 1, Red), Paint_cost(N - 1, Green)) + Cost[N][Blue];
			}
			
		}
		
		return DP[N][color];
	}

}
