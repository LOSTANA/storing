package basic.ch17;

public class HeroTest {

	public static void main(String[] args) {

		Warrior warrior1 = new Warrior("야스오",100);
		Archer archer1 = new Archer("애쉬",100);
		Wizard wizard1 = new Wizard("라이즐", 100);
		
		warrior1.attack();
		archer1.attack();
		wizard1.attack();
		
	}

}
