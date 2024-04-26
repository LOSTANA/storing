package basic.ch22;

public class ToyRobot implements RemoteController, SoundEffect {

	int withd;
	int height;
	String color;

	@Override
	public void turnOn() {
		System.out.println("가오가이거를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("가오가이거를 끕니다.");
	}

	@Override
	public void soundOn() {
		System.out.println("가오~ 가이그어어억!!~~");
	}

}

// turnOn
// turnOff
