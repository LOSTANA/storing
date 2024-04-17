package basic.ch02;

public class DiscountCalculatory {

	public static void main(String[] args) {

		//상수 선언 - 원가, 힐인률
		
		final int MONEY = 50;
		final double DISCOUNT = 0.3; // 30% 할인
		
		
		//할인된 가격 계산 하기(비지니스 로직)
		// 할인된 가격 = 원가 x (1 - 할인률)
		
		double discountmoney = MONEY * (1 - DISCOUNT);
		//최종된 가격을 정수형으로 형 변환 처리
		
		//결과 출력
		System.out.println("최종 가격: " + (int)discountmoney );
		
	}

}
