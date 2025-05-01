package chap05;

public class Prob1 {
	public static void main(String[] args) {
		int[] ia = new int[] { 3, 7, 1, 8, 10, 2, 15, 2, 10 };
		int[] ib = new int[] { 1, 2, 3, 4, 5 };
		sum(ib, "ib");

	}

	public static void sum(int[] arr, String arrName) {
		int sumEven = 0;
		int sumOdd = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sumEven += arr[i];
			} else {
				sumOdd += arr[i];
			}
		}
		System.out.println("배열" + arrName);
		System.out.println("홀수의 합:" + sumOdd);
		System.out.println("짝수의 합:" + sumEven);
	}
}
