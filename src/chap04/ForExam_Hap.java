package chap04;

public class ForExam_Hap {

	public static void main(String[] args) {
		int add = 0;
		int even = 0;
		int odd = 0;
		for (int i = 1; i <= 100; i++) {
			add += i;
			if (i % 2 == 0) {
				even += i;
			} else {
				odd += i;
			}
		}
		System.out.println("총합:" + add);
		System.out.println("짝수합:" + even);
		System.out.println("홀수합:" + odd);
	}

}
