package basic.exercise;

public class Exercise5 {

	public static void main(String[] args) {
		
		char star = '*';

		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(star);
			}
			System.out.println();
		}
		
		
		/*char star = '*';

        for (int i = 1; i < 10; i = i + 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print(star);
            }
            System.out.println();
        }*/
		
		/*char star = '*';

		for (int i = 4; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(star);
			}
			System.out.println();
		}*/

	}// end of main

}// end of class
