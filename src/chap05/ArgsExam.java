package chap05;

//명령행 매개변수 5개를 입력받아 총점과 평균을 출력
//[출력형식]
//총점:____
//평균:____
public class ArgsExam {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}

		System.out.println("총점:" + sum);
		System.out.println("평균:" + (sum / args.length));
	}

}
