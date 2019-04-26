package com.java0424;

public class 조건문 {

	
	/*************
	 *-if문(따로 쓰는게 아니라 메소드 안에서 쓰임)
	 * if(조건식) {} 필수, 조건
	 * eles {} if 조건이 아닐 때 실행.
	 * eles if() {} 두번째 조건이 필요할 때
	 * -비교자   대상 (비교자) 비교대상
	 * == : 같다 -(문자열 비교로는 쓸 수 없음.)
	 * != : 같지 않다
	 * >  :크다 
	 * <  :작다
	 * >= :크거나 같다
	 * <= :작거나 같다
	 *  - switch 문
	 *  switch(비교값)
	 *  case 값 : 비교값과 값이 같으면 실행
	 *  default : 비교값이 case 값에 없으면 실행
	**************/
	
	/*static 왜 안쓴다고?-메인클래스 안에서 쓰여서 받으면 쓰는거고 객체 생성해서 쓰면 안 씀. 그럼 메모리 효율 좋고, 클래스 받아서
	쓰니 재사용 가능.*/
	
	public void t1(int a) {
	
		if(10 == a) {
			System.out.println("같다");
			
		}
		else {
			System.out.println("같지 않다");
		}
	}
	
	public boolean t2(int a) {
		if(10 == a) {
			return true;}
		else {
			return false;
		}
	}
	
	public int t3(int a, int b) {
		
		if(a == b) {
			return 1;
		}
		else {return 0;}
		
	}
	
	public int t4(int a, int b) {
		if(a>b) {
			return a;
		}else if(a<b) {
			return b;
			
		}else {
			return -1;
		}
		
		
	}

	public String t5(int a, int b) {
		//하나라도 참이면 그 순서에서 멈춰. 연결되어 이썽서.
		if(a == b) {
			return "두 개의 값이 같다";
		}else if(a != b) {
				return "두 개의 값이 같지 않다";
		}else if(a > b) {
			return "a 변수의 값이 크다";
		}else if(a<b) {
			return "b 변수의 값이 크다";
		}else if(a>b) {
			return "a 변수의 값이 b보다 크다";
		}else if(a <= b) {
			return "a 변수의 값이 b보다 작거나 같다";
		}else if(a>=b) {
			return "a 변수의 값이 b보다 크거나 같다";
		}else {
			return "두 개의 값을 비교 할 수 없다";
		}
	}

	public String t6(int a, int b) {
		if(a == b) {
			return "두 개의 값이 같다";
		}
		
		if(a !=b ) {
			return "두 개의 값이 같지 않다";
		}
		 if(a>b) {
			 return "a 변수의 값이 크다";
		 }
		 if(a<b) {
			 return "b 변수의 값이 크다";
		 }
		return "두 개의 값이 같을 비교할 수 없다";
	}

	public String t7(int a, int b) {
		//마지막 참이 리턴값. 변수를 언제 마지막으로 적용했나. 
		//리턴값이 없으니까 실행만 하고 반환은 안 하다 리턴썼으니까 그 전에 쓴 걸로 리턴.
		String msg = "";
		if(a == b) {
			msg = "두 개의 값이 같다";
		}
		
		if(a !=b ) {
			msg = "두 개의 값이 같지 않다";
		}
		 if(a>b) {
			 msg = "a 변수의 값이 크다";
		 }
		 if(a<b) {
			 msg = "b 변수의 값이 크다";
		 }
		 
		return msg; 
	}

	public String t8(int a) {
		String msg = "";
		
		switch (a) {
		case 0:
		      msg = "전달 받은 값은 0입니다.";
		      break;
		case 1:
		      msg = "전달 받은 값은 1입니다.";
		      break;//값이 참이니 더이상 아래로 내려가지 마라. 안 쓰면 맨 마지막값도 같이 쓰임
		default:
			  msg = "전달 받은 값은 case 값에 없습니다.";
			  break;
		}
		
		return msg;
	}
	
	public String t9(int a) {
		//문장 같은 걸 조합해야 할 때.(브레이크 안 쓰면 같이 나오니까.)
	String msg = "";
	
	switch (a) {
	case 0:
		msg = "0 비교";
	
	case 1:
		msg = msg + "1 비교";
		break;
    case 2:
		msg = msg + "2 비교 범위의 값입니다.";
		break;
	default:
		msg = "0~2 범위의 값이 아닙니다.";
		break;
		
		
	}
	return msg;
	
	}
	
	public String t10(int score) {
	String grade = "";
	
	switch (score/10) {
	case 10:
	case 9:
		grade = "A";
		break;
	case 8:
		grade = "B";
		break;
	case 7:
		grade = "C";
		break;
	case 6:
		grade = "D";
		break;
	default:
		grade = "F";
		break;
			
		
	}

   return grade;
}

}
	

