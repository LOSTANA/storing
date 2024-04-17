package basic.ch04;

import java.util.Scanner;

public class WhileTest2 {
	//코드의 시작점(메인함수)
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 특정 조건일 때 반복문을 종료 시켜 보자
		boolean flag = true; // 깃발
		int start = 1;
		int end = 3;
		
		while(flag) {
			System.out.println("start : " + start);
			if(start == end) {
				System.out.println("if 구문이 동작함");
				flag = false;
				return;
			}
			start++;
		}
		
		
	}//end of main

}//end of class
