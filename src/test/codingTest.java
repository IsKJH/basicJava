package test;

import java.util.Iterator;

public class codingTest {

	public static void main(String[] args) {
		Solution s = new Solution();
		String[] arr = { "u", "r", "u", "u" };
		s.solution(arr);
	}

	public static class Solution {
		public String[] solution(String[] str_list) {
			String[] answer = new String[str_list.length];
			for (int i = 0; i < str_list.length; i++) {
				if (str_list[i].equals("l")) {
					for (int j = 0; j < i; j++) {
						answer[j] = str_list[j];
					}
					return answer;
				} else if (str_list[i].equals("r")) {
					int cnt = 0;
					for (int j = i + 1; j < str_list.length; j++) {
						if (str_list[j] != "l") {
							answer[cnt++] = str_list[j];
						}
					}
					return answer;
				}
			}
			return new String[0];
		}
	}
}
