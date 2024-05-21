package io.file.ch06;

import java.io.FileWriter;

public class MyFileWriter {

	public static void main(String[] args) {

		// 파일에다가 문자 기반 스트림을 활용해서 데이터를 써 보자

		String data = "Hello, Java File I/O";

		try (FileWriter writer = new FileWriter("example.txt")) {
			// 파일에다가 문자열 쓰기
			writer.write(data);
			writer.write("\n");// 한줄 띄움
			writer.write("추가 글을 작성 할 수 있음");

			// 물을 내리다
			writer.flush();

			System.out.println("");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}