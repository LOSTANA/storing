package basic.exercise;

import java.util.Scanner;

public class FunctionTest1 {

	public static void main(String[] args) {

		int menu;
		String name;
		int num;
		int age;
		int[] number = new int[2];
		Scanner sc = new Scanner(System.in);

		while (true) {

			try {//무시하셔도됩니다
				Thread.sleep(3 * 1000);
			} catch (InterruptedException ie) {
				Thread.currentThread().interrupt();
			}
			clearScreen();
			System.out.println("==============================================================");
			System.out.println("원하시는 메뉴를 입력하세요");
			System.out.print("1. 인사말 출력하기\t");
			System.out.print("2. 제곱 계산하기\t");
			System.out.print("3. 나이 확인\n");
			System.out.print("4. 양음수 판독기\t");
			System.out.print("5. 큰 값 판독기\n");
			System.out.println("==============================================================");
			menu = sc.nextInt();

			if (menu == 1) { //문제 1번
				System.out.print("이름을 입력하세요 : ");
				name = sc.next();
				greet(name);

			} else if (menu == 2) { //문제 2번
				System.out.print("제곱을 계산할 수를 입력 하세요 : ");
				num = sc.nextInt();
				System.out.println("입력한 수의 제곱은 " + square(num) + " 입니다");
			}

			else if (menu == 3) { // 문제 3번
				System.out.print("나이를 입력하세요 : ");
				age = sc.nextInt();
				if (checkAdult(age) == true) {
					System.out.println("당신은 성인입니다 " + checkAdult(age));
				}

				else {
					System.out.println("당신은 성인이 아닙니다 " + checkAdult(age));
				}

			} else if (menu == 4) { // 문제 4번
				System.out.print("정수를 입력하세요 : ");
				num = sc.nextInt();
				System.out.println(signOfNumber(num));
			}

			else if (menu == 5) { // 문제 5번
				System.out.print("두 수를 입력하세요 : ");
				for (int i = 0; i < 2; i++)
					number[i] = sc.nextInt();
				System.out.println("두 수중 가장 큰 수는 " + findMax(number[0], number[1]));
			}

			else {
				System.out.println("프로그램을 종료합니다");
				sc.close();
				break;
			}

		}
	}

	private static void clearScreen() { //화면 지우기용
		for (int i = 0; i < 5; i++)
			System.out.println("");

	}

	static void greet(String name) { // 문제1
		System.out.println("안녕하세요, " + name + "님!");
	}

	static int square(int n1) { // 문제2
		int mul = 0;

		mul = n1 * n1;

		return mul;
	}

	static boolean checkAdult(int n1) { // 문제3
		boolean ageCheck;
		if (n1 >= 18)
			ageCheck = true;
		else
			ageCheck = false;
		return ageCheck;
	}

	static String signOfNumber(int n1) { //문제4
		String position;
		if (n1 > 0)
			position = "positive";
		else if (n1 < 0)
			position = "negative";
		else
			position = "zero";
		return position;
	}

	static int findMax(int n1, int n2) {// 문제5

		int max = n1 > n2 ? n1 : n2;
		return max;
	}

}
