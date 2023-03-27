package sec03;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 a : ");
		int a = scan.nextInt();
		System.out.print("정수 b : ");
		int b = scan.nextInt();
		System.out.print("정수 c : ");
		int c = scan.nextInt();
		
		if (a > b) {
			int t = a;
			a = b;
			b = t;
		}
		
		if (b > c) {
			int t = b;
			b = c;
			c = t;
		}
		
		if (a > b) {
			int t = a;
			a = b;
			b = t;
		}
		
		System.out.println("세 정수가 오름차순으로 정렬되었습니다.");
		System.out.printf("a : %d, b : %d, c : %d", a, b, c);
		
	}

}
