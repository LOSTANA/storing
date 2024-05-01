package basic.ch14;

public class ArrayTest4 {

	public static void main(String[] args) {

		String[] arrayStr = new String[26];
		int result = 0;
		arrayStr[0] = "A";
		arrayStr[1] = "B";
		arrayStr[2] = "C";
		arrayStr[3] = "D";
		arrayStr[3] = "E";
		arrayStr[25] = "Y";

		// 배열안에 요소의 개수를 출력 하시오
		// 값이 있다면 콘솔창에 출력
		// 반복문 활용

		for (int i = 0; i < arrayStr.length; i++) {
			if (arrayStr[i] != null) {
				System.out.println(arrayStr[i]);
				result++;
			}
		}
		
		System.out.println(result);
	}// end of main

}// end of class
