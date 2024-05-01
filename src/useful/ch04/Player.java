package useful.ch04;

public class Player {


		private static Player player;

		// 3. 외부에서 접근 가능한 메서드를 만들어 준다
		public static Player getInstance() {

			if (player == null) {
				player = new Player();
			}

			return player;
		
	}
	
}
