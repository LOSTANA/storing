package basic.ch23;

public class Mother extends Thread{
	
	BankAccount account;
	
	public Mother(BankAccount account) {
		this.account = account;
	}
	
	//위임 시킬 일을 정의 할 예정
	@Override
	public void run() {
		//5천원 출금요청
		account.withDraw(5000);
	}
	
}
