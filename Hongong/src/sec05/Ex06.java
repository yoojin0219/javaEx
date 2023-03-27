package sec05;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int[] score = null;
		
		outter :
		while (true) {
			System.out.println("--------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택> ");
			int select = scan.nextInt();
			
			if (select == 1) {
				System.out.print("학생수> ");
				num = scan.nextInt();
				score = new int[num];
			} else if (select == 2) {
				for (int i = 0; i < score.length; i++) {
					System.out.print("stnum[" + i + "]> ");
					score[i] = scan.nextInt(); 
				}
				
			} else if (select == 3) {
				for (int i = 0; i < score.length; i++) {
					System.out.println("stnum[" + i + "]> " + score[i]);
				}				
			} else if (select == 4) {
				int sum = 0;
				for (int scores : score) {
					sum += scores;
				}
				double avg = (double)sum / score.length;
				
				int max = 0;
				for (int scores : score) {
					if (max < scores) {
						max = scores;
					}
				}
					
				System.out.println("점수 합계 : " + sum);
				System.out.println("평균 점수 : " + avg);
				System.out.println("최고 점수 : " + max);
			} else {
				System.out.println("프로그램 종료");
				break outter;
			}
		}
		
	}
}
