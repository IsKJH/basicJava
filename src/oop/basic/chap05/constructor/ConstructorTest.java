package oop.basic.chap05.constructor;

public class ConstructorTest {

	public static void main(String[] args) {
		Constructor obj = new Constructor();
		System.out.println(obj);
		Constructor obj2 = new Constructor();
		System.out.println(obj2);
		Constructor obj3 = new Constructor("뷔", "bts1", "1234");
		System.out.println("성명:" + obj3.getName() + ", id:" + obj3.getId());

	}

}
