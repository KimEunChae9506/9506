package com.java0425;

import java.util.Scanner;

public class Test {
	
	
	public Test() {
		//System.out.println("평가를 실행하겠습니다");

		평가(); //평가 첫번째 실행-맨 처음 var 처럼. 이 메소드에서 평가 실행하니 메인에서는
	//부르기만
	}
	
	Scanner scan = new Scanner(System.in);
	int num = 1;
	int input = 0;
	String score = "";
	
	 public void 평가() {
	    	
			System.out.println(num + "번 학생의 점수를 입력하시오");		
			input = scan.nextInt();
			
	    	if(input == 100 || input>=90) {
				score= "A";
			}else if(input ==89 || input >=80) {
				score = "B";
			}
			
			else {
				score = "F";
			}
	    
	    	System.out.println(num + "번 학생의 시험 결과는" + score + "입니다.");
			num++;
		     //scan.close();//여기서 끝남.
			
			if(num > 10) {
				System.out.println("평가를 종료하겠습니다");
				return; //void기 때문에 리턴쓰면 종료. 약간 break
			}else {
				//다음 평가 시작
				평가();
				
			}
			
			
			
	}

}
