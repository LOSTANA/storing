package starcraft.ver02;

public class GateWay {

	private int gateWayNumber;
	private int count;
	// 기능 - 질럿 생산하는 기능을 만들어 보세요
	//생성자
	public GateWay(int gateWayNumber) {
		this.gateWayNumber = gateWayNumber;
		count = 0;
	}
	
	

	public int getCount() {
		return count;
	}
	public int getGateWayNumber() {
		return gateWayNumber;
	}

	public Zealot makeZealot(String name) {
		count ++;
		return new Zealot(name);
	}
}
