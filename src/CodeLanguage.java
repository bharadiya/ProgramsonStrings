
public class CodeLanguage {
	public static void main(String[] args) {
		String l = "abcdefghijklmnopqrstuvwxyz";
		l = l.toLowerCase();
		for (int i = 0; i < l.length(); i++) {
			System.out.print((int) l.charAt(i) - 96 + " ");
		}
	}
}
