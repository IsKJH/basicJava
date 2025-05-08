package chap04;

import java.util.Scanner;

public class SwitchExam1 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("주민번호 입력: ");
		int num = key.nextInt();
		switch (num) {
		case 1, 3:
			System.out.println("주민번호입력:" + num);
			System.out.println("남자");
			break;
		case 2, 4:
			System.out.println("주민번호입력:" + num);
			System.out.println("여자");
			break;
		default:
			System.out.println("주민번호입력:" + num);
			System.out.println("기타");
			break;
		}
		key.close();
	}

}
