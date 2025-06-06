package oop.exam;

public abstract class Display {
	abstract int getColumns();

	abstract int getRows();

	abstract String getRowText(int row);

	final void show() {
		for (int i = 0; i < getRows(); i++) {
			System.out.println(getRowText(i));
		}
	}
}
