package chap05;

//2차원 배열을 정의하고 엑세스
//다차원배열은 배열을 참조하는 배열
public class Array2DTest1 {

	public static void main(String[] args) {
		int[][] myarr = new int[3][2];
		System.out.println(myarr);
		System.out.println("각 요소가 참조하는 배열:" + myarr[0]);
		System.out.println("각 요소가 참조하는 배열:" + myarr[1]);
		System.out.println("각 요소가 참조하는 배열:" + myarr[2]);
		System.out.println(myarr[0][0]);
		System.out.println(myarr[1][0]);
		System.out.println(myarr[2][0]);
		myarr[0][0] = 100;
		myarr[1][1] = 200;

		for (int row = 0; row < 3; row++) {
			for (int i = 0; i < 2; i++) {
				System.out.print(myarr[row][i] + "\t");
			}
			System.err.println();
		}
	}
}
