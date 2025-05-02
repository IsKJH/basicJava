package oop.basic.chap05;

//MyMethod클래스에서 정의된 메소드를 사용
//=> 메소드호출
public class MyMethodTest {
	public static void main(String[] args) {
		MyMethod obj = new MyMethod();
		System.out.println("프로그램시작");
		System.out.println("step1");
		// 1. 매개변수가 없고 리턴값이 없는 메소드의 호출
		obj.display();
	}

}
