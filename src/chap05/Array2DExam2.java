package chap05;

public class Array2DExam2 {

	public static void main(String[] args) {
		int[][] arr1 = { { 90, 89, 100 }, { 98, 89, 97 } };
		String[] classArr = { "A반", "B반" };
		for (int i = 0; i < arr1.length; i++) {
			int sum = 0;
			System.out.print(classArr[i] + ": ");
			for (int j = 0; j < arr1[i].length; j++) {
				sum += arr1[i][j];
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println("합계:" + sum + " 평균:" + (sum / arr1[i].length));
		}
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			double sum = 0;
			System.out.println("[" + classArr[i] + "]");
			for (int j = 0; j < arr1[i].length; j++) {
				sum += arr1[i][j];
			}
			System.out.println("합계:" + (int) sum);
			System.out.println("합계:" + (double) (sum / arr1[i].length));
			System.out.println("-------------------");
		}
	}
}
