package basic.exercise.toy;

import java.util.Random;

//클래스 인형뽑기
//상품들이 존재가능
//사자인형, 곰인형, 에어팟
//요구조건
//배열을 활용해서 객체들을 담아 주세요

public class ToyMachine {

	
	final int MAX_PRODUCT = 100;
	Random rd = new Random();

	Product[] products = new Product[MAX_PRODUCT];

	Product air = new Airpot();
	Product lion = new Lion();
	Product bear = new Bear();

	public void addProduct() {
		int productCount = 1;
		products[0] = air;

		if (productCount < MAX_PRODUCT) {
			for (int i = 1; i < products.length; i++) {
				if (products[productCount] == null) {
					int a = rd.nextInt(100);
					if (a >= 0 && a < 50) {
						products[productCount] = lion;
					} else {
						products[productCount] = bear;
					}
					productCount++;
				}
			}
		} else {
			System.out.println("상품 적재량이 초과되었습니다");
		}
	}

}
