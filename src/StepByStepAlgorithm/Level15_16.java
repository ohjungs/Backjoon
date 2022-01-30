package StepByStepAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Level15_16 {
	/*
	 * 12865�� ����� �賶 ���� �� ������ ���� ����� �賶�� ���� �����̴�. �� �� �ĸ� ������ �θ��� �ް� �Ǵ� �ؼ��� ������ ������
	 * �Ѵ�. ������� ������ �����ϸ� �ִ��� ���� ���� �����̱� ������, ������ �ٴ� �賶 ���� �ִ��� ��ġ �ְ� �η��� �Ѵ�. �ؼ��� ���࿡
	 * �ʿ��ϴٰ� �����ϴ� N���� ������ �ִ�. �� ������ ���� W�� ��ġ V�� �����µ�, �ش� ������ �賶�� �־ ���� �ؼ��� V��ŭ ��� ��
	 * �ִ�. ���� �౺�� �غ� ���� ���� �ؼ��� �ִ� K��ŭ�� ���Ը��� ���� �� �ִ� �賶�� ��� �ٴ� �� �ִ�. �ؼ��� �ִ��� ��ſ� ������
	 * �ϱ� ���� �賶�� ���� �� �ִ� ���ǵ��� ��ġ�� �ִ��� �˷�����. �Է� ù �ٿ� ��ǰ�� �� N(1 �� N �� 100)�� �ؼ��� ��ƿ ��
	 * �ִ� ���� K(1 �� K �� 100,000)�� �־�����. �� ��° �ٺ��� N���� �ٿ� ���� �� ������ ���� W(1 �� W ��
	 * 100,000)�� �ش� ������ ��ġ V(0 �� V �� 1,000)�� �־�����. �Է����� �־����� ��� ���� �����̴�. ��� �� �ٿ� �賶��
	 * ���� �� �ִ� ���ǵ��� ��ġ���� �ִ��� ����Ѵ�.
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
 
		int[] W = new int[N + 1]; // ����
		int[] V = new int[N + 1]; // ��ġ
		int[] dp = new int[K + 1];
 
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			W[i] = Integer.parseInt(st.nextToken());
			V[i] = Integer.parseInt(st.nextToken());
		}
 
		for (int i = 1; i <= N; i++) {
			
			// K���� Ž���Ͽ� ���� �� �ִ� ���� �Ѱ�ġ�� ���� ���� ������ �ݺ� 
			for (int j = K; j - W[i] >= 0; j--) {
				dp[j] = Math.max(dp[j], dp[j - W[i]] + V[i]);
			}
		}
		System.out.println(dp[K]);
	}
}
