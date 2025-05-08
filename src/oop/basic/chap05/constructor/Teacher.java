package oop.basic.chap05.constructor;

public class Teacher {
	private String name;
	private int age;
	private String subject;

	public Teacher() {
	}

	public Teacher(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}

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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void display() {
		System.out.println("이 름 : " + this.getName() + " 나 이 : " + this.getAge() + " 담당과목 : " + this.getSubject());
	}
}
