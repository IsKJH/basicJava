package test;

public class MethodHomeTest {

	public void checkEvenOrOdd(int num) {
		if (num % 2 == 0) {
			System.out.println(num + "은 짝수입니다.");
		}
	}

	public void sumBetween(int num1, int num2) {
		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			sum += i;
		}
		System.out.println(num1 + "부터 " + num2 + "까지의 합: " + sum);
	}

	public void repeatString(String str, int num) {
		for (int i = 0; i < num; i++) {
			System.out.println(str);
		}
	}

	public void checkAlphabet(char str) {
		if (str >= 'A' && str <= 'Z') {
			System.out.println("'" + str + "'" + "는 알파벳입니다.");
		} else {
			System.out.println("'" + str + "'" + "는 알파벳이 아닙니다.");
		}
	}

	public void checkRange(int num) {
		if (num >= 1 && num <= 100) {
			System.out.println("정상 입력");
		} else {
			System.out.println("잘못된 입력");
		}
	}

}
