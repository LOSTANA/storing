package basic.ch12;

public class NumberPrinterTest {

	public static void main(String[] args) {

		NumberPrinter n1 = new NumberPrinter(1);
		NumberPrinter n2 = new NumberPrinter(2);
		n1.printWaitNumber(); // 고객 1
		n1.printWaitNumber(); // 고객 2
		n1.printWaitNumber(); // 고객 3
		n1.printWaitNumber(); // 고객 4
		
		n2.printWaitNumber();
		n2.printWaitNumber();
		
	}//end of main

}
