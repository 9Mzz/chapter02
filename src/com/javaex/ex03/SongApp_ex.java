package com.javaex.ex03;

public class SongApp_ex {
	public static void main(String[] args) {
		
		Song_ex s1 = new Song_ex();
		Song_ex s2 = new Song_ex();
		
		s1.setTitle("좋은날");
		s1.setArtist("아이유");
		s1.setAlbum("Real");
		s1.setComposer("이민수");
		s1.setYear("2010");
		s1.setTrack(3);
		s1.showinfo();
		
		//s1.showInfo();
		
		//
		s2.setTitle("거짓말");
		s2.setArtist("BIGBANG");
		s2.setAlbum("Always");
		s2.setYear("G-Dragon");
		s2.setTrack(2);
		s2.showinfo();
		//s2.showInfo();
		System.out.println(s2.toString());
		
		
	}
}
