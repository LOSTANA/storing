package useful.ch04;

public class MaunalCar extends Car{

	@Override
	void drive() {
		System.out.println("사람이 운전을 합니다");
		
	}

	@Override
	void stop() {
System.out.println("사람이 브레이크를 밟아 머뭅니다");
		
	}
	
}
