package StepByStepAlgorithm;

import java.util.*;

public class Level5_2 {

	public static void main(String[] args) {
		/*
		 * 9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ���� ���,
		 * ���� �ٸ� 9���� �ڿ��� 3, 29, 38, 12, 57, 74, 40, 85, 61 �� �־�����, �̵� �� �ִ��� 85�̰�, �� ����
		 * 8��° ���̴�. �Է� ù° �ٺ��� ��ȩ ��° �ٱ��� �� �ٿ� �ϳ��� �ڿ����� �־�����. �־����� �ڿ����� 100 ���� �۴�. ��� ù°
		 * �ٿ� �ִ��� ����ϰ�, ��° �ٿ� �ִ��� �� ��° �������� ����Ѵ�.
		 */ 
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[9];			// ���� 9���� ���� �迭 ����
		
		for(int i = 0 ; i < arr.length ; i ++)			// �迭�� 9���� ���� ����
		{
			arr[i]=sc.nextInt();	
		}
		
		int max = arr[0];			// ������ �� ù�� ° ���� max�� ���� 
		int index = 0 ;			// �ִ밪�� ��ġ�� �˾Ƴ� ���� ����
		
		for(int i = 1 ; i < arr.length ; i ++)
		{
			if(arr[i] > max) 			// max�� arr[0]�̴ϱ�, max���� ū ���� ������ �� ���� max�� ��.
			{							
				max = arr[i];
				index = i+1;			// max�� �� ���� ��ġ�� index�� ����
			}
		}
		
		System.out.println(max);
		System.out.println(index);
		
	}
}

