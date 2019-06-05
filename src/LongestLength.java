
public class LongestLength {
	public static int findMax(int[] a) {
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i])
				max = a[i];
		}
		return max;
	}

	public static void main(String[] args) {
		String[] arr = { "jdfijifjdij", "abc", "abcd", "abcde", "abcde" };
		int[] newarr = new int[arr.length];
		for (int i = 0; i < newarr.length; i++) {
			newarr[i] = arr[i].length();
		}
		System.out.println(findMax(newarr));
	}
}
