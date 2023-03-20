package sec04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = (int)(Math.random() * 90 + 10);
		
		while (true) {
			System.out.print("두 자리의 정숫값 : ");
			int n = scan.nextInt();
			if (n > num) {
				System.out.println("더 작은 숫자입니다.");
			} else if (n < num) {
				System.out.println("더 큰 숫자입니다.");
			} else {
				System.out.println("-- 정답입니다! --");
				break;
			}
		}
		
	}

}
