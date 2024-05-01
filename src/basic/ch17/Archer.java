package basic.ch17;

public class Archer extends Hero {
	public Archer(String name, int hp) {
		super(name, hp);
	}
	
	@Override
	public void attack() {
		System.out.println("궁수가 공격을 합니다");
	}
	
	void fireArrow() {
		System.out.println(this.name + " 가 불화살 공격을 합니다");
	}

}
