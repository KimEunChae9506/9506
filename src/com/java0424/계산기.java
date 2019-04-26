package com.java0424;

public class 계산기 {
	
	public void 테스트(int a, int b) {
		System.out.println("a :" + a + "b :" + b);
		//실행하면 끝이니까 void but 계산기는 결과갋을 받아야 한까 return 씀.
	}
	public int 덧셈(int a, int b) {
		return (a + b);
	}

	
	public int 뺄셈(int a, int b) {
		return (a - b);
	}
	
	public float 나눗셈(int a, int b) {
		//(float) 명시적 형변환-기본자료형 변형-값이 int로 나오면 안 되니까 괄호하고 float씀.
		return (float) (a / b);
	}
	
	public float 곱셈(int a, int b) {
		return (float) (a * b);
	}
	
	public float 덧곱셈(int a, int b, int c) {
		return (float) ((a + b) * c);
	}
	 
}
