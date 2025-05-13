package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowExam {
	// throws를 이용해서 예외를 호출한 곳에서 처리하도록 작업하세요
	public void test() throws NullPointerException, InputMismatchException, Exception {
		Scanner key = new Scanner(System.in);
		String str = null;
		System.out.println("숫자입력:");
		int data = key.nextInt();
		System.out.println("입력한 숫자는 :" + data);

		System.out.println(str.length());
	}

	public static void main(String[] args) {
		ThrowExam obj = new ThrowExam();
		try {
			obj.test();
		} catch (NullPointerException e) {
			System.out.println("str은 null입니다.");
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력하세요.");
		} catch (Exception e) {
			System.out.println("예외 오류입니다.");
		}
	}

}