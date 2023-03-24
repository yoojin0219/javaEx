package com.kh.object.practice;

import java.util.Random;

public class NonStaticSample {

	public void printLottoNumbers() {
		
		System.out.print("랜덤 값 : ");
		int[] lotto = new int[6];
		Random random = new Random();
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		int temp;
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < i; j++) {
				if (lotto[i] < lotto[j]) {
					temp = lotto[i]; 
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		
	}
	
	public void outputChar(int num, char c) {
		System.out.print("a문자 5개 출력 :");
		for (int i = 1; i <= num; i++) {
			System.out.print(" " + c);
		}
	}
	
	public char alphabette() {
		return (char)((Math.random() * 26) + 65);
	}
	
	public String mySubstring(String str, int index1, int index2) {
		
		return null;
	}
	
	
	
}
