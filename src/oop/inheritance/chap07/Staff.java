package oop.inheritance.chap07;

public class Staff extends Person {
	private String job;

	public Staff() {
	}

	public Staff(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void display() {
		System.out.println("이 름 : " + this.getName() + " 나 이 : " + this.getAge() + " 부 서 : " + this.getJob());
	}
}
