package basic.ch10;

public class HeroTest {

	public static void main(String[] args) {
	
		Hero hero1 = new Hero();
		

		String name;
		int hp;
		int power;
		double defense;
		
		
		hero1.setName("전사");
		hero1.setHp(1000);
		hero1.setPower(100);
		hero1.setDefense(50);
		
		
		name = hero1.getName();
		hp = hero1.getHp();
		power = hero1.getPower();
		defense = hero1.getDefense();
		
		hero1.showInfo();
		System.out.println(name);
		System.out.println(hp);
		System.out.println(power);
		System.out.println(defense);

		
	}


}
