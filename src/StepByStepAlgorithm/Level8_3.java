package StepByStepAlgorithm;

import java.util.Scanner;

public class Level8_3 {
	/*
	 * ���� 1193 �м�ã�� ������ ū �迭�� ������ ���� �м����� �����ִ�.
	 * 
	 * 1/1 1/2 1/3 1/4 1/5 �� 2/1 2/2 2/3 2/4 �� �� 3/1 3/2 3/3 �� �� �� 4/1 4/2 �� �� �� ��
	 * 5/1 �� �� �� �� �� �� �� �� �� �� �� �̿� ���� ������ �м����� 1/1 �� 1/2 �� 2/1 �� 3/1 �� 2/2 �� �� �� ����
	 * ������� ������ ���ʴ�� 1��, 2��, 3��, 4��, 5��, �� �м���� ����.
	 * 
	 * X�� �־����� ��, X��° �м��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� ù° �ٿ� X(1 �� X �� 10,000,000)�� �־�����.
	 * 
	 * ��� ù° �ٿ� �м��� ����Ѵ�.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int cnt = 0;
		int n = 0;
		while (true) {
			n++;
			cnt +=n;
			if(cnt>=a) {
				if(n%2==0) {
					System.out.println(a-cnt+n+"/"+(cnt-a+1));
				}else {
					System.out.println((cnt-a+1)+"/"+(a-cnt+n));
				}
				break;
			}
		}
	}
}
