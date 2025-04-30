package chap04;

public class WhileTest1 {

	public static void main(String[] args) {
		System.out.println("While테스트");
		// "자바프로그래밍"을 10번 출력하기
		int cnt = 0;
		while (cnt < 10) {
			System.out.println("자바프로그래밍");
			cnt++;
		}
		System.out.println();
		cnt = 1;
		while (true) {
			System.out.println("자바프로그램");
			if (cnt == 5) {
				break;
			}
			cnt++;
		}
	}

}
