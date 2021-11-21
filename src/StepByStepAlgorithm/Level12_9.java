package StepByStepAlgorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Level12_9 {
	/*
	 * 10814�� ���̼� ���� �ð� ���� �޸� ���� ���� ���� ���� ��� ���� ���� 3 �� 256 MB 58988 25248 19132
	 * 42.048% ���� �¶��� ������ ������ ������� ���̿� �̸��� ������ ������� �־�����. �̶�, ȸ������ ���̰� �����ϴ� ������, ���̰�
	 * ������ ���� ������ ����� �տ� ���� ������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� ù° �ٿ� �¶��� ���� ȸ���� �� N�� �־�����. (1 �� N �� 100,000)
	 * 
	 * ��° �ٺ��� N���� �ٿ��� �� ȸ���� ���̿� �̸��� �������� ���еǾ� �־�����. ���̴� 1���� ũ�ų� ������, 200���� �۰ų� ����
	 * �����̰�, �̸��� ���ĺ� ��ҹ��ڷ� �̷���� �ְ�, ���̰� 100���� �۰ų� ���� ���ڿ��̴�. �Է��� ������ ������ �־�����.
	 * 
	 * ��� ù° �ٺ��� �� N���� �ٿ� ���� �¶��� ���� ȸ���� ���� ��, ���̰� ������ ������ ������ �� �ٿ� �� �� ���̿� �̸��� ��������
	 * ������ ����Ѵ�.
	 */
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		String[][] arr = new String[N][2];
		
 
		for(int i = 0; i < N; i++) {
			arr[i][0] = in.next();	// ����
			arr[i][1] = in.next();	// �̸�
		}
 
		
		Arrays.sort(arr, new Comparator<String[]>() {
			// ���̼����� ����
			@Override
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}
			
		});
		
		for(int i = 0; i < N; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
}
