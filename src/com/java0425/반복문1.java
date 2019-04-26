package com.java0425;

public class 반복문1 {

    /***************
     * for문 : for(1,2,3){실행문}
     * 1 ) 초기화식: for 문에서 사용할 변수 선언 및 초기값 정의
     * 2 ) 조건식: if문과 동일하게 거짓을 찾기 위한 조건
     * 3 ) 증감식: for문에서 사용할 변수를 변화를 주기 위한 식
     */
	
	public void t1() {
		for(int i=0; i < 10; i++) {
		System.out.println(i);
	}
	
}
	
	
	public void t2(int s) {
		System.out.println("반복문 시작");
	for(int i=0; i < s; i++ )	{
		System.out.println(i);
	}
	    System.out.println("반복문 종료");
	}
	
	
	

	public void t3(int c, int d) {
		System.out.println("t3 반복문 시작");
	for(; c<=d; c++)	{//t3 괄호 안에 초기화 선언했기 때문에 안 써도 됨.
		System.out.println(d);
	}
	 System.out.println("t3반복문 종료");
	}
	
	public void t4() {
	for(int i=0; i < 5; i++) {
		if(i % 2 ==0) {
			System.out.print("★");
		}else {
			System.out.print("☆");
		}
		System.out.println("");
		System.out.print("");
	}
	//System.out.println("끝");
  }
	
	public void t5() {
		for(int i=0; i < 5; i++) {
			
			for(int j=0; j <= i; j++) {
				
					if(i % 2 ==0) {
						System.out.print("★");
					}else {
						System.out.print("☆");
					}
				
			}
			System.out.println("");
		}
	}

	public void t6() {
            for(int i=0; i < 5; i++) {
			
			for(int j=0; j <= i; j++) {
				//i-0 j-0  i-1 j-1(i 1일 때 j 0빼니까) i-1 j-0(i 1일 때 j 1빼니까)
					if((i-j) % 2 ==0) {
						System.out.print("★");
					}

					else {
						System.out.print("☆");
					}
		
            }
			System.out.println("");
			//결국 안쪽 for 인 j값이 나오게 되는 거임.
		
	}

	}


	public void t7() {
	     	int t=0;
            for(int i=0; i < 9; i++) {//0 1 2 3 4 3 2 1 0 이 돼야 하니까 임의 변수 t로 i 대신 표현...
			if(i>4) {
				t = t-2;//i++는 i 값나오고 1 빼니까 -2
			}
			 for(int j=0; j <= t; j++) {
				
					if(j % 2 ==0) {
						System.out.print("★");
					}

					else {
						System.out.print("☆");
					}
		
            }
			 t++;
			System.out.println("");
			
            } 

	}

	public void t8() {
		int t=0;
            for(int i=0; i < 9; i++) {//0 1 2 3 4 3 2 1 0 이 돼야 하니까 임의 변수 t로 i 대신 표현...
			if(i>4) {
				
				t = t-2;//i++는 i 값나오고 1 빼니까 -2
			}
			 for(int j=0; j <= t; j++) {
				
					if((t-j) % 2 ==0) {
						System.out.print("★");
					}

					else {
						System.out.print("☆");
					}
		
            }
			 t++;
			System.out.println("");
			
            } 
	
	}
 
	public void t9() { 
		
		
		for(int i=1; i <= 9; i++) {
			
			System.out.println(i+ "단");
		
			for(int j=1; j <=9; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
		
		
		
	}

    public void t10() { 
		
    	
		for(int i=1; i <= 9; i+=3) {
			
				System.out.println(i + "단");
				
			for(int j=1; j <=9; j++) {
				
				System.out.println(i + "*" + j + "=" + (i*j) + i++);
			
				}
			System.out.println();

				}
	
			}
			
			

		
		
	}

    


