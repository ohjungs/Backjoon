package StepByStepAlgorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Level12_10 {
	/*
	 * 18870 ��ǥ ���� ���� ������ ���� N���� ��ǥ X1, X2, ..., XN�� �ִ�. �� ��ǥ�� ��ǥ ������ �����Ϸ��� �Ѵ�.
	 * 
	 * Xi�� ��ǥ ������ ��� X'i�� ���� Xi > Xj�� �����ϴ� ���� �ٸ� ��ǥ�� ������ ���ƾ� �Ѵ�.
	 * 
	 * X1, X2, ..., XN�� ��ǥ ������ ������ ��� X'1, X'2, ..., X'N�� ����غ���.
	 * 
	 * �Է� ù° �ٿ� N�� �־�����.
	 * 
	 * ��° �ٿ��� ���� �� ĭ���� ���е� X1, X2, ..., XN�� �־�����.
	 * 
	 * ��� ù° �ٿ� X'1, X'2, ..., X'N�� ���� �� ĭ���� �����ؼ� ����Ѵ�.
	 * 
	 * ���� 1 �� N �� 1,000,000 -109 �� Xi �� 109
	 */
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int[] arr = new int[N];
	        int[] arrClone;
	        Map<Integer, Integer> map = new HashMap<>();
	        int count = 0;
	        StringBuilder sb = new StringBuilder();

	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextInt();
	        }

	        arrClone = arr.clone();

	        Arrays.sort(arrClone);

	        for (int i = 0; i < arrClone.length; i++) {
	            if (!map.containsKey(arrClone[i])) {
	                map.put(arrClone[i], count++);
	            }
	        }

	        for (int i = 0; i < arr.length; i++) {
	            sb.append(map.get(arr[i])).append(" ");
	        }
	        
	        System.out.println(sb);
	}
}
