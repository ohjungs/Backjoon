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
/*
 * �빮�ڷ� ����� �����̱⿡ ���� ���� �Է°��� ��� �빮�ڷ� ��ȯ -> String.toUpperCase(); ��� �빮�ڷ� ����,
 * �ҹ��ڴ� String.toLowerCase();
 * 
 * ���ĺ� 'A ~ Z'�� �� 26�� -> int[] count = new int[26], 26ũ���� �迭 ����
 * 
 * �Է� ���ڿ� ���̸�ŭ �ݺ��� ���� -> �Է� ���ڿ� �� ���ھ�, �ش� ���ĺ� ������ int�迭 count �� ���� -> 'A'�� ���
 * ex) 'A'-'A' => 65-65 => 0���� count�迭 0��° �� ����
 * 
 * ���ĺ� ����(�迭ũ��)��ŭ �ݺ��� ���� -> ���� �ߺ����� ū�� ���ϸ� max�� ���� -> �ش� ��ġ ���ĺ� �˾Ƴ��� ���� (index
 * + 'A') ex) 1+'A' => 1+65 => 66, 66�� 'B'�� �ش�
 */
