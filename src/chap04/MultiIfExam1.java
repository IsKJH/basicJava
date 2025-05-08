package chap04;

import java.util.Scanner;

public class MultiIfExam1 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("주민번호 입력: ");
		int num = key.nextInt();
		if (num == 1 || num == 3) {
			System.out.println("주민번호입력:" + num);
			System.out.println("남자");
		} else if (num == 2 || num == 4) {
			System.out.println("주민번호입력:" + num);
			System.out.println("여자");
		} else {
			System.out.println("주민번호입력:" + num);
			System.out.println("기타");
		}
		key.close();
	}

}
