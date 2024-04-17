package basic.ch07;

import java.util.Scanner;

public class Tutorial {

	public static void main(String[] args) {
		TutorialFunction function = new TutorialFunction();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수상한 RPG에 오신것을 환영합니다");
		System.out.println("직업을 정해주세요");
		System.out.println("1. 전사\t2. 마법사\t3. 궁수\t4. 도적");
		int choose = sc.nextInt();
		if(choose == 1)
		{
			function.className = "전사";
			function.attack = 100;
			function.defense = 50;
			function.maxhealth = 500;
			function.maxmana = 1;
			function.level = 1;
		}
		else if(choose == 2) {
			function.className = "마법사";
			function.attack = 30;
			function.defense = 10;
			function.maxhealth = 300;
			function.maxmana = 500;
			function.level = 1;
		}
		else if(choose == 3) {
			function.className = "궁수";
			function.attack = 70;
			function.defense = 30;
			function.maxhealth = 400;
			function.maxmana = 100;
			function.level = 1;
		}
		else if(choose == 4) {
			function.className = "도적";
			function.attack = 150;
			function.defense = 10;
			function.maxhealth = 300;
			function.maxmana = 100;
			function.level = 1;
		}
		else {
			function.className = "워로드";
			function.attack = 1;
			function.defense = 70;
			function.maxhealth = 500;
			function.maxmana = 100;
			function.level = 1;
		}
		System.out.println("닉네임을 정해주세요");
		String name = sc.next();
		function.name = name;
		
		while(true) {
			System.out.println("=============================");
			System.out.println("할일을 선택해 주세요");
			System.out.println("1. 캐릭터 정보");
			System.out.println("2. 레벨업 하기");
			System.out.println("3. 몬스터에게 피격당하기");
			System.out.println("그외. 게임종료");
			System.out.println("=============================");
			choose = sc.nextInt();
			if(choose == 1) {
				function.showinfo();
			}
			else if(choose == 2) {
				function.levelUp();
			}
			else if(choose == 3) {
				function.monsterAttack();
			}
			else
			{
				System.out.println("로그아웃합니다");
				break;
			}
		}
			
		

	}


}
