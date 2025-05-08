package chap04;

import java.util.Scanner;

public class MultiIfExam2 {
	public static void main(String[] args) {
		System.out.println("점수입력: ");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		if (score < 0 || score > 100) {
			System.out.println("잘못입력");
		} else {
			if (score < 60) {
				System.out.println("점수:" + score);
				System.out.println("평가:F");
			} else if (score < 70) {
				System.out.println("점수:" + score);
				System.out.println("평가:D");
			} else if (score < 80) {
				System.out.println("점수:" + score);
				System.out.println("평가:C");
			} else if (score < 90) {
				System.out.println("점수:" + score);
				System.out.println("평가:B");
			} else if (score <= 100) {
				System.out.println("점수:" + score);
				System.out.println("평가:A");
			}
		}
		scanner.close();
	}
}
