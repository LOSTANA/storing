package basic.test;

import java.util.Random;
import java.util.Scanner;

public class Newbie {

	String name;
	String className;
	int health = 0;
	int mana = 0;
	int attack;
	int defense;
	int level;
	int maxhealth;
	int maxmana;
	int movement;
	int a;
	int b;
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	
	
	public Newbie(String a) {
		name = a;
		className = "초보자";
		health = 10;
		mana = 10;
		attack = 10;
		defense = 1;
		level = 1;
		maxhealth = health;
		maxmana = mana;

	}

	public void war() {
		className = "전사";
		health = 1000;
		mana = 10;
		attack = 100;
		defense = 50;
		level = 1;
		if (maxhealth < health)
			maxhealth = health;
		if (maxmana < mana)
			maxmana = mana;

	}

	public void mag() {
		className = "마법사";
		health = 300;
		mana = 500;
		attack = 30;
		defense = 10;
		level = 1;
		if (maxhealth < health)
			maxhealth = health;
		if (maxmana < mana)
			maxmana = mana;

	}

	public void aut() {
		className = "궁수";
		health = 400;
		mana = 100;
		attack = 70;
		defense = 30;
		level = 1;
		if (maxhealth < health)
			maxhealth = health;
		if (maxmana < mana)
			maxmana = mana;

	}

	public void thi() {
		className = "도적";
		health = 300;
		mana = 10;
		attack = 150;
		defense = 10;
		level = 1;
		if (maxhealth < health)
			maxhealth = health;
		if (maxmana < mana)
			maxmana = mana;

	}

	public void showInfo() {
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
		System.out.println("===============================");

	}

	public void monsterAttack(Monster mon) {

				b = rd.nextInt(this.attack);
				
				mon.beAttacked(b);
		}
			

	public void levelUp() {
		System.out.println("레벨업 하셨습니다");
		System.out.println("===============================");
		level = level + 1;
		if (health == maxhealth)
			health = health + 50;
		if (mana == maxmana)
			mana = mana + 10;
		maxhealth = maxhealth + 50;
		maxmana = maxmana + 10;

	}
	
	public void beAttacked(int a) {

		if (a > 50) {
			System.out.println("치명상을 당하셨습니다 " + a + "만큼 피격당했습니다!");
			health = health - a;
			System.out.println("===============================");
		} else if (a == defense) {
			System.out.println("방어에 성공했습니다");
			System.out.println("===============================");
		}
		else if (a <= 0) {
			System.out.println("회피하셨습니다");
			System.out.println("===============================");
		}
		else {
			System.out.println("몬스터에게 " + a + "만큼 피격당했습니다");
			health = health - a;
			System.out.println("===============================");
		}

		if (health <= 0) {
			System.out.println("사망하셨습니다");
			System.out.println("===============================");
			
		} else {
			System.out.println("나의 남은 체력 : " + health);
			System.out.println("===============================");
		}

		
	}

}
