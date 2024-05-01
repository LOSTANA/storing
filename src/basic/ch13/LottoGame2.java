package basic.ch13;

import java.util.Random;

public class LottoGame2 {

	public static void main(String[] args) {
		// static 변수 --> 클래스 변수라고도 한다
		
		int[] gameNumber1 = makeNumber();
		int[] gameNumber2 = makeNumber();
		int[] gameNumber3 = makeNumber();
		int[] gameNumber4 = makeNumber();
		int[] gameNumber5 = makeNumber();
		int[] gameNumber6 = makeNumber();
// 전체 1~6까지 나온 결과값을 오름차순으로 정렬
//단, 중복값 제외
		
//수식을 작성해주세요
	// 만약 if 반복문 사용 금지 if문 6개로 구성
		System.out.println(gameNumber1 + "\t");
		System.out.println(gameNumber2+ "\t");
		System.out.println(gameNumber3 + "\t");
		System.out.println(gameNumber4+ "\t");
		System.out.println(gameNumber5+ "\t");
		System.out.println(gameNumber6+ "\t");
		System.out.println("=========================");
		
		int box1 = 0;
		if(gameNumber1 > gameNumber2) {
			box1 = gameNumber2;
			gameNumber2 = gameNumber1;
			gameNumber1 = box1;
		}
		if(gameNumber2 > gameNumber3) {
			box1 = gameNumber3;
			gameNumber3 = gameNumber2;
			gameNumber2 = box1;
		}
		if(gameNumber3 > gameNumber4) {
			box1 = gameNumber4;
			gameNumber4 = gameNumber3;
			gameNumber3 = box1;
		}
		if(gameNumber4 > gameNumber5) {
			box1 = gameNumber5;
			gameNumber5 = gameNumber4;
			gameNumber4 = box1;
		}
		if(gameNumber5 > gameNumber6) {
			box1 = gameNumber2;
			gameNumber6 = gameNumber5;
			gameNumber5 = box1;
		}
		
		System.out.println(gameNumber1 + "\t");
		System.out.println(gameNumber2+ "\t");
		System.out.println(gameNumber3 + "\t");
		System.out.println(gameNumber4+ "\t");
		System.out.println(gameNumber5+ "\t");
		System.out.println(gameNumber6+ "\t");
	
		System.out.println("=========================");
		

		
	}
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
