package basic.ch04;

public class WhileTest2_1 {
	//코드의 시작점(메인함수)
	public static void main(String[] args) {

		//1부터 5까지 덧셈 연산을 하라
		//1 + 2 + 3 + 4 + 5
		
		int start = 1;//시작값은 1
		int end = 5;
		int sum = 0;
		
		boolean flag = true;
		//첫번째 반복
		//6번째
		// 6     <= 5  --> 거짓  --> 반복문 종료
		
		while(flag) {
			if(start == 10) {
				flag = false;
			}
		//1: 1	=	0 +  1  ==> sum : 1
		//2: 3  =   1 +  2  ==> sum : 3
		//3: 6  =   3 +  3  ==> sum : 6
		//4: 10 =   6 +  4  ==> sum : 10
		//5: 15 =  10 +  5  ==> sum : 15
			
			
			sum = sum + start;
			System.out.println("sum(" + start + "): " + sum);
			start++; //1씩 증가
		}
		
	}//end of main

}//end of class
