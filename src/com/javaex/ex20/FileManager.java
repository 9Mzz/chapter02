package com.javaex.ex20;

import java.io.IOException;

public class FileManager {

	// 필드

	// 생성자
	public FileManager() {
	}

	// 메소드

	// 메소드-일반
	public void readFile() throws IOException{// c:aaa.text 을 읽어오는 메소드

		try {
			System.out.println("강제 예외상황 발생");
			throw new IOException(); // 파일을 못읽었을때 예외 발생
		} catch (IOException e) {
			System.out.println("파일이 없습니다.");
		}
	}

}
