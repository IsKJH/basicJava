package oop.inheritance.chap07;

//final은 클래스, 변수, 메소드에 각각 추가할 수 있다.
//변수 - 상수(값을 재할당하는 것이 불가능)
//메소드 - 오버라이딩이 불가능한 메소드 정의
//클래스 - 상속이 불가능한 클래스 정의
//fianl class A {
//	int num = 100;// 변수
//	public static final int NUM_VALUE = 10000;
//
//	public void test() {
//		num = 1000;
////		NUM_VALUE = 20000; - 상수라 변경이 불가능
//	}
//
//	// 오버라이딩이 불가능한 메소드
//	public final void display() {
//		System.out.println("상위display");
//	}
//}
class A {
	int num = 100;// 변수
	public static final int NUM_VALUE = 10000;

	public void test() {
		num = 1000;
//	NUM_VALUE = 20000; - 상수라 변경이 불가능
	}

// 오버라이딩이 불가능한 메소드
//	public final void display() {
//		System.out.println("상위display");
//	}
	public void display() {
		System.out.println("상위display");
	}
}

class B extends A {
	public void display() {
		System.out.println("하위display");
	}
}

public class FinalTest {

	public static void main(String[] args) {
		B obj = new B();
		obj.display();
	}

}
