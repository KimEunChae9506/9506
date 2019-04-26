package com.java0424;

import java.util.Scanner;

public class IFEx1 {

	Scanner scan = new Scanner(System.in);

	public String 이프(int score){
		
		if(score >= 60) {
			return "합격을 축하합니다.";
		}else {
			return "불합격입니다.";
		}
	}
	
	
}
