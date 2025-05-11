package oop.polymorphism.chap07;

//부모타입의 변수를 선언하면 모든 자식 객체를 참조할 수 있다.

class Parent {
	public void test() {
		System.out.println("부모의 test");
	}
}

class Child1 extends Parent {
	public void test() {
		System.out.println("Child1의 test");
	}
}

class Child2 extends Parent {
	public void test() {
		System.out.println("Child2의 test");
	}
}

class Child3 extends Parent {
	public void test() {
		System.out.println("Child3의 test");
	}
}

class Child4 extends Parent {
	public void test() {
		System.out.println("Child4의 토스뱅크");
	}
}

public class RefTypeCastingTest3 {

	public static void main(String[] args) {
		Child1 obj1 = new Child1(); // 계좌이체
		Child2 obj2 = new Child2(); // 신용카드
		Child3 obj3 = new Child3(); // 카카오페이
		Child4 obj4 = new Child4();
		run(obj4);
	}

	public static void run(Parent child) {
		child.test();

	}
}
