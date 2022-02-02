package StepByStepAlgorithm;

import java.util.Scanner;

public class Level16_1 {
	/*
	 * 11047�� ���� 0 ���� �ر԰� ������ �ִ� ������ �� N�����̰�, ������ ������ �ſ� ���� ������ �ִ�. ������ ������ ����ؼ� ��
	 * ��ġ�� ���� K�� ������� �Ѵ�. �̶� �ʿ��� ���� ������ �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. �Է� ù° �ٿ� N�� K�� �־�����.
	 * (1 �� N �� 10, 1 �� K �� 100,000,000) ��° �ٺ��� N���� �ٿ� ������ ��ġ Ai�� ������������ �־�����. (1 ��
	 * Ai �� 1,000,000, A1 = 1, i �� 2�� ��쿡 Ai�� Ai-1�� ���) ��� ù° �ٿ� K���� ����µ� �ʿ��� ���� ������
	 * �ּڰ��� ����Ѵ�.
	 */

	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int K = in.nextInt();
		
		int[] coin = new int[N];
		
		for(int i = 0; i < N; i++) {
			coin[i] = in.nextInt();
		}
		
		int count = 0;
 
		for(int i = N - 1; i >= 0; i--) {
 
			// ���� ������ ��ġ�� K���� �۰ų� ���ƾ��� ���������ϴ�.
			if(coin[i] <= K) {
				// ���� ��ġ�� �������� ������ �� �ִ� ������ �����ش�.
				count += (K / coin[i]);
				K = K % coin[i];
			}
		}
		System.out.println(count);
	}
}
