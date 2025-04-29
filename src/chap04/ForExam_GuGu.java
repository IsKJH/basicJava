package chap04;

import java.util.Scanner;

public class ForExam_GuGu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단:");
		int dan = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}

	}

}
