package com.javaex.ex05;

public class SongApp {
	public static void main(String[] args) {
		
		//필드
		Song s01 = new Song();

		s01.setTitle("좋은날");
		s01.setArtist("아이유");
		s01.setAlbum("Real");
		s01.setComposer("이민수");
		s01.setYear("2010");
		s01.setTrack(3);
		System.out.println(s01.toString());
		System.out.println("==================");
		
//		System.out.println(s01.toString());
		Song s02 = new Song("거짓말", "BIGBANG", "Always", "G-Dragon", "2007", 2);
		s02.setTrack(2);
//		System.out.println(s02.toString());
		System.out.println("==================");
		
		//6개 모든 필드값 초기화 하는 생성자 사용
		Song s03 = new Song("벚꽃엔딩", "버스커버스커", "버스커버스커 1집", "장범준", "2012", 4);
		System.out.println(s03.toString());
		System.out.println("==================");
		
		Song s04 = new Song("벚꽃엔딩", "버스커버스커2", "버스커버스커1집2", "장범준2", "20122", 4);
		System.out.println(s04.toString());
		System.out.println("===========================");
		
				
		//아이유출력
		System.out.println("아이유출력");
		s01.showinfo();
		System.out.println("==================");
		
		//빅뱅출력
		System.out.println("빅뱅출력");
		s02.showinfo();
		System.out.println("==================");
		
		//버스커버스커
		s03.showinfo();
		System.out.println("------------------");
		
		System.out.println();
		
		
		//생성자
		
		//메소드-g/s
		
		//메소드-일반
	
		
		
	}
}
