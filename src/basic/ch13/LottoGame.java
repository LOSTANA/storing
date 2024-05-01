package basic.ch13;

import java.util.Random;

public class LottoGame {

	public static void main(String[] args) {
		// static 변수 --> 클래스 변수라고도 한다

// 전체 1~6까지 나온 결과값을 오름차순으로 정렬
//단, 중복값 제외
		
//수식을 작성해주세요
	// 만약 if 반복문 사용 금지 if문 6개로 구성
		System.out.println(makeNumber() + "\t");
		System.out.println(makeNumber()+ "\t");
		System.out.println(makeNumber() + "\t");
		System.out.println(makeNumber()+ "\t");
		System.out.println(makeNumber()+ "\t");
		System.out.println(makeNumber()+ "\t");
		System.out.println("=========================");

		int[] lottos = makeNumber();
		for(int i = 0;i<lottos.length;i++) {
			System.out.println(lottos[i] + "\t");
		}
		

		
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
