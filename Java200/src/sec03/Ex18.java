package sec03;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 a : ");
		int a = scan.nextInt();
		System.out.print("정수 b : ");
		int b = scan.nextInt();
		
		if (a < b) {
			int t = a;
			a = b;
			b = t;
		}
		
		System.out.println("a가 b보다 크도록 정렬했습니다.");
		System.out.printf("정수 a : %d\n정수 b : %d", a, b);
	}

}
