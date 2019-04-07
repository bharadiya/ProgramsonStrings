
public class FindSmallestNo {
	public static int smallestNumber(int n) {
		if (n == 1)
			return 0;
		else {
			String A = "1";
			for (int i = 0; i < n - 1; i++) {
				A = A.concat("0");
			}
			return Integer.parseInt(A);
		}
	}

	public static void main(String[] args) {
		System.out.println(smallestNumber(1));
	}
}
