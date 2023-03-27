package sec04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("세 자리의 정숫값 : ");
			int n = scan.nextInt();
			if (n < 100 || n > 999) {
			} else {
				System.out.println("입력한 값은 " + n +"입니다.");
				break;			
			}
		}
		
	}

}
