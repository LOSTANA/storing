package io.file.ch03;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {
	public static void main(String[] args) {
		// 스트림은 기본적으로 단방향이다
		// 입력 스트림, 출력 스트림 두개가 필요하다

		// 파일 경로 (복사할 대상)
		String sourceFilePath = "C:\\Users\\KDP\\Documents\\Lightshot\\a.zip";
		// 목적지 파일
		String destinationFilePath = "copy1.zip";

		// 소요시간 확인
		long startTime = System.nanoTime();
		try (FileInputStream in = new FileInputStream(sourceFilePath);
				FileOutputStream out = new FileOutputStream(destinationFilePath)) {
			int data;
			while ((data = in.read()) != -1) {
				// 파일에 출력
				out.write(data);
			}

			System.out.println("입력 스트림 --> 출력스트림 --> 입력 --> 출력에 반복완료");
		} catch (Exception e) {

		}

		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("복사의 소요 시간은 : " + duration);
		
		// 소요 시간을 초 단위로 변환 --> 포맷팅
		double seconds = duration / 1000000000.0;
		// String 클래스에 format 메서드 사용해보기
		String resultFormat = String.format("소요 시간은 : %.6f초 입니다.", seconds);
		//%는 포맷 지정자의 시작
		//f지정자는 float,double 유형의 변수를 인자로 받아 처리하겠다
		System.out.println(resultFormat
				);
	}
}
