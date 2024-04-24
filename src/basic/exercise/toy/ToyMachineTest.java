package basic.exercise.toy;

import java.util.Random;
import java.util.Scanner;

public class ToyMachineTest {

	public static void main(String[] args) {

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		boolean money = true;

		int count1 = 1;
		int count2 = 1;
		ToyMachine toy = new ToyMachine();

		System.out.println("==================================");
		System.out.println("\t인형 뽑기 v1.0.0");
		toy.addProduct();
		while (money) {
			System.out.println("몇번 도전해보시겠습니까? (음수 입력시 재고 조회 ,100입력시 재고 채우기, 0 입력시 종료)");
			System.err.println("반드시 숫자만 입력해주세요!");
			int chance = sc.nextInt();

			if (chance > 0 && chance !=100) {
				System.out.println("상품 뽑기를 진행합니다");

				for (int i = 0; i < chance; i++) {
					int a = rd.nextInt(150);
					System.out.print("뽑는중");
					try {
						for (int j = 0; j < 2; j++) {
							Thread.sleep(2000);
							System.out.print(".");
						}
					} catch (Exception e) {
						System.out.println(e);
					}
					System.out.println("");
					System.out.print("상품이 뽑혔습니다!(남은기회 : " + (chance - i - 1) + " ) ==> ");

					if (a >= 100 || toy.products[a] == null) {
						System.out.println("꽝");
					} else {
						if (toy.products[a] != null) {
							toy.products[a].showInfo();
						}
					}
					
					try {
						for (int j = 0; j < 1; j++) {
							Thread.sleep(1000);
						}
					} catch (Exception e) {
						System.out.println(e);
					}

					if (a < 100) {
						if (toy.products[a] instanceof Lion) {
							System.err.println("현재 사자인형 " + count1 + "개째!");
							count1++;
							toy.products[a] = null;
						} else if (toy.products[a] instanceof Bear) {
							System.err.println("현재 곰인형 " + count2 + "개째!");
							count2++;
							toy.products[a] = null;
						} else {
							System.err.println("운 되게 좋으시네요!");
							toy.products[a] = null;
						}
					}
					
					try {
						for (int j = 0; j < 1; j++) {
							Thread.sleep(1000);
						}
					} catch (Exception e) {
						System.out.println(e);
					}

					if (i + 1 == chance) {
						System.out.println("기회를 모두 소모하셨습니다");
					}

				}

			} else if (chance < 0) {
				System.out.println("적재된 뽑기를 보여줍니다");
				for (int i = 0; i < toy.products.length; i++) {
					if (toy.products[i] != null) {
						System.out.print((i + 1) + ". ");
						toy.products[i].showInfo();
					} else {
						System.err.println((i + 1) + ". 재고없음");
					}
				}
			}

			else if (chance == 0) {
				System.out.println("인형뽑기를 종료합니다!");
				money = false;
			} else if (chance == 100) {
				System.out.println("재고를 다시 채웁니다");
				toy.addProduct();
			} else {
				System.out.println("잘못된 입력입니다!");
			}
			chance = 0;
			count1 = 1;
			count2 = 1;

		}

	}

}
