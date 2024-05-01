package useful.ch05;

public class MyThread2MainTest {

	public static void main(String[] args) {

		System.out.println("main start ");

		MyThread2 th2 = new MyThread2();
		new Thread(th2).start();

		System.out.println("--- end main thread ----");
		// 문제 MyThread2를 메모리에 올리고
		// 그 안에 정의된 run() 메서드를 호출하시오
		// 힌트 ---> Thread 문서를 반드시 확인하시오
	}

}
