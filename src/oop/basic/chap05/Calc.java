package oop.basic.chap05;

public class Calc {
	public int calc(String opr, int num1, int num2) {
		int result = 0;

		if (opr == "+") {
			result = num1 + num2;
		} else if (opr == "*") {
			result = num1 * num2;
		} else if (opr == "-") {
			result = num1 - num2;
		} else {
			result = num1 / num2;
		}

		return result;
	}
}
