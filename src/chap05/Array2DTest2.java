package chap05;

//2차원배열의 선언과 생성과 초기화를 동시에 작업
public class Array2DTest2 {
	public static void main(String[] args) {
		int[][] myarr = { { 100, 0, 0 }, { 0, 100, 0 }, { 0, 0, 100 } };
		for (int i = 0; i < myarr.length; i++) {
			for (int j = 0; j < myarr[i].length; j++) {
				System.out.print(myarr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
