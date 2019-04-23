import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingAscending {
	public static String[] sortByLength(String[] i) {
		int[] arr = new int[i.length];
		List<String> A = new ArrayList<String>();
		for (int j = 0; j < arr.length; j++) {
			A.add(i[j]);
		}
		String[] finalarr = new String[i.length];
		for (int j = 0; j < i.length; j++) {
			arr[j] = i[j].length();
		}
		Arrays.sort(arr);
		for (int j = 0; j < arr.length; j++) {
			for (int k = 0; k < A.size(); k++) {
				if (arr[j] == A.get(k).length()) {
					finalarr[j] = A.get(k);
					A.remove(k);
					break;
				}
			}
		}
		return finalarr;
	}

	public static void main(String[] args) {
		String[] i = { "zz", "", "bb", "ccc", "cc" };
		for (String string : sortByLength(i)) {
			System.out.print(string + " ");
		}
	}
}
