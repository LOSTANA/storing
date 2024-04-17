package basic.ch04;

public class ContinueTest2 {

	public static void main(String[] args) {

		boolean flag = true;
		int i = 1;

		// 풀이 - 2 : 특정 조건이 되었을 때 반복문을 멈추어라
		// while (flag) {

		// if (i == 100) {
		// flag = false;
		// }
		// if ((i % 3) == 0) {
		// System.out.print(i + " ");
		// }
		// i++;
		// }
		// 풀이 - 1
		while (i < 101) {
			if ((i % 3) == 0) {

				System.out.println(i);
			} // 특정 조건 --> 멈추기
			if (i == 100) {
				flag = false;
			} // i = 100
			i++; // i == 101
		}

	}// end of main

}// end of class
