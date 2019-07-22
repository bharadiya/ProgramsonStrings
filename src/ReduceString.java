import java.util.ArrayList;

public class ReduceString {

	public static String reduceString(String inp) {
		char[] arr = inp.toCharArray();
		ArrayList<Character> al = new ArrayList<Character>();
		for (int i = 0; i < arr.length; i++) {
			al.add(arr[i]);
		}
		for (int i = 0; i < al.size();) {
			if (al.get(i) == al.get(al.size() - 1)) {
				al.remove(i);
				al.remove(al.size() - 1);
				i = 0;
				if (al.size() == 1) {
					al.remove(0);
				}
			} else {
				break;
			}
		}
		char[] result = new char[al.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = al.get(i);
		}
		return new String(result);
	}

	public static void main(String[] args) {
		System.out.println(reduceString("abcdcba"));
	}
}
