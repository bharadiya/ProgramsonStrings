
public class PassingMarksandGrades {
	public static boolean passingMark(double passMark, String grades) {
		int savenum = 0;
		for (int i = 0; i < grades.length(); i++) {
			if (grades.charAt(i) == 'A') {
				savenum += 5;
			} else if (grades.charAt(i) == 'B') {
				savenum += 4;
			} else if (grades.charAt(i) == 'C') {
				savenum += 3;
			} else if (grades.charAt(i) == 'D') {
				savenum += 2;
			} else {
				savenum += 1;
			}
		}
		double avg = (double) savenum / grades.length();
		return avg >= passMark;
	}

	public static void main(String[] args) {
		System.out.println(passingMark(3.5, "ABC"));
	}
}
