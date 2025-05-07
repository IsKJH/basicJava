package oop.basic.chap05.constructor;

public class Person2 {
	// 정보를 은닉
	private String name;
	private String addr;
	private int age;

	public Person2() {
	}

	public Person2(String name, String addr, int age) {
		super();
		this.name = name;
		this.addr = addr;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public String getAddr() {
		return this.addr;
	}

	public int getAge() {
		return this.age;
	}

}
