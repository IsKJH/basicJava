package oop.exam;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
	private List studentList;

	public StudentManager() {
		studentList = new ArrayList();
	}

	public void addStudent(Student student) {
		studentList.add(student);
	}

	public List getStudentList() {
		return studentList;
	}

	public Student getStudent(String name) {
		/*
		 * 학생이름(name)으로 학생 검색
		 */
		for (Object student : studentList) {
			Student obj = (Student) student;
			if (obj.getName().equals(name)) {
				return obj;
			}
		}
		return null;
	}

	public ArrayList search(String grade) {
		/*
		 * 점수 등급으로 학생 목록 검색
		 */
		List gradeList = new ArrayList();
		for (Object student : studentList) {
			Student obj = (Student) student;
			if (obj.getGrade().equals(grade)) {
				gradeList.add(obj);
			}
		}
		return (ArrayList) gradeList;
	}

}
