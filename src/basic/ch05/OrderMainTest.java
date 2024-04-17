package basic.ch05;

public class OrderMainTest {

	public static void main(String[] args) {
		
		
		
		Order order1 = new Order();
		order1.food = "불고기버거";
		order1.money = 3600;
		order1.number = 2;
		
		Order order2 = new Order();
		order2.food = "빅맥";
		order2.money = 5800;
		order2.number = 1;
		
		
		System.out.println(order1.food);
		System.out.println(order1.money + "원");
		System.out.println(order1.number + "개");
		System.out.println(order1.food);
		System.out.println(order1.money + "원");
		System.out.println(order1.number + "개");
	}

}
