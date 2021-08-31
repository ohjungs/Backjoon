package oh;

import java.util.Scanner;

public class Level5_3 {

	public static void main(String[] args) {
		/*
		 * ���� �� ���� �ڿ��� A, B, C�� �־��� �� A �� B �� C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ�
		 * ���α׷��� �ۼ��Ͻÿ�. ���� ��� A = 150, B = 266, C = 427 �̶�� A �� B �� C = 150 �� 266 �� 427
		 * = 17037300 �� �ǰ�, ����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������. �Է� ù° �ٿ�
		 * A, ��° �ٿ� B, ��° �ٿ� C�� �־�����. A, B, C�� ��� 100���� ũ�ų� ����, 1,000���� ���� �ڿ����̴�. ��� ù°
		 * �ٿ��� A �� B �� C�� ����� 0 �� �� �� �������� ����Ѵ�. ���������� ��° �ٺ��� �� ��° �ٱ��� A �� B �� C�� �����
		 * 1���� 9������ ���ڰ� ���� �� �� �������� ���ʷ� �� �ٿ� �ϳ��� ����Ѵ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		
		int[] counts = new int[10];
		int number = A * B * C;
		while (number > 0) {
			counts[number % 10]++;
			number /= 10;
		}
		
		for (int i = 0; i < counts.length; ++i) {
			System.out.println(counts[i]);
		
		}
	}
}