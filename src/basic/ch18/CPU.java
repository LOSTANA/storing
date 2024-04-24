package basic.ch18;

public class CPU {

	void CpuStart() {
		try {
			for (int i = 0; i < 2; i++) {
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("cpu작동시작");
	}

	void CpuStop() {
		try {
			for (int i = 0; i < 2; i++) {
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("cpu 정지");
	}
}
