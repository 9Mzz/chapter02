package com.javaex.ex03;

public class Song_ex {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;

	// alt+shift+s = getter,setter 팝업
	// ctrl + shift + f // 자동줄정렬

	public String getTitle() {

		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	public void showinfo() {
		System.out.println(artist+", "+title+" ("+album+", "+year+", "+track+"번 track, "+composer+")");
	}

	@Override
	public String toString() {
		return "Song_ex [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer
				+ ", year=" + year + ", track=" + track + "]";
	}
	

}
