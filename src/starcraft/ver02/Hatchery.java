package starcraft.ver02;

public class Hatchery {

	private int hatcheryNumber;
	private int count;
	
	public Hatchery(int hatcheryNumber) {
		count = 0;
		this.hatcheryNumber = hatcheryNumber;
	}
	
	public int getCount() {
		return count;
	}
	
	public int getHatcheryNumber() {
		return hatcheryNumber;
	}
	
	public Zergling makeZergling(String name) {
		count++;
		return new Zergling(name);
	}
	
}
