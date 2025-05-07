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
		obj.display();
		System.out.println("step2");
		System.out.println("step3");
		// 2. 리턴값이 없고 매개변수 1개 메소드의 호출
		obj.display("*");
		obj.display("#");
		obj.display("★");
		// 3. 리턴값이 없고 매개변수 2개 메소드의 호출
		obj.display("▣", 3);
		obj.display("◆", 3);
		obj.display("%", 3);
		// 4. 매개변수가 있고 리턴값이 있는 메소드 호출
		// 1) 리턴값이 있는 메소드를 호출하는 경우 리턴타입과 동일한 타입의 변수를 선언해서 리턴값을 저장한다.
		int returndata = obj.add(1000, 2000);
		System.out.println("계산결과=>" + returndata);
		if (returndata > 3000) {
			System.out.println("통과");
		} else {
			System.out.println("다시작업");
		}
		// 2) 메소드의 호출결과를 다른 메소드의 매개변수로 전달하거나 바로 호출해서 작업이 가능하다.
		System.out.println("계산결과=>" + obj.add(3000, 4000));
		if (obj.add(3000, 4000) > 3000) {
			System.out.println("통과");
		} else {
			System.out.println("다시작업");
		}
	}

}
