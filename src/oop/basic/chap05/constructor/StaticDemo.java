package oop.basic.chap05.constructor;

//인스턴스변수와 정적변수(클래스 변수 - static변수)
public class StaticDemo {
	int num;
	static int staticNum; // static변수

	public StaticDemo() {
		num++;
		staticNum++;
	}

	public void display() {
		System.out.println("num=>" + num + ", staticNum=>" + staticNum);
	}

}
