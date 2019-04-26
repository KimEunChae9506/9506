package com.java0424;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("계산기 시작");
		System.out.print("첫번째 값을 입력하세요 > ");
		int a = scan.nextInt();
		System.out.print("연산자를 입력하세요 > ");
		String b = scan.next();
		System.out.print("두번째 값을 입력하세요 ");
		int c = scan.nextInt();
		System.out.print("연산자를 입력하세요 > ");
		String e = scan.next();
		System.out.print("세번째 값을 입력하세요 ");
		int d = scan.nextInt();
       
		계산기 calc = new 계산기();
		String msg = "";
		switch (b) {
		case "+":
			msg = a + "+" + c + "=" + calc.덧셈(a, c);
			break;
		case "-":
			msg = a + "-" + c + "=" + calc.뺄셈(a, c);
			break;
		case "*":
		    msg = a + "*" + c + "=" + calc.곱셈(a, c);
			break;
		case "/":
		    msg = a + "/" + c + "=" + calc.나눗셈(a, c);
		    break;
		case "^+*":
			msg ="(" +  a + "+" + c + ")" + "*" + d + "=" + calc.덧곱셈(a,c,d);
			break;
		case "+^*":
			msg =a + "+" + "(" + c + "*" + d + ")" + "=" + calc.덧곱셈(a,c,d);
			break;
		
		default:
			msg = "계산할 수 없습니다.";
			break;
		}
		
			switch (e) {
			
			case "_":
			    msg = msg;
			    break;
				
			default:
				msg = "계산할 수 없습니다.";
				break;
			}
			
		
	
		scan.close();
		System.out.println(msg);
	}
	
	

}
