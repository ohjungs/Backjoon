package StepByStepAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Level12_2 {
	/* 2751�� �� �����ϱ� 2
	 * ���� N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� ù° �ٿ� ���� ���� N(1 �� N �� 1,000,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ���� �־�����. �� ���� ������
	 * 1,000,000���� �۰ų� ���� �����̴�. ���� �ߺ����� �ʴ´�.
	 * 
	 * ��� ù° �ٺ��� N���� �ٿ� ������������ ������ ����� �� �ٿ� �ϳ��� ����Ѵ�.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = in.nextInt();
		
		// list �迭 �� �ϳ��� ���� �ȴ�.
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			list.add(in.nextInt());
		}
		
		Collections.sort(list);
		
		for(int value : list) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);
	}
}
