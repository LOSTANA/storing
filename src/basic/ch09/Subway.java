package basic.ch09;

public class Subway {

	int lineNumber;
	int passengerCount2 = 0;
	int money;
	
	public Subway(int line) {
		lineNumber = line;
	}
		//지하철도 승객을 태운다
		public void take(int pay) {
			money += pay;
			passengerCount2++;
		}
		public void showInfo() {
			System.out.println("지하철 번호 " + lineNumber);
			System.out.println("지하철 승객수 " + passengerCount2);
			System.out.println("수입 " + money);
		}
	}
	
