package chap04;

import java.util.Scanner;

public class WhileExam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단:");
		int dan = sc.nextInt();
		int i = 1;
		while (i <= 9) {
			System.out.println(dan + "*" + i + "=" + dan * i);
			i++;
		}
		sc.close();
	}

}
