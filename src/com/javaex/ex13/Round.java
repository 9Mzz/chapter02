package com.javaex.ex13;

public class Round {

	//필드
	private String lineColor;
	private String fillcolor;
	private int weight;
	private int height;
	//생성자
	public Round() {
	}
	public Round(String lineColor, String fillcolor, int weight, int height) {
		this.lineColor = lineColor;
		this.fillcolor = fillcolor;
		this.weight = weight;
		this.height = height;
	}
	//메소드 g-s
	public String getLineColor() {
		return lineColor;
	}
	public String getFillcolor() {
		return fillcolor;
	}
	public int getWeight() {
		return weight;
	}
	public int getHeight() {
		return height;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public void setFillcolor(String fillcolor) {
		this.fillcolor = fillcolor;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	//메소드 일반
	@Override
	public String toString() {
		return "Round [lineColor=" + lineColor + ", fillcolor=" + fillcolor + ", weight=" + weight + ", height="
				+ height + "]";
	}
	
	
}
