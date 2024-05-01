package basic.exercise;

import java.util.Scanner;

public class PhoneBookManager {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean logout = true;

		PhoneBook[] ph = new PhoneBook[100];

		final String SAVE = "1";
		final String RESEARCH_ALL = "2";
		final String CHANGE = "3";
		final String DELETE = "4";
		final String RESEARCH = "5";
		final String END = "0";

		System.out.println("===================================");
		System.out.println("전화번호부 v2.0.6");

		while (logout) {
			System.out.println("===================================");
			System.out.println("수행하실 메뉴를 선택해주세요");
			System.out.println("1.전화번호 저장 2.전화번호 조회 3.전화번호 수정 4.전화번호 삭제");
			System.out.println("5.전화번호 선택 조회 0.프로그램 종료");

			String choose = sc.nextLine();

			if (choose.equals(SAVE)) {
				PhoneBook.save(sc, ph);
			} else if (choose.equals(RESEARCH_ALL)) {
				PhoneBook.research_all(sc, ph);
			} else if (choose.equals(CHANGE)) {
				PhoneBook.change(sc, ph);
			} else if (choose.equals(DELETE)) {
				PhoneBook.delete(sc, ph);
			} else if (choose.equals(RESEARCH)) {
				PhoneBook.research(sc, ph);
			} else if (choose.equals(END)) {
				logout = false;
				System.out.println("===================================");
				System.out.println("프로그램을 종료합니다");
			} else
				System.out.println("잘못된 입력입니다 다시 입력해주세요!");
		}

	}// end of main

}
// end of class
