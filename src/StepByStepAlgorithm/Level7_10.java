package StepByStepAlgorithm;

import java.io.IOException;
import java.util.Scanner;

public class Level7_10 {
	/*
	 * ���� 1613�� �׷� �ܾ� üĿ �׷� �ܾ�� �ܾ �����ϴ� ��� ���ڿ� ���ؼ�, �� ���ڰ� �����ؼ� ��Ÿ���� ��츸�� ���Ѵ�. ����
	 * ���, ccazzzzbb�� c, a, z, b�� ��� �����ؼ� ��Ÿ����, kin�� k, i, n�� �����ؼ� ��Ÿ���� ������ �׷�
	 * �ܾ�������, aabbbccb�� b�� �������� ��Ÿ���� ������ �׷� �ܾ �ƴϴ�. �ܾ� N���� �Է����� �޾� �׷� �ܾ��� ������ ����ϴ�
	 * ���α׷��� �ۼ��Ͻÿ�. �Է� ù° �ٿ� �ܾ��� ���� N�� ���´�. N�� 100���� �۰ų� ���� �ڿ����̴�. ��° �ٺ��� N���� �ٿ�
	 * �ܾ ���´�. �ܾ�� ���ĺ� �ҹ��ڷθ� �Ǿ��ְ� �ߺ����� ������, ���̴� �ִ� 100�̴�. ��� ù° �ٿ� �׷� �ܾ��� ������ ����Ѵ�
	 */
	public static void main(String[] args) {
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); int
		 * n = Integer.parseInt(br.readLine()); int result = n; StringTokenizer st;
		 * for(int i=0; i<n; i++) { st = new StringTokenizer(br.readLine()); String s =
		 * st.nextToken(); int cnt=0; for(char c='a'; c<='z'; c++) { int first =
		 * s.indexOf(c); int last = s.lastIndexOf(c); if(first!=last) { for(int
		 * j=first+1; j<last; j++) { if(s.charAt(j)!=c) { cnt++; break; } } } }
		 * if(cnt!=0) { result--; } } System.out.println(result); }
		 */
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int cnt = a;
		for (int i = 0; i < a; i++) {
			String word = sc.next();
			for (int j = 1; j < word.length(); j++) {
				if (word.indexOf(word.charAt(j - 1)) > word.indexOf(word.charAt(j))) {
					cnt--;
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}
// �ٽ�Ǯ�� ��Ǯ��..
