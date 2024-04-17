package basic.exercise;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;
		int i = 1;
		// \n ==> 무조건 한줄 내림
		boolean stop = true;

		while (stop) {
			System.out.println("=============================================");
			System.out.println("메뉴 선택");

			System.out.println("\n1. 등록\t2. 조회\t3. 수정\t4. 삭제\t0. 종료 ");
			System.out.print("선택 : ");
			choice = sc.nextInt();
			System.out.println("=============================================");

			System.out.println("\t현재 실행 횟수 : " + i);
			// if(i == 7) {
			// System.out.println("7번이나 입력하셨네요 대단해요!");
			// }
			// if(i == 50) {
			// System.out.println("이걸 왜 50번이나 입력하시는 거죠?");
			// }
			// if(i == 77) {
			// System.out.println("\t럭키세븐 당첨");
			// }

			// 만약.... 사용자 1 -->

			if (choice == 1) {
				System.out.println("\t등록 선택했습니다");
			} else if (choice == 2) {
				System.out.println("\t조회 선택했습니다");
			} else if (choice == 3) {
				System.out.println("\t수정 선택했습니다");
			} else if (choice == 4) {
				System.out.println("\t삭제 선택했습니다");
			} else if (choice == 0) {
				System.out.println("\t프로그램을 종료합니다");
				break;//while 반복문을 빠져나와 프로그램 종료
			} else {
				System.out.println("잘못된 입력입니다. 다시 선택해주세요");
			}

			i++;
		}

	}// end of main

}// end of class
