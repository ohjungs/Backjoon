package StepByStepAlgorithm;

import java.util.Scanner;

public class Level7_5 {
	/*
	 * 1157��, �ܾ���� ���� ���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷���
	 * �ۼ��Ͻÿ�. ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�. �Է� ù° �ٿ� ���ĺ� ��ҹ��ڷ� �̷���� �ܾ �־�����. �־����� �ܾ��� ���̴�
	 * 1,000,000�� ���� �ʴ´�. ��� ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�. ��, ���� ���� ����
	 * ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		String a = sc.next().toUpperCase();
		int max = -1;
		char st = '?';

		for (int i = 0; i < a.length(); i++) {
			arr[a.charAt(i) - 65]++;
			if (max < arr[a.charAt(i) - 65]) {
				max = arr[a.charAt(i) - 65];
				st = a.charAt(i);
			} else if (max == arr[a.charAt(i) - 65])
				st = '?';
		}
		System.out.println(st);
	}

}
