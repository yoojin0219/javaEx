package sec03;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			
			System.out.print("몇 월입니까? ");
			int month = scan.nextInt();
			
			switch (month) {
			case 3:			
			case 4:			
			case 5:
				System.out.println("계절은 봄입니다.");
				break;
			case 6:			
			case 7:			
			case 8:		
				System.out.println("계절은 여름입니다.");
				break;
			case 9:			
			case 10:			
			case 11:	
				System.out.println("계절은 가을입니다.");
				break;
			case 12:			
			case 1:			
			case 2:
				System.out.println("계절은 겨울입니다.");
				break;
			default :
				System.out.println("그런 월은 존재하지 않습니다.");
				break;
			}
			
		}
		
	}
}
