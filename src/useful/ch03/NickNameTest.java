package useful.ch03;

import java.util.Scanner;

public class NickNameTest {

	public static void main(String[] args) {

		NickName nickName = new NickName();
		
		String inputNick = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("닉네임을 설정해 주세요 ==> ");
		try {
			inputNick = sc.next();
			nickName.setNick(inputNick);
		}catch(NickNameException e) {
			System.out.println("예외발생 : " + e.getMessage());
		}finally {
			sc.close();
		}
		
	}

}
