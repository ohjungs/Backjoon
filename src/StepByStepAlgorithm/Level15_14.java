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
	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
		
		char[] str1 = in.nextLine().toCharArray();
		char[] str2 = in.nextLine().toCharArray();
		
		int length_1 = str1.length;
		int length_2 = str2.length;
		
		// ������ ǥ���� ���� �ε����� �� �پ� �߰� �� 
		int[][] dp = new int[length_1 + 1][length_2 + 1];
		
		// 1���� ���� (index 0 �� �������̹Ƿ� 0�� ���� ��������) 
		for(int i = 1; i <= length_1; i++) {
			for(int j = 1; j <= length_2; j++) {
				
				// (i-1)�� (j-1) ��° ���ڰ� ���� ���ٸ�  
				if(str1[i - 1] == str2[j - 1]) {
					// �밢�� �� (i-1, j-1)�� dp�� +1 �� ������ ���� 
					dp[i][j] = dp[i - 1][j - 1] + 1;	
				}
				
				// ���� �ʴٸ� ���� ��(i-1)�� ���� ��(j-1)�� �� �� ū ������ ����  
				else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
        
		// Top-Down ���ʹ� �ٸ��� dp �ε����� �� �پ� �߰��Ǿ����Ƿ� -1�� ���� ����
		System.out.println(dp[length_1][length_2]);
		
	}
}
