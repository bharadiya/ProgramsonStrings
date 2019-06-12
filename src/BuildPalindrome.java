
public class BuildPalindrome {
	public static String buildPalindrome(String st) {
		if (isPalindrome(st))
			return st;
		String temp = st;
		for (int i = 1; i < st.length(); i++) {
			String A = temp.substring(0, i);
			String B = temp.substring(i, st.length());
			if (isPalindrome(B))
				return A.concat(B).concat((reversal(A)));
		}
		return temp;
	}

	public static boolean isPalindrome(String a) {
		String A = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			A = A + a.charAt(i);
		}
		return a.equals(A);
	}

	public static String reversal(String a) {
		String A = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			A = A + a.charAt(i);
		}
		return A;
	}

	public static void main(String[] args) {
		System.out.println(buildPalindrome("abcdc"));
	}
}
