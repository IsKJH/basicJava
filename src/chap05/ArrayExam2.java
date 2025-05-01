package chap05;

public class ArrayExam2 {

	public static void main(String[] args) {
		boolean[] arr = new boolean[4];
		arr[3] = true;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "번 요소 => " + arr[i]);
		}

	}

}
