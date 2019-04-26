package com.java0423;

public class Main {

	public static void main(String[] args) {
		System.out.println("변수연습");
		
		/**
		 * 0.객체(object > class)
		 * 1.변수
		 * 2.메소드
		 * 3.출력
		 * 4.연산
		 * 5.접근제한자(public)
		 * 6.정적(static)
		 * 7.리턴타입(void)
		 * 8.자료형
		 * 9.매개변수(메소드 호출 시 같이 보낼 값)(괄호 안)
		 **/
		
		
		//객체(class) 객체변수   대입    (생성키워드) (객체생성자)
		/*
		 *    Var        v    =     new      Var(); 
		 *    Var 란 클래스 생성해서 v라고 변수이름 붙였어. 객체 생성했은 ㅣVar 뒤에 괄호 안 명령이 실행될거야.
		 */
		// 클래스 변수일 때 클래스 부를 때 
		
		//Var v = new Var(); //객체생성
		//v.var();  //메소드 호출,  변수로 메소드(함수)호출
		
		new Var();  //생성자가 넣어져서 생성자가 만들어질 때 호출되게 하려고.클래스 안에 메서드를 생성해놔서
		
		//Var v = new Var();
		
		//v.var(1,6);
		//int s = v.state1;
		
		//v.var2(1,6);
		
		//Var=클래스, var=Var 클래스에서 설정한 메소드(리턴할 수 있는 것)
		
		System.out.println(and(5,6));
		
	}
	
	static int and(int c, int d) {
		return c+d;
		}
}
