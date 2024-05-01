package basic.ch23;

public class MainTest {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();

		Father father = new Father(account);
		father.start();
		
		
		Mother mother = new Mother(account);
		mother.start();
		
		int resultMoney = account.getMoney();
		System.out.println("현재 잔액 : " + resultMoney);
		//정상 처리 : 10만원 + 1만원 - 5천원 ==> 10만 5천원
	}

}
