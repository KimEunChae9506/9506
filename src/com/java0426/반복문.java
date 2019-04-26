package com.java0426;

import java.util.Scanner;
public class 반복문 {

	public void lv1(){
		
		for(int y = 1; y<=9; y ++) {
			System.out.println(y + "단");
			for(int x=1; x<=9; x++) {
				System.out.println(y + "*" + x + "=" + (y*x));
			}
			System.out.println();
		}
		
	}
		public void lv2(){
			
			for(int y = 1; y<=9; y = y +3) {//밑에 프린트아웃이 있으니 세로, Y축으로 +3씩. 1,4,7
				/*System.out.print(y + "단\t" );
				System.out.print((y +1) + "단\t");
				System.out.print((y +2) + "단\t");//그냥 단임.
				System.out.println();*/
				for(int x=1; x<=9; x++) {
					System.out.print(y + "*" + x + "=" + (y*x) + "\t");//순서대로 명령 실행 써놓은거야 단순한게. Y=1부터 2,3-다시 앞 FOR로 돌아오면 이제 4부터
					System.out.print((y+1) + "*" + x + "=" + (y*x) +"\t");//4란 Y+3
					System.out.print((y+2) + "*" + x + "=" + (y*x) + "\t");
					System.out.println();
				}
				System.out.println();
			}

	}
	
public void lv3(){
			
			for(int y = 1; y<=3; y++) {//Y는3까지의 정수.1,2,3.
				/*System.out.print(y + "단\t" );
				System.out.print((y +3) + "단\t"); -이것들은 밑에 프린트(두번째FOR)실행 후 하나씩 실행. X<Y
				System.out.print((y +6) + "단\t");
				System.out.println();*/
				for(int x=1; x<=9; x++) {
					System.out.print(y + "*" + x + "=" + (y*x) + "\t");//1이 들어감. X9까지 실행.
					System.out.print((y+3) + "*" + x + "=" + ((y+3)*x) +"\t");//이번엔 옆에 4넣은 값을 실행.
					System.out.print((y+6) + "*" + x + "=" + ((y+6)*x) + "\t");//여기까지 실행후 다음 줄 넘어가서 앞FOR실행. 다음은 2. 다음은 3.
					System.out.println();
				}
				System.out.println();
			}
}		

public void lv4() {
	Scanner scan = new Scanner(System.in);
	// X축으로 출력 나올 갯수를 입력 받는다.
	System.out.println("X축으로 출력 나올 갯수를 입력 하세요.");
	int x축 = scan.nextInt();
	for(int y = 1; y <= 9; y = y + x축) {
		for(int x = 1; x <= 9; x++) {
			for(int 계산 = 0; 계산 < x축; 계산++) {
				System.out.print((y + 계산) + " * " + x + " = " + ((y + 계산) * x) + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

	scan.close();
}




public void lv5() {
	Scanner scan = new Scanner(System.in);
	// X축으로 출력 나올 갯수를 입력 받는다.
	System.out.println("X축으로 출력 나올 갯수를 입력 하세요.");
	int x축 = scan.nextInt();
	for(int y = 1; y <= 9; y = y + x축) {
		for(int x = 1; x <= 9; x++) {
			for(int 계산 = 0; 계산 < x축; 계산++) {
				System.out.print((y + 계산) + " * " + x + " = " + ((y + 계산) * x) + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

	scan.close();
}


public void lv6() {
	for(int i=1; i <=11; i++) {
		for(int j=1; j <=11; j++) {
			
			if(i==j) {
				System.out.print("■");
			
	}else if(i==1 || j==1) {
		System.out.print("■");
		
	}else if(i==11 || j==11) {
		System.out.print("■");
	
}else if(i==6 || j==6) {
	System.out.print("■");
}
else if(i+j ==12) {
	
	System.out.print("■");
}else {
	System.out.print("□");
}

	}
		System.out.println();//앞 for이 i가 2되기 전에 한 줄 띄어라.
	

}

}
}

