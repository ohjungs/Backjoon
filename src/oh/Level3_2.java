package oh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level3_2 { 	public static void main(String[] args) throws IOException {
	
		/*
		 * �� ���� �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. �Է� ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
		 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10) ��� �� �׽�Ʈ ���̽�����
		 * "Case #x: "�� ����� ����, A+B�� ����Ѵ�. �׽�Ʈ ���̽� ��ȣ�� 1���� �����Ѵ�.
		 */
//	Scanner sc = new Scanner(System.in);
//	int n= sc.nextInt();
/*	for(int i=0; i<n; i++) {
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println( "Case #"+(i+1) +": " + (num1+num2) );*/

//	����
//	�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//	�Է�
//	ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
//
//	�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
//
//	���
//	�� �׽�Ʈ ���̽����� "Case #x: A + B = C" �������� ����Ѵ�. x�� �׽�Ʈ ���̽� ��ȣ�̰� 1���� �����ϸ�, C�� A+B�̴�.

	 	
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	
	int T = Integer.parseInt(br.readLine());

	StringBuilder sb = new StringBuilder();
	for (int i = 1; i <= T; i++) {
		String str = br.readLine();
		int A = str.charAt(0)-'0';
		int B = str.charAt(2)-'0';
		sb.append("Case #").append(i).append(": ").append(A)
		.append(" + ").append(B).append(" = ").append(A+B).append('\n');
	}
	System.out.println(sb);

}

}
