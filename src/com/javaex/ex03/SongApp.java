package com.javaex.ex03;

public class SongApp {
	public static void main(String args) {
		
		Song apps = new Song();
		
		apps.set_title("좋은날");
		apps.set_artist("아이유");
		apps.set_album("Real");
		apps.set_composer("이민수");
		apps.set_year(2010);
		apps.set_track(3);
		apps.setinfo();
	}
}
