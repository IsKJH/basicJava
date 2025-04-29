package test;

import java.util.Scanner;

public class FareTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----Menu------");
		System.out.println("1. 가정용 (liter당 50원)");
		System.out.println("2. 상업용 (liter당 45원)");
		System.out.println("3. 공업용 (liter당 30원)");
		System.out.println("----------------");
		System.out.print("메뉴를 선택하세요=>");
		int oper = sc.nextInt();
		System.out.println("----------------");
		System.out.println("사용량을 입력하세요");
		int use = sc.nextInt();
		int useFee = 0;
		switch (oper) {
		case 1:
			useFee = use * 50;
			break;
		case 2:
			useFee = use * 45;
			break;
		case 3:
			useFee = use * 30;
			break;
		}
		System.out.println("===============");
		System.out.println("사용자코드:1");
		System.out.println("사용요금:" + useFee);
		System.out.println("총수도 요금:" + (int) (useFee + (useFee * 0.05)));

	}

}
