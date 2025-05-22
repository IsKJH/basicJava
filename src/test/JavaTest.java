package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaTest {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Orchard orchard = new Orchard(2000, 5000, 3000, 4000);
		while (true) {
			System.out.println("===================");
			System.out.println("과수원 운영 사이트 입니다.");
			System.out.println("1. 회원");
			System.out.println("2. 관리자");
			System.out.println("3. 종료");
			System.out.println("선택해주세요.");
			System.out.println("===================");
			String firstChk = br.readLine();
			if (firstChk.equals("1")) {
				System.out.println("===================");
				System.out.println("과수원 회원 사이트 입니다.");
				System.out.println("1. 과일구매");
				System.out.println("2. 구매내역");
				System.out.println("선택해주세요.");
				System.out.println("===================");
				String key = br.readLine();
				if (key.equals("1")) {
					orchard.print();
					System.out.println("===================");
					System.out.println("구매하실 과일명을 선택해주세요.");
					System.out.println("1. waterMelon");
					System.out.println("2. apple");
					System.out.println("3. peach");
					System.out.println("4. shineMusket");
					System.out.println("===================");
					String type = br.readLine();
					System.out.println("===================");
					System.out.println("수량을 작성해주세요.");
					System.out.println("===================");
					int count = Integer.parseInt(br.readLine());
					switch (type) {
					case "1":
						if (orchard.getWaterMelon() >= count) {
							orchard.setWaterMelon(orchard.getWaterMelon() - count);
							System.out.println("waterMelon(" + count + ")개 구매완료");
							orchard.setHistoryList("waterMelon", count);
						} else {
							System.out.println("재고가 부족합니다.");
						}
						break;
					case "2":
						if (orchard.getApple() >= count) {
							orchard.setApple(orchard.getApple() - count);
							System.out.println("apple(" + count + ")개 구매완료");
							orchard.setHistoryList("apple", count);
						} else {
							System.out.println("재고가 부족합니다.");
						}
						break;
					case "3":
						if (orchard.getPeach() >= count) {
							orchard.setPeach(orchard.getPeach() - count);
							System.out.println("peach(" + count + ")개 구매완료");
							orchard.setHistoryList("peach", count);
						} else {
							System.out.println("재고가 부족합니다.");
						}
						break;
					case "4":
						if (orchard.getShineMusket() >= count) {
							orchard.setShineMusket(orchard.getShineMusket() - count);
							System.out.println("shineMusket(" + count + ")개 구매완료");
							orchard.setHistoryList("shineMusket", count);
						} else {
							System.out.println("재고가 부족합니다.");
						}
						break;
					}
				} else if (key.equals("2")) {
					orchard.printHistory();
				} else {
					System.out.println("잘못 입력했습니다.");
				}
			} else if (firstChk.equals("2")) {
				System.out.println("===================");
				System.out.println("과수원 관리자 사이트 입니다.");
				System.out.println("1. 과일입고");
				System.out.println("2. 과일출고");
				System.out.println("3. 재고확인");
				System.out.println("선택해주세요.");
				System.out.println("===================");
				String key = br.readLine();
				if (key.equals("1")) {
					System.out.println("===================");
					System.out.println("과일명을 선택해주세요.(입고)");
					System.out.println("1. waterMelon");
					System.out.println("2. apple");
					System.out.println("3. peach");
					System.out.println("4. shineMusket");
					System.out.println("===================");
					String type = br.readLine();
					System.out.println("===================");
					System.out.println("수량을 작성해주세요.");
					System.out.println("===================");
					int count = Integer.parseInt(br.readLine());
					switch (type) {
					case "1":
						orchard.setWaterMelon(orchard.getWaterMelon() + count);
						break;
					case "2":
						orchard.setApple(orchard.getApple() + count);
						break;
					case "3":
						orchard.setPeach(orchard.getPeach() + count);
						break;
					case "4":
						orchard.setShineMusket(orchard.getShineMusket() + count);
						break;
					}
					orchard.print();
				} else if (key.equals("2")) {
					System.out.println("===================");
					System.out.println("과일명을 선택해주세요.(출고)");
					System.out.println("1. waterMelon");
					System.out.println("2. apple");
					System.out.println("3. peach");
					System.out.println("4. shineMusket");
					System.out.println("===================");
					String type = br.readLine();
					System.out.println("===================");
					System.out.println("수량을 작성해주세요.");
					System.out.println("===================");
					int count = Integer.parseInt(br.readLine());
					switch (type) {
					case "1":
						if (orchard.getWaterMelon() >= count) {
							orchard.setWaterMelon(orchard.getWaterMelon() - count);
						} else {
							System.out.println("재고가 부족합니다.");
						}
						break;
					case "2":
						if (orchard.getApple() >= count) {
							orchard.setApple(orchard.getApple() - count);
						} else {
							System.out.println("재고가 부족합니다.");
						}
						break;
					case "3":
						if (orchard.getPeach() >= count) {
							orchard.setPeach(orchard.getPeach() - count);
						} else {
							System.out.println("재고가 부족합니다.");
						}

						break;
					case "4":
						if (orchard.getShineMusket() >= count) {
							orchard.setShineMusket(orchard.getShineMusket() - count);
						} else {
							System.out.println("재고가 부족합니다.");
						}
						break;
					}
					orchard.print();
				} else if (key.equals("3")) {
					orchard.print();
				} else {
					System.out.println("잘못 입력했습니다.");
				}
			} else if (firstChk.equals("3")) {
				break;
			} else {
				System.out.println("잘못 입력했습니다.");
			}
		}
	}

}
