package sec04;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("카운트다운 합니다.");
		
		int n;
		
		while (true) {
			System.out.print("양의 정숫값 : ");
			n = scan.nextInt();
			
			for (; n >= 0; n--) {
				System.out.println(n);
			}
			
			System.out.println("n의 값이 " + n + "이 되었습니다.");
		}
		
	}

}
