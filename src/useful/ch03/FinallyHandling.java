package useful.ch03;

import java.util.Scanner;

public class FinallyHandling {

	// 메인 쓰레드
	public static void main(String[] args) {

		// try-catch-finally
		// 언제 finally 사용해야 해?
		// 자원을 반드시 닫아 주어야 할땐 등등..
		Scanner scanner = new Scanner(System.in);

		try {
			int result = scanner.nextInt();
			System.out.println("result : " + result);
			// scanner의 자원을 다 사용했다면 자원을 해제해야 한다

		} finally {
			scanner.close();
			System.out.println("자원 해제 완료");
		}

	}// end of main

}// end of class
