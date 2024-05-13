package structure.ch06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class UniqueUserIDSystem {
	
	private HashSet<String> userIDs;
	
	public UniqueUserIDSystem() {
		this.userIDs = new HashSet<String>();
	}
	
	// 사용자 ID 등록 가능
	// 정상적으로 들어가면 true
	// 중복 발생하면 false
	public boolean registerUserID(String userId) {
		return userIDs.add(userId);
	}
	
	// 시스템 실행
	public void run() {
		// 동작 - 스캐너 활용
		// 실행 흐름 만들기 --> while , if
		// 결과 -> 정상 유저 등록
		//		-> 이미 등록된 사용자 입니다;
		Scanner sc = new Scanner(System.in);
		userIDs.add("주윤재");
		while(true) {
			System.out.println("등록할 이름을 입력해주세요");
			String id = sc.next();
			boolean idCheck = registerUserID(id);
			if(idCheck) {
				System.out.println("정상 유저 등록");
				break;
			}
			else {
				System.out.println("이미 등록된 사용자 입니다");
			}

		
		}
		sc.close();
	}
	
	//코드 테스트
	public static void main(String[] args) {
		UniqueUserIDSystem system = new UniqueUserIDSystem();
		system.run();
	}//end of main

}// end of class
