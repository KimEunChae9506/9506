package com.java0429;

import java.util.Scanner;

public class 배열 {

	
  public void t1() {
	  boolean[][] 표= new boolean[5][5];
	  표[0][0] = false;
	  표[0][1] = false;
	  표[0][2] = false;
	  표[0][3] = false;
	  표[0][4] = false;
	  
	  표[1][0] = false;
	  표[1][1] = false;
	  표[1][2] = false;
	  표[1][3] = false;
	  표[1][4] = false;
	  
	  표[2][0] = false;
	  표[2][1] = false;
	  표[2][2] = false;
	  표[2][3] = false;
	  표[2][4] = false;
	  
	  표[3][0] = false;
	  표[3][1] = false;
	  표[3][2] = false;
	  표[3][3] = false;
	  표[3][4] = false;
	  
	  표[4][0] = false;
	  표[4][1] = false;
	  표[4][2] = false;
	  표[4][3] = false;
	  표[4][4] = false;
	  
	  for(int y=0; y < 표.length; y++) {//행
		  
		 for(int x=0; x < 표[y].length; x++) {//열. y행이랑 같이 가야 되니 (y가 먼저 표현되니 y배열)
			 System.out.print(표[y][x] + "\t");
		 }
		 System.out.println();
	  }
	  
  }


  public void t2() {
	  
	  int[][] 표 = new int[5][5];
	  
	  for(int y = 0; y < 표.length; y++) {
		  
		  for(int x=0; x < 표[y].length; x++) {
			  if(y%2==0) {//0,2,4
				  표[y][x] = 0;  
			  }else {
				  표[y][x] = 1;  
			  }
			  System.out.print(표[y][x] + "\t");
		  }
		  System.out.println();
	  }
	 
  }

  public void t3() {
	  	int[][] 표 = new int[5][5];
	  	for(int y=0; y < 표.length; y++) {
	  		for(int x=0; x < 표[y].length; x++) {
	  			if(y == x || y + x == 4) {
	  				표[y][x] = 1;			
	  			}
	  			else {
	  				표[y][x] = 0;
	  			}
	  			System.out.print(표[y][x] + "\t");
	  	}
	  		System.out.println();
  }

  }

  public boolean t4(int ax, int ay, int bx, int by) {
	    boolean result = false;
	  	int[][] 맵 = {
	  			{0,0,0,0,0,0,0,0,0,0},
				{0,1,1,1,1,1,1,1,1,0},
				{0,1,0,0,1,0,1,0,1,0},
				{0,1,0,0,1,0,1,0,1,0},
				{0,1,1,0,0,0,1,0,1,0},
				{0,1,1,0,0,0,1,1,1,0},
				{0,1,0,0,0,0,1,0,1,0},
				{0,1,0,0,1,0,1,0,1,0},
				{0,1,1,1,1,1,1,0,1,0},
				{0,0,0,0,0,0,0,0,0,0}
	  	};
	  	
	  	
	  	
	  	for(int y=0; y < 맵.length; y++) {
	  		for(int x=0; x < 맵[y].length; x++) {
	  			
	  			if(맵[ay][ax] == 0) {
	  				ay = by;
	  				by = bx; //현재값을 과거랑 같게 하라. 0□을 만나면 전에서 움직이지 마라.
	  						result = true;
	  			}
	  			
	  			
	  			if(y == ay && x == ax) {
	  				System.out.print("＠ ");		
	  			}else if (맵[y][x] == 1){
	  				System.out.print("□ ");
	  			}
	  			else {
	  				System.out.print("■ ");
	  			}
	  			
	  			
	  	}
	  		System.out.println();
}
          return result;//참일 때 움직고 폴스일 때 안움직이는 거르너 리저트.
}

  public void t5() {
	  Scanner scan = new Scanner(System.in);
	  int ax=1;
	  int ay=1;
	  int bx=1;
	  int by=1;
	  t4(ax, ay, bx, by); ///시작 위해 필요한 호출
	  while(true) {
		  String input = scan.next();
		  System.out.println(input.toUpperCase());
		  switch (input.toUpperCase()) {
		  case"W":  //위
			  ay--;
			  break;
		  case"S"://아래
			  ay++;
			  break;
		  case"A": //왼
			  ax++;
			  break;
		  case"D": //오른
			  ax--;
			  break;
	      default:
				  break;
		  }
		  
		  if(t4(ax, ay, bx, by)) { //이동을 위하여 호출
			 ax = bx;
			 ay = by; //전이랑 값이 같아서 전으로 돌아가. 위에서 트루인 경우. 트루일시 움직이지 않음.
		  }else {
			  bx = ax;
			  by = ay;
		  }
		  
	  }
	  
  }

 
  public boolean t6(int ax, int ay, int bx, int by) {
	    boolean result = false;
	  	int[][] 맵 = {
	  			{1,1,1,1,1,1,1,1},
				{1,0,1,0,0,0,1,1},
				{0,0,0,0,0,0,0,1},
				{1,0,1,2,0,1,0,0},
				{1,1,1,1,1,1,1,1}
};
	  	
	  	
	  	
	  	for(int y = 0; y < 맵.length; y++) {
	  		for(int x = 0; x < 맵[y].length; x++) {
	  			
	  			if(맵[ax][ay] == 1) {
	  				ay=by;
	  				ax=bx;
	  		  		
	  		  		result = true; //움직이지 않는 게 트루.
	  		  	}
	  			
	  			if(y == ay && x == ax) {
	  				System.out.print("♬ ");
	  			}else if(맵[y][x] == 2) {
	  				System.out.print("＠ ");
	  			}else if(맵[y][x] == 1) {
	  				System.out.print("■ ");
	  			}else {
	  				System.out.print("□ ");
	  			}
	  			
	  		}
	  		System.out.println();
	  		
	  	}
	   return result;
	   
  }  	
  
  public void t7() {
	  Scanner scan = new Scanner(System.in);
	  int ax=0;
	  int ay=2;
	  int bx=0;
	  int by=2;
	  t6(ax, ay, bx, by); ///시작 위해 필요한 호출
	  while(true) {
		  String input = scan.next();
		  System.out.println(input.toUpperCase());
		  switch (input.toUpperCase()) {
		  case"W":  //위
			  ay++;
			  break;
		  case"S"://아래
			  ay--;
			  break;
		  case"A": //왼
			  ax--;
			  break;
		  case"D": //오른
			  ax++;
			  break;
	      default:
				  break;
				  
				  //System.out.println("강사님 이름을 입력하세요.");
				  //String input = scan.next(); //강사님 이름 입력	  
		  }
		  
		  if(t6(ax, ay, bx, by)) { //이동을 위하여 호출
			 
			  ax = bx;
			  ay = by; 
			  
		  }else {
			  bx = ax;
			  by = ay;
		  }
		  
		  
	  }
	  
  }
 
 

  
  }
	  
