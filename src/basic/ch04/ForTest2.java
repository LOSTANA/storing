package basic.ch04;

public class ForTest2 {

	public static void main(String[] args) {

		// 화면에 구구단 2단을 출력 하시오
		int num = 2;
		System.out.println(num + " * 1 = " + (num * 1));
		System.out.println(num + " * 2 = " + (num * 2));
		System.out.println(num + " * 3 = " + (num * 3));
		System.out.println(num + " * 4 = " + (num * 4));
		System.out.println(num + " * 5 = " + (num * 5));
		System.out.println(num + " * 6 = " + (num * 6));
		System.out.println(num + " * 7 = " + (num * 7));
		System.out.println(num + " * 8 = " + (num * 8));
		System.out.println(num + " * 9 = " + (num * 9));

		System.out.println("--------------------------------------------------");

		// 화면에 구구단 3단을 출력 하시오
		num = 3;// 변수에 효용 (언제든 접근해서 활용 가능)
		System.out.println(num + " * 1 = " + (num * 1));
		System.out.println(num + " * 2 = " + (num * 2));
		System.out.println(num + " * 3 = " + (num * 3));
		System.out.println(num + " * 4 = " + (num * 4));
		System.out.println(num + " * 5 = " + (num * 5));
		System.out.println(num + " * 6 = " + (num * 6));
		System.out.println(num + " * 7 = " + (num * 7));
		System.out.println(num + " * 8 = " + (num * 8));
		System.out.println(num + " * 9 = " + (num * 9));

		System.out.println("--------------------------------------------------");

		num = 4;
		System.out.println(num + " * 1 = " + (num * 1));
		System.out.println(num + " * 2 = " + (num * 2));
		System.out.println(num + " * 3 = " + (num * 3));
		System.out.println(num + " * 4 = " + (num * 4));
		System.out.println(num + " * 5 = " + (num * 5));
		System.out.println(num + " * 6 = " + (num * 6));
		System.out.println(num + " * 7 = " + (num * 7));
		System.out.println(num + " * 8 = " + (num * 8));
		System.out.println(num + " * 9 = " + (num * 9));

		System.out.println("--------------------------------------------------");
		// 구구단 5단을 출력하시오
		num = 5;
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		} // end of for
		System.out.println("--------------------------------------------------");
		// for 구문을 활용해서 6단을 출력하시오
		num += 1;
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		} // end of for
		System.out.println("--------------------------------------------------");
		// for 구문을 활용해서 7단을 출력하시오
		num += 1;
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		} // end of for
			// for 구문을 활용해서 8단을 출력하시오
		num += 1;
		System.out.println("--------------------------------------------------");
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		} // end of for
		System.out.println("--------------------------------------------------");
		// for 구문을 활용해서 9단을 출력하시오
		num += 1;
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		} // end of for
		System.out.println("--------------------------------------------------");

		/*for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			} // end of for
			System.out.println("--------------------------------------------------");
		}*/ //2중 반복일경우

	}// end of main

}// end of class
