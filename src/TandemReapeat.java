import java.util.regex.Pattern;

public class TandemReapeat {
	public static boolean isTandemRepeat(String a) {
		String t = "";
		for (int i = 0; i < a.length() - 1; i++) {
			for (int j = i + 1; j < a.length(); j++) {
				if (a.charAt(i) == a.charAt(j)) {
					t = a.substring(0, j);
					System.out.println(t);
					break;
				}
			}
			break;
		}
		return Pattern.compile("("+t+")\\1{1,}").matcher(a).find();
	}

	public static void main(String[] args) {
		System.out.println(isTandemRepeat("qqq"));
	}
}
