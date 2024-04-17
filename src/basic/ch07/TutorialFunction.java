package basic.ch07;

import java.util.Random;

public class TutorialFunction {

	String name;
	String className;
	int health = 0;
	int mana = 0;
	int attack;
	int defense;
	int level;
	int maxhealth;
	int maxmana;

	void showinfo() {
		if (health == 0)
			health = maxhealth;
		if (mana == 0)
			mana = maxmana;
		System.out.println("=========캐릭터 정보===========");
		System.out.println("닉네임 : " + name);
		System.out.println("직업 : " + className);
		System.out.println("체력 : " + health + " / " + maxhealth);	
		System.out.println("방어력 : " + defense);
		System.out.println("마나 : " + mana + " / " + maxmana);
		System.out.println("레벨 : " + level);

	}

	void monsterAttack() {
		
		Random rd = new Random();
		int a = rd.nextInt(100) - defense;

		if (a > 50) {
			System.out.println("치명상을 당하셨습니다 " + a + "만큼 피격당했습니다!");
			health = health - a;
		} else if (a == defense)
			System.out.println("방어에 성공했습니다");
		else if (a <= 0)
			System.out.println("회피하셨습니다");
		else {
			System.out.println("몬스터에게 " + a + "만큼 피격당했습니다");
			health = health - a;
		}

		if (health <= 0) {
			System.out.println("사망하셨습니다");
			health = maxhealth;
		} else
			System.out.println("남은 체력 : " + health);
	}

	void levelUp() {
		System.out.println("레벨업 하셨습니다");
		level = level + 1;
		if (health == maxhealth)
			health = health + 50;
		if (mana == maxmana)
			mana = mana + 10;
		maxhealth = maxhealth + 50;
		maxmana = maxmana + 10;

	}
}
