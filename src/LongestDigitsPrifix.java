
public class LongestDigitsPrifix {
	public static String longestDigitsPrefix(String s) {
		String[] arr = null;
		arr = s.split("[^0-9]");
		try {
			return arr[0];
		} catch (ArrayIndexOutOfBoundsException e) {
			return "";
		}
	}

	public static void main(String[] args) {
		System.out.println(longestDigitsPrefix("5a6a7g"));
	}
}
