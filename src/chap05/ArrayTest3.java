package chap05;

//배열의 사용 - for 문을 이용해서 작업하기
public class ArrayTest3 {

	public static void main(String[] args) {
		int[] myArr = new int[3];
		myArr[0] = 1000;
		myArr[1] = 2000;
		myArr[2] = 3000;
		System.out.println("0번 요소 =>" + myArr[0]);
		System.out.println("1번 요소 =>" + myArr[1]);
		System.out.println("2번 요소 =>" + myArr[2]);
		// System.out.println("3번 요소 =>" + myArr[3]);
		System.out.println("======================");
		// 코드를 최적화
		for (int i = 0; i < myArr.length; i++) {
			System.out.println(i + "번 요소 =>" + myArr[i]);
		}
		System.out.println("배열의 요소의 갯수=>" + myArr.length);
	}

}
