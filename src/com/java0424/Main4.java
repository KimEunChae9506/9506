package com.java0424;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
	
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt(); 
		
		
		
		IFEx1 if문 = new IFEx1();
	
		scan.close();
		
		String 이프= if문.이프(score);
		
		System.out.println(이프);
		
	}


}
