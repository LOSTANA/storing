package basic.ch04;

public class BreakTest2 {
	// 코드의 시작점
	public static void main(String[] args) {

		boolean flag = true;
		int i = 1;

		while (flag) {
			
			//단독 if구문은 - 수행이 될 수도 있고 안될 수도 있다
			if ((i % 7) == 0) {
				flag = false;
				
				//중간에 멈추어라
				break;
			}
			System.out.println("i의 값 : " + i);
			i++;

		}

	}// end of main

}// end of class
