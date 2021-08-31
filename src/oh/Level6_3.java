package oh;

import java.util.Scanner;

public class Level6_3 {
	/*
	 * ���� � ���� ���� X�� �� �ڸ��� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. ���������� ���ӵ� �� ���� ���� ���̰� ������ ������
	 * ���Ѵ�. N�� �־����� ��, 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * �Է� ù° �ٿ� 1,000���� �۰ų� ���� �ڿ��� N�� �־�����.
	 * ��� ù° �ٿ� 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����Ѵ�.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		if (n < 100) {
			System.out.println(n);
		} else {
			int result = 99;
			
			for (int i = 100; i <= n; ++i) {
				result += checkHanNumber(i);
			}
			
			if (n == 1000) result--;
			
			System.out.println(result);
		}
	}
	
	private static int checkHanNumber(int number) {
		int num1 = number / 100 % 10;
		int num2 = number / 10 % 10;
		int num3 = number % 10;
		
		if (num2 * 2 == num1 + num3) {
			return 1;
		}
		return 0;
	}
}