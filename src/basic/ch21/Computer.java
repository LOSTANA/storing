package basic.ch21;

public abstract class Computer {

	String name;
	
	public abstract void display();
	public abstract void typing();
	public void turnOn() {
		System.out.println("컴퓨터 전원 ON");
	};
	public void turnOff() {
		System.out.println("컴퓨터 전원 Off");
	};
	
	public static void main(String[] args) {
		DeskTop desktop;
		NoteBook notebook;
	}
	
}
