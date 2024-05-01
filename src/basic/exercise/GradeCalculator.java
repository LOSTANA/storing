package basic.exercise;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {

		int score;
		char grade = 'X'; // 초기값을 'X'로 설정해 잘못된 입력을 쉽게 확인
		String message = ""; // 추가적인 피드백 메시지
		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("성적을 입력하세요 (0-100): ");
			score = scanner.nextInt();

			if (score <= 100 && score >= 90) { // 90이상 100이하일 경우
				grade = 'A';
				message = "우수한 성적이네요! 계속 좋은 성적 유지하길 바랍니다.";
			} else if (score < 90 && score >= 80) {// 80이상 90미만일 경우
				grade = 'B';
				message = "좋은 성적입니다. 조금만 더 노력하면 A도 가능해요!";
			} else if (score < 80 && score >= 70) {// 70이상 80미만일 경우
				grade = 'C';
				message = "괜찮은 성적이지만, 더 높은 등급을 위해 노력해봅시다.";
			} else if (score < 70 && score >= 60) {// 60이상 70미만일 경우
				grade = 'D';
				message = "학습에 더 집중할 필요가 있어요. 도움이 필요하면 말해주세요.";
			} else if (score < 60 && score >= 0) {// 0이하 60 미만일 경우
				grade = 'F';
				message = "학습에 더 집중할 필요가 있어요. 도움이 필요하면 말해주세요.";
			} else// 그 외값
			{
				grade = 'X';// 빠르게 반복 입력했을때 F값으로 튀는 걸 방지
				System.out.println("당신은 " + grade + " 학점입니다");
				System.out.println("잘못된 입력입니다. 성적은 0에서 100 사이로 입력해주세요.");
				// message = "잘못된 입력입니다. 성적은 0에서 100 사이로 입력해주세요."; //while문 아닐경우 사용
				break; // while로 인한 반복 x
			}

			System.out.println("당신은 " + grade + " 학점입니다");
			System.out.println(message);
			System.out.println();
			System.out.println("====================================");
			System.out.println();

		}
		scanner.close(); // 자원 닫기
		// .. 코드를 작성해주세요
		// 힌트 - 비교 연산자와 논리연사자를 활용
		// ...

	}

}
