package chap02;

public class VariableExam1 {
	public static void main(String[] args) {
		int kor, math, eng, total, avg;
		kor = 100;
		math = 98;
		eng = 98;
		total = kor + math + eng;
		avg = total / 3;

		System.out.println("총점:" + total);
		System.out.println("평균:" + avg);
	}
}
