package io.file;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//문자 기반 스트림 + 보조 문자 기반 스트림 확인
//한줄 입력하면 종료됨
//여러줄 반복적으로 동작 할 수 있도록 기능을 추가해주세요
public class StandardInputExample2 {

	public static void main(String[] args) {
		System.out.println("여러줄의 텍스트를 입력하세요");
		System.out.println("입력을 종료하려면 빈 줄에서 엔터를 누르세요");
		// 문자 기반 스트림 + 보조 문자 기반 스트림을 사용한다

		boolean flag = true;

		try (InputStreamReader isr = new InputStreamReader(System.in); BufferedReader br = new BufferedReader(isr)) {

			// isr -> 한 문자씩 읽는 기능 read() 가지고 있었다
			// br -> 한번에 한]라인씩 읽을 수 있는 기능을 가지고 있다
			while (flag) {
				// isr.read(); --> 기능 확장인
				String inputUserData = br.readLine();

				System.out.println("입력 확인 : " + inputUserData);
				if (inputUserData == "") {
					flag = false;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
