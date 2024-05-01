package basic.ch10;

public class Hero {

	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean isDie;

	// getter, setter 메서드를 만들어 주세요

	public String getName() {
		return this.name;
	}

	public void setName(String inputName) {
		this.name = inputName;
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int inputHp) {
		this.hp = inputHp;
	}

	public int getPower() {
		return this.power;
	}

	public void setPower(int inputPower) {
		this.power = inputPower;
	}

	public double getDefense() {
		return this.defense;
	}

	public void setDefense(int inputDefense) {
		this.defense = inputDefense;
	}

	public boolean getIsDie() {
		return this.isDie;
	}

	public void setIsDie(boolean inputIsDIe) {
		this.isDie = inputIsDIe;
	}
	
	public void showInfo() {
		System.out.println("직업 : " + this.name);
		System.out.println("체력 : " + this.hp);
		System.out.println("공격력 : " + this.power);
		System.out.println("방어력 : " + this.defense);
	}

}
