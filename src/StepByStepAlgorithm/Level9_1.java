package StepByStepAlgorithm;

import java.util.Scanner;

public class Level9_1 {
	/*
	 * 1978�� �Ҽ�ã�� �Ҽ� ã�� �ð� ���� �޸� ���� ���� ���� ���� ��� ���� ���� 2 �� 128 MB 84396 40059 32524
	 * 48.125% ���� �־��� �� N�� �߿��� �Ҽ��� �� ������ ã�Ƽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� ù �ٿ� ���� ���� N�� �־�����. N�� 100�����̴�. �������� N���� ���� �־����µ� ���� 1,000 ������ �ڿ����̴�.
	 * 
	 * ��� �־��� ���� �� �Ҽ��� ������ ����Ѵ�.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int sosuCnt = 0, cnt = 0;

		for (int i = 1; i <= num; i++) {
			int num2 = sc.nextInt();
			sosuCnt = 0;

			for (int j = 1; j <= num2; j++) {
				if (num2 % j == 0)
					sosuCnt++;
			}

			if (sosuCnt == 2)
				cnt++;
		}
		System.out.print(cnt);
	
	}
}
