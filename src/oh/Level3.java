package oh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Level3 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		for(int i=1; i<10; i++){
//			System.out.println(n*i );
//			};
		// 
//		int arr[] = new int[n];
//		 
//		for (int i = 0; i < n; i++) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			arr[i] = a + b;
//		}
//		sc.close();
// 
//		for (int k : arr) {
//			System.out.println(k);
//		}
		
		//n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		int sum=0;
//		for (int i = 1; i <= n; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
			
		/*
		 * Scanner�� System.out.println ��� BufferedReader�� BufferedWriter�� ����� �� �ִ�.
		 * BufferedWriter.flush�� �� �������� �� ���� �ϸ� �ȴ�.
		 * �� �׽�Ʈ���̽����� A+B�� �� �ٿ� �ϳ��� ������� ����Ѵ�. -> ��ĳ�ʸ� �������� ..!
		 * 	int N = Integer.parseInt(br.readLine());
        
		StringTokenizer st;
 
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
		}
		br.close();
        
		bw.flush();
		bw.close();
		 */
			
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int N = Integer.parseInt(br.readLine());
//		StringBuilder sb = new StringBuilder();
// 
//		for (int i = 0; i < N; i++) {		
//			String str = br.readLine();
//			int target = str.indexOf(" ");
//			int result = Integer.parseInt(str.substring(0,target)) + Integer.parseInt(str.substring(target + 1));		
//			sb.append(result+"\n");
//		}
//		
//		br.close();
//		System.out.print(sb);
//		�ڿ��� N�� �־����� ��, 1���� N���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		�Է�
//		ù° �ٿ� 100,000���� �۰ų� ���� �ڿ��� N�� �־�����.
//		���
//		ù° �ٺ��� N��° �� ���� ���ʴ�� ����Ѵ�.
	for(int i=1; i<=n; i++) {
		System.out.println(i);
	}
	
	}
}
