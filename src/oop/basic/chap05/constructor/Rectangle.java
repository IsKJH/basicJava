package oop.basic.chap05.constructor;

public class Rectangle {
	private int width;
	private int height;
	private String color;
	private int area;

	public void calculateArea() {
		this.area = getWidth() * getHeight();
	}

	public Rectangle() {
		setColor("흰색");
	}

	public Rectangle(int width, int height) {
		this();
		this.width = width;
		this.height = height;
	}

	public Rectangle(int width, int height, String color) {
		this(width, height);
		this.color = color;
	}

	public Rectangle(int width, int height, String color, int area) {
		this(width, height, color);
		this.area = area;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
}
