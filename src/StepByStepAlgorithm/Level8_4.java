package StepByStepAlgorithm;

import java.util.Scanner;

public class Level8_4 {
	/* 2869�� �����̴� �ö󰡰� �ʹ�.
	 * ���� �� ���� �����̰� �ִ�. �� �����̴� ���̰� V������ ���� ���븦 �ö� ���̴�.
	 * �����̴� ���� A���� �ö� �� �ִ�. ������, �㿡 ���� �ڴ� ���� B���� �̲�������. ��, ���� �ö� �Ŀ��� �̲������� �ʴ´�.
	 * �����̰� ���� ���븦 ��� �ö󰡷���, ��ĥ�� �ɸ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * �Է� ù° �ٿ� �� ���� A, B, V�� �������� ���еǾ �־�����. (1 �� B < A �� V �� 1,000,000,000)
	 * ��� ù° �ٿ� �����̰� ���� ���븦 ��� �ö󰡴µ� ��ĥ�� �ɸ����� ����Ѵ�.
	 */
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int v = sc.nextInt();
		
		int day = (v-b)/(a-b);
		if((v-b)%(a-b)!=0) {
			day++;
		}
		System.out.println(day);
	
	}
}
