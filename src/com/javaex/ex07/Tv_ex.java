package com.javaex.ex07;

public class Tv_ex {

	// 필드
	private int channel;
	private int volume;
	private boolean power;
	
	
	// 생성자
	public Tv_ex() {
	
	}
	
	public Tv_ex(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	// 메소드 g-s
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}

	// 메소드 일반
	public void power(boolean power) {
		this.power=power;
	}
	
	public void channel(int channel) {
		if(isPower()) {
			if(channel<1)
				this.channel=1;
			else if(channel>255)
				this.channel=255;
			else
				this.channel=channel;
		}
	}
	public void channel(boolean up) {
		int ch;
		if(up)
			ch = this.channel + 1;
		else 
			ch = this.channel - 1;
		channel(ch);
	
	}
	
	public void volume(int volume) {
		if(isPower()) {
			if(volume<0)
				this.volume=0;
			else if(volume>100)
				this.volume=100;
			else
				this.volume=volume;
		}

	}
	public void volume(boolean up) {
		int vol;
		if(up)
			vol = this.volume + 1;
		else 
			vol = this.volume - 1;
		volume(vol);
	}
	
	public void status() {
		System.out.println("────────────────────────────────────────────");
		System.out.println("                TV  status");
		System.out.printf(" power:%b\tchannel:%d\tvolume:%d\n", power,channel, volume);
		System.out.println("────────────────────────────────────────────");
		System.out.println();
	}

	
	
	
}
	
	
	

	

	
	
	
	
