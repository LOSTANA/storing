package basic.ch22;

public class Rabbit implements RaceParticipant {
	
	private final int speed = 10;

	@Override
	public String getName() {
		return "허위 간 매물 토끼";
	}

	@Override
	public int getSpeed() {
		return speed;
	}
	
}
