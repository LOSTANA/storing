package basic.ch19;

public class BankTest {

	public static void main(String[] args) {

		Bank bank = new Bank("그린은행"); // 독립적인 생명 주기를 가진다
		Customer customer = new Customer("홍길동"); //독립적인 생명 주기를 가진다
		
		
		//연관관계
		customer.useBankService(bank);
		System.out.println("=======================");
		//enum type연습
		bank.provideService(ServiceType.ACCOUNT_INFO, customer);
		bank.provideService(ServiceType.WHAT, customer);
	}

}
