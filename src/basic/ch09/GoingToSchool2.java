package basic.ch09;

import java.util.Scanner;

public class GoingToSchool2 {

	public static void main(String[] args) {

		// 설계된 클래스를 가지고 본인이 의도한 대로 실행에 흐름을 만들어 보자

		// 스캐너를 활용해서 1번을 누르면 버스를 태워서 실행에 흐름을 만들기
		// 2번을 누르면 지하철 태우는 실행에 흐름을 만들어 보자
		Bus bus1 = new Bus(36);
		Bus bus2 = new Bus(181);
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);
		Student[] s1 = new Student[6];
		Scanner sc = new Scanner(System.in);

		String name;

		int max = 0;

		int menu;
		int veh;
		int choose;

		while (true) {
			System.out.println("===========================================");
			System.out.println("가상 학교 등교 시스템");
			System.out.println("===========================================");
			System.out.println("메뉴를 정해주세요");
			System.out.println("1. 캐릭터 생성(최대 6개)       2.캐릭터 선택(현재 " + (max) + "개 생성)");
			menu = sc.nextInt();
			if (menu == 1) {
				System.out.println("이름을 생성해 주세요 : ");
				name = sc.next();
				s1[max] = new Student(name, 100000);
				max++;
				for(int i = 0;i<5;i++)
					System.out.println();
				continue;
			} else if (menu == 2) {
				System.out.println("학생을 선택해 주세요");

				if (max == 0) {
					System.out.println("현재 생성된 캐릭터가 없습니다");
					for(int i = 0;i<5;i++)
						System.out.println();
					continue;
				}
				for (int i = 0; i < max; i++) {
					System.out.print((i + 1) + ". ");
					s1[i].showInfo();
				}
				menu = sc.nextInt() - 1;
			} else {
				System.out.println("게임을 종료합니다");
				sc.close();
				break;
			}
			while (true) {
				System.out.println("=====================================");
				System.out.println("어떤걸 타고 가시겠습니까?");
				System.out.println("1. 버스       2. 지하철    3. 정산     4. 캐릭터선택");
				veh = sc.nextInt();
				if (veh == 1) {
					System.out.println("탈 버스를 정해주세요");
					System.out.println("1. 36번     2. 181번");
					choose = sc.nextInt();
					if (choose == 1) {
						s1[menu].takeBus(bus1);
						System.out.println("버스를 타고 무사히 목적지에 도착했습니다");
					} else if (choose == 2) {
						s1[menu].takeBus(bus2);
						System.out.println("버스를 타고 무사히 목적지에 도착했습니다");
					}
					else
						System.out.println("걷기로 결정하였습니다");

				} else if (veh == 2) {
					System.out.println("탈 지하철을 정해주세요");
					System.out.println("1. 1호선     2. 2호선");
					choose = sc.nextInt();
					if (choose == 1) {
						s1[menu].takeSubway(subway1);
						System.out.println("지하철를 타고 무사히 목적지에 도착했습니다");
					}
					else if(choose == 2) {
						s1[menu].takeSubway(subway2);
						System.out.println("지하철를 타고 무사히 목적지에 도착했습니다");
					}
					
				} else if (veh == 3) {
					s1[menu].showInfo();
					System.out.println("===================================");
					bus1.showInfo();
					System.out.println("===================================");
					bus2.showInfo();
					System.out.println("===================================");
					subway1.showInfo();
					System.out.println("===================================");
					subway2.showInfo();
					System.out.println("===================================");

				} else
					break;
				
			}

		}
	}

}
