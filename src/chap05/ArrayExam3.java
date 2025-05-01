package chap05;

public class ArrayExam3 {

	public static void main(String[] args) {
		int[] scoreArr = { 98, 99, 100, 89, 88 };
		int hap = 0;
		for (int i = 0; i < scoreArr.length; i++) {
			hap += scoreArr[i];
		}
		System.out.println("총합:" + hap);
		System.out.println("평균:" + hap / scoreArr.length);
	}

}
