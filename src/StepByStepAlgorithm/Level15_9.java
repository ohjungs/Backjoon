package StepByStepAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level15_9 {
	/*
	 * 10844�� ���� ��� �� ���� 45656�̶� ���� ����.
	 * 
	 * �� ���� ������ ��� �ڸ��� ���̰� 1�̴�. �̷� ���� ��� ����� �Ѵ�.
	 * 
	 * N�� �־��� ��, ���̰� N�� ��� ���� �� �� �� �ִ��� ���غ���. 0���� �����ϴ� ���� ��ܼ��� �ƴϴ�.
	 * 
	 * �Է� ù° �ٿ� N�� �־�����. N�� 1���� ũ�ų� ����, 100���� �۰ų� ���� �ڿ����̴�.
	 * 
	 * ��� ù° �ٿ� ������ 1,000,000,000���� ���� �������� ����Ѵ�.
	 */


	static Long[][] dp;
	static int N;
	final static long MOD = 1000000000;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		dp = new Long[N + 1][10];
		
		// ù��° �ڸ����� 1�� �ʱ�ȭ 
		for(int i = 0; i < 10; i++) {
			dp[1][i] = 1L;
		}
		
		long result = 0;
		
		// ������ �ڸ����� 1~9������ ����� ���� ��� �����ش�.
		for(int i = 1; i <= 9; i++) {
			result += recur(N, i);
		}
		System.out.println(result % MOD);
	}
	
	/*
	 dist �� �ڸ���, val�� �ڸ����� �ǹ���
	 
	 ù° �ڸ����� �� val�� ���̱� ������
	 ����� ���� 1�ۿ� ����. ��, dp[1]�� �� �ڸ�����
	 1�� �ʱ�ȭ �Ǿ��־���Ѵ�.
	*/
	
	static long recur(int digit, int val) {		
 
		// ù° �ڸ����� �����Ѵٸ� ���̻� Ž���� �ʿ� ����
		if(digit == 1) {
			return dp[digit][val];
		}
			
		// �ش� �ڸ����� val���� ���� Ž������ �ʾ��� ��� 
		if(dp[digit][val] == null) {
			// val�� 0�ϰ�� ������ 1�ۿ� ����
			if(val == 0) {
				dp[digit][val] = recur(digit - 1 ,1);
			}
			// val�� 1�ϰ�� ������ 8�ۿ� ����
			else if(val== 9) {
				dp[digit][val] = recur(digit - 1, 8);
			}
			// �� ���� ���� val-1�� val+1 ���� ����� ���� ���� ����� ���� ��
			else {
				dp[digit][val] = recur(digit - 1, val - 1) + recur(digit - 1, val + 1);
			}
		}
		return dp[digit][val] % MOD;
	}
}
