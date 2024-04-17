package basic.ch04;

import java.util.Scanner;

public class OddSumCalculator {

	public static void main(String[] args) {

		// 사용자의 입력값을 받아서 1부터 x 까지 숫자에 홀수를 덧셈하고 출력하시오
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1;i <= num;i = i + 2) {
			sum = sum + i;
		}
		System.out.println("합 : " + sum);
	}// end of main

}// end of class
