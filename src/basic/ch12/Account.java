package basic.ch12;

public class Account {
	public String account;
	private String cardNumber;
	private int count;
	
	public String getAccount() {
		return account;
	}
	
	public String getcardNumber() {
		return cardNumber;
	}
	
	public Account(String account, String cardNumber) {
		this.account = account;
		this.cardNumber = cardNumber;
	}
	
	public void makeAccount(String cardNumber) {
		this.cardNumber = cardNumber;
		account = "우리은행";
	}
	
	public void showInfo() {
		System.out.println("현재 발급된 계좌는 이렇습니다");
		System.out.println(count + ". 은행명 : " + account + " 카드번호 : " + cardNumber );
	}
	
}
