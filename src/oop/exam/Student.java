package oop.exam;

public class Student {

	private String name; // 학생이름
	private int midScore; // 중간점수
	private int endScore; // 기말점수
	private int taskScore; // 과제점수
	private String grade; // 등급

	public Student() {
		super();
	}

	/*
	 * 학생이름을 매개변수로 하는 생성자 구현
	 */
	public Student(String name) {
		super();
		this.name = name;
	}
	/*
	 * 학생이름, 중간점수, 기말점수, 과제점수를 매개변수로 하는 생성자 구현
	 */

	public Student(String name, int midScore, int endScore, int taskScore) {
		super();
		this.name = name;
		this.midScore = midScore;
		this.endScore = endScore;
		this.taskScore = taskScore;
	}

	public void calcGrade() {
		/*
		 * 학생의 등급을 판단하는 메소드 구현
		 */
		int score = (int) (midScore * 0.4 + endScore * 0.4 + taskScore * 0.2);
		if (score <= 100 && score >= 90) {
			grade = "A";
		} else if (score < 90 && score >= 80) {
			grade = "B";
		} else if (score < 80 && score >= 70) {
			grade = "C";
		} else if (score < 70 && score >= 60) {
			grade = "D";
		} else if (score < 60) {
			grade = "F";
		}
	}

	public int getEndScore() {
		return endScore;
	}

	public void setEndScore(int endScore) {
		this.endScore = endScore;
	}

	public int getMidScore() {
		return midScore;
	}

	public void setMidScore(int midScore) {
		this.midScore = midScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTaskScore() {
		return taskScore;
	}

	public void setTaskScore(int taskScore) {
		this.taskScore = taskScore;
	}

	public String getGrade() {
		return grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", midScore=" + midScore + ", endScore=" + endScore + ", taskScore="
				+ taskScore + ", grade=" + grade + "]";
	}

}
