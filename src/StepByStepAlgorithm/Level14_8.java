package StepByStepAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Level14_8 {
	/* 14489�� ��ŸƮ ��ũ
	 * ��ŸƮ�� ��ũ �ð� ���� �޸� ���� ���� ���� ���� ��� ���� ���� 2 �� 512 MB 50020 25333 14734 47.308%
	 * ���� ������ ��ŸƮ��ũ�� �ٴϴ� ������� �𿩼� �౸�� �غ����� �Ѵ�. �౸�� ���� ���Ŀ� �ϰ� �ǹ� ������ �ƴϴ�. �౸�� �ϱ� ����
	 * ���� ����� �� N���̰� �ű��ϰԵ� N�� ¦���̴�. ���� N/2������ �̷���� ��ŸƮ ���� ��ũ ������ ������� ������ �Ѵ�.
	 * 
	 * BOJ�� ��ϴ� ȸ�� ��� ������� ��ȣ�� 1���� N������ �����߰�, �Ʒ��� ���� �ɷ�ġ�� �����ߴ�. �ɷ�ġ Sij�� i�� ����� j��
	 * ����� ���� ���� ������ ��, ���� �������� �ɷ�ġ�̴�. ���� �ɷ�ġ�� ���� ���� ��� ���� �ɷ�ġ Sij�� ���̴�. Sij�� Sji��
	 * �ٸ� ���� ������, i�� ����� j�� ����� ���� ���� ������ ��, ���� �������� �ɷ�ġ�� Sij�� Sji�̴�.
	 * 
	 * N=4�̰�, S�� �Ʒ��� ���� ��츦 ���캸��.
	 * 
	 * i\j 1 2 3 4 1 1 2 3 2 4 5 6 3 7 1 2 4 3 4 5 ���� ���, 1, 2���� ��ŸƮ ��, 3, 4���� ��ũ ����
	 * ���� ��쿡 �� ���� �ɷ�ġ�� �Ʒ��� ����.
	 * 
	 * ��ŸƮ ��: S12 + S21 = 1 + 4 = 5 ��ũ ��: S34 + S43 = 2 + 5 = 7 1, 3���� ��ŸƮ ��, 2, 4����
	 * ��ũ ���� ���ϸ�, �� ���� �ɷ�ġ�� �Ʒ��� ����.
	 * 
	 * ��ŸƮ ��: S13 + S31 = 2 + 7 = 9 ��ũ ��: S24 + S42 = 6 + 4 = 10 �౸�� ����ְ� �ϱ� ���ؼ� ��ŸƮ
	 * ���� �ɷ�ġ�� ��ũ ���� �ɷ�ġ�� ���̸� �ּҷ� �Ϸ��� �Ѵ�. ���� ������ ���� ��쿡�� 1, 4���� ��ŸƮ ��, 2, 3�� ���� ��ũ
	 * ���� ���ϸ� ��ŸƮ ���� �ɷ�ġ�� 6, ��ũ ���� �ɷ�ġ�� 6�� �Ǿ ���̰� 0�� �ǰ� �� ���� �ּ��̴�.
	 * 
	 * �Է� ù° �ٿ� N(4 �� N �� 20, N�� ¦��)�� �־�����. ��° �ٺ��� N���� �ٿ� S�� �־�����. �� ���� N���� ���� �̷����
	 * �ְ�, i�� ���� j��° ���� Sij �̴�. Sii�� �׻� 0�̰�, ������ Sij�� 1���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
	 * 
	 * ��� ù° �ٿ� ��ŸƮ ���� ��ũ ���� �ɷ�ġ�� ������ �ּڰ��� ����Ѵ�.
	 */
	static int N;
	static int min = Integer.MAX_VALUE;
	static int[][] arr;
	static boolean[] visit;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		visit = new boolean[N];
		
		for(int i = 0 ; i < N ; i++) {
		StringTokenizer str = new StringTokenizer(br.readLine());
		for(int j = 0 ; str.hasMoreTokens();j++) {
			arr[i][j]= Integer.parseInt(str.nextToken());
		}
		}
		
		dfs(0,0);
		
		System.out.println(min);
		

}
	public static void dfs(int depth, int a) {
		
		if(depth == N/2) {
			diff();
			return;
		}
		
		for(int i = a ; i < N ; i++) {
			visit[i]=true;
			dfs(depth+1, i+1);
			visit[i]=false;
		}	
	}
	
	public static void diff() {
		int start = 0;
		int link = 0;
		for(int i = 0 ; i < N-1 ; i++) {
			for(int j = i+1 ; j < N ; j++) {
				if(visit[i]==true && visit[j]==true) {
					start += arr[i][j];
					start += arr[j][i];
				}
				else if(visit[i]==false && visit[j]==false) {
					link += arr[i][j];
					link += arr[j][i];
				}
				
			}
		}
		
		int val = Math.abs(start - link);
		
		if(val == 0) {
			System.out.println(val);
			System.exit(0);
		}
		
		min=Math.min(min,val);
	}
}
