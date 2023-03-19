package sec02;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("x와 y를 더하고 곱하고 나눕니다.");
		
		System.out.print("x의 값 : ");
		double x = scan.nextDouble();
		
		System.out.print("y의 값 : ");
		double y = scan.nextDouble();
		
		double sum = x + y;
		double multi = x * y;
		double divide = x / y;
		double rest = x % y;
		
		System.out.println("두 수의 합은 " + sum + "입니다.");
		System.out.println("두 수의 곱은 " + multi + "입니다.");
		System.out.println("x를 y로 나눈 몫은 " + divide + "입니다.");
		System.out.println("나머지는 " + rest + "입니다.");
		
	}

}
