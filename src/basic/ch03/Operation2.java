package basic.ch03;

public class Operation2 {

	public static void main(String[] args) {

		int result1 = 5+3;
		int result2 = 5-3;
		int result3 = 5*3;
		//int result4 = 5/3; // 고민해볼 사항
		double result4 = 5.0/3.0; // 고민해볼 사항
		int result5 = 5%3;
		
		System.out.println("result1 " + result1);
		System.out.println("result2 " + result2);
		System.out.println("result3 " + result3);
		System.out.println("result4 " + result4);
		System.out.println("result5 " + result5);
		
		//문제
		// 1. (12 + 3) /3 값을 화면에 출력해 보세요
		// 변수명, 데이터 유형 스스로 결정하고 식을 만들어 보세요
		
		int answer = (12 + 3) / 3;
		System.out.println(answer);
		
		//2. (25 % 2) 값을 화면에 출력해보세요
		//어떤 수로 2로 나누었을때 나머지가 0이면 짝수 1이면 홀수
		int answer2 = 25 % 2;
		System.out.println(answer2);

		if (answer2 == 1)
			System.out.println("홀수");
		else
			System.out.println("짝수");
		
		//3. 15를 4로 나눈 후, 그 결과의 절대값을 출력하세요
		int answer3 = 15 / 4;
		Math math = null;
		System.out.println(Math.abs(answer3));
		
		// 도전 문제
		// 직접 산술 연산자 문제 만들기
		
		
	}//end of main	

}//end of class
