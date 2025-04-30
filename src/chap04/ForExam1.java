package chap04;

public class ForExam1 {

	public static void main(String[] args) {
//		for (int i = 10; i > 0; i--) {
//			System.out.println("자바프로그래밍" + i);
//		}
//		for (int i = 0; i < 5; i++) {
//			for (int j = 1; j < 6; j++) {
//				System.out.print(i * 5 + j);
//			}
//			System.out.println();
//
//		}
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 6; j++) {
				if (i + 1 == j) {
					System.out.print("*");
				} else {
					System.out.print(i * 5 + j);
				}
			}
			System.out.println();

		}
	}

}
