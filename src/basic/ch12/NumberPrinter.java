package basic.ch12;

// 번호 뽑아 주는 기계
public class NumberPrinter {
	
	private int id;
	static int waitNumber;
	// static 변수 --> Method Area
	//waitNumber 먼저올라감
	public NumberPrinter(int id) {
		this.id = id;
		waitNumber = 1;
	}

	// 기능 -- 번호표를 출력 한다
	public void printWaitNumber(){
		
		System.out.println( id + " 번에 기기의 대기 순번은 " + waitNumber);
		waitNumber++;
	}

}
