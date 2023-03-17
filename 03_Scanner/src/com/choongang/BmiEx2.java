package com.choongang;

import java.util.Scanner;

public class BmiEx2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
		
			System.out.print("키(cm) : ");
			String strHeigt = scan.nextLine();
		
			System.out.print("몸무게(kg) : ");
			String strWeight = scan.nextLine();
		
			double height = Double.parseDouble(strHeigt) * 0.01;
			double weight = Double.parseDouble(strWeight);
		
			double bmi = weight / (height * height);
			
			System.out.println("--------------------");
			System.out.printf("당신의 BMI는 %.2f입니다.", bmi);
			System.out.println();
			
		
			if(bmi < 18.5) {
				System.out.println("저체중입니다.");
			} else if(bmi < 25) {
				System.out.println("표준입니다.");
			} else if(bmi < 30) {
				System.out.println("과체중입니다.");
			} else if(bmi < 35) {
				System.out.println("비만입니다.");
			} else {
				System.out.println("고도비만입니다.");
			}
			
			System.out.println("--------------------");
			
			System.out.println("종료하시겠습니까? (y/n)");
			String quit = scan.nextLine();
			if(quit.equals("y")) {
				break;
			}
			
			System.out.println("BMI 프로그램을 종료합니다.");
		
		}
		
	
	}
		
}