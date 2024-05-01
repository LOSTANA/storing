package basic.ch06;

import java.util.Scanner;

//자바의 모든 코드는 class XXX {} 블록안에 코드를 작성하기로 약속 되어있다
public class Function1 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int sum;
		add(10, 10);

		Scanner sc = new Scanner(System.in);

		System.out.print("값 설정 1 : ");
		num1 = sc.nextInt();
		System.out.print("값 설정 2 : ");
		num2 = sc.nextInt();
		sum = calcSum(num1, num2);

		System.out.println(num1 + " 과 " + num2 + " 의 합은 " + sum);
		
		sc.close();
	}// end of main

	static int add(int n1, int n2) {
		int result;
		result = n1 + n2;
		return result;
	}

	// 연습 문제
	// 함수를 수정 -- 파라메터 정수 2개를 받을 수 있도록 설계
	// s1, s2 --> 반복
	// 1, 10 -> 55
	static int calcSum(int n1, int n2) {
		int sum = 0;
		int i;
		for (i = n1; i <= n2; i++) {
			// 횟수 101번 동작 하는 녀석

			// 0 = 0 + 1
			// 1 = 1 + 2
			// 3 = 3 + 3
			sum = sum + i; // 5050

		}
		return sum;
	}
}// end of class
