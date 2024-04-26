package basic.exercise.toy;

import java.util.Random;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		ToyMachine machine = new ToyMachine();
		int select;
		boolean flag = true;
		boolean flag2 = true;
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		machine.addProduct();
		System.out.println("인형뽑기를 시작합니다.");

		while (flag) {
			System.out.println("1.뽑기 2.종료");
			select = sc.nextInt();
			if (select == 1) {
				System.out.println("몇번 뽑으시겠습니까?");
				int chance;
				chance = sc.nextInt();
				flag2 = true;
				while (flag2) {
					int a = r.nextInt(10);
					machine.products[a].showInfo();
					chance -= 1;
					if (chance == 0) {
						System.out.println("기회가 모두 소모되었습니다");
						flag2 = false;
					} else {
						System.out.println(chance + "만큼 기회가 남았습니다. 계속 하시겠습니까?");
						System.out.println("1. 뽑기 2. 중단");
						int select2 = sc.nextInt();
						if (select2 == 1) {
							continue;
						} else if (select2 == 2) {
							System.out.println("중단합니다");
							flag2= false;
						} else
							System.out.println("다시 입력해주세요");
					}
				}

			} else if (select == 2) {
				System.out.println("종료합니다.");
				flag = false;
			} else {
				System.out.println("잘못된 선택");
			}
		}

	}

}
