package StepByStepAlgorithm;

import java.util.Scanner;

public class Level5_6 {

	public static void main(String[] args) {
		/*
		 * ���� "OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. ������ ���� ��� ��
		 * ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. ���� ���, 10�� ������ ������ 3�� �ȴ�.
		 * "OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
		 * OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * �Է� ù° �ٿ� �׽�Ʈ ���̽��� ������ �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���̰� 0���� ũ�� 80���� ���� ���ڿ���
		 * �־�����. ���ڿ��� O�� X������ �̷���� �ִ�.
		 * ��� �� �׽�Ʈ ���̽����� ������ ����Ѵ�.
		 */
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n+1];		
		for(int i=0; i<n; i++) {
			int count=0, sum=0;	
			str[i] = sc.next();
			for(int j=0; j<str[i].length(); j++) {
				if(str[i].charAt(j)=='o') {
					sum += ++count;
				}	else count=0;
			}System.out.println(sum);
		}sc.close();
		
	}

}
