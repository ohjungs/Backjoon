package StepByStepAlgorithm;

import java.util.Scanner;

public class Level9_2 {
	/*
	 * 2581�� �Ҽ� ���� �ڿ��� M�� N�� �־��� �� M�̻� N������ �ڿ��� �� �Ҽ��� ���� ��� ��� �̵� �Ҽ��� �հ� �ּڰ��� ã��
	 * ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * ���� ��� M=60, N=100�� ��� 60�̻� 100������ �ڿ��� �� �Ҽ��� 61, 67, 71, 73, 79, 83, 89, 97 ��
	 * 8���� �����Ƿ�, �̵� �Ҽ��� ���� 620�̰�, �ּڰ��� 61�� �ȴ�.
	 * 
	 * �Է� �Է��� ù° �ٿ� M��, ��° �ٿ� N�� �־�����.
	 * 
	 * M�� N�� 10,000������ �ڿ����̸�, M�� N���� �۰ų� ����.
	 * 
	 * ��� M�̻� N������ �ڿ��� �� �Ҽ��� ���� ��� ã�� ù° �ٿ� �� ����, ��° �ٿ� �� �� �ּڰ��� ����Ѵ�.
	 * 
	 * ��, M�̻� N������ �ڿ��� �� �Ҽ��� ���� ���� ù° �ٿ� -1�� ����Ѵ�.
	 */
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int m=sc.nextInt();
		int n = sc.nextInt();
		boolean arr[]= new boolean[n+1];
		arr[0] = true;
		arr[1] = true;
		for(int i=2; i<=Math.sqrt(n+1); i++) {
			for(int j=i*i; j<n+1; j+=i) {
				arr[j] =true;
			}
		}
		int min =Integer.MAX_VALUE;
		int sum = 0;
		for(int i=m; i<n+1; i++) {
			if(arr[i] == false) {
				if(min>i)
					min =i;
				sum += i;
			}
		}
		if(sum ==0)
			System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}}
