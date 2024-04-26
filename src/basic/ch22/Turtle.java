package basic.ch22;

public class Turtle implements RaceParticipant {
	
	private final int speed = 2;

	@Override
	public String getName() {
		
		return "용왕 의자출신 거북이";
	}

	@Override
	public int getSpeed() {
		
		return speed;
	}
	
}
