package sec04;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("카운트다운 합니다.");
		
		int n;
		while (true) {
			System.out.print("양의 정숫값 : ");
			n = scan.nextInt();
			if (n <= 0) {
			} else {
				/*
				for (int i = n; n >= 0; n--) {
					System.out.println(n);
				}
				*/
				int i = n;
				while (n >= 0) {
					System.out.println(n);
					n--;
				}
				break;
			}
		}
		
		System.out.println("n의 값이 " + n + "이 되었습니다." );
		
	}

}
