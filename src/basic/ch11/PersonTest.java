package basic.ch11;

public class PersonTest {

	public static void main(String[] args) {
		
		//주석 - ...
		Person person1 = new Person("홍길동", 100);
		Person personBox = person1;
		Person personBox2 = person1.getPerson();
		
		Person personLee = new Person("이순신", 101);
		System.out.println("---------------------------------");
		//위 코드까지는 Heap 메모리 영역에 객체가 2개 생성된 상태이다
		//지역변수인 person1, personBox, PersonBox2는 같은 객체를 가르킨다
		
		//연습 문제 - setName 메서드 만들기
		
		personBox2.setName("티모");
		person1.showInfo();
	}//end of main

}//end of class
