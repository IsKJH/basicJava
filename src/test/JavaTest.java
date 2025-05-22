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

			} else if (firstChk.equals("2")) {
				System.out.println("===================");
				System.out.println("과수원 관리자 사이트 입니다.");
				System.out.println("1. 과일입고");
				System.out.println("2. 과일출고");
				System.out.println("3. 재고확인");
				System.out.println("선택해주세요.");
				System.out.println("===================");
				String managerFirstChk = br.readLine();
				if (managerFirstChk.equals("1")) {
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
				} else if (managerFirstChk.equals("2")) {
				} else {
					orchard.print();
				}

			} else {
				break;
			}
		}
	}

}
