package basic.ch22;

public class RomeoTest {
	
	public static void main(String[] args) {
		
		Actor actor = new Actor("황정민");
		actor.performAsRomeo();
		
		Student student = new Student("배우 지망생"); // 다형성 코드의 유연함
		student.performAsRomeo();
		
	} // end of main
}	// end of class
