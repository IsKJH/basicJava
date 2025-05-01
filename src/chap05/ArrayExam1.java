package chap05;

public class ArrayExam1 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 1000;
		arr[2] = 2000;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "번 요소 => " + arr[i]);
		}

	}

}
