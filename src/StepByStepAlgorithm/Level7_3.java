package StepByStepAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level7_3 {

	public static void main(String[] args) throws IOException {
/*		Scanner in = new Scanner(System.in);
		 
		 
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
 
		String S = in.nextLine();
 
		for(int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
    
			if(arr[ch - 'a'] == -1) {	// arr ���� ���� -1 �� ��쿡�� �ʱ�ȭ
				arr[ch - 'a'] = i;
			}
		}
 
		for(int val : arr) {	// �迭 ���
			System.out.print(val + " ");
		}
	}
}
*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
 
		String S = br.readLine();
 
		for(int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
    
			if(arr[ch - 'a'] == -1) {	// arr ���� ���� -1 �� ��쿡�� �ʱ�ȭ
				arr[ch - 'a'] = i;
			}
		}
 
		for(int val : arr) {	// �迭 ���
			System.out.print(val + " ");
		}
	}
}
 
