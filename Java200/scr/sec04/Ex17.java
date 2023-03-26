package sec04;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("몇 개의 *을 표시할까요? ");
		int n = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.print("*");
			if (i % 5 == 0) {
				System.out.println();
			}
		}
		
	}

}
