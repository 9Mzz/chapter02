package com.javaex.ex07;

public class TV {
	// 메인
	private int channel;
	private int volume;
	private boolean power;

	// 생성자
	public TV() {
		System.out.println("Status()");
	}

	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	// 메소드 g-s
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getChannel() {
		return channel;
	}
	////
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getVolume() {
		return volume;
	}
	////

	public void setPower(boolean power) {
		this.power = power;
	}
	public boolean isPower() {
		return power;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}

	public void status(boolean action) {
		if (0 < channel && channel < 255) {
			if (action==true) {
				System.out.println("볼륨을 높였습니다." + "현재 채널은" + (++channel) + ", 볼륨은" + (++volume) + "입니다");
			} else if (action==false) {
				System.out.println("볼륨을 내렸습니다." + "현재 채널은" + (--channel) + ", 볼륨은" + (--volume) + "입니다");
			} else {
				System.out.println("잘못된 입력");
			}
		} else {
			System.out.println("채널이 없습니다.");
		}

	}

}
