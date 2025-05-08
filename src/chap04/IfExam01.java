package chap04;

import java.util.Scanner;

public class IfExam01 {
	public static void main(String[] args) {
//
//		Random random = new Random();
//		int num = random.nextInt();
//		if (num % 5 == 0 && num >= 0) {
//			System.out.println("입력한 숫자는 5의 배수입니다.");
//		} else {
//			System.out.println("입력한 숫자는 5의 배수가 아닙니다.");
//		}
		Scanner key = new Scanner(System.in);
		System.out.println("숫자입력:");
		int num = key.nextInt();
		if (num > 0) {
			if (num % 5 == 0) {
				System.out.println("입력한 숫자는 5의 배수입니다.");
			} else {
				System.out.println("입력한 숫자는 5의 배수가 아닙니다.");
			}
		}
		key.close();
	}
}
