package chap04;

import java.util.Random;
import java.util.Scanner;

public class Ifexam02 {
	public static void main(String[] args) {

		// Scanner를 이용해서 작업하기
		Scanner key = new Scanner(System.in);
		System.out.print("숫자입력:");
		int num = key.nextInt();
		if (num > 0) {
			if (num % 5 == 0) {
				System.out.println("입력한 숫자는 5의 배수입니다.");
			} else {
				System.out.println("입력한 숫자는 5의 배수가 아닙니다.");
			}
		}
	}
}
