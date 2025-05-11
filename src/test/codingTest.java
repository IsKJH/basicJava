package test;

public class codingTest {

	public static void main(String[] args) {
		Solution s = new Solution();
		s.solution(7, 15);
	}

	public static class Solution {
		public int solution(int n, int t) {
			int answer = n;
			for (int i = 1; i <= t; i++) {
				n *= 2;
			}
			System.out.println(n);
			return answer;
		}
	}
}
