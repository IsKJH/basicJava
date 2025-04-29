package chap02;

import java.util.Random;
//ctrl+shift+o => 자동import
//ctrl + / => 한줄주석 설정 및 해제

public class APIExam2 {

	public static void main(String[] args) {

//		ArrayList list = new ArrayList();
		Random random = new Random();
		System.out.println("랜덤수=>" + random.nextInt());
		System.out.println("랜덤수=>" + random.nextInt(1, 100));
	}

}
