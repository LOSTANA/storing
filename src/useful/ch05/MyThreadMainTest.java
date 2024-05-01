package useful.ch05;

public class MyThreadMainTest {

	//기본적으로 메인 작업자 하나를 가지고 있다 - 메인쓰레드라 한다
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		
		//필요하다면 추가 작업자를 사용할 수 있다
		MyThread th1 = new MyThread();
		th1.start(); //start 호출되면 run()메서드가 동작되게 약속 되어있다
		System.out.println("--------------------------");
		
		//필요하다면 추가 작업자를 더 만들 수 있다
		MyThread th2 = new MyThread();
		//새로운 작업자를 생성해서 위임시킬때는 Thread 안에 있는 start() 메서드를 호출해야해
		th2.start();
		//결국 다른작업자에게 일을 위임하려면 쓰레드에 start()를 호출해야 해!
	}//end of main
	
}//end of class
