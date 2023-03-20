package sec04;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		outter :
		while (true) {
			
			System.out.print("정숫값 : ");
			int n = scan.nextInt();
			
			if (n > 0) {
				System.out.println("이 값은 양수입니다.");
			} else if (n < 0) {
				System.out.println("이 값은 음수입니다.");
			} else {
				System.out.println("이 값은 0입니다.");
			}
			
		
			System.out.print("종료하시겠습니까? (y / n)");
			String quit = scan.nextLine();
			
			/*
			if (quit.equals("y")) {
				break outter;
			} else {
				System.out.println("프로그램이 다시 시작됩니다.");
			}
			*/
		}
		
		// System.out.println("프로그램이 종료되었습니다.");
		
	}
	
}
