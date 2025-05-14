package oop.exam;

public class SideBorder extends Border {
	char borderChar;

	@Override
	int getColumns() {
		return display.getColumns() + 2;
	}

	@Override
	int getRows() {
		return display.getRows();
	}

	@Override
	String getRowText(int row) {
		return borderChar + display.getRowText(row) + borderChar;
	}

	public SideBorder() {
		super();
	}

	public SideBorder(Display display, char ch) {
		super(display);
		this.borderChar = ch;
	}

	public char getBorderChar() {
		return borderChar;
	}

	public void setBorderChar(char borderChar) {
		this.borderChar = borderChar;
	}

}
