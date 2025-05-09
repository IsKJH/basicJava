package oop.polymorphism.chap07;

//객체의 형변환
class Super {
	String data = "상위클래스";

	public void display() {
		System.out.println("super의 display");
	}
}

class Sub extends Super {
	String data = "하위클래스";

	public void display() {
		System.out.println("Sub의 display");
	}

	public void test() {
		System.out.println("Sub의 test");
	}
}

public class RefTypeCastingTest2 {

	public static void main(String[] args) {
		System.out.println("1. Super타입의 참조변수로 Super객체를 사용");
		Super obj1 = new Super();
		obj1.display();
		System.out.println(obj1.data);
		System.out.println("*****************************************");

		System.out.println("2. Sub타입의 참조변수로 Sub객체를 사용");
		Sub obj2 = new Sub();
		obj2.display();
		System.out.println(obj2.data);
		System.out.println("*****************************************");
		// 상속관계에 있는 클래스는 자동캐스팅
		// 서브클래스의 인스턴스를 슈퍼클래스타입으로 변환하는 작업 - 업캐스팅(안전)
		// 컴파일시점에 참조변수의 타입에 따라서 사용 가능한 멤버가 결정된다.
		// 참조변수가 Super타입 이므로 Super의 멤버만 접근할 수 있다.
		System.out.println("3. Super타입의 참조변수로 Sub객체를 사용");
		Super obj3 = new Sub();
		obj3.display();
		System.out.println(obj3.data);
		System.out.println("*****************************************");
		// obj3.test();
		// obj3이 Super타입의 참조변수이지만 실제 참조하고 있는 생성된 객체는 Sub객체이므로 obj3을 서브객체참조변수로
		// 변환이 가능하다.
		System.out.println("4. Sub타입의 참조변수로 Super객체를 사용");
//		Sub obj4 = new Super();
		System.out.println("*****************************************");
	}

}
