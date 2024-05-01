package starcraft.ver02;

public class Barracks {

	private int BarracksNumber;
	private int count;
	
	public Barracks(int barracksNumber) {
		this.BarracksNumber = barracksNumber;
		count = 0;
	}
	
	public int getBarracksNumber() {
		return BarracksNumber; 
	}
	
	public int getCount() {
		return count;
	}
	
	public Marine makeMarine(String name) {
		count++;
		return new Marine(name);
	}
}
