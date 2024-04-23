package basic.ch18;

public class Computer {

	CPU cpu;
	
	public Computer() {
		cpu = new CPU();
	}
	
	public void Starting() {
		cpu.CpuStart();
		try {
		      for (int i = 0; i < 2; i++) {
		        Thread.sleep(2000);
		   		      }
		    } catch (Exception e) {
		      System.out.println(e);
		    }
		System.out.println("컴퓨터 작동시작");
	}
	
	public void Stoping() {
		cpu.CpuStop();
		try {
		      for (int i = 0; i < 2; i++) {
		        Thread.sleep(2000);
		      }
		    } catch (Exception e) {
		      System.out.println(e);
		    }
		System.out.println("컴퓨터 작동멈춤");
	}
	
	public static void main(String[] args) {
		Computer com = new Computer();
		com.Starting();
		try {
		      for (int i = 0; i < 2; i++) {
		        Thread.sleep(2000);
		        System.out.println("컴퓨터 작동중");
		      }
		    } catch (Exception e) {
		      System.out.println(e);
		    }
		com.Stoping();
		
	}
}
