package test;

public class BookMagazineTest {

	public static void main(String[] args) {
		Book1 book = new Book1("자바의 정석", 20000, 2);
		Magazine magazine = new Magazine("월간코딩", 10000, 3, "5월호");
		Book1 book1 = new Book1("스프링 부트", 25000, 1);
		System.out.println("=== 판매 목록 ===");
		book.printInfo();
		magazine.printInfo();
		book1.printInfo();
		System.out.println("\n=== 특집 안내 ===");
		System.out.println("→ [" + magazine.getTitle() + " " + magazine.getMonth() + "] 특집 커버 스토리 공개!\n");
		System.out.println(
				"총 판매 금액: " + (int) (book.getTotalPrice() + magazine.getTotalPrice() + book1.getTotalPrice()) + "원");
	}

}
