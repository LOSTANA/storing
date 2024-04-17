package basic.test;

import java.util.Random;

public class Warrior {

	String className;
	int health = 0;
	int mana = 0;
	int attack;
	int defense;
	int level;
	int maxhealth;
	int maxmana;
	
	public void changeWarrior() {

		
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
}
