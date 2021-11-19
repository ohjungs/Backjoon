package StepByStepAlgorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Level12_8 {
	/*
	 * 1181�� �ܾ� ���� ���� ���ĺ� �ҹ��ڷ� �̷���� N���� �ܾ ������ �Ʒ��� ���� ���ǿ� ���� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * ���̰� ª�� �ͺ��� ���̰� ������ ���� ������ �Է� ù° �ٿ� �ܾ��� ���� N�� �־�����. (1 �� N �� 20,000) ��° �ٺ���
	 * N���� �ٿ� ���� ���ĺ� �ҹ��ڷ� �̷���� �ܾ �� �ٿ� �ϳ��� �־�����. �־����� ���ڿ��� ���̴� 50�� ���� �ʴ´�.
	 * 
	 * ��� ���ǿ� ���� �����Ͽ� �ܾ���� ����Ѵ�. ��, ���� �ܾ ���� �� �Էµ� ��쿡�� �� ������ ����Ѵ�.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int N = in.nextInt();
		String[] arr = new String[N];
 
		in.nextLine();	// ���� ����
 
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				// �ܾ� ���̰� ���� ��� 
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} 
				// �� ���� ��� 
				else {
					return s1.length() - s2.length();
				}
			}
		});
 
 
		System.out.println(arr[0]);
		
		for (int i = 1; i < N; i++) {
			// �ߺ����� �ʴ� �ܾ ���
			if (!arr[i].equals(arr[i - 1])) {
				System.out.println(arr[i]);
			}
		}
	}
}
