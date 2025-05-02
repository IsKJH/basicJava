package test;

public class ArrayTest {

	public static void main(String[] args) {
		ArrayTest test = new ArrayTest();
		test.prob1();
		test.prob2('a');
		test.prob3();
		test.prob4();
		test.prob5();
		test.prob6();
	}

	public void prob1() {
		int[] arr = { 10, 20, 5, 3, 100, 55 };
		int maxNum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxNum) {
				maxNum = arr[i];
			}
		}
		System.out.println("최댓값: " + maxNum);
	}

	public void prob2(char target) {
		char[] arr = { 'a', 'b', 'c', 'a', 'a' };
		int cnt = 0;
		for (int i : arr) {
			if (i == target) {
				cnt++;
			}
		}
		System.out.println("'" + target + "'의 개수: " + cnt);
	}

	public void prob3() {
		int[] arr = { 10, -3, 25, -7, 33, -5 };
		int negativeSum = 0;
		int positiveSum = 0;
		for (int i : arr) {
			if (i > 0) {
				positiveSum += i;
			} else {
				negativeSum += i;
			}
		}
		System.out.println("양수의 합: " + positiveSum);
		System.out.println("음수의 합: " + negativeSum);
	}

	public void prob4() {
		int[] arr = { 1, 3, 5, 7, 9 };
		int lastVal = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = lastVal;
		System.out.print("이동 결과: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void prob5() {
		int[] scores = { 85, 92, 76, 58, 99 };
		int sum = 0;
		double avg = 0;
		int minCnt = 0;
		int maxScore = 0;
		String bestStudent = "";
		System.out.println("학생 점수 리스트:");
		for (int i = 0; i < scores.length; i++) {
			System.out.println("학생 " + i + ": " + scores[i] + "점");
			sum += scores[i];
			if (scores[i] < 60) {
				minCnt += 1;
			}
			if (maxScore < scores[i]) {
				maxScore = scores[i];
				bestStudent = "학생 " + i;
			}
		}
		avg = (double) sum / scores.length;
		System.out.println("\n총점: " + sum);
		System.out.println("평균: " + String.format("%.2f", avg));
		System.out.println("60점 미만 학생 수: " + minCnt);
		System.out.println("최고 점수: " + maxScore + "점 (" + bestStudent + ")");
		System.out.println("90점 이상 학생 등급 부여: ");
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 90) {
				System.out.println("학생 " + i + ": A등급 (" + scores[i] + "점)");
			}
		}
	}

	public void prob6() {
		int[] scores = { 95, 100, 78, 85, 60 };
		int max = scores[0];
		int min = scores[0];
		for (int i : scores) {
			if (max < i) {
				max = i;
			}
			if (min > i) {
				min = i;
			}
		}
		System.out.println("점수 차이: " + (max - min));
	}
}
