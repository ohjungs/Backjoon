package StepByStepAlgorithm;

import java.util.Scanner;

public class Level3_3 {

	public static void main(String[] args) {
//		ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
//		�Է�
//		ù° �ٿ� N(1 �� N �� 100)�� �־�����.
//		���
//		ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ����Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.print("*");
//			}	
//			System.out.println("");
//		}
//		����
//		ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
//
//		������, �������� �������� ������ ��(���� ����)�� ����Ͻÿ�.
//
//		�Է�
//		ù° �ٿ� N(1 �� N �� 100)�� �־�����.
//
//		���
//		ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ����Ѵ�.

		for(int i=1; i<=n; i++) { //1���� n���� i�� 1�� ������Ű�鼭 �ݺ�
			for(int j=1; j<=n; j++) { //1���� n���� j�� 1�� ������Ű�鼭 �ݺ�
				if(j<=n-i) { //j�� n-i���� �۴ٸ� ���� ���
					System.out.printf(" "); 
				}
				else { //j�� i���� ũ�ٸ� * ���
					System.out.printf("*"); //* ���	
				}
			}
			System.out.println();
		}
	}

}
