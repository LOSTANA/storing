package basic.exercise;

public class WhileTest3 {
	//코드의 시작점(메인함수)
	public static void main(String[] args) {

		int i = 1;
		
		int sum = 0;
		
		while(i <=10) {
			
			sum = sum + i;
			i++;
		}
		
		System.out.println(sum);
	}//end of main

}//end of class
