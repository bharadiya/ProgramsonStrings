import java.util.ArrayList;
import java.util.Arrays;

public class CountOccurence {
	public static void main(String[] args) {
		String str = "A Life is awesome";
		char[] res = str.toCharArray();
		Arrays.sort(res);
		ArrayList<Character> A = new ArrayList<Character>();
		for (int i = 0; i < res.length; i++) {
			A.add(res[i]);
		}
		A.add(null);
		int count = 0;
		for (int i = 0; i < A.size() - 1; i++) {
			if (A.get(i) == A.get(i + 1)) {
				count++;
			} else {
				count += 1;
				System.out.println("Occurence of " + A.get(i) + " is " + count);
				count = 0;
			}
		}
	}
}
