package basic.exercise;

public class ForTest3 {

	public static void main(String[] args) {

		System.out.println("\n-------------------------");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("|   " + j + "\t");
			}

			System.out.print("|");
			System.out.println("\n-------------------------");
		}

	}// end of main

}// end of class
