package chap03;

//자바에서 사용할 수 있는 연산자
//=> 산술연산자, 증감연산자, 논리부정연산자
public class OprTest1 {

	public static void main(String[] args) {
		boolean state = true;
		System.out.println(state);
		System.out.println(!state);
		// +, -, *, /, % 연산자 확인
		int x = 5;
		int y = x++;
		System.out.println("x=" + x + " y=" + y);
		x = 5;
		y = x--;
		System.out.println("x=" + x + " y=" + y);
		x = 5;
		y = ++x;
		System.out.println("x=" + x + " y=" + y);
		x = 5;
		y = --x;
		System.out.println("x=" + x + " y=" + y);

	}

}
