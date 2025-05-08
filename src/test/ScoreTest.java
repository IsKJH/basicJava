package test;

class Score {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;

	public void print() {
		if (getName() == null) {
			System.out.println(getKor() + "\t" + getEng() + "\t" + getMath() + "\t" + getSum() + "\t" + getAvg());
		} else {
			System.out.println(getName() + "\t" + getKor() + "\t" + getEng() + "\t" + getMath() + "\t" + getSum() + "\t"
					+ getAvg());
		}

	}

	public Score() {
	}

	public Score(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = getKor() + getEng() + getMath();
		this.avg = (double) (getKor() + getEng() + getMath()) / 3;
	}

	public Score(String name, int kor, int eng, int math) {
		this(kor, eng, math);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

}

public class ScoreTest {
	public static void main(String[] args) {
		int totalScore = 0;
		Score s1 = new Score("홍길동", 10, 20, 30);

		Score s2 = new Score("김자바", 50, 40, 60);

		Score s3 = new Score("이디비", 70, 100, 50);

		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");

		s1.print();
		s2.print();
		s3.print();

		System.out.print("총  계\t");
//총계용 국어, 영어, 수학, 총점, 평균값을 계산하여 출력되도록
//이곳을 완성하시오.
		Score sum = new Score(s1.getKor() + s2.getKor() + s3.getKor(), s1.getEng() + s2.getEng() + s3.getEng(),
				s1.getMath() + s2.getMath() + s3.getMath());
		sum.print();
	}
}