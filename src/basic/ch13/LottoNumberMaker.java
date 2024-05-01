package basic.ch13;

import java.util.Random;

public class LottoNumberMaker {

	private String version = "1.0.0";

	// main 함수
	public static void main(String[] args) {

		System.out.println(makeNumber());

	}

	// 인스턴스에 속하지 않는 함수 만들기
	public static int[] makeNumber() {
		// static 함수안에 멤버 변수를 사용할 수 없다
		// 메모리가 뜨는 순서 !!
		// System.out.println("ver : " + version);
		// 자바 도구 -- 표준 API
		// 난수 발생기 -- > 랜덤적인 값 생성
		int[] numbers = new int[6];
		Random random = new Random();
		for (int i = 0; i < 6; i++) {
			int resultNumber = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				numbers[i] = resultNumber;
				if (numbers[i] == numbers[j]) {
					i--;
				}
			}

		}

		return numbers;
	}
}
