package oop.exam;

public class StringDisplay extends Display {
	String string;

	@Override
	int getColumns() {
		return string.getBytes().length;
	}

	@Override
	int getRows() {
		return 1;
	}

	@Override
	String getRowText(int row) {
		return row == 0 ? string : null;
	}

	public StringDisplay() {
		super();
	}

	public StringDisplay(String string) {
		super();
		this.string = string;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

}
