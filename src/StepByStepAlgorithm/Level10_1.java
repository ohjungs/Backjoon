package StepByStepAlgorithm;

import java.util.Scanner;

public class Level10_1 {
	/*
	 * 10872�� ���丮��! ���� 0���� ũ�ų� ���� ���� N�� �־�����. �̶�, N!�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� ù° �ٿ� ���� N(0 �� N �� 12)�� �־�����.
	 * 
	 * ��� ù° �ٿ� N!�� ����Ѵ�.
	 */
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		in.close();
		
		int sum = factorial(N);
		System.out.println(sum);
		
	}
	
	public static int factorial(int N) {
		if(N <= 1) return 1;	// ��� ��������
		return N * factorial(N - 1);		
	
	}
}
