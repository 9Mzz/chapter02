package com.javaex.ex03;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	//
	public void set_title(String s) {
		title = s;
	}
	public String get_title() {
		return title;
	}
	//
	public void set_artist(String a) {
		artist = a;
	}
	public String get_artist() {
		return artist;
	}
	//
	public void set_album(String b) {
		album = b;
	}
	public String get_album() {
		return album;
	}
	//
	public void set_composer(String c) {
		composer = c;
	}
	public String get_composer() {
		return composer;
	}
	//
	public void set_year(int y) {
		year = y;
	}
	public int get_year() {
		return year;
	}
	//
	public void set_track(int t) {
		track = t;
	}
	public int get_track() {
		return track;
	}
	public void setinfo() {
		System.out.println(
				artist+title+"( "+album+", "+year+", "+track+"번 track,"+composer+" 작곡 )"
				);
	}
}
