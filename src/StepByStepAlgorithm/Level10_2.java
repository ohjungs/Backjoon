package StepByStepAlgorithm;

import java.util.Scanner;

public class Level10_2 {
	/*
	 * 10870�� �ĺ���ġ �� 5 ���� �Ǻ���ġ ���� 0�� 1�� �����Ѵ�. 0��° �Ǻ���ġ ���� 0�̰�, 1��° �Ǻ���ġ ���� 1�̴�. �� ����
	 * 2��° ���ʹ� �ٷ� �� �� �Ǻ���ġ ���� ���� �ȴ�.
	 * 
	 * �̸� ������ �Ẹ�� Fn = Fn-1 + Fn-2 (n �� 2)�� �ȴ�.
	 * 
	 * n=17�϶� ���� �Ǻ���ġ ���� �Ẹ�� ������ ����.
	 * 
	 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
	 * 
	 * n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� ù° �ٿ� n�� �־�����. n�� 20���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.
	 * 
	 * ��� ù° �ٿ� n��° �Ǻ���ġ ���� ����Ѵ�.
	 */
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int N = in.nextInt();
 
			System.out.println(fibonacci(N));
		}
 
	}
 
	// �Ǻ���ġ �Լ�
	static int fibonacci(int N) {
		if (N == 0)	return 0;
		if (N == 1)	return 1;
		return fibonacci(N - 1) + fibonacci(N - 2);
	}
}