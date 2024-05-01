package basic.ch08;

public class UserInfo {

	public String userId;
	public String userPassword;
	public String userName;
	public String userAddress;
	public String phoneNumber;
	
	//생성자 오버로딩이란
	//생성자의 개수가 여러개 있다
	
	//기본 생성자 형태 만들어보기
	public void UserInfo() {}
	
	public UserInfo(String id) {
		userId = id;
		
	}
	public UserInfo(String id,String name) {
		userId = id;
		userName = name;
	}
	public UserInfo(String id,String name,String password) {
		userId = id;
		userPassword = password;
		userName = name;
	}
	public UserInfo(String id,String name,String password,String address) {
		userId = id;
		userPassword = password;
		userName = name;
		userAddress = address;
	}
	public UserInfo(String id,String name,String password,String address,String phonenumber) {
		userId = id;
		userPassword = password;
		userName = name;
		userAddress = address;
		phoneNumber = phonenumber;
	}
	public void showInfo() {
		System.out.println("아이디 : " + userId);
		System.out.println("비밀번호 : " + userPassword);
		System.out.println("이름 : " + userName);
		System.out.println("주소 : " + userAddress);
		System.out.println("전화번호 : " + phoneNumber);
	}

	
	//연습문제
	//1 - 매개변수 3개를 받는 생성자 만들기
	//2 - 매겨변수 4개를 받는 생성자 만들기
	//3 - 매개변수 5개를 받는 생성자를 만들기
	
}//end of class
