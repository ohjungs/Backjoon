package oh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Level2 {
	public static void main(String[] args) {
		int a = 12, b = 10;
		if (a > b) {
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
		;
		System.out.println(a > b ? "a��ũ��" : "b�� ũ��.");
		System.out.println("============");

		for (int i = 0; i < 10; i++) {
			if (i < 10)
				System.out.print("���� ��" + i);
			System.out.print("���� ��" + i);
			System.out.println();

		}
		//���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int score = 60;
		if (score >= 90 ) { 
			System.out.println("A����");
			} else if (score >= 80) {
			System.out.println("B����");
		} else if (score >= 70) {
			System.out.println("C����");
		}else if (score >= 60) {
			System.out.println("D����");
		}else { System.out.println("F����");}

//		������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
//		���� ���, 2012���� 4�� ����̸鼭 100�� ����� �ƴ϶� �����̴�. 1900���� 100�� ����̰� 400�� ����� �ƴϱ� ������ ������ �ƴϴ�. ������, 2000���� 400�� ����̱� ������ �����̴�.
		int y = 2000;
		if(y%4==0) {
			if(y%400==0) System.out.println("1");
			else if(y%100==0) System.out.println("0");
			else System.out.println("1");
		}
		else System.out.println("0");
		System.out.print((y%4==0)?((y%400==0)?"1":(y%100==0)?"0":"1"):"0");
		
		
		
//���� ���� ���� �� �ϳ��� �־��� ���� ��� ��и鿡 ���ϴ��� �˾Ƴ��� ���̴�. ��и��� �Ʒ� �׸�ó�� 1���� 4���� ��ȣ�� ���´�. "Quadrant n"�� "��n��и�"�̶�� ���̴�.
// 1��и� ++, 2��и� -,+ 3��и� -, - 4��и� -, + 
		Scanner scanner = new Scanner(System.in);
		int X = scanner.nextInt();
		int Y = scanner.nextInt();
		
		if(X > 0) {
			if(Y > 0) {
				System.out.print(1);
			} 
			else {
				System.out.print(4);
			}
		} 
		
		else {
			if(Y > 0) {
				System.out.print(2);
			} 
			else {
				System.out.print(3);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
		
	}

