package basic.ch13;

public class LottoGame {

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
		System.out.println(gameNumber2+ "\t");
		System.out.println(gameNumber3 + "\t");
		System.out.println(gameNumber4+ "\t");
		System.out.println(gameNumber5+ "\t");
		System.out.println(gameNumber6+ "\t");
		System.out.println("=========================");

		

		
	}

}
