package sec04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("정수 a : ");
		int a = scan.nextInt();
		System.out.print("정수 b : ");
		int b = scan.nextInt();
		
		if (a > b) {
			int t = a;
			a = b;
			b = t;
		}
		
		/*
		for (int i = a; i <= b; i++) {
			System.out.print(i + " ");
		}
		*/
		
		int i = a;
		while (i <= b) {
			System.out.print(i + " ");
			i++;
		}
	}

}
