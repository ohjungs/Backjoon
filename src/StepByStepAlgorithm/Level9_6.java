package StepByStepAlgorithm;

import java.util.Scanner;

public class Level9_6 {
	/*
	 * 9020�� �������� ���� ���� 1���� ū �ڿ��� �߿��� 1�� �ڱ� �ڽ��� ������ ����� ���� �ڿ����� �Ҽ���� �Ѵ�. ���� ���, 5��
	 * 1�� 5�� ������ ����� ���� ������ �Ҽ��̴�. ������, 6�� 6 = 2 �� 3 �̱� ������ �Ҽ��� �ƴϴ�.
	 * 
	 * �������� ������ ������ �������� ���ذ� ������, 2���� ū ��� ¦���� �� �Ҽ��� ������ ��Ÿ�� �� �ִٴ� ���̴�. �̷��� ���� ������
	 * ����� �Ѵ�. ��, ¦���� �� �Ҽ��� ������ ��Ÿ���� ǥ���� �� ���� ������ ��Ƽ���̶�� �Ѵ�. ���� ���, 4 = 2 + 2, 6 =
	 * 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11, 14 = 7 + 7�̴�. 10000����
	 * �۰ų� ���� ��� ¦�� n�� ���� ������ ��Ƽ���� �����Ѵ�.
	 * 
	 * 2���� ū ¦�� n�� �־����� ��, n�� ������ ��Ƽ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ���� ������ n�� ������ ��Ƽ���� ���� ������
	 * ��쿡�� �� �Ҽ��� ���̰� ���� ���� ���� ����Ѵ�.
	 * 
	 * �Է� ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ� ¦�� n�� �־�����.
	 * 
	 * ��� �� �׽�Ʈ ���̽��� ���ؼ� �־��� n�� ������ ��Ƽ���� ����Ѵ�. ����ϴ� �Ҽ��� ���� �ͺ��� ���� ����ϸ�, �������� �����Ѵ�.
	 */

		/*
			false : �Ҽ�
			range : 0 ~ 10000
		*/
		public static boolean[] prime = new boolean[10001];

		public static void main(String[] args) {
			 
			Scanner in = new Scanner(System.in);
			
			get_prime();
	 
			int T = in.nextInt();	// �׽�Ʈ���̽�
	 
			while (T-- > 0) {
				int n = in.nextInt();
				int first_partition = n / 2;
				int second_partition = n / 2;
	 
				while (true) {
	            
					// �� ��Ƽ���� ��� �Ҽ��� ���
					if (!prime[first_partition] && !prime[second_partition]) {
						System.out.println(first_partition + " " + second_partition);
						break;
					}
					first_partition--;
					second_partition++;
				}
			}
	 
		}
	 
		// �����佺�׳׽��� ü
		public static void get_prime() {
			prime[0] = prime[1] = true;
	 
			for (int i = 2; i <= Math.sqrt(prime.length); i++) {
				if (prime[i])
					continue;
				for (int j = i * i; j < prime.length; j += i) {
					prime[j] = true;
				}
			}
		}
	 
	}

