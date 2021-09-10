package StepByStepAlgorithm;

import java.util.Scanner;

public class Level7_8 {
	/*
	 * 5622�� ���̾� ���� ������� �ҸӴϴ� �Ʒ� �׸��� ���� ������ ���̾� ��ȭ�⸦ ����Ѵ�.
	 * ��ȭ�� �ɰ� ���� ��ȣ�� �ִٸ�, ���ڸ� �ϳ��� ���� ������ �ݼ� ���� �ִ� �� ���� �ð�������� ������ �Ѵ�. ���ڸ� �ϳ� ������
	 * ���̾��� ó�� ��ġ�� ���ư���, ���� ���ڸ� �������� ���̾��� ó�� ��ġ���� �ٽ� ������ �Ѵ�.
	 * ���� 1�� �ɷ��� �� 2�ʰ� �ʿ��ϴ�. 1���� ū ���� �Ŵµ� �ɸ��� �ð��� �̺��� �� �ɸ���, �� ĭ ���� �ִ� ���ڸ� �ɱ� ���ؼ�
	 * 1�ʾ� �� �ɸ���.
	 * ������� �ҸӴϴ� ��ȭ ��ȣ�� �� ���ڿ� �ش��ϴ� ���ڷ� �ܿ��. ��, � �ܾ �� ��, �� ���ĺ��� �ش��ϴ� ���ڸ� �ɸ� �ȴ�. ����
	 * ���, UNUCIC�� 868242�� ����.
	 * �ҸӴϰ� �ܿ� �ܾ �־����� ��, �� ��ȭ�� �ɱ� ���ؼ� �ʿ��� �ּ� �ð��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * �Է� ù° �ٿ� ���ĺ� �빮�ڷ� �̷���� �ܾ �־�����. �ܾ��� ���̴� 2���� ũ�ų� ����, 15���� �۰ų� ����.
	 * ��� ù° �ٿ� ���̾��� �ɱ� ���ؼ� �ʿ��� �ּ� �ð��� ����Ѵ�.
	 */
	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
 
		int count = 0;
		int k = s.length();
        
		for(int i = 0; i < k; i++) {
        
			switch(s.charAt(i)) {
            
			case 'A' : case 'B': case 'C' : 
				count += 3;
				break;
                
			case 'D' : case 'E': case 'F' :
				count += 4; 
				break;
                
			case 'G' : case 'H': case 'I' :
				count += 5; 
				break;
                
			case 'J' : case 'K': case 'L' : 
				count += 6;
				break;
                
			case 'M' : case 'N': case 'O' :
				count += 7;
				break;
                
			case 'P' : case 'Q': case 'R' : case 'S' : 
				count += 8; 
				break;
                
			case 'T' : case 'U': case 'V' : 
				count += 9;
				break;
                
			case 'W' : case 'X': case 'Y' : case 'Z' : 
				count += 10;
				break;
			}
		}		
		System.out.print(count);
		/*
		 * int count = 0; int value;
		 * 
		 * while(true) {
		 * 
		 * value = System.in.read();
		 * 
		 * if(value == '\n') { break; }
		 * 
		 * if(value < 68) count += 3; else if(value < 71) count += 4; else if(value <
		 * 74) count += 5; else if(value < 77) count += 6; else if(value < 80) count +=
		 * 7; else if(value < 84) count += 8; else if(value < 87) count += 9; else count
		 * += 10;
		 * 
		 * 
		 * } System.out.print(count);
		 */
	}
}
