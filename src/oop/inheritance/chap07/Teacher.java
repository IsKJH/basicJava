package oop.inheritance.chap07;

public class Teacher extends Person {
	private String subject;

	public Teacher() {
	}

	public Teacher(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
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
