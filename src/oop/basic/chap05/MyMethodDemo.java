package oop.basic.chap05;

public class MyMethodDemo {

	public static void main(String[] args) {
		Calc c = new Calc();
		ForExam_GuGu FGugu = new ForExam_GuGu();
		MultiForGuGu mGugu = new MultiForGuGu();
		System.out.println("계산결과=>" + c.calc("+", 100, 220));
		FGugu.printGuGu(1);
		mGugu.printGuGu();
	}
}
