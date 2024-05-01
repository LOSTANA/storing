package basic.test;

import java.util.Random;



public class Monster {

	int monsterHealth;
	Random rd = new Random();
	public Monster(int health) {
		monsterHealth = health;
	}

	public void beAttacked(int power) {
		
		monsterHealth = monsterHealth - power;
		if (monsterHealth <= 0) {
			System.out.println("남은체력 : 0");
		System.out.println("사냥에 성공하셨습니다!");
		System.out.println("===============================");

	}
		else {
			System.out.println("몬스터에게 " + power + "데미지를 줬다!");
			System.out.println("몬스터 남은체력 : " + monsterHealth);
		}
	}
	public void attacking(Newbie nw) {
		int a = rd.nextInt(100) - nw.defense;
		
		nw.beAttacked(a);
	}

}
