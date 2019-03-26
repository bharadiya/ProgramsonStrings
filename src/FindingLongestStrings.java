public class FindingLongestStrings {
	public static String[] allLongestStrings(String[] a) {
		int max = 0;
		int count = 0;
		int[] d = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			d[i] = a[i].length();
		}
		for (int i = 0; i < a.length; i++)
			if (d[i] >= max) {
				max = d[i];
			}
		for (int i = 0; i < a.length; i++) {
			if (a[i].length() == max) {
				count++;
			}
		}
		String[] p = new String[count];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i].length() == max) {
				p[j] = a[i];
				j++;
			}
		}
		return p;
	}

	public static void main(String[] args) {
		String[] input = { "aba", "aa", "ad", "vcd", "aba" };
		for (int i = 0; i < allLongestStrings(input).length; i++) {
			System.out.println(allLongestStrings(input)[i]);
		}
	}
}
