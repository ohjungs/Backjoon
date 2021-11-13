package StepByStepAlgorithm;

import java.util.Scanner;

public class Level12_5 {
	/*
	 * 1427�� ��Ʈ�λ��̵� ���� �迭�� �����ϴ� ���� ����. ���� �־�����, �� ���� �� �ڸ����� ������������ �����غ���.
	 * 
	 * �Է� ù° �ٿ� �����Ϸ��� �ϴ� �� N�� �־�����. N�� 1,000,000,000���� �۰ų� ���� �ڿ����̴�.
	 * 
	 * ��� ù° �ٿ� �ڸ����� ������������ ������ ���� ����Ѵ�.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int[] counting = new int[10];
 
		int N = in.nextInt();
 
		while (N != 0) {
			counting[N % 10]++;
			N /= 10;
		}
 
		for (int i = 9; i >= 0; i--) {
			while (counting[i]-- > 0) {
				System.out.print(i);
			}
		}
	}
}
