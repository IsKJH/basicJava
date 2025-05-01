package chap04;

public class WhileExam1 {

	public static void main(String[] args) {
		int add = 0;
		int even = 0;
		int odd = 0;
		int cnt = 0;
		while (cnt <= 100) {
			add += cnt;
			if (cnt % 2 == 0) {
				even += cnt;
			} else {
				odd += cnt;
			}
			cnt++;
		}
		System.out.println("총합:" + add);
		System.out.println("짝수합:" + even);
		System.out.println("홀수합:" + odd);
	}

}
