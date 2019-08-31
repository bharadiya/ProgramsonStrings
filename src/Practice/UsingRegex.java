package Practice;

public class UsingRegex {
	public static void main(String[] args) {
		String s = "123$567$3ifhdsifjsidjfkfksd(*&^67895*7*6&8&";
		int sum = 0;
		s = s.replaceAll("[^0-9]", "");
		System.out.println(s);
		String[] arr = s.split("");
		int[] a = new int[arr.length];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(arr[i]);
		}
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);
	}
}
