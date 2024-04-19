package basic.ex13;

public class LottoGame3 {

	public static void main(String[] args) {
		// static 변수 --> 클래스 변수라고도 한다

		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();
		int gameNumber3 = LottoNumberMaker.makeNumber();
		int gameNumber4 = LottoNumberMaker.makeNumber();
		int gameNumber5 = LottoNumberMaker.makeNumber();
		int gameNumber6 = LottoNumberMaker.makeNumber();
// 전체 1~6까지 나온 결과값을 오름차순으로 정렬
//단, 중복값 제외

//수식을 작성해주세요
		// 만약 if 반복문 사용 금지 if문 6개로 구성
		System.out.println(gameNumber1 + "\t");
		System.out.println(gameNumber2 + "\t");
		System.out.println(gameNumber3 + "\t");
		System.out.println(gameNumber4 + "\t");
		System.out.println(gameNumber5 + "\t");
		System.out.println(gameNumber6 + "\t");
		System.out.println("=========================");

		int box1 = 0;
		// 반복의 횟수 -6
		for (int pass = 1; pass <= 6; pass++) {
			if (gameNumber1 > gameNumber2) {
				box1 = gameNumber2;
				gameNumber2 = gameNumber1;
				gameNumber1 = box1;
			}
			if (gameNumber2 > gameNumber3) {
				box1 = gameNumber3;
				gameNumber3 = gameNumber2;
				gameNumber2 = box1;
			}
			if (gameNumber3 > gameNumber4) {
				box1 = gameNumber4;
				gameNumber4 = gameNumber3;
				gameNumber3 = box1;
			}
			if (gameNumber4 > gameNumber5) {
				box1 = gameNumber5;
				gameNumber5 = gameNumber4;
				gameNumber4 = box1;
			}
			if (gameNumber5 > gameNumber6) {
				box1 = gameNumber6;
				gameNumber6 = gameNumber5;
				gameNumber5 = box1;
			}
		}

		System.out.println(gameNumber1 + "\t");
		System.out.println(gameNumber2 + "\t");
		System.out.println(gameNumber3 + "\t");
		System.out.println(gameNumber4 + "\t");
		System.out.println(gameNumber5 + "\t");
		System.out.println(gameNumber6 + "\t");

		System.out.println("=========================");

	}

}
