package basic.ch14;

public class ArrayTest3 {

	public static void main(String[] args) {

		char[] alpahbets = new char[26];
		char ch1 = 'A';
		alpahbets[0] = ch1;

		char ch2 = 'B';
		alpahbets[1] = ch2;

		char ch3 = 'C';
		alpahbets[2] = ch3;
		
		char ch26 = 'z';
		alpahbets[25] = ch26;

		// 배열은 반복문과 함께 많이 사용된다
		int forCount = 0;
		int result = alpahbets.length;
		for (int i = 0; i < alpahbets.length; i++) {
			// alpahbets[i];
			System.out.println(alpahbets[i]);
			forCount++;
		}
		for (int i = 0;i<alpahbets.length;i++) {
			if(alpahbets[i] == 0) {
				result--;
			}
		}
		
		System.out.println("for 동작 횟수 " + forCount);
		
		System.out.println("배열안의 요소의 개수는? " + result);
	}// end of main

}// end of class
