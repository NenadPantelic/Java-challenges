package codewars;

public class SplitString {
	public static String[] solution(String s) {
		int len = s.length();
		int numOfPairs = len / 2;
		if (2 * numOfPairs < len)
			numOfPairs++;
		String[] chars = new String[numOfPairs];
		for (int i = 0; i < numOfPairs && 2 * i < len; i++) {
			chars[i] = s.charAt(2 * i) + ((2 * i + 1 < len) ? s.charAt(2 * i + 1) : "_").toString();
		}
		return chars;
	}

	public static String[] solution2(String s) {
		int len = s.length();
		if (len % 2 != 0) {
			s += "_";
			len++;
		}
		String[] chars = new String[len / 2];
		for (int i = 0; i < len / 2; i++) {
			chars[i] = s.charAt(2 * i) + "" + s.charAt(2 * i + 1);
		}
		return chars;
	}

}
