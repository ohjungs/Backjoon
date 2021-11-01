package StepByStepAlgorithm;

import java.util.Scanner;

public class Level11_2 {
	/*
	 * 2231�� ������ ���� � �ڿ��� N�� ���� ��, �� �ڿ��� N�� �������� N�� N�� �̷�� �� �ڸ����� ���� �ǹ��Ѵ�. � �ڿ���
	 * M�� �������� N�� ���, M�� N�� �����ڶ� �Ѵ�. ���� ���, 245�� �������� 256(=245+2+4+5)�� �ȴ�. ���� 245��
	 * 256�� �����ڰ� �ȴ�. ����, � �ڿ����� ��쿡�� �����ڰ� ���� ���� �ִ�. �ݴ��, �����ڰ� ���� ���� �ڿ����� ���� �� �ִ�.
	 * 
	 * �ڿ��� N�� �־����� ��, N�� ���� ���� �����ڸ� ���س��� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� ù° �ٿ� �ڿ��� N(1 �� N �� 1,000,000)�� �־�����.
	 * 
	 * ��� ù° �ٿ� ���� ����Ѵ�. �����ڰ� ���� ��쿡�� 0�� ����Ѵ�.
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
    
	int N = in.nextInt();
    
	int result = 0;

	
	for(int i = 0; i < N; i++) {
		int number = i;
		int sum = 0;	// �� �ڸ��� �� ���� 
		
		while(number != 0) {
			sum += number % 10;	// �� �ڸ��� ���ϱ�
			number /= 10;
		}
		
		// i ���� �� �ڸ��� �������� ���� ��� (�����ڸ� ã���� ���) 
		if(sum + i == N) {
			result = i;
			break;
		}
		
	}

	System.out.println(result);
}
}
