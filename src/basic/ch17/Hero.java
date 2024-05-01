package basic.ch17;

public class Hero {
	String name;
	int hp;
	
	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
		
	}
	public void attack() {
			System.out.println(this.name + "이 공격을 시전했다");
		}

}


