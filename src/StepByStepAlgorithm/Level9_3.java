package StepByStepAlgorithm;

import java.util.Scanner;

public class Level9_3 {
	
	/*
	 * 11653�� ���μ����� ���� ���� N�� �־����� ��, ���μ������ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * �Է� ù° �ٿ� ���� N (1 �� N �� 10,000,000)�� �־�����.
	 * ��� N�� ���μ����� ����� �� �ٿ� �ϳ��� ������������ ����Ѵ�. N�� 1�� ��� �ƹ��͵� ������� �ʴ´�.
	 */
	public static void main(String[] args) {
		

	Scanner in = new Scanner(System.in);
    
	int N = in.nextInt();

	for (int i = 2; i <= Math.sqrt(N); i++) {	// �Ǵ� i * i <= N
		while (N % i == 0) {
			System.out.println(i);
			N /= i;
		}
	}
	if (N != 1) {
		System.out.println(N);
	}
}
}

