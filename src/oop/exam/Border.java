package oop.exam;

public abstract class Border extends Display {
	Display display;

	public Border() {
		super();
	}

	public Border(Display display) {
		super();
		this.display = display;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

}
