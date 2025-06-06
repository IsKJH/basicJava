package oop.basic.chap05.constructor;

public class Rectangle2 {
	private int width;
	private int length;
	private String color;

	public int area() {
		return getWidth() * getLength();
	}

	public int perimeter() {
		return (getWidth() * 2) + (getLength() * 2);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
