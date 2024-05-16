package io.file.ch03;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedFileCopy {

	public static void main(String[] args) {
		//(바이트 기반 스트림을 활용)
		//기반 스트림 + 보조스트림을 활용해서 파일 복사 기능을 만들고
		// 소요시간을 측정하시오
		
		long start = System.nanoTime();
		
		String file = "나는 배고프다";
		
		try (FileOutputStream out = new FileOutputStream("output3.txt");
				BufferedOutputStream bos = new BufferedOutputStream(out)){
			byte[] bytes = file.getBytes();
			
			bos.write(bytes);
			bos.flush();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		String sourceFilePath = "output3.txt";
		String destinationFilePath = "output3_copy1.txt";
		
		try(FileInputStream in = new FileInputStream(sourceFilePath);
				FileOutputStream out2 = new FileOutputStream(destinationFilePath)){
					int data;
					while((data = in.read()) != -1){
						out2.write(data);
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
		
		long end = System.nanoTime();
		long dur = end - start;
		
		double seconds = dur / 1000000000.0;
		
		String result = String.format("복사 시간은 : %.6f초 입니다",seconds);
		
		System.out.println(result);
		

	}
}
