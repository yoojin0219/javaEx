package sec04;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("카운트업 합니다.");
		
		while (true) {
			System.out.print("양의 정수값 : ");
			int n = scan.nextInt();
			
			for (int i = 0; i <= n; i++) {
				System.out.println(i);
			}
			
		}
		
	}
	
}
