package com.java0424;

public class Main {

	        //1. 생성자  {}
	        //생성자 안에 생성자 생성은 하지 않는다. - {} 이게 있어서.
	        //생성자 안에 메소드 생성은 하지 않는다.
			//2. 변수 상수-전역 (클래스 전역, 클래스 바로 밑에)
			//3. 메소드 :{} - 변수 - 메소드 전역 -지역
	        //메소드 안에 메소드 생성은 하지 않는다.
	        //메소드 안에 생성자 생성은 하지 않는다.
	        //4. staitc(정적) : 만들지 않는다. 단 main 메소드만 static을 사용한다.
	        //5. 기능 구현할 때 가능하면 클래스를 적극 활용한다. -재사용성을 위해. main은 따로, 기능 클래스는 따로.
	
	/* int a;
	 
	 void aa() {
	 
	 int b = 1;
	 
	 for(int i = 0; i<10; i++) {
		 System.out.println(i);	//for문 안에서만 사용 가능한 지역 변수
		 System.out.println(i+b);
	 
	*/
	public static void main(String[] ag){
		
		계산기 calc = new 계산기();
		
		int a=2;
		int b=4;
		int c=5;
		
		 calc.테스트(a, b);
		 calc.덧셈(a,b); //덧셈 메소드 호출
		 calc.뺄셈(a,b);
		 calc.나눗셈(a,b);
		 calc.곱셈(a,b);
		 calc.덧곱셈(a,b,c);
		 
		 System.out.println( calc.덧곱셈(5,9,2));
	}

 }

