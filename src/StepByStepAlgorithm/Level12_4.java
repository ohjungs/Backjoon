package StepByStepAlgorithm;

import java.util.Scanner;

public class Level12_4 {
	/*
	 * 2108�� ����� ���� ���� ó���ϴ� ���� ����п��� ����� �߿��� ���̴�. ����п��� N���� ���� ��ǥ�ϴ� �⺻ ��谪���� ������ ����
	 * �͵��� �ִ�. ��, N�� Ȧ����� ��������.
	 * 
	 * ������ : N���� ������ ���� N���� ���� �� �߾Ӱ� : N���� ������ �����ϴ� ������ �������� ��� �� �߾ӿ� ��ġ�ϴ� �� �ֺ� :
	 * N���� ���� �� ���� ���� ��Ÿ���� �� ���� : N���� ���� �� �ִ񰪰� �ּڰ��� ���� N���� ���� �־����� ��, �� ���� �⺻ ��谪��
	 * ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� ù° �ٿ� ���� ���� N(1 �� N �� 500,000)�� �־�����. ��, N�� Ȧ���̴�. �� ���� N���� �ٿ��� �������� �־�����.
	 * �ԷµǴ� ������ ������ 4,000�� ���� �ʴ´�.
	 * 
	 * ��� ù° �ٿ��� �������� ����Ѵ�. �Ҽ��� ���� ù° �ڸ����� �ݿø��� ���� ����Ѵ�.
	 * 
	 * ��° �ٿ��� �߾Ӱ��� ����Ѵ�.
	 * 
	 * ��° �ٿ��� �ֺ��� ����Ѵ�. ���� �� ���� ������ �ֺ� �� �� ��°�� ���� ���� ����Ѵ�.	��° �ٿ��� ������ ����Ѵ�.
	 */
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);	
	int N = in.nextInt();
	
	// �Է°��� ���� : -4000 ~ 4000
	int[] arr = new int[8001];
	
	/*
	 *  sum = �� �հ� 
	 *  max = �ִ�
	 *  min = �ּڰ� 
	 *  median = �߾Ӱ�
	 *  mode = �ֺ� 
	 */
	int sum = 0;
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	// median �� mode �� -4000~4000 �� ������ ���� �ʱ�ȭ�ϸ� �ȴ�.
	int median = 10000;
	int mode = 10000;
	
	for(int i = 0; i < N; i++) {
		int value = in.nextInt();
		sum += value;
		arr[value + 4000]++;
	
		if(max < value) {
			max = value;
		}
		if(min > value) {
			min = value;
		}
	}
	
	
	// ��ȸ 
	int count = 0;	// �߾Ӱ� �� ���� �� 
	int mode_max = 0; 	// �ֺ��� �ִ�  
	
	// ������ ������ �ֺ��� 1���� ����������� true, �ƴҰ�� false
	boolean flag = false;	 
	
	for(int i = min + 4000; i <= max + 4000; i++) {
		
		if(arr[i] > 0) {
			
			/*
			 * <�߾Ӱ� ã��>
			 * ����Ƚ���� ��ü ��ü ������ ���ݿ� �� ��ģ�ٸ� 
			 */
			if(count < (N + 1) / 2) {
				count += arr[i];	// i���� �󵵼��� count �� ����
				median = i - 4000;
			}
			
			/*
			 * <�ֺ� ã��>
			 * ���� �ֺ󰪺��� ���� ���� �󵵼��� �� ���� ��� 
			 */
			if(mode_max < arr[i]) {
				mode_max = arr[i];
				mode = i - 4000;
				flag = true;	// ù �����̹Ƿ� true �� ���� 
			}
			// ���� �ֺ� �ִ񰪰� ������ ���鼭 �� ���� �ߺ��Ǵ� ��� 
			else if(mode_max == arr[i] && flag == true) {
				mode = i - 4000;
				flag = false;					
			}
		}
	}
	
	System.out.println((int)Math.round((double)sum / N));	// ������ 
	System.out.println(median);	// �߾Ӱ� 
	System.out.println(mode);	// �ֺ� 
	System.out.println(max - min);	// ���� 
}
}
