package StepByStepAlgorithm;

import java.util.Scanner;

public class Level9_4 {
	/*
	 * 1929�� �Ҽ� ���ϱ� ���� M�̻� N������ �Ҽ��� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� ù° �ٿ� �ڿ��� M�� N�� �� ĭ�� ���̿� �ΰ� �־�����. (1 �� M �� N �� 1,000,000) M�̻� N������ �Ҽ��� �ϳ�
	 * �̻� �ִ� �Է¸� �־�����.
	 * 
	 * ��� �� �ٿ� �ϳ���, �����ϴ� ������� �Ҽ��� ����Ѵ�.
	 */
	public static boolean[] prime;
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int M = in.nextInt();
	int N = in.nextInt();
	
	prime = new boolean[N + 1];
	get_prime();
			
	for(int i = M; i <= N; i++) {
		// false = �Ҽ� 
		if(!prime[i]) System.out.println(i);
	}
}


// �����佺�׳׽��� ü �˰���
public static void get_prime() {
	// true = �Ҽ��ƴ� , false = �Ҽ� 
	prime[0] = prime[1] = true;
	
	for(int i = 2; i <= Math.sqrt(prime.length); i++) {
		if(prime[i]) continue;
		for(int j = i * i; j < prime.length; j += i) {
			prime[j] = true;
		}
	}
}
}
