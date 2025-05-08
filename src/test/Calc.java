package test;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		Calc();
	}

	public static void Calc() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****미니계산기*****");
		System.out.println("1.더하기");
		System.out.println("2.곱하기");
		System.out.println("3.빼기");
		System.out.println("4.나누기");
		System.out.print("연산자를 선택하세요.");
		int oper = sc.nextInt();
		if (1 <= oper && oper <= 4) {
			System.out.print("숫자를 입력하세요.");
			int num1 = sc.nextInt();
			System.out.print("숫자를 입력하세요.");
			int num2 = sc.nextInt();
			System.out.println("계산결과=>"
					+ (oper == 1 ? num1 + num2 : oper == 2 ? num1 * num2 : oper == 3 ? num1 - num2 : num1 / num2));
		} else {
			System.out.println("잘못선택했습니다.");
			Calc();
		}
		sc.close();
	}

}
