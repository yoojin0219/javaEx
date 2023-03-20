package com.choongang;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int money = 0;
		
		quit :
		while (true) {
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------");
				
			System.out.print("선택> ");
			int input = scan.nextInt();
		
			switch (input) {
				case 1:
					System.out.print("예금액> ");
					money += scan.nextInt();
					break;
				case 2:
					System.out.print("출금액> ");
					int num = scan.nextInt();
					if (num > money) {
						System.out.println("잔액이 부족합니다.");
					} else {
						money -= num;
					}
					break;
				case 3:
					System.out.println("잔고> " + money);
					break;
				case 4:
					System.out.println();
					System.out.println("프로그램 종료");
					break quit;
			}
			
		}		
		
	}

}
