package StepByStepAlgorithm;

import java.util.Scanner;

public class Level4 {
	public static void main(String[] args) {
		//�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			if(num1==0 && num2==0){
				sc.close();
				break;
		}	System.out.println(num1+num2);
	}
		while(sc.hasNextInt()) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a+b);
		}

	}
}
