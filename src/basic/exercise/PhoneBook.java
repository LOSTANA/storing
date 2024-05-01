package basic.exercise;

import java.util.Scanner;

public class PhoneBook {

	private String name;
	private String number;
	static int lastSave = 0;

	public PhoneBook(String name, String number) {
		this.name = name;
		this.number = number;

	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public static void save(Scanner sc, PhoneBook[] ph) {

		System.out.println("===================================");
		System.out.println("저장하실 이름과 번호를 입력하세요");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("번호 : ");
		String number = sc.nextLine();

		PhoneBook phone = new PhoneBook(name, number);

		if (lastSave >= ph.length) {
			System.out.println("===================================");
			System.out.println("더이상 번호를 저장할 수 없습니다");
			return;
		}
		for (int i = 0; i < ph.length; i++) {
			if (ph[i] == null) {
				ph[i] = phone;
				lastSave++;
				System.out.println("===================================");
				System.out.println("저장되었습니다");
				break;
			}
		}

	}

	public static void research_all(Scanner sc, PhoneBook[] ph) {
		System.out.println("===================================");
		final String ALL = "1";
		final String SOME = "2";
		System.out.println("1. 전체 조회 2. 선택 조회");
		System.out.print("선택 : ");

		String re = sc.nextLine();
		boolean check = false;

		if (re.equals(ALL)) {
			System.out.println("===================================");
			System.out.println("현재 조회된 번호는 다음과 같습니다");
			for (int i = 0; i < ph.length; i++) {
				if (ph[i] != null) {
					System.out.println(ph[i].getName() + ", " + ph[i].getNumber());
					check = true;
				}

			}
			if (check == false) {
				System.out.println("현재 저장된 번호가 없습니다");
				return;
			}
		} else if (re.equals(SOME)) {
			research(sc, ph);
		} else {
			System.out.println("===================================");
			System.out.println("잘못 입력하셨습니다 처음메뉴로 돌아갑니다");
			return;
		}
	}

	public static void change(Scanner sc, PhoneBook[] ph) {
		System.out.println("===================================");
		System.out.println("변경할 전화번호의 이름을 입력해주세요");
		String name = sc.nextLine();
		boolean check = false;
		for (int i = 0; i < ph.length; i++) {
			if (ph[i] != null) {
				if (ph[i].getName().equals(name)) {
					System.out.println("===================================");
					System.out.println("변경하실 번호를 입력해주세요");
					System.out.println("현재 저장된 번호 : " + ph[i].getNumber());
					String number = sc.nextLine();
					System.out.println("===================================");
					System.out.println("다음과 같이 변경됩니다");

					System.out.println("변경전 : " + ph[i].getName() + ", " + ph[i].getNumber());
					ph[i].setNumber(number);
					System.out.println("변경후 : " + ph[i].getName() + ", " + ph[i].getNumber());
					check = true;
					break;
				}

			}

		}
		if (check == false) {
			System.out.println("해당 이름의 번호가 저장되어있지 않습니다");
		}
	}

	public static void delete(Scanner sc, PhoneBook[] ph) {
		System.out.println("===================================");
		System.out.println("1. 전체 삭제 2. 선택 삭제");
		System.out.print("선택 : ");
		final String ALL = "1";
		final String SOME = "2";
		String re = sc.nextLine();
		boolean check = false;

		if (re.equals(ALL)) {
			System.out.println("===================================");
			System.out.println("전체 삭제합니다");
			for (int i = 0; i < ph.length; i++) {
				if (ph[i] != null) {
					ph[i] = null;
					check = true;
				}

			}
			if (check == false) {
				System.out.println("현재 저장된 번호가 없습니다");
				return;
			}
		} else if (re.equals(SOME)) {
			System.out.println("===================================");
			System.out.println("삭제할 전화번호의 이름을 입력해주세요");
			String name = sc.nextLine();

			for (int i = 0; i < ph.length; i++) {
				if (ph[i] != null) {
					if (ph[i].getName().equals(name)) {
						System.out.println("===================================");
						ph[i] = null;
						System.out.println("삭제 되었습니다");
						return;
					}
				} else {
					System.out.println("===================================");
					System.out.println("잘못 입력하셨습니다 처음메뉴로 돌아갑니다");
					break;
				}
			}
		}
	}

	public static void research(Scanner sc, PhoneBook[] ph) {
		System.out.println("===================================");
		System.out.println("검색할 전화번호의 이름을 입력해주세요");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		boolean check = false;
		System.out.println("===================================");
		System.out.println("조회된 전화번호는 다음과 같습니다");
		for (int i = 0; i < ph.length; i++) {
			if (ph[i] != null) {
				if (ph[i].getName().equals(name)) {
					System.out.println("이름 : " + ph[i].getName() + " 번호 : " + ph[i].getNumber());
					check = true;
				}
			}
		}
		if (check == false) {
			System.out.println("현재 저장된 번호가 없습니다");
			return;
		}

	}

}
