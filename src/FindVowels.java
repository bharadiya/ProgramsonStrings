
import java.util.StringTokenizer;

public class FindVowels {
	public static boolean hasVowel(String s) {
		String vowels = "aeiouAEIOU";
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < vowels.length(); j++) {
				if (s.charAt(i) == vowels.charAt(j)) {
					return true;
				}
			}

		}
		return false;
	}

	public static void main(String[] args) {
		String str = "Hiiiiiii I am a good program egg kvvy same";
		// String[] out = str.split("\\s");
		String A = "";
		StringTokenizer newstr = new StringTokenizer(str);
		while (newstr.hasMoreTokens()) {
			A = newstr.nextToken();
			for (int i = 0; i < A.length(); i++) {
				if (hasVowel(A)) {
					System.out.println(A);
					break;
				}
			}
		}
	}
}
