package StepByStepAlgorithm;

import java.util.HashSet;
import java.util.Scanner;

public class Level5_4 {

	public static void main(String[] args) {
		/*
		 * ���� �� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. ���� ���, 7, 14, 27, 38�� 3���� ���� ��������
		 * 1, 2, 0, 2�̴�.
		 * �� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. �� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * �Է� ù° �ٺ��� ����° �� ���� ���ڰ� �� �ٿ� �ϳ��� �־�����. �� ���ڴ� 1,000���� �۰ų� ����, ���� �ƴ� �����̴�.
		 * ��� ù° �ٿ�, 42�� �������� ��, ���� �ٸ� �������� �� �� �ִ��� ����Ѵ�.
		 */
		Scanner in = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<Integer>();
 
		for (int i = 0; i < 10; i++) {
			h.add(in.nextInt() % 42);
		//�Է¹��� ���� ������ ���� add�޼ҵ带 ���� HashSet�� ����
		}
        
		in.close();
		System.out.print(h.size());


	}

}
