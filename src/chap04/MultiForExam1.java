package chap04;

public class MultiForExam1 {

	public static void main(String[] args) {
		fun1(7);
	}

	public static void fun1(int row) {
		int middle = (row * row / 2) + 1;
		int cnt = 1;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row; j++) {
				if (row % 2 == 0) {
					System.out.print("2");
				} else {
					if (cnt != middle) {
						System.out.print("2");
					} else {
						System.out.print("너");
					}
				}
				cnt++;
			}
			System.out.println();
		}

	}
}
