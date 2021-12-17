package StepByStepAlgorithm;

import java.util.Scanner;

public class Level15_4 {
	/*
	 * 9461�� �ĵ��� ���� ���� ������ �׸��� ���� �ﰢ���� ���� ������� ������ �ִ�. ù �ﰢ���� ���ﰢ������ ���� ���̴� 1�̴�. ��
	 * �������� ������ ���� �������� ���ﰢ���� ��� �߰��Ѵ�. �������� ���� �� ���� ���̸� k�� ���� ��, �� ���� ���̰� k�� ���ﰢ����
	 * �߰��Ѵ�.
	 * 
	 * �ĵ��� ���� P(N)�� ������ �ִ� ���ﰢ���� ���� �����̴�. P(1)���� P(10)���� ù 10�� ���ڴ� 1, 1, 1, 2, 2, 3,
	 * 4, 5, 7, 9�̴�.
	 * 
	 * N�� �־����� ��, P(N)�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, N�� �־�����. (1 �� N �� 100)
	 * 
	 * ��� �� �׽�Ʈ ���̽����� P(N)�� ����Ѵ�.
	 */
	public static Long[] seq = new Long[101];
	 
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		seq[0] = 0L;
		seq[1] = 1L;
		seq[2] = 1L;
		seq[3] = 1L;
		
		int T = in.nextInt();
		
		while(T-- > 0) {
			int N = in.nextInt();
			System.out.println(padovan(N));
		}
		
	}
	
	public static long padovan(int N) {
		if(seq[N] == null) {	// Ž������ ���� �ε����� ��� ���ȣ��
			seq[N] = padovan(N - 2) + padovan(N - 3);
		}
		return seq[N];
	}
}
