package oh;

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
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}	
			System.out.println("");
		}
	
	}

}
