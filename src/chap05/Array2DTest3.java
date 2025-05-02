package chap05;

import java.util.Iterator;

public class Array2DTest3 {

	public static void main(String[] args) {
		String[][] myarr = { { "*" }, { "*", "*" }, { "*", "*", "*" }, { "*", "*", "*", "*" },
				{ "*", "*", "*", "*", "*" } };
		System.out.println(myarr[4].length);
		for (int i = 0; i < myarr.length; i++) {
			for (int j = 0; j < myarr[i].length; j++) {
				System.out.print(myarr[i][j]);
			}
			System.out.println();
		}
	}

}
