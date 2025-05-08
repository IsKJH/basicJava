package test;

public class Student {

	private String name;
	private String subject;
	private int fee;
	private double returnFee;

	public void calcReturnFee() {
		if (getSubject() == "javaprogram") {
			returnFee = fee * 0.25;
		} else if (getSubject() == "jspprogram") {
			returnFee = fee * 0.2;
		} else {
			System.out.println("그런 과정 명은 없습니다.");
		}
	}

	public void print() {
		System.out.println(getName() + " 씨의 과정명은 " + getSubject() + " 이고 교육비는 " + getFee() + "이며 환급금은 " + getReturnFee()
				+ " 입니다.");
	}

	public Student() {
	}

	public Student(String name, String subject, int fee) {
		this.name = name;
		this.subject = subject;
		this.fee = fee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public double getReturnFee() {
		return returnFee;
	}

	public void setReturnFee(double returnFee) {
		this.returnFee = returnFee;
	}

	public static void main(String args[]) {
		Student stu = new Student("장동건", "jspprogram", 500000);
		stu.calcReturnFee();
		stu.print();
	}
}
