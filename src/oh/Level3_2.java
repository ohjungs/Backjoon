package oh;

import java.util.Scanner;

public class Level3_2 { 	public static void main(String[] args) {
	
		/*
		 * �� ���� �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. �Է� ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
		 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10) ��� �� �׽�Ʈ ���̽�����
		 * "Case #x: "�� ����� ����, A+B�� ����Ѵ�. �׽�Ʈ ���̽� ��ȣ�� 1���� �����Ѵ�.
		 */
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	for(int i=0; i<n; i++) {
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println( "Case #"+(i+1) +": " + (num1+num2) );

	};
				sc.close();
}

}
