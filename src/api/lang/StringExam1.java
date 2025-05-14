package api.lang;

import java.util.Scanner;

public class StringExam1 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("문자열입력:");
		// next메소드는 spacebar나 enter를 만나기 전까지의 문자열만 읽어서 리턴
		// 한줄전체를 읽고 싶은 경우
		String data = key.nextLine();
		System.out.println("입력받은 문자열:" + data);
		String upper = data.toUpperCase();
		String reverse = "";
		for (int i = upper.length() - 1; i >= 0; i--) {
			reverse += upper.charAt(i);
		}
		System.out.println(reverse);
		key.close();
	}

}
