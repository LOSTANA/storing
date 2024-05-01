package basic.test;

import java.util.Scanner;

public class Game {


	public static void main(String[] args) {
		Newbie[] newbie = new Newbie[6];

		Scanner sc = new Scanner(System.in);

		String name;
		int menu;
		int max = 0;
		int choose;
		int choose1;
		int movement;
		
		Monster mon = new Monster(1000);

		while (true) {
			System.out.println("===========================================");
			System.out.println("수상한 RPG");
			System.out.println("===========================================");
			System.out.println("메뉴를 정해주세요");
			System.out.println("1. 캐릭터 생성(최대 6개)       2.캐릭터 선택(현재 " + (max) + "개 생성)");
			menu = sc.nextInt();
			if (menu == 1) {
				if (max == 6) {
					System.out.println("만들 수 있는 캐릭터가 최대치 입니다");
					continue;
				}
				else {
				System.out.println("이름을 생성해 주세요 : ");
				name = sc.next();
				newbie[max] = new Newbie(name);
				max++;
				for (int i = 0; i < 5; i++)
					System.out.println();
				continue;
				}
			} else if (menu == 2) {
				System.out.println("캐릭터를 선택해 주세요");

				if (max == 0) {
					System.out.println("현재 생성된 캐릭터가 없습니다");
					for (int i = 0; i < 5; i++)
						System.out.println();
					continue;
				
				}
				for (int i = 0; i < max; i++) {
					System.out.print((i + 1) + ". ");
					newbie[i].showInfo();
				}
				menu = sc.nextInt() - 1;
			} else {
				System.out.println("게임을 종료합니다");
				sc.close();
				break;
			}

			while (true) {
				System.out.println("하실 행동을 선택하세요");
				System.out.println("1. 전직하기     2. 사냥하기      3. 렙업하기     4. 내 정보  그외. 종료하기");
				choose = sc.nextInt();
				if (choose == 1) {
					System.out.println("무엇으로 전직하겠습니까?");
					System.out.println("1. 전사     2. 마법사      3. 궁수       4. 도적     그외.하지않는다");
					choose1 = sc.nextInt();
					if (choose1 == 1) {
						newbie[menu].war();
						continue;
					} else if (choose1 == 2) {
						newbie[menu].mag();
						continue;
					} else if (choose1 == 3) {
						newbie[menu].aut();
						continue;
					} else if (choose1 == 4) {
						newbie[menu].thi();
						continue;
					} else
						break;
				} else if (choose == 2) {
					System.out.println("몬스터가 나타났다!");
					while (true) {

						System.err.println("할일 을 선택하세요");
						System.err.println("1. 공격한다  2.도망친다");
						movement = sc.nextInt();
						if(movement == 1)
						{
							newbie[menu].monsterAttack(mon);
							if(mon.monsterHealth <=0) {
								newbie[menu].levelUp();
								mon.monsterHealth = 1000;
								break;
							}
							mon.attacking(newbie[menu]);
							
						}
						else {
							System.out.println("무사히 도망쳤다");
							mon.monsterHealth = 1000;
							break;
						}
						if(newbie[menu].health <= 0) {
							newbie[menu].health = newbie[menu].maxhealth;
							break;
						}
						System.out.println("===============================");
					}
				} else if (choose == 3) {
					newbie[menu].levelUp();
				} else if (choose == 4) {
					newbie[menu].showInfo();
				} else
					break;
			}
		}
	}
}

