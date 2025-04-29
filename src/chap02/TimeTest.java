package chap02;

public class TimeTest {
	public static void main(String[] args) {
		int hour = 8800 / 3600;
		int minute = (8800 % 3600) / 60;
		int second = (8800 % 3600) % 60;

		System.out.println(hour + "시간" + minute + "분" + second + "초");
		findTime(3600);
	}

	public static void findTime(int time) {
		int hour = time / 3600;
		int minute = (time % 3600) / 60;
		int second = (time % 3600) % 60;
		System.out.println(hour + "시간" + minute + "분" + second + "초");
	}
}
