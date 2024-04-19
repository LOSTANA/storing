package basic.ch12;

public class Card {

	//멤버 변수
	public static int cardNumber = 1;
	private int cardN;
	
	private String cardName;
	
	//생성자
	public Card(String cardName) {
		this.cardName = cardName;
		this.cardN = cardNumber++;
	}
	//멤버 함수
	
	//get,set작성

	public static int getCardNumber() {
		return cardNumber;
	}

	public static void setCardNumber(int cardNumber) {
		Card.cardNumber = cardNumber;
	}

	public int getCardN() {
		return cardN;
	}

	public void setCardN(int cardN) {
		this.cardN = cardN;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	public static void main(String[] args) {
		
		Card card1 = new Card("부산");
		Card card2 = new Card("농협");
		Card card3 = new Card("우리");
		
		System.out.println("카드가 발급되었습니다");
		System.out.println("카드 번호 : " + card1.getCardName());
		System.out.println("고유 카드번호 : " + card1.getCardN() );
		
		System.out.println("카드 번호 : " + card2.getCardName());
		System.out.println("고유 카드번호 : " + card2.getCardN());
		
		System.out.println("카드 번호 : " + card3.getCardName());
		System.out.println("고유 카드번호 : " + card3.getCardN());
		
		
	}

}


