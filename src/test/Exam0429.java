package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam0429 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		pro4();
	}

	public static void pro1() {
		System.out.println("2~100 사이의 정수를 입력하세요.:");
		int num = sc.nextInt();
		boolean chk = true;
		for (int i = 2; i <= num; i++) {
			if (i != num && num % i == 0) {
				chk = false;
			}
		}
		if (chk) {
			System.out.println(num + "는(은) 소수입니다.");
		} else {
			System.out.println(num + "는(은) 소수가 아닙니다.");
		}
	}

	public static void pro2() {
		System.out.println("1보다 크고 20보다 작은 정수를 입력하세요.:");
		int num = sc.nextInt();
		if (num < 2 || num > 9) {
			System.out.println("잘못된 숫자가 입력되었습니다.");
		} else {
			for (int i = 1; i <= 9; i++) {
				System.out.println(num + "*" + i + "=" + num * i);
			}
		}
	}

	public static void pro3() {
		System.out.println("최대 공약수 구하기");
		System.out.println("첫번째 숫자를 입력하세요");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int num2 = sc.nextInt();

		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0) {
				list1.add(i);
			}
		}
		for (int i = 1; i <= num2; i++) {
			if (num2 % i == 0) {
				list2.add(i);
			}
		}
		int answer = 1;
		if (list1.size() > list2.size()) {
			for (int i : list1) {
				for (int j : list2) {
					if (i == j && j > answer) {
						answer = j;
					}
				}
			}
		} else {
			for (int i : list2) {
				for (int j : list1) {
					if (i == j && j > answer) {
						answer = j;
					}
				}
			}
		}
		System.out.println(answer);
	}

	public static void pro4() {
		System.out.println("양의 정수를 입력하세요 : ");
		int num = sc.nextInt();
		int numSize = 0;
		int numAdd = 0;
		if (num > 0 && num <= 1000) {
			System.out.println(num + "의 배수 개수 = " + 1000 / num);
			for (int i = num; i <= 1000; i++) {
				if (i % num == 0) {
					numAdd += i;
				}
			}
			System.out.println(num + "의 배수 합 = " + numAdd);
		} else {
			System.out.println("잘못된 숫자범위입니다. 다시 입력하세요.");
			pro4();
		}
	}
}
