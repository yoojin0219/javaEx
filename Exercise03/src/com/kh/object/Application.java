package com.kh.object;

import com.kh.object.practice.NonStaticSample;

public class Application {

	public static void main(String[] args) {

		NonStaticSample non = new NonStaticSample();
				
		non.printLottoNumbers();
		System.out.println();

		non.outputChar(5, 'a');
		System.out.println();
		
		System.out.println(non.alphabette());
		

		
	}

}
