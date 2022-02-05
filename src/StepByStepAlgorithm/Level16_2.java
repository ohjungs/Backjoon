package StepByStepAlgorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Level16_2 {
	/*
	 * 1931 ȸ�ǽ� ���� ���� �� ���� ȸ�ǽ��� �ִµ� �̸� ����ϰ��� �ϴ� N���� ȸ�ǿ� ���Ͽ� ȸ�ǽ� ���ǥ�� ������� �Ѵ�. �� ȸ��
	 * I�� ���� ���۽ð��� ������ �ð��� �־��� �ְ�, �� ȸ�ǰ� ��ġ�� �ʰ� �ϸ鼭 ȸ�ǽ��� ����� �� �ִ� ȸ���� �ִ� ������ ã�ƺ���.
	 * ��, ȸ�Ǵ� �ѹ� �����ϸ� �߰��� �ߴܵ� �� ������ �� ȸ�ǰ� ������ �Ͱ� ���ÿ� ���� ȸ�ǰ� ���۵� �� �ִ�. ȸ���� ���۽ð��� ������
	 * �ð��� ���� ���� �ִ�. �� ��쿡�� �������ڸ��� ������ ������ �����ϸ� �ȴ�.
	 * �Է� ù° �ٿ� ȸ���� �� N(1 �� N �� 100,000)�� �־�����. ��° �ٺ��� N+1 �ٱ��� �� ȸ���� ������ �־����µ� �̰���
	 * ������ ���̿� �ΰ� ȸ���� ���۽ð��� ������ �ð��� �־�����. ���� �ð��� ������ �ð��� 231-1���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.
	 * ��� ù° �ٿ� �ִ� ����� �� �ִ� ȸ���� �ִ� ������ ����Ѵ�.
	 */

	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		
		/*
		  time[][0] �� ���۽����� �ǹ� 
		  time[][1] �� ��������� �ǹ� 
		*/
		int[][] time = new int[N][2];
		
		
		for(int i = 0; i < N; i++) {
			time[i][0] = in.nextInt();	// ���۽ð� 
			time[i][1] = in.nextInt();	// ����ð� 
		}
		
		
		// ������ �ð��� �������� �����ϱ� ���� compare ������ 
		Arrays.sort(time, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				
				// ����ð��� ���� ��� ���۽ð��� ���������� �����ؾ��Ѵ�.  
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				
				return o1[1] - o2[1];
			}
 
		});
		
		int count = 0;
		int prev_end_time = 0;
		
		for(int i = 0; i < N; i++) {
			
			// ���� ����ð��� ���� ȸ�� ���� �ð����� �۰ų� ���ٸ� ���� 
			if(prev_end_time <= time[i][0]) {
				prev_end_time = time[i][1];
				count++;
			}
		}
		
		System.out.println(count);
	}
}
