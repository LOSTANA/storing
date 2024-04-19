package starcraft.ver01;

public class StarCraftTest1 {

	public static void main(String[] args) {
		
		//질럿 2
		Zealot zealot1 = new Zealot("천하무적질럿1");
		Zealot zealot2 = new Zealot("질럿2");
		//마린 2
		Marine marine1 = new Marine("귀신잡는해병1");
		Marine marine2 = new Marine("마린2");
		//저글링 2
		Zergling zergline1 = new Zergling("저글링1");
		Zergling zergline2 = new Zergling("저글링2");
		
		for(int i = 0;i<10;i++) {
			zealot1.attackMarine(marine2);
		}
		marine2.showInfo();
	}

}
