package oop.basic.chap05;

public class Student {
	private String name;
	private int age;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void display() {
		System.out.println("이 름 : " + this.getName() + " 나 이 : " + this.getAge() + " 학 번 : " + this.getId());
	}
}
