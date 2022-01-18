package StepByStepAlgorithm;

import java.util.Scanner;

public class Level15_14 {
	/*
	 * 9251�� LCS ���� LCS(Longest Common Subsequence, ���� ���� �κ� ����)������ �� ������ �־����� ��,
	 * ����� �κ� ������ �Ǵ� ���� �� ���� �� ���� ã�� �����̴�.
	 * 
	 * ���� ���, ACAYKP�� CAPCAK�� LCS�� ACAK�� �ȴ�.
	 * 
	 * �Է� ù° �ٰ� ��° �ٿ� �� ���ڿ��� �־�����. ���ڿ��� ���ĺ� �빮�ڷθ� �̷���� ������, �ִ� 1000���ڷ� �̷���� �ִ�.
	 * 
	 * ��� ù° �ٿ� �Է����� �־��� �� ���ڿ��� LCS�� ���̸� ����Ѵ�.
	 */
	static char[] str1;
	static char[] str2;
 
	static Integer[][] dp;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
 
		// toCharArray() �� ���ڿ��� char[] �迭�� ��ȯ���ִ� �޼ҵ��.
		str1 = in.nextLine().toCharArray();
		str2 = in.nextLine().toCharArray();
		
		dp = new Integer[str1.length][str2.length];
 
		System.out.println(LCS(str1.length - 1, str2.length - 1));
		
	}
	
	static int LCS(int x, int y) {
		
		// �ε��� �� (������)�� ��� 0 ��ȯ
		if(x == -1 || y == -1) {
			return 0;
		}
 
		// ���� Ž������ ���� �ε������?
		if(dp[x][y] == null) {
			dp[x][y] = 0;
 
			// str1�� x��° ���ڿ� str2�� y��° ���ڰ� ������ �˻�
			if(str1[x] == str2[y]) {
				dp[x][y] = LCS(x - 1, y - 1) + 1;
			}
 
			// ���� �ʴٸ� LCS(dp)[x-1][y]�� LCS(dp)[x,y-1] �� ū ������ �ʱ�ȭ
			else {
				dp[x][y] = Math.max(LCS(x - 1, y), LCS(x, y - 1));
			}
		}
		
		return dp[x][y];
	}
}
