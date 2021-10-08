package StepByStepAlgorithm;

import java.util.Scanner;

public class Level9_5 {
	/*
	 * 4948�� ����Ʈ�� ���� ���� ����Ʈ�� ������ ������ �ڿ��� n�� ���Ͽ�, n���� ũ��, 2n���� �۰ų� ���� �Ҽ��� ��� �ϳ�
	 * �����Ѵٴ� ������ ��� �ִ�.
	 * 
	 * �� ������ ������ ����Ʈ���� 1845�⿡ �����߰�, ������Ƽ ü������� 1850�⿡ �����ߴ�.
	 * 
	 * ���� ���, 10���� ũ��, 20���� �۰ų� ���� �Ҽ��� 4���� �ִ�. (11, 13, 17, 19) ��, 14���� ũ��, 28���� �۰ų�
	 * ���� �Ҽ��� 3���� �ִ�. (17,19, 23)
	 * 
	 * �ڿ��� n�� �־����� ��, n���� ũ��, 2n���� �۰ų� ���� �Ҽ��� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� �Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�. �� ���̽��� n�� �����ϴ� �� �ٷ� �̷���� �ִ�.
	 * 
	 * �Է��� ���������� 0�� �־�����.
	 * 
	 * ��� �� �׽�Ʈ ���̽��� ���ؼ�, n���� ũ��, 2n���� �۰ų� ���� �Ҽ��� ������ ����Ѵ�.
	 */
public static boolean[] prime = new boolean[246913];
    
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
        
		get_prime();	// �Ҽ��� ��� �޼ҵ� ����
		
		while(true) {
			int n = in.nextInt();
			if(n == 0) break;	// n �� 0 �ϰ�� ����
            
			int count = 0;	// �Ҽ� ������ �� ����
            
			for(int i = n + 1; i <= 2 * n; i++) {
				if(!prime[i]) count++;
			}
			System.out.println(count);
		}		
	}
	
	// �Ҽ��� ��� �޼ҵ�
	public static void get_prime() {
		// 0 �� 1 �� �Ҽ��� �ƴϹǷ� ture
		prime[0] = prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}
 
}