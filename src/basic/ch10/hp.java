package basic.ch10;

public class hp {

	int number;
	int attack;
	
	public void beAttacked(int power) {
		number = number - attack;
		System.out.println(attack + "만큼 피격 당했습니다");
		System.out.println("남은 체력 : " + number);
	}
	
	public int attacked(int power) {
		if(number<power) {
			System.out.println("잘못된 요청입니다");
			return 0;
		}
		number = number + attack;
		System.out.println(attack + "만큼 회복했습니다");
		System.out.println("남은 체력 : " + number);
		return number;
	}
}
