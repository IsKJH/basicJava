package oop.polymorphism.chap07;

public class Rectangular extends Shape {
	private double width;
	private double height;

	@Override
	public void calculationArea() {
		setArea(width * height);
	}

	public Rectangular(String name, double width, double height) {
		super(name);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
