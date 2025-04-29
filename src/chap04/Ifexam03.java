package chap04;

import java.util.Scanner;

public class Ifexam03 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("숫자입력:");
		int num = key.nextInt();
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("양수이면서 짝수입니다.");
			} else {
				System.out.println("양수이면서 홀수입니다.");
			}
		} else {
			System.out.println("음수입니다.");
		}
	}

}
