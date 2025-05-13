package exception;

// try ~ catch ~ finally를 연습
// 예외가 발생하거나 발생하지 않거나 무조건 실행되어야 하는 명령문은 finally에 추가
public class ExceptionTest3 {
	public static void main(String[] args) {
		try {
			System.out.println("try블럭 시작");
			System.out.println(10 / 10);
			System.out.println("try블럭 종료");
		} catch (ArithmeticException e) {
			System.out.println("예외발생");
		} finally {
			System.out.println("무조건 실행되는 코드 - 자원반납");
		}
	}
}
