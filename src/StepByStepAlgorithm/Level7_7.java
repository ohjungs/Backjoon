package StepByStepAlgorithm;

import java.util.Scanner;

public class Level7_7 {
	/*
	 * 2908�� ��� ���� ������� ���� ����� ������ ���� ���Ѵ�. ����� ���ڸ� �дµ� ������ �ִ�. �̷��� ������ ���ϴ� ����� ���ؼ�
	 * ����̴� ���� ũ�⸦ ���ϴ� ������ ���־���. ����̴� �� �ڸ� �� �� ���� ĥ�ǿ� ���־���. �� ������ ũ�Ⱑ ū ���� ���غ����
	 * �ߴ�. ����� ���� �ٸ� ����� �ٸ��� �Ųٷ� �д´�. ���� ���, 734�� 893�� ĥ�ǿ� �����ٸ�, ����� �� ���� 437�� 398��
	 * �д´�. ����, ����� �� ���� ū ���� 437�� ū ����� ���� ���̴�. �� ���� �־����� ��, ����� ����� ����ϴ� ���α׷���
	 * �ۼ��Ͻÿ�. �Է� ù° �ٿ� ����̰� ĥ�ǿ� ���� �� �� A�� B�� �־�����. �� ���� ���� ���� �� �ڸ� ���̸�, 0�� ���ԵǾ� ����
	 * �ʴ�. ��� ù° �ٿ� ����� ����� ����Ѵ�.
	 */
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	sc.close();
	num1 = Integer.parseInt(new StringBuilder().append(num1).reverse().toString());
	num2 = Integer.parseInt(new StringBuilder().append(num2).reverse().toString());
	System.out.println(num1 > num2 ? num1 : num2 );
}	
}
/* ���ڿ��� �Ųٷ� ����ϱ� .. ����
 * String str = "ABCDE"; //���ڿ� reverse StringBuffer sb = new StringBuffer(str);
 * String reverse = sb.reverse().toString(); //��� ��� System.out.println(sb); //
 * "EDCBA" System.out.println(reverse); // "EDCBA"
 */