package oop.exam;

public class FullBorder extends Border {

	String makeLine(char ch, int count) {
		String str = "";
		if (count != 1) {
			for (int i = 0; i < display.getColumns(); i++) {
				str += ch;
			}
			return "+" + str + "+";
		} else {
			return "|" + display.getRowText(0) + "|";
		}

	}

	@Override
	int getColumns() {
		return display.getColumns();
	}

	@Override
	int getRows() {
		return 3;
	}

	@Override
	String getRowText(int row) {
		return makeLine('-', row);
	}

	public FullBorder(Display display) {
		super(display);
	}

}
