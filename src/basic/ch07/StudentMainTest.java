package basic.ch07;

public class StudentMainTest {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.studentID = 1001;
		student1.studentName = "샤코";
		student1.address = "푸른언덕";
		student1.study();
		student1.breakTime();
		student1.showInfo();
		
		Student student2 = new Student();
		student2.studentID = 2001;
		student2.studentName = "야스오";
		student2.address = "붉은 언덕";
		student2.showInfo();
		student2.takeTest();
		student2.cleanup();
		}
		
	}
