package basic.exercise;

import java.util.Scanner;

public class IfExercise1 {

	
	//코드의 시작점
	public static void main(String[] args) {

		// 정수값 이력 받기 활용해서 코드에 흐름을 만들어 주세요
		// 조건문을 완성하세요
		// 90점 이상 -> A 학점 입니다. 
		// 80점 이상 -> B 학점 입니다. 
		// 70점 이상 -> C 학점 입니다.
		// 60점 이상 -> D 학점 입니다.
		// 59점 이하 -> F 학점 입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 값을 입력하세요 : ");
		int a = sc.nextInt();
		
		if (a >= 90) {
			System.out.println("A 학점입니다");
		}
		else if(a >= 80) {
			System.out.println("B 학점입니다");
		}
		else if (a >= 70) {
			System.out.println("C 학점입니다");
		}
		else if (a >= 60) {
			System.out.println("D 학점입니다");
		}
		else {
			System.out.println("F 학점입니다");
		}
		sc.close();
	} // end of main

} // end of class
