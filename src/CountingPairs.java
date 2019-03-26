
public class CountingPairs {
	public static int countDistantPairs(String a, int d) {
		int count = 0;
		for (int i = 0; i < a.length()-d-1; i++) {
			if (a.charAt(i) == a.charAt(i + d + 1))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(countDistantPairs("abacaba", 1));
	}
}
