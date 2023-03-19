package sec03;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("a의 값 : ");
		int a = scan.nextInt();
		System.out.print("b의 값 : ");
		int b = scan.nextInt();

		if (a == b) {
			System.out.println("두 수는 같습니다.");
		} else {
			int max, min;

			if (a > b) {
				int max = a;
				int min = b;
			} else {
				int max = b;
				int min = a;
			}
			System.out.println("작은 값은 " + min + "입니다.");
			System.out.println("큰 값은 " + max + "입니다.");
		}
		

		
	}

}
