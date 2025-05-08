package oop.basic.chap05.constructor;

public class Staff {
	private String name;
	private int age;
	private String job;

	public Staff() {
	}

	public Staff(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
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
